package es.hiberus.dao;

import es.hiberus.equipo.dao.interfaces.IEntrenadorDAO;
import es.hiberus.equipo.database.Database;
import es.hiberus.equipo.model.Entrenador;

public class EntrenadorDAO implements IEntrenadorDAO{

	@Override
	public Boolean create(Entrenador t) {
		Database.getInstance().put(t.getNombre(), t);
		return null;
	}

	@Override
	public Boolean delete(Entrenador t) {
		Database.getInstance().remove(t.getNombre());
		return null;
	}

	@Override
	public Boolean update(Entrenador t) {
		Database.getInstance().put(t.getNombre(), t);
		return null;
	}

	@Override
	public Entrenador read(String nombre) {
		return Database.getInstance().get(nombre);
		return null;
	}

}
