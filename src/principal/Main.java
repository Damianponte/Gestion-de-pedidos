package principal;

import java.util.Scanner;

import Enums.Categoria;
import Usuarios.Cliente;
import Usuarios.Repartidor;
import excepciones.ProductoException;
import lineaProducto.Pedido;
import lineaProducto.Producto;

public class Main {

	 public static void main(String[] args) throws ProductoException {

	        Scanner sc = new Scanner(System.in);

	        Cliente cliente = new Cliente("Loida", "loida@email.com", "123");
	        Repartidor repartidor = new Repartidor("Paco", "Pacopaquito@email.com", "456", "Centro");

	        System.out.println("=== CREAR PEDIDO ===");
	        System.out.print("ID del pedido: ");
	        String id = sc.nextLine();
	        System.out.print("indique la fecha ");
	        String fecha = sc.nextLine();

	        Pedido pedido = cliente.crearPedido(id,fecha);
	        String respuesta;

	        do {
	            System.out.println("\n--- AÑADIR PRODUCTO ---");
	            System.out.print("Nombre: ");
	            String nombre = sc.nextLine();

	            System.out.print("Precio: ");
	            double precio = sc.nextDouble();
	            sc.nextLine(); 

	            System.out.println("Categoría:");
	            System.out.println("1. BEBIDA");
	            System.out.println("2. COMIDA");
	            System.out.println("3. POSTRE");
	            System.out.print("Elige opción: ");
	            int cat = sc.nextInt();
	            sc.nextLine();

	            Categoria categoria;

	            switch (cat) {
	                case 1:
	                    categoria = Categoria.BEBIDA;
	                    break;
	                case 2:
	                    categoria = Categoria.COMIDA;
	                    break;
	                case 3:
	                    categoria = Categoria.POSTRE;
	                    break;
	                default:
	                    System.out.println("Opción inválida, se asigna COMIDA");
	                    categoria = Categoria.COMIDA;
	            }

	            Producto p = new Producto(nombre, precio, categoria);
	            pedido.AgregarProducto(p);

	            System.out.print("¿Añadir otro producto? (S/N) ");
	            respuesta = sc.nextLine().toUpperCase(); 

	        } while (respuesta.equals("S"));

	        		pedido.calcularTotal();

	        System.out.println("\nAsignando repartidor...");
	        if (pedido.asignarRepartidor(repartidor)) {
	            System.out.println("Repartidor asignado");
	        } else {
	            System.out.println("No se pudo asignar");
	        }

	        System.out.print("\n¿Entregar pedido? (s/N): ");
	        String entregar = sc.nextLine().toUpperCase();

	        if (entregar.equals("S")) {
	            pedido.entregar();
	         
	        }

	        System.out.println("\n=== ESTADO FINAL ===");
	        System.out.println("Pedido: " + pedido.getEstado());
	        System.out.println("Repartidor: " + repartidor.getEstado());

	        sc.close();
	    }
	}
