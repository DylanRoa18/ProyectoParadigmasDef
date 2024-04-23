package co.edu.poli.proyecto.model;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	private String nombre;
	private String director;
	private String genero;
	private String anio;
	private boolean estReserva;
	
	
	public Pelicula(String nombre, String director, String genero, String anio, boolean estReserva) {
		super();
		this.nombre = nombre;
		this.director = director;
		this.genero = genero;
		this.anio = anio;
		this.estReserva = estReserva;
	
	}

	List<Pelicula> catalogo = new ArrayList<>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public boolean isEstReserva() {
		return estReserva;
	}

	public void setEstReserva(boolean estReserva) {
		this.estReserva = estReserva;
	}


	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", director=" + director + ", genero=" + genero + ", anio=" + anio
				+ ", estReserva=" + estReserva ;
	}
	
	 public void reservar() {
	        if (estReserva) {
	            estReserva = false;
	            System.out.println("La película \"" + nombre + "\" ha sido reservada.");
	        } else {
	            System.out.println("La película \"" + nombre + "\" no está disponible para reservar.");
	        }
	    }


}
	
