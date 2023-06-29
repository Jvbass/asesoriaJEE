package cl.modulo5.asesorias.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cl.modulo5.asesorias.conexion.DBConnection;
import cl.modulo5.asesorias.model.entity.Usuario;

public class UsuarioService {

	  //retornamos todas las capacitaciones
	  public static List<Usuario> findAllUsuarios() {
		    
		    List<Usuario> capacitaciones = new ArrayList<>();
		    DBConnection conexion = DBConnection.getInstance();
		    String sql = "SELECT * FROM usuarios";
		    
		    try {
		      
		      PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
		      ResultSet rs = statement.executeQuery();
		      
		      while(rs.next()) {
		        int rut = rs.getInt("rut");
		        String nombre = rs.getString("nombre");
		        String apellido = rs.getString("apellido");
		        String contrasena = rs.getString("contrasena");
		        String tipo = rs.getString("tipo");
		        Usuario usuario = new Usuario(rut, nombre, apellido,contrasena,tipo);
		        capacitaciones.add(usuario);
		      }
		      
		    } catch (Exception e) {
		      System.out.println(e.getMessage());
		    }
		    return capacitaciones;
		  }
}
