package Usuarios;

import java.util.ArrayList;

import Enums.EstadoRepartidor;
import lineaProducto.Pedido;

public class Repartidor extends Usuario {
	
	
	private String zonaReparto;
	private EstadoRepartidor estado;
	private ArrayList<Pedido>pedidosAsignados;
	
	
	public Repartidor(String nombre, String email, String telefono) {
		super(nombre, email, telefono);
		
		this.zonaReparto = zonaReparto;
		this.estado = EstadoRepartidor.disponible;
		
		pedidosAsignados=new ArrayList<>();
	}


	public String getZonaReparto() {
		return zonaReparto;
	}


	public void setZonaReparto(String zonaReparto) {
		this.zonaReparto = zonaReparto;
	}


	public EstadoRepartidor getEstado() {
		return estado;
	}


	public void setEstado(EstadoRepartidor estado) {
		this.estado = estado;
	}


	public ArrayList<Pedido> getPedidosAsignados() {
		return pedidosAsignados;
	}


	public void setPedidosAsignados(ArrayList<Pedido> pedidosAsignados) {
		this.pedidosAsignados = pedidosAsignados;
	}
	
	
	public void asignarPedido(Pedido pedido) {
		pedidosAsignados.add(pedido);
		this.estado = EstadoRepartidor.ocupado;
	}
	
	public void liberar() {
		this.estado=EstadoRepartidor.disponible;
	}
	
}
