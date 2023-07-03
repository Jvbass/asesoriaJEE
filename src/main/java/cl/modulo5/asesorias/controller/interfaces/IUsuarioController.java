package cl.modulo5.asesorias.controller.interfaces;

import java.util.List;

import cl.modulo5.asesorias.model.entity.Administrativo;
import cl.modulo5.asesorias.model.entity.Cliente;
import cl.modulo5.asesorias.model.entity.Profesional;
import cl.modulo5.asesorias.model.entity.Usuario;

public interface IUsuarioController {
	public List<Usuario> findAllUsuarios();
	
	public Usuario saveCliente(Cliente cliente);
	
	public Usuario saveProfesional(Profesional profesional);
	
	public Usuario saveAdministrativo(Administrativo administrativo);
	
	public void deleteUsuarioByRut(int rut);
	
	public Usuario updateUsuario(Usuario usuario);
	
	public Usuario findByRutUsuario(int rut);

		
}
