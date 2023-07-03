package cl.modulo5.asesorias.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cl.modulo5.asesorias.conexion.DBConnection;
import cl.modulo5.asesorias.model.entity.Capacitacion;

public class CapacitacionService {

	  static DBConnection conexion = DBConnection.getInstance();
	  
	  //para nueva capacitacion
	  public static Capacitacion saveCapacitacion(Capacitacion capacitacion) {
		    String sql = "INSERT INTO capacitaciones (nombre, detalle) VALUES (?, ?)";
		    
		    try {
		        PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
		        statement.setString(1, capacitacion.getNombre());
		        statement.setString(2, capacitacion.getDetalle());

		        
		        statement.executeUpdate();

		    } catch (Exception e) {
		        System.out.println(e.getMessage());
		    }
		    
		    return null; // Si la inserción falla, se retorna null
		}

	  
	  //para retornar todas las capacitaciones
	  public static List<Capacitacion> findAllCapacitaciones() {   
		    List<Capacitacion> capacitaciones = new ArrayList<>();

		    String sql = "SELECT * FROM capacitaciones";
		    
		    try {
		      
		      PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
		      ResultSet rs = statement.executeQuery();
		      
		      while(rs.next()) {
		        int id = rs.getInt("id");
		        String nombre = rs.getString("nombre");
		        String detalle = rs.getString("detalle");
		        Capacitacion capacitacion = new Capacitacion(id, nombre, detalle);
		        capacitaciones.add(capacitacion);
		      }
		      
		    } catch (Exception e) {
		      System.out.println(e.getMessage());
		    }
		    return capacitaciones;
		  }

	  //para retornar capacitacion por id 
	  public static Capacitacion findByIdCapacitacion(int id) {    
		  Capacitacion capacitacion = null;
		    String sql = "SELECT * FROM capacitaciones WHERE id = ?";
		    
		    try {
		      
		      PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
		      statement.setInt(1, id);
		      ResultSet rs = statement.executeQuery();
		      
		      if(rs.next()) {
		        String nombre = rs.getString("nombre");
		        String detalle = rs.getString("detalle");
		        
		        capacitacion = new Capacitacion(id, nombre, detalle);
		        
		      }
		    } catch (Exception e) {
		      System.out.println(e.getMessage());
		    }
		    
		    return capacitacion;
		  }

	  //para actualizar capacitacion
	  public static Capacitacion updateCapacitacion(Capacitacion capacitacion) {
		  String sql = "UPDATE capacitaciones SET nombre = ?, detalle = ? WHERE id = ?";
		    
		    try {
		      PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
		      statement.setString(1, capacitacion.getNombre());
		      statement.setString(2, capacitacion.getDetalle());
		      statement.setInt(3, capacitacion.getId());
		      statement.executeUpdate();
		      
		    } catch (Exception e) {
		      System.out.println(e.getMessage());
		    }
		    
		    return capacitacion;
	}
	  
	  //para borrar capacitacion
	  public static boolean deleteCapacitacionById(int idCapacitacion) {
		    String sql = "DELETE FROM capacitaciones WHERE id = ?" ;
		    
		    try {
		      PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
		      statement.setInt(1, idCapacitacion);
		      int rowsAffected = statement.executeUpdate();
		      
		      return rowsAffected > 0;
		    } catch (Exception e) {
		      System.out.println(e.getMessage());
		      return false;
		    }
		     
		  }
  
}
