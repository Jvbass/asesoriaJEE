package cl.modulo5.asesorias.model.entity;

public class Administrativo extends Usuario {
	
	private String area;

	public Administrativo() {
	}

	public Administrativo(int rut, String nombre, String apellido, String contrasena, String tipo, String area) {
		super(rut, nombre, apellido, contrasena, tipo);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Administrativo [area=" + area + "]";
	}

	
	
	
	
	
}
