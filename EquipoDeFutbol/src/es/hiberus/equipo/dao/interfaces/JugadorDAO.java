package es.hiberus.equipo.dao.interfaces;

public interface JugadorDAO {
	
	public boolean crear(Jugador j);
	
	public boolean eliminar(Jugador j);
	
	public boolean modificar(Jugador j);
	
	public String read(String id);}
