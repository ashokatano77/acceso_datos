package com.danielme.blog.gson;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;

public class Actor {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	@Expose

	@SerializedName("gender")
	private String sexCode;

	@Since(1.0)
	private String nombre;

	@Until(2.0)
	private Calendar fechaNacimiento;

	public Actor() {
		super();
	}

	public Actor(String nombre, Calendar fechaNacimiento, String sexCode) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.sexCode = sexCode;
	}

	@Override
	public String toString() {
		return nombre + " (" + sdf.format(fechaNacimiento.getTime()) + ")";
	}

}