package Usuarios;

import java.util.ArrayList;
import java.util.List;

import lineaProducto.Pedido;

public class Cliente extends Usuario {

	private List<Pedido> pedidos = new ArrayList<>();
	
	public Cliente(String nombre, String email, String telefono) {
		super(nombre, email, telefono);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Pedido crearPedido() {
		Pedido p=new Pedido ();
		pedidos.add(p);
		return Pedido;
	}



	public List<Pedido> getPedidos() {
		return pedidos;
	}


}
