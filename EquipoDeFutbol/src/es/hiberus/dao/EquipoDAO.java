package es.hiberus.dao;

import es.hiberus.equipo.dao.interfaces.IEquipoDAO;
import es.hiberus.equipo.database.Database;
import es.hiberus.equipo.model.Equipo;

public class EquipoDAO implements IEquipoDAO{

	@Override
	public  boolean create(Equipo t) {
		Database.getInstance().put(t.getNombre(), t);
		return null;
	}

	@Override
	public Boolean delete(Equipo t) {
		Database.getInstance().remove(t.getNombre());
		return null;
	}

	@Override
	public Boolean update(Equipo t) {
		Database.getInstance().put(t.getNombre(), t);
		return null;
	}

	@Override
	public Equipo read(String nombre) {
		return Database.getInstance().get(nombre);
		return null;
	}

}
