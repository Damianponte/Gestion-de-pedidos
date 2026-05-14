package lineaProducto;
import java.util.ArrayList;
import java.util.List;

import Enums.EstadoPedido;
import Usuarios.Cliente;

public class Pedido {
	private String id;
    private String fechaPedido;
    private EstadoPedido estado;
    private Cliente cliente;
    //private Repartidor repartidor;
    private List<Producto> productos = new ArrayList<>();


}
