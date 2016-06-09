package es.hiberus.equipo.model;

import es.hiberus.equipo.dao.interfaces.Nombrado;

public abstract class Persona implements Nombrado{
	
	private String nombre;

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public void setNombre() {
		this.nombre = nombre;
		
	}

}
