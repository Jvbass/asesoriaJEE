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
		        int id = rs.getInt("id");
		        String nombre = rs.getString("nombre");
		        String tipo = rs.getString("tipo");
		        Usuario usuario = new Usuario(id, nombre, tipo);
		        capacitaciones.add(usuario);
		      }
		      
		    } catch (Exception e) {
		      System.out.println(e.getMessage());
		    }
		    return capacitaciones;
		  }
}
