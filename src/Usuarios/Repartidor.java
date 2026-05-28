package Usuarios;

import java.util.ArrayList;

import Enums.EstadoRepartidor;
import lineaProducto.Pedido;

public class Repartidor extends Usuario {
	
	
	private String zonaReparto;
	private EstadoRepartidor estado;
	private ArrayList<Pedido>pedidosAsignados;
	
	
	public Repartidor(String nombre, String email, String telefono,String zonaReparto) {
		super(nombre, email, telefono);
		this.zonaReparto = zonaReparto;
		this.estado = EstadoRepartidor.DISPONIBLE;
		
		pedidosAsignados=new ArrayList<>();
	}


	public String getZonaReparto() {
		return zonaReparto;
	}


	

	public EstadoRepartidor getEstado() {
		return estado;
	}


	


	public ArrayList<Pedido> getPedidosAsignados() {
		return pedidosAsignados;
	}


	public void setPedidosAsignados(ArrayList<Pedido> pedidosAsignados) {
		this.pedidosAsignados = pedidosAsignados;
	}
	
	
	public void asignarPedido(Pedido pedido) {
		pedidosAsignados.add(pedido);
		this.estado = EstadoRepartidor.OCUPADO;
	}
	
	public void liberar() {
		this.estado=EstadoRepartidor.DISPONIBLE;
	}

    public void ocupar() {
        estado = EstadoRepartidor.OCUPADO;
    }
   
	
}
