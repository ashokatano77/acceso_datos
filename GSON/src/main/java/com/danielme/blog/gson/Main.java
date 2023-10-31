package com.danielme.blog.gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 
 * @author danielme.com
 * 
 */
public class Main {

	public static void main(String[] args) {
		Actor tomhanks = new Actor("Tom Hanks", new GregorianCalendar(1956, 8, 9), "H");
		Actor halleberry = new Actor("Halle Berry", new GregorianCalendar(1966, 7, 14), "M");
		List<Actor> actores1 = new LinkedList<Actor>();
		actores1.add(tomhanks);
		actores1.add(halleberry);
		Pelicula pelicula1 = new Pelicula("El atlas de las nubes", (short) 2012,
				"Lana Wachowski, Tom Tykwer, Andy Wachowski", (short) 172, actores1);

		Actor jesse = new Actor("Jesse Eisenberg", new GregorianCalendar(1983, 9, 5), "M");
		Actor andrew = new Actor("Andrew Garfield", new GregorianCalendar(1983, 7, 20), "H");
		List<Actor> actores2 = new LinkedList<Actor>();
		actores2.add(jesse);
		actores2.add(andrew);
		Pelicula pelicula2 = new Pelicula("La red social", (short) 2010, "David Fincher", (short) 120, actores2);

		List<Pelicula> peliculas = new LinkedList<Pelicula>();
		peliculas.add(pelicula1);
		peliculas.add(pelicula2);

		GsonBuilder gsonBuilder = new GsonBuilder().serializeNulls().setPrettyPrinting();
		gsonBuilder.registerTypeAdapter(GregorianCalendar.class, new CalendarJsonSerializer());
		gsonBuilder.registerTypeAdapter(Calendar.class, new CalendarJsonSerializer());
		Gson gson = gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").create();

		String peliculasActuales = gson.toJson(peliculas);
		// peliculasActuales = peliculasActuales + "-";
		System.out.println(peliculasActuales);

		Pelicula[] peliculasJSON = gson.fromJson(peliculasActuales, Pelicula[].class);

		for (Pelicula pelicula : peliculasJSON) {
			System.out.println(pelicula.toString());

		}
		// --------------------------------------------------------PELIS
		// ACTUALES---------------------------------------------------------------
		// Crear una instancia de Gson
		Gson gson1 = new GsonBuilder().serializeNulls().setPrettyPrinting().create();

		// Convertir la lista de películas a formato JSON
		// Guardamos la lista de películas que nos venia en el programa, en el archivo
		// pelis actuales
		String jsonString = gson1.toJson(peliculas);
		// Con esto guardamos la informacion en el archivo correspondiente
		try (FileWriter fileWriter = new FileWriter("pelis_actuales.json")) {
			fileWriter.write(jsonString);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// -----------------------------------------------------------PELIS
		// FAVORITAS------------------------------------------------
		// PELI FAVORITA 1
		// Hago los objetos que van a ir dentro de la lista
		Actor dicaprio = new Actor("Leonardo DiCaprio", new GregorianCalendar(1974, 11, 11), "M");
		Actor kateWinslet = new Actor("Kate Winslet", new GregorianCalendar(1975, 10, 5), "F");

		// Hago lista de actores de la primera peli
		List<Actor> actoresPelFavorita1 = new LinkedList<Actor>();
		// Añado los actores creados a la lista
		actoresPelFavorita1.add(dicaprio);
		actoresPelFavorita1.add(kateWinslet);
		Pelicula peliculaFav1 = new Pelicula("Titanic", (short) 1997, "James Cameron", (short) 195,
				actoresPelFavorita1);

		// Película favorita 2
		Actor actor1Fav2 = new Actor("Keanu Reeves", new GregorianCalendar(1964, 9, 2), "M");
		Actor actor2Fav2 = new Actor("Carrie-Anne Moss", new GregorianCalendar(1967, 8, 21), "F");
		List<Actor> actoresPelFavorita2 = new LinkedList<Actor>();
		actoresPelFavorita2.add(actor1Fav2);
		actoresPelFavorita2.add(actor2Fav2);
		Pelicula peliculaFav2 = new Pelicula("The Matrix", (short) 1999, "The Wachowskis", (short) 136,
				actoresPelFavorita2);

		// Película favorita 3
		Actor actor1Fav3 = new Actor("Harrison Ford", new GregorianCalendar(1942, 7, 13), "M");
		Actor actor2Fav3 = new Actor("Sean Connery", new GregorianCalendar(1930, 8, 25), "M");
		List<Actor> actoresPelFavorita3 = new LinkedList<Actor>();
		actoresPelFavorita3.add(actor1Fav3);
		actoresPelFavorita3.add(actor2Fav3);
		Pelicula peliculaFav3 = new Pelicula("Indiana Jones and the Last Crusade", (short) 1989, "Steven Spielberg",
				(short) 127, actoresPelFavorita3);

		// Película favorita 4
		Actor actor1Fav4 = new Actor("Robert Downey Jr.", new GregorianCalendar(1965, 4, 4), "M");
		Actor actor2Fav4 = new Actor("Gwyneth Paltrow", new GregorianCalendar(1972, 9, 27), "F");
		List<Actor> actoresPelFavorita4 = new LinkedList<Actor>();
		actoresPelFavorita4.add(actor1Fav4);
		actoresPelFavorita4.add(actor2Fav4);
		Pelicula peliculaFav4 = new Pelicula("Iron Man", (short) 2008, "Jon Favreau", (short) 126, actoresPelFavorita4);

		// Película favorita 5
		Actor actor1Fav5 = new Actor("Tim Robbins", new GregorianCalendar(1958, 10, 16), "M");
		Actor actor2Fav5 = new Actor("Morgan Freeman", new GregorianCalendar(1937, 6, 1), "M");
		List<Actor> actoresPelFavorita5 = new LinkedList<Actor>();
		actoresPelFavorita5.add(actor1Fav5);
		actoresPelFavorita5.add(actor2Fav5);
		Pelicula peliculaFav5 = new Pelicula("The Shawshank Redemption", (short) 1994, "Frank Darabont", (short) 142,
				actoresPelFavorita5);

		List<Pelicula> peliculasFavoritas = new LinkedList<Pelicula>();
		peliculasFavoritas.add(peliculaFav1);
		peliculasFavoritas.add(peliculaFav2);
		peliculasFavoritas.add(peliculaFav3);
		peliculasFavoritas.add(peliculaFav4);
		peliculasFavoritas.add(peliculaFav5);

		// Con esto guardamos la informacion en el archivo correspondiente
		try (FileWriter fileWriter = new FileWriter("pelis_favoritas.json")) {
			String jsonStringPelisFavoritas = gson1.toJson(peliculasFavoritas);
			fileWriter.write(jsonStringPelisFavoritas);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// FileWriter fw =

	}

}