package cl.modulo5.asesorias.model.entity;

public class Cliente {
	private String nombre;
	private String apellido;
	private String telefono;
	private String direccion;
	private String comuna;
	
	public Cliente() {
	}
	
	public Cliente(String nombre, String apellido, String telefono, String direccion, String comuna) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.comuna = comuna;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", direccion="
				+ direccion + ", comuna=" + comuna + "]";
	}
	
}
