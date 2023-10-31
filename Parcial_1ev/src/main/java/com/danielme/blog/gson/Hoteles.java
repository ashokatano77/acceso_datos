package com.danielme.blog.gson;

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hoteles {
	@Expose
	@SerializedName("empresa")
	private String Empresa;

	@Expose
	@SerializedName("fundacion")
	private int Fundacion;

	@SerializedName("ciudad_sede")
	private String Ciudad_sede;

	@SerializedName("pais_sede")
	private String Pais_sede;

	private Date created_at;

	private List<Hotel> Hoteless;

	public Hoteles(String Empresa, int Fundacion, String Ciudad_sede, String Pais_sede, List<Hotel> Hoteless) {
		super();
	}

	public Hoteles(String Empresa, int Fundacion, String Ciudad_sede, List<Hotel> Hoteless) {
		super();
		this.Empresa = Empresa;
		this.Fundacion = Fundacion;
		this.Ciudad_sede = Ciudad_sede;
		this.Pais_sede = Pais_sede;
		this.Hoteless = Hoteless;

	}

	@Override
	public String toString() {
		String s = Empresa;
		boolean first = true;
		for (Hotel hotell : Hoteless) {
			if (first) {
				first = false;
			} else {
				s += ", ";
			}
			s += hotell.toString();

		}
		return s;
	}

}