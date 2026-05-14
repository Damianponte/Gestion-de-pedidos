package Usuarios;

public abstract class Usuario {

	private String nombre;
	private String email;
	private String telefono;
	public Usuario(String nombre, String email, String telefono) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	public String mostrarDatos() {
		
		return "nombre: " + nombre +
				" telefono: " + telefono +
				"email:" + email;
	}
		
	
}
