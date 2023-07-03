package cl.modulo5.asesorias.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cl.modulo5.asesorias.conexion.DBConnection;
import cl.modulo5.asesorias.model.entity.Administrativo;
import cl.modulo5.asesorias.model.entity.Cliente;
import cl.modulo5.asesorias.model.entity.Profesional;
import cl.modulo5.asesorias.model.entity.Usuario;

public class UsuarioService {
	  static DBConnection conexion = DBConnection.getInstance();
	
	//para guardar usuario tipo cliente
	public static Cliente saveCliente(Cliente cliente) {
		saveUsuario(cliente);

		String sqlTipo = "INSERT INTO cliente (telefono, usuario_rut ) VALUES (?, ?)";

		try {
			PreparedStatement statementTipo = conexion.getConnection().prepareStatement(sqlTipo);

			statementTipo.setString(1, cliente.getTelefono());
			statementTipo.setInt(2, cliente.getRut());
			
			statementTipo.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return cliente; // Si la inserción falla, se retorna null
	}
	
	//para guardar profesional
	public static Profesional saveProfesional(Profesional profesional) {
		saveUsuario(profesional);
		String sqlTipo = "INSERT INTO profesional (profesion, usuario_rut ) VALUES (?, ?)";

		try {
			PreparedStatement statementTipo = conexion.getConnection().prepareStatement(sqlTipo);

			statementTipo.setString(1, profesional.getProfesion());
			statementTipo.setInt(2, profesional.getRut());
			
			statementTipo.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return profesional; // Si la inserción falla, se retorna null
	}
	
	//para guardar administrativo
	public static Administrativo saveAdministrativo(Administrativo administrativo) {
		saveUsuario(administrativo);
		String sqlTipo = "INSERT INTO administrativo (area, usuario_rut ) VALUES (?, ?)";

		try {
			PreparedStatement statementTipo = conexion.getConnection().prepareStatement(sqlTipo);

			statementTipo.setString(1, administrativo.getArea());
			statementTipo.setInt(2, administrativo.getRut());
			
			statementTipo.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return administrativo; // Si la inserción falla, se retorna null
	}
	
	//para guardar usuarios (se reutiliza en cada tipo de usuario)
	public static void saveUsuario(Usuario usuario) {
	    String sql = "INSERT INTO usuarios (rut, nombre, apellido, contrasena, tipo) VALUES (?, ?, ?, ?, ?)";

	    try {
	        PreparedStatement statement = conexion.getConnection().prepareStatement(sql);

	        statement.setInt(1, usuario.getRut());
	        statement.setString(2, usuario.getNombre());
	        statement.setString(3, usuario.getApellido());
	        statement.setString(4, usuario.getContrasena());
	        statement.setString(5, usuario.getTipo());

	        statement.executeUpdate();
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
	}

	// Service para retornar todos los usuarios
	public static List<Usuario> findAllUsuarios() {

		List<Usuario> usuarios = new ArrayList<>();
		String sql = "SELECT * FROM usuarios";

		try {

			PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				int rut = rs.getInt("rut");
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				String contrasena = rs.getString("contrasena");
				String tipo = rs.getString("tipo");
				Usuario usuario = new Usuario(rut, nombre, apellido, contrasena, tipo);
				usuarios.add(usuario);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return usuarios;
	}
	
	//Service para borrar Usuario
	public static boolean deleteUsuarioByRut(int rut) {
		
		boolean userDeleted = false;
		
	    String sqlUsuario = "DELETE FROM Usuarios WHERE rut = ?" ;
	    String sqlAdm = "DELETE FROM administrativo WHERE usuario_rut = ?" ;
	    String sqlPro = "DELETE FROM profesional WHERE usuario_rut = ?" ;
	    String sqlCli = "DELETE FROM cliente WHERE usuario_rut = ?" ;
	    
	    try {        
	        PreparedStatement statementClient = conexion.getConnection().prepareStatement(sqlCli);
	        statementClient.setInt(1, rut);
	        int rowsClientAffected = statementClient.executeUpdate();
	        
	        PreparedStatement statementAdmin = conexion.getConnection().prepareStatement(sqlAdm);
	        statementAdmin.setInt(1, rut);
	        int rowsAdminAffected = statementAdmin.executeUpdate();
	        
	        PreparedStatement statementPro = conexion.getConnection().prepareStatement(sqlPro);
	        statementPro.setInt(1, rut);
	        int rowsProAffected = statementPro.executeUpdate();
	      
	     // Borrar usuario si no hay registros asociados en las otras tablas
	        if (rowsClientAffected > 0 || rowsAdminAffected > 0 || rowsProAffected > 0) {
	            PreparedStatement statementUser = conexion.getConnection().prepareStatement(sqlUsuario);
	            statementUser.setInt(1, rut);
	            int rowsUserAffected = statementUser.executeUpdate();
	            
	            userDeleted = rowsUserAffected > 0;
	        }
	        
	        return userDeleted;
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	        return false;
	    }
	}
}
