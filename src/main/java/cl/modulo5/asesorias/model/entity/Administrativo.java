package cl.modulo5.asesorias.model.entity;

public class Administrativo {
	private String nombre;
	private String apellido;
	private String experiencia;
	private String area;
	
	public Administrativo() {
	}

	public Administrativo(String nombre, String apellido, String experiencia, String area) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.experiencia = experiencia;
		this.area = area;
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

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Administrativo [nombre=" + nombre + ", apellido=" + apellido + ", experiencia=" + experiencia
				+ ", area=" + area + "]";
	}
	
	
	
	
	
}
