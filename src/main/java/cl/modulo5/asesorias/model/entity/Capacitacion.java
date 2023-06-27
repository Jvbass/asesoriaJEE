package cl.modulo5.asesorias.model.entity;

public class Capacitacion {
	private int id;
	private String nombre;
	private String detalle;
	
    public Capacitacion() {
    }

    public Capacitacion(int id, String nombre, String detalle) {
        this.id = id;
        this.nombre = nombre;
        this.detalle = detalle;
    }

    public int getId() {
        return id;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", nombre=" + nombre + ", detalle=" + detalle + "]";
	}

}
