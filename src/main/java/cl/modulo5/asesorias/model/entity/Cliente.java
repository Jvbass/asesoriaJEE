package cl.modulo5.asesorias.model.entity;

public class Cliente extends Usuario{
	private String telefono;

	public Cliente() {
	}

	public Cliente(int rut, String nombre, String apellido, String contrasena, String tipo, String telefono) {
		super(rut, nombre, apellido, contrasena, tipo);
		this.telefono = telefono;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

    @Override
    public String toString() {
        return "Cliente [telefono=" + telefono + ", nombre=" + getNombre() + ", apellido=" + getApellido() + ", tipo=" + getTipo() + "]";
    }
	
}
