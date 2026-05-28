package Usuarios;

import java.util.ArrayList;
import java.util.List;

import lineaProducto.Pedido;

public class Cliente extends Usuario {

	private List<Pedido> pedidos = new ArrayList<>();
	 private static int contadorPedidos = 1;
	
	public Cliente(String nombre, String email, String telefono) {
		super(nombre, email, telefono);
		this.pedidos = new ArrayList<>();
		
	}



	public Pedido crearPedido() {
		 String id = "PED" + contadorPedidos++;
		Pedido p=new Pedido (id,this);
		pedidos.add(p);
		return p;
	}



	public List<Pedido> getPedidos() {
		return pedidos;
	}


}


