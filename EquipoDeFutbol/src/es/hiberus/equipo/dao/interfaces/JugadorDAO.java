package es.hiberus.equipo.dao.interfaces;

import java.util.HashMap;

import es.hiberus.equipo.model.Jugador;

public interface JugadorDAO {
	
	public HashMap listaPersonal = new HashMap();
	
	public boolean crear(Jugador j);
	
	public boolean eliminar(Jugador j);
	
	public boolean modificar(Jugador j);
	
	public String read(String id);}
