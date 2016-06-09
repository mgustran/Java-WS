package es.hiberus.equipo.database;
import java.util.HashMap;
import java.util.Map;

import es.hiberus.equipo.model.Persona;

public class Database {
	
	private static Database INSTANCE;
	private Map<String, Persona> personas;
	
	protected Database(){		
		//Exists only to defeat instantiation.
	}
	
	public Map<String, Persona> getPersonas() {
		return personas;
	}


	public static Database getInstance(){
		if(INSTANCE == null){
			INSTANCE = new Database();
		}
		
		return INSTANCE;
	}
	
}
