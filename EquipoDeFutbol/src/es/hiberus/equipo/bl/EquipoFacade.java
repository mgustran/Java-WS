package es.hiberus.equipo.bl;




public interface EquipoFacade {
	
	public void jugar();
	
	public void comprobarEquipo();
	
	public void agregar(Manager manager);
	
	public void agregar(Jugador jugador);
	
	public void agregar(Entrenador entrenador);
	
	public void modificar(Manager manager);
	
	public void modificar(Jugador jugador);
	
	public void modificar(Entrenador entrenador);
	
	public void quitar(Manager manager);
	
	public void quitar(Jugador jugador);
	
	public void quitar(Entrenador entrenador);
}