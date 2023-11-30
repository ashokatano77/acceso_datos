package com.Dam.universidad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

 /*
    DATOS QUE HAY QUE PONER
    -DNI
    -Name
    -Surname1
    -Surname2
    -Birthdate
    -idAsignature
    -registredDate

    Notas de clase: crear colmnas, crear la clase estudiante dto,
    tambien hace falta un data transfer object
    */


@SpringBootApplication
public class UniversidadApplication {
	static final String JDBC_USER = "root";
	static final String JDBC_PASS = "987654321Mysql";
	static final String JDBC_DB_URL = "jdbc:mysql://localhost:3306/universidad";




		public static void main (String[]args){
			Connection conexion;


			try {
				conexion = DriverManager.getConnection(JDBC_DB_URL, JDBC_USER, JDBC_PASS);


				if (conexion != null) {
					System.out.println("Conectado");

					// Creación de sentencia SQL mediante la clase Statement
					Statement sentencia = conexion.createStatement();

					// Sentencias de consulta que guardaremos en un objeto ResultSet perteneciente a la libreria java.sql
					ResultSet rs = sentencia.executeQuery("SELECT * FROM PERSONA");
					while (rs.next()) {
						System.out.println(rs.getString("nif"));
					}
					rs.close();
					sentencia.close();
				}

				conexion.close();

			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

	}
