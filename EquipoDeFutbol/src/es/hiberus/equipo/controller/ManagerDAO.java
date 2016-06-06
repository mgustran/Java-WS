package es.hiberus.equipo.controller;

import java.util.HashMap;

import es.hiberus.equipo.model.Manager;

public interface ManagerDAO {
	
	public HashMap listaPersonal = new HashMap();
	
	public boolean crear (Manager m);
	
	public boolean eliminar (Manager m);
	
	public boolean modificar (Manager m);
	
	public String read (String id);}
