package es.hiberus.equipo.model;

import java.util.HashMap;

import es.hiberus.equipo.dao.*;
import es.hiberus.equipo.dao.interfaces.ManagerDAO;

public class Manager extends Persona implements ManagerDAO {
	
	DataBase db = new DataBase();

	public boolean crear (Manager m) {
		db.personas
		return false;
	}

	@Override
	public boolean eliminar(Manager m) {
		listaPersonal.remove(m);
		return false;
	}

	@Override
	public boolean modificar(Manager m) {
		listaPersonal.replace(getNombre(), m);
		return false;
	}

	@Override
	public String read(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
