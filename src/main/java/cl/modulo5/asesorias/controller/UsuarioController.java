package cl.modulo5.asesorias.controller;

import java.util.List;

import cl.modulo5.asesorias.controller.interfaces.IUsuarioController;
import cl.modulo5.asesorias.model.entity.Usuario;
import cl.modulo5.asesorias.services.UsuarioService;

public class UsuarioController implements IUsuarioController{

	@Override
	public List<Usuario> findAllUsuarios() {
		return UsuarioService.findAllUsuarios();
	}

	@Override
	public Usuario saveUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUsuario(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario updateUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findByIdUsuario(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
