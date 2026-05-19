package lineaProducto;
import java.util.ArrayList;
import java.util.List;

import Enums.EstadoPedido;
import Enums.EstadoRepartidor;
import Usuarios.Cliente;
import Usuarios.Repartidor;
import excepciones.ProductoException;

public class Pedido {
	private String id;
    private String fechaPedido;
    private EstadoPedido estado;
    private Cliente cliente;
    private Repartidor repartidor;
    private List<Producto> productos = new ArrayList<>();
    
    
	public String getId() {
		return id;
	}
	
	public String getFechaPedido() {
		return fechaPedido;
	}
	
	public EstadoPedido getEstado() {
		return estado;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public List<Producto> getProductos() {
		return productos;
	}


	public void AgregarProducto(Producto producto) throws ProductoException {
		
		if(producto == null) {
			throw new ProductoException("no se a encontrado ese producto");
			
		}
		
		boolean existe=false;
		
		for(Producto p:productos) {
			if (p.getNombre().equalsIgnoreCase(producto.getNombre())) {
	            existe = true;
	            break;
	        }
	    
		}
		if(existe) {
			 throw new ProductoException (" el producto " + producto.getNombre() + " ya esta existe");
		
		}else {
			
			productos.add(producto);
			System.out.println("el producto se ha añadido correctamente");
		}
		
	}
	
	public void CalcularTotal() {
		double total=0.0;
		
		for(Producto p:productos) {
			
			total += p.getPrecio();
			
		}
		System.out.println("el precio total del pedido es : " + total);
	}
	
	public boolean asignarRepartidor(Repartidor repartidor) {
	   
	    if (productos.isEmpty()) return false;
	    
	  
	    if (repartidor.getEstado() != EstadoRepartidor.disponible) return false;
	    
	    if (estado != EstadoPedido.pendiente) return false;

	  
	    this.repartidor = repartidor;
	    this.estado = EstadoPedido.reparto;
	    
	  
	    repartidor.setEstado(EstadoRepartidor.ocupado); 
	    repartidor.asignarPedido(this);
	    
	    return true;
	}
	public void entregar() {
        if (estado == EstadoPedido.reparto) {
            this.estado = EstadoPedido.entregado;
            if (repartidor != null) {
                repartidor.liberar();
            }
        }
    }

    public void cancelar() {
        if (estado == EstadoPedido.pendiente) {
            this.estado = EstadoPedido.cancelado;
        }
    }
	
		
	
	
	
		
		
		
	
	
	
	
	
	
	
	
	
	
	
}
