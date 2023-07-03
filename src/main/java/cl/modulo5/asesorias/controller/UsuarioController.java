package cl.modulo5.asesorias.controller;

import java.util.List;

import cl.modulo5.asesorias.controller.interfaces.IUsuarioController;
import cl.modulo5.asesorias.model.entity.Administrativo;
import cl.modulo5.asesorias.model.entity.Cliente;
import cl.modulo5.asesorias.model.entity.Profesional;
import cl.modulo5.asesorias.model.entity.Usuario;
import cl.modulo5.asesorias.services.UsuarioService;

public class UsuarioController implements IUsuarioController{

	@Override
	public List<Usuario> findAllUsuarios() {
		return UsuarioService.findAllUsuarios();
	}

	@Override
	public Usuario saveCliente(Cliente cliente) {
		return UsuarioService.saveCliente(cliente);
	}
	
	@Override
	public Usuario saveProfesional(Profesional profesional) {
		return UsuarioService.saveProfesional(profesional);
	}
	
	@Override
	public Usuario saveAdministrativo(Administrativo administrativo) {
		return UsuarioService.saveAdministrativo(administrativo);
	}

	@Override
	public void deleteUsuarioByRut(int id) {
	    boolean isDeleted = UsuarioService.deleteUsuarioByRut(id);
	    if(isDeleted) {
	        System.out.println("Usuario borrado");
	      } else {
	        System.out.println("Error al borrar Usuario");
	      }		
	}

	@Override
	public Usuario updateUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findByRutUsuario(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
