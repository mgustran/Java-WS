package es.hiberus.equipo.dao.interfaces;

import java.util.HashMap;

import es.hiberus.equipo.model.Portero;

public interface PorteroDAO {
	
	public HashMap listaPersonal = new HashMap();

	public boolean crear(Portero ent);
	
	public boolean eliminar(Portero ent);
	
	public boolean modificar(Portero ent);
	
	public String read(String id);
}
