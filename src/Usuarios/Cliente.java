package Usuarios;

import java.util.ArrayList;
import java.util.List;

import lineaProducto.Pedido;

public class Cliente extends Usuario {

	private List<Pedido> pedidos = new ArrayList<>();
	
	
	public Cliente(String nombre, String email, String telefono) {
		super(nombre, email, telefono);
		this.pedidos = new ArrayList<>();
		
	}



	public Pedido crearPedido(String idPedido,String fechaPedido) {
		Pedido p=new Pedido (idPedido,this,fechaPedido);
		pedidos.add(p);
		return p;
	}



	public List<Pedido> getPedidos() {
		return pedidos;
	}


}


