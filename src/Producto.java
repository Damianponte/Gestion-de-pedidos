import Enums.Categoria;

public class Producto {

	private String nombre;
	private double precio;
	private Categoria categoria;
	public Producto(String nombre, double precio, Categoria categoria) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
		public String mostrarDatos() {
			return nombre + " : " + precio + " €" + categoria;
		}
	
}
