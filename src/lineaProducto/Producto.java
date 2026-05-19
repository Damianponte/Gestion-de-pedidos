package lineaProducto;
import Enums.Categoria;
import excepciones.ProductoException;

public class Producto {

	private String nombre;
	private double precio;
	private Categoria categoria;
	public Producto(String nombre, double precio, Categoria categoria) {
	
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
	
	public String NombreProducto() {
			return nombre + " : " + precio + " €" + categoria;
		}
	
	public boolean comprobarPedido(Producto p) throws ProductoException {
		if(p==null) {
			throw new ProductoException("El producto no puede ser nulo.");
		
		}
		if(this.nombre == null && this.nombre.equalsIgnoreCase(p.getNombre())) {
			System.out.println("ya hai un producto que se llama asi");
			return false;
		
		}
		return false;
		
		
	}
	
	
}
