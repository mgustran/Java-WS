
package es.hiberus.equipo.dao;

import java.util.HashMap;
import java.util.Map;

public class DataBase {

   private static DataBase INSTANCE;

   public Map<String, IPersona> personas = new HashMap<>(20);

   public DataBase() {
       // Exists only to defeat instantiation.
   }

   public static DataBase getInstance() {
       if(INSTANCE == null) {
           INSTANCE = new DataBase();
       }
       return INSTANCE;
   }

   public Map<String, IPersona> getPersonas() {
       return personas;
   }

}