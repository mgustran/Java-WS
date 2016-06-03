package es.hiberus.equipo.dao.interfaces;

public interface PorteroDAO {

	public boolean crear(Portero ent);
	public boolean eliminar(Portero ent);
	public boolean modificar(Portero ent);
	public String read(String id);
}
