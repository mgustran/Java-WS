package es.hiberus.equipo.controller;

import java.util.HashMap;

import es.hiberus.equipo.model.Equipo;

public interface EquipoDAO {
	
	public HashMap listaPersonal = new HashMap();
	
	public boolean crear(Equipo e);
	
	public boolean eliminar(Equipo e);
	
	public boolean modificar(Equipo e);
	
	public String read(String id);

}
