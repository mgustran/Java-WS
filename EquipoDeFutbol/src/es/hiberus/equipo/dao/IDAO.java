package es.hiberus.equipo.dao;

public interface IDAO<T> {

	   public Boolean create(T t);
	   public Boolean delete(T t);
	   public Boolean update(T t);
	   public T read(String nombre);

	}