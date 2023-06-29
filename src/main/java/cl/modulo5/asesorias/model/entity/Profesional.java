package cl.modulo5.asesorias.model.entity;

public class Profesional extends Usuario {
	private String profesion;

	public Profesional() { 
	}

	public Profesional(int rut, String nombre, String apellido, String contrasena, String tipo, String profesion) {
		super(rut, nombre, apellido, contrasena, tipo);
		this.profesion = profesion;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	@Override
	public String toString() {
		return "Profesional [profesion=" + profesion + "]";
	}
	
}
