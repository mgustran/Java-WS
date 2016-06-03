package es.hiberus.equipo.dao.interfaces;

public interface EntrenadorDAO {	
	
	public boolean crear(Entrenador ent);
	
	public boolean eliminar(Entrenador ent);
	
	public boolean modificar(Entrenador ent);
	
	public String read(String id);}
