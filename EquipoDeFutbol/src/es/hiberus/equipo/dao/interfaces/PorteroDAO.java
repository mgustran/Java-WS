package es.hiberus.equipo.dao.interfaces;

import es.hiberus.equipo.model.Portero;

public interface PorteroDAO {

	public boolean crear(Portero ent);
	public boolean eliminar(Portero ent);
	public boolean modificar(Portero ent);
	public String read(String id);
}
