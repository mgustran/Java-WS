package es.hiberus.equipo.dao.interfaces;

public interface DAO<T> {
	
	   public boolean create(T t);
	   public boolean delete(T t);
	   public boolean update(T t);
	   public T read(String nombre);

}
