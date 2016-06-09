package es.hiberus.dao;

import es.hiberus.equipo.dao.interfaces.IJugadorDAO;
import es.hiberus.equipo.database.Database;
import es.hiberus.equipo.model.Jugador;

public class JugadorDAO implements IJugadorDAO{

	@Override
	public Boolean create(Jugador t) {
		Database.getInstance().put(t.getNombre(), t);
		return null;
	}

	@Override
	public Boolean delete(Jugador t) {
		Database.getInstance().remove(t.getNombre());
		return null;
	}

	@Override
	public Boolean update(Jugador t) {
		Database.getInstance().put(t.getNombre(), t);
		return null;
	}

	@Override
	public Jugador read(String nombre) {
		return Database.getInstance().get(nombre);
		return null;
	}

}
