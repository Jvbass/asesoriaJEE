package cl.modulo5.asesorias.model.entity;

public class Usuario{
		
	private int rut;
	private String nombre;
	private String apellido;
	private String contrasena;
	private String tipo;
	
	public Usuario() {
	}

	public Usuario(int rut, String nombre, String apellido, String contrasena, String tipo) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.contrasena = contrasena;
		this.tipo = tipo;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Usuario [rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", contrasena=" + contrasena
				+ ", tipo=" + tipo + "]";
	}



	
}
