package cl.modulo5.asesorias.model.entity;

public class Profesional {
	private String nombre;
	private String apellido;
	private String tituloProfesional;
	private String fechaEgreso;
	
	public Profesional() { 
	}

	public Profesional(String nombre, String apellido, String tituloProfesional, String fechaEgreso) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.tituloProfesional = tituloProfesional;
		this.fechaEgreso = fechaEgreso;
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

	public String getTituloProfesional() {
		return tituloProfesional;
	}

	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
	}

	public String getFechaEgreso() {
		return fechaEgreso;
	}

	public void setFechaEgreso(String fechaEgreso) {
		this.fechaEgreso = fechaEgreso;
	}

	@Override
	public String toString() {
		return "Profesional [nombre=" + nombre + ", apellido=" + apellido + ", tituloProfesional=" + tituloProfesional
				+ ", fechaEgreso=" + fechaEgreso + "]";
	}

	
	
}
