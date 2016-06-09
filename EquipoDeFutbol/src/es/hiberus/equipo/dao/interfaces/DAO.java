package es.hiberus.equipo.dao.interfaces;

public interface DAO<T> {
	
	   public Boolean create(T t);
	   public Boolean delete(T t);
	   public Boolean update(T t);
	   public T read(String nombre);

}
