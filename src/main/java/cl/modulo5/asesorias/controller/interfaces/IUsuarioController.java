package cl.modulo5.asesorias.controller.interfaces;

import java.util.List;

import cl.modulo5.asesorias.model.entity.Usuario;

public interface IUsuarioController {
	public List<Usuario> findAllUsuarios();
	
	public Usuario saveUsuario(Usuario usuario);
	
	public void deleteUsuario(int id);
	
	public Usuario updateUsuario(Usuario usuario);
	
	public Usuario findByIdUsuario(int id);
		
}
