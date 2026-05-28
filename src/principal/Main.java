package principal;

import java.util.ArrayList;
import java.util.Scanner;

import Enums.Categoria;
import Usuarios.Cliente;
import Usuarios.Repartidor;
import excepciones.ProductoException;
import lineaProducto.Pedido;
import lineaProducto.Producto;

public class Main {

	 public static void main(String[] args) throws ProductoException {

	        Scanner entrada = new Scanner(System.in);

	        Cliente cliente = new Cliente("Loida", "loida@email.com", "123");
	        Repartidor repartidor = new Repartidor("Paco", "Pacopaquito@email.com", "456", "Centro");
	        
	        
	        ArrayList<Producto>catalogo =new ArrayList<>();
	        catalogo.add(new Producto("Pizza", 10, Categoria.COMIDA));
	        catalogo.add(new Producto("Refresco", 2, Categoria.BEBIDA));
	        catalogo.add(new Producto("Helado", 3, Categoria.POSTRE));
	        catalogo.add(new Producto("hamburguesa", 5, Categoria.COMIDA));
	        catalogo.add(new Producto("agua", 1.5, Categoria.BEBIDA));
	        catalogo.add(new Producto("tarta",3.5 , Categoria.POSTRE));
	        
	        Pedido pedido = cliente.crearPedido();
	        
	        System.out.println("Pedido creado con ID: " + pedido.getId());
	        System.out.println("Fecha: " + pedido.getFechaPedido());
	        
	 

	   
	        String respuesta;

	        do {
	        	 System.out.println("\n--- CATÁLOGO ---");

	             for (int i = 0; i < catalogo.size(); i++) {
	                 System.out.println((i + 1) + ". " + catalogo.get(i));
	             } 
	             
	            System.out.println("eleje producto:");
	           int opcion=entrada.nextInt()-1;
	           entrada.nextLine();
	           
	           if (opcion >= 0 && opcion < catalogo.size()) {
	                pedido.AgregarProducto(catalogo.get(opcion));
	            }

	            System.out.print("¿Añadir otro producto? (S/N): ");
	            respuesta = entrada.nextLine().toUpperCase();

	           

	        } while (respuesta.equals("S"));

	        		pedido.calcularTotal();

	        System.out.println("Asignando repartidor!");
	        if (pedido.asignarRepartidor(repartidor)) {
	            System.out.println("Repartidor asignado: " + repartidor.getNombre());
	        } else {
	            System.out.println("No se pudo asignar");
	        }

	        System.out.print("\n¿Entregar pedido? (s/N): ");
	        String entregar = entrada.nextLine().toUpperCase();

	        if (entregar.equals("S")) {
	            pedido.entregar();
	         
	        }

	        System.out.println(" ESTADO FINAL");
	        System.out.println("Pedido: " + pedido.getEstado());
	        System.out.println("Repartidor: " + repartidor.getEstado());

	        entrada.close();
	    }
	}
