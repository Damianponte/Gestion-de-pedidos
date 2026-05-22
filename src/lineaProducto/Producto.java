package lineaProducto;
import Enums.Categoria;
import excepciones.ProductoException;

public class Producto {

	private String nombre;
	private double precio;
	private Categoria categoria;
	
	public Producto(String nombre, double precio, Categoria categoria) throws ProductoException {
		if(nombre== null) {
			throw new ProductoException("El nombre del producto no puede estar vacío.");
			
		}
		
		if(precio<=0) {
			throw new ProductoException("El precio no puede ser negativo,ni cero");
			
		}
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
	}
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	
	public String NombreProducto() {
			return nombre + " : " + precio + " €" + "por" + categoria;
		}
	
	public boolean comprobarProducto(Producto p) throws ProductoException {
		if(p==null) {
			throw new ProductoException("El producto no puede ser nulo.");
		
		}
		if(this.nombre != null && this.nombre.equalsIgnoreCase(p.getNombre())) {
			System.out.println("ya hai un producto que se llama asi");
			return true;
		
		}
		return false;
		
		
	}
	
	
}
