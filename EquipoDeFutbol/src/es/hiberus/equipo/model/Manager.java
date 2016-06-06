package es.hiberus.equipo.model;

import java.util.HashMap;

import es.hiberus.equipo.dao.interfaces.*;

public class Manager implements ManagerDAO{
	
	

	@Override
	public boolean crear(Manager m) {
		listaPersonal.put(nombre, m);
		return false;
	}

	@Override
	public boolean eliminar(Manager m) {
		listaPersonal.remove(m);
		return false;
	}

	@Override
	public boolean modificar(Manager m) {
		listaPersonal.replace(nombre, m);
		return false;
	}

	@Override
	public String read(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
