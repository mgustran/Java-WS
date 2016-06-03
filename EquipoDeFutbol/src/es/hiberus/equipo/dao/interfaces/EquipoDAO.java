package es.hiberus.equipo.dao.interfaces;

public interface EquipoDAO {
	
	public boolean crear(Equipo e);
	public boolean eliminar(Equipo e);
	public boolean modificar(Equipo e);
	public String read(String id);

}
