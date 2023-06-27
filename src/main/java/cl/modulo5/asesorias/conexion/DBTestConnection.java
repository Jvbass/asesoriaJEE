package cl.modulo5.asesorias.conexion;
import java.sql.ResultSet;
import java.sql.Statement;

import cl.modulo5.asesorias.model.entity.Capacitacion;

public class DBTestConnection {
  
  private static DBConnection instanceDbConnection;
  
  DBTestConnection() {
    instanceDbConnection = DBConnection.getInstance();
  }
  
  public static void main(String[] args) {
    new DBTestConnection();
    findAllCapacitaciones();
 
  }
  
  public static void findAllCapacitaciones() {
    
    String sql = "SELECT * FROM capacitacion";
    
    try {
      Statement statement = instanceDbConnection.getConnection().createStatement();
      ResultSet resultSet = statement.executeQuery(sql);
      
      while(resultSet.next()) {
          int id = resultSet.getInt("id");
          String nombre = resultSet.getString("nombre");
          String detalle = resultSet.getString("detalle");
        
   
        Capacitacion capacitacion = new Capacitacion(id, nombre, detalle);
        System.out.println(capacitacion.toString());
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
  
}
