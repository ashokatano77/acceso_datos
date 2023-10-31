package com.danielme.blog.gson;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Quieres introducir algún hotel? Pulsa 1 para sí, 2 para no");
		int Respuesta = sc.nextInt();

		if (Respuesta == 1) {

			// hago un while por si el usuario quiere seguir introduciendo datos.

			System.out.println("Quieres seguir introduciendo?");
			System.out.println("Quieres introducir algún hotel? Pulsa 3  para sí, 0 para no");
			int Respuesta2 = sc.nextInt();
			while (Respuesta2 == 3) {

				// Si el cliente quiere introucir un nuevo hotel, irá introducioendo los datos
				System.out.println("Inserta los datos del nuevo hotel");
				System.out.println("Nombre");
				String Nom1 = sc.nextLine();
				System.out.println("Estrellas");
				int Estrellas1 = sc.nextInt();
				System.out.println("Telefono");
				int Telefono1 = sc.nextInt();
				System.out.println("Calle");
				String Calle1 = sc.nextLine();
				System.out.println("Número");
				int Numero1 = sc.nextInt();
				System.out.println("Código Postal");
				int Codigo_Postal1 = sc.nextInt();
				System.out.println("País");
				String Pais = sc.nextLine();

				// Aqui metemos los nuevos datos en el nuevo objeto creado

				Hotel Nuevo = new Hotel(Nom1 + Estrellas1 + Telefono1 + Calle1 + Numero1 + Codigo_Postal1 + Pais,
						Codigo_Postal1, Codigo_Postal1, Pais, Codigo_Postal1, Codigo_Postal1, Pais);

				Hotel Chiclana = new Hotel("Riu Chiclana", 4, 687622331, "Paseo maritimo", 6871, "ES");
				Hotel La_Mola = new Hotel("Riu La Mola", 4, 687442331, "Principal", 81, 7871, "ES");
				Hotel Riu_Palace = new Hotel("Riu Palace", 3, 666888111, "Juan Quevedo", 2, 3871, "ES");
				// AÑADO LA ESTRELLA QUE HABÍA QUE AÑADIR
				int Nueva_estrella = 1;
				Chiclana.setEstrellas(Chiclana.getEstrellas() + Nueva_estrella);
				La_Mola.setEstrellas(La_Mola.getEstrellas() + Nueva_estrella);
				Riu_Palace.setEstrellas(Riu_Palace.getEstrellas() + Nueva_estrella);
				Nuevo.setEstrellas(Nuevo.getEstrellas() + Nueva_estrella);

				// meto los bjetos creados en la lista

				List<Hotel> hoteles1 = new LinkedList<Hotel>();
				hoteles1.add(Chiclana);
				hoteles1.add(La_Mola);
				hoteles1.add(Riu_Palace);
				hoteles1.add(Nuevo);

				// meto la lista en el objeto más grande

				Hoteles Riu = new Hoteles("RIU", 1993, "Hannover", hoteles1);
				System.out.println(Riu);

			}

		} else {

			// si el cliente no quiere introducir ningún dato se van a introducir los datos
			// que estaban previstos
			Hotel Chiclana = new Hotel("Riu Chiclana", 4, 687622331, "Paseo maritimo", 6871, "ES");
			Hotel La_Mola = new Hotel("Riu La Mola", 4, 687442331, "Principal", 81, 7871, "ES");
			Hotel Riu_Palace = new Hotel("Riu Palace", 3, 666888111, "Juan Quevedo", 2, 3871, "ES");
			// AÑADO LA ESTRELLA QUE HABÍA QUE AÑADIR
			int Nueva_estrella = 1;
			Chiclana.setEstrellas(Chiclana.getEstrellas() + Nueva_estrella);
			La_Mola.setEstrellas(La_Mola.getEstrellas() + Nueva_estrella);
			Riu_Palace.setEstrellas(Riu_Palace.getEstrellas() + Nueva_estrella);
			// se hace lalista
			List<Hotel> hoteles1 = new LinkedList<Hotel>();
			hoteles1.add(Chiclana);
			hoteles1.add(La_Mola);
			hoteles1.add(Riu_Palace);

			Hoteles Riu = new Hoteles("RIU", 1993, "Hannover", hoteles1);
			System.out.println(Riu);
		}

	}

	String Archivo = "hotelesNous.json";
	FileInputStream Entrada = null;
	FileOutputStream Salida = null;
	String Archivo2 = "hoteles.json";

	// Con este método lo que voy a hacer es leer lo que hay dentro del archivo json
	// y reescribirlo. Aunque no se si lo he hecho bien porque lo he cojido de los
	// ejercicios que hicimos

	public void LEER_ESCRIBIR(String Archivo) {
		try {
			this.Entrada = new FileInputStream(this.Archivo);
			byte[] datos = new byte[1024];

			int CantidadLeida;
			while ((CantidadLeida = this.Entrada.read(datos)) != -1) {
				String Contenido = new String(datos, 0, CantidadLeida);
				this.Salida = new FileOutputStream(Archivo2, false);
				byte[] bytes = Contenido.getBytes();
				this.Salida.write(bytes);

			}
		} catch (IOException var13) {
			var13.printStackTrace();
		} finally {
			try {
				if (this.Archivo != null) {
					this.Entrada.close();
				}
			} catch (IOException var12) {
				System.err.println("Hubo un error");
				var12.printStackTrace();
			}

		}

	}

}