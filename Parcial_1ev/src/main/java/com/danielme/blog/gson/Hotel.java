package com.danielme.blog.gson;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;

public class Hotel {

	/*
	 * private static final SimpleDateFormat sdf = new
	 * SimpleDateFormat("dd/MM/yyyy");
	 * 
	 * @Expose
	 */

	// @SerializedName("gender")
	// private String sexCode;

	@SerializedName("nombre")
	private String Nombre;

	@SerializedName("estrellas")
	private int Estrellas;

	@SerializedName("telefono")
	private int Telefono;

	@SerializedName("calle")
	private String Calle;

	@SerializedName("numero")
	private int Num;

	@SerializedName("codigo_postal")
	private int Codigo_postal;

	@SerializedName("pais")
	private String Pais;

	public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEstrellas() {
        return Estrellas;
    }

    public void setEstrellas(int estrellas) {
        Estrellas = estrellas;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String calle) {
        Calle = calle;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int num) {
        Num = num;
    }

    public int getCodigo_postal() {
        return Codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        Codigo_postal = codigo_postal;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

	/*
	 * @Since(1.0)
	 * private String nombre;
	 * 
	 * @Until(2.0)
	 * private Calendar fechaNacimiento;
	 */



	public Hotel() {
		super();
	}

	public Hotel(String Nombre, int Estrellas, int Telefono, String Calle, int Codigo_postal,
			String Pais) {
		super();
	}

	public Hotel(String Nombre, int Estrellas, int Telefono, String Calle, int Num, int Codigo_postal,
			String Pais) {
		super();
		this.Nombre = Nombre;
		this.Estrellas = Estrellas;
		this.Telefono = Telefono;
		this.Calle = Calle;
		this.Codigo_postal = Codigo_postal;
		this.Pais = Pais;

	}

	@Override
	public String toString() {
		return " |Nombre: " + Nombre +
				" |Estrellas: " + Estrellas +
				" |Teléfono: " + Telefono +
				" |Dirección-->" +
				"   |-Calle: " + Calle +
				"   |-Número " + Num +
				"   |-Código Postal" + Codigo_postal +
				"   |-Pais" + Codigo_postal;

	}

}