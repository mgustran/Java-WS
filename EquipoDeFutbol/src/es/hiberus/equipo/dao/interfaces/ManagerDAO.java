package es.hiberus.equipo.dao.interfaces;

public interface ManagerDAO {
	
	public boolean crear(Manager m);
	public boolean eliminar(Manager m);
	public boolean modificar(Manager m);
	public String read(String id);}
