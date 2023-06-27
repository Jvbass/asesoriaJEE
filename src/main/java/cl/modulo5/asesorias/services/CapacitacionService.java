package cl.modulo5.asesorias.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cl.modulo5.asesorias.conexion.DBConnection;
import cl.modulo5.asesorias.model.entity.Capacitacion;

public class CapacitacionService {

	  DBConnection conexion = DBConnection.getInstance();
	  
	  //creamos nueva capacitacion
	  public static Capacitacion saveCapacitacion(Capacitacion capacitacion) {
		    DBConnection conexion = DBConnection.getInstance();
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

	  
	  //retornamos todas las capacitaciones
	  public static List<Capacitacion> findAllCapacitaciones() {
		    
		    List<Capacitacion> capacitaciones = new ArrayList<>();
		    DBConnection conexion = DBConnection.getInstance();
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
  
}
