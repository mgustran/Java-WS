package es.hiberus.dao;

import es.hiberus.equipo.dao.interfaces.IManagerDAO;
import es.hiberus.equipo.database.Database;
import es.hiberus.equipo.model.Manager;

public class ManagerDAO implements IManagerDAO {

    @Override
    public Boolean create(Manager t) {
        Database.getInstance().put(t.getNombre(), t);
        return true;
    }

    @Override
    public Boolean delete(Manager t) {
        Database.getInstance().remove(t.getNombre());
        return true;
    }

    @Override
    public Boolean update(Manager t) {
        Database.getInstance().put(t.getNombre(), t);
        return true;
    }

    @Override
    public Manager read(String nombre) {
        return Database.getInstance().get(nombre);
     
    }

}
