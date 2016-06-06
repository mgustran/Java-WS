package es.hiberus.equipo.dao.interfaces;

import java.util.HashMap;

import es.hiberus.equipo.model.*;

public interface EntrenadorDAO  {	
	
	
	
	public boolean crear(Entrenador ent);
	
	public boolean eliminar(Entrenador ent);
	
	public boolean modificar(Entrenador ent);
	
	public String read(String id);}

