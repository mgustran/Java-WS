package es.hiberus.equipo.dao.interfaces;

import java.util.HashMap;
import java.util.Map;

import es.hiberus.equipo.dao.DataBase;
import es.hiberus.equipo.dao.IManagerDAO;
import es.hiberus.equipo.dao.IPersona;
import es.hiberus.equipo.model.Manager;



public class ManagerDAO implements IManagerDAO {

    @Override
    public Boolean create(Manager t) {
        DataBase.getInstance().personas.put(t.getNombre(), (IPersona) t);
        return true;
    }

    @Override
    public Boolean delete(Manager t) {
        DataBase.getInstance().personas.remove(t.getNombre());
        return true;
    }

    @Override
    public Boolean update(Manager t) {
        DataBase.getInstance().personas.put(t.getNombre(), (IPersona) t);
        return true;
    }

    @Override
    public Manager read(String nombre) {
        return (Manager) DataBase.getInstance().personas.get(nombre);
    }

}