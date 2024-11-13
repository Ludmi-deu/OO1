package oo.ej23;

import java.util.ArrayList;
import oo.Bag.*;
import java.util.List;


public class Persona {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private List<Pedido> pedidos;
	private List<Producto> productos;
	
	
	public Persona(String nombre, String apellido, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.pedidos = new ArrayList<Pedido>();
		this.productos = new ArrayList<Producto>();
	}


	public void addProducto(Producto p) {
		productos.add(p);
	}
	

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	
	public void addPedido(Pedido p) {
		pedidos.add(p);
	}
	
	public Pedido crearPedido (Persona comprador, Producto producto, FormaDePago pago, FormaDeEnvio envio, int cantidad) {
		if (producto.HayStock(cantidad)) {
			Pedido p = new Pedido (comprador, producto, pago, envio, cantidad);
			producto.descontarStock(cantidad);
			pedidos.add(p);
			return p;
		}
		return null;
	}
	
	public Bag<String> cantidadProductosPorCategoria(){
		Bag<String> cant = new BagImpl<String>();
		for (Producto p : productos) {
			cant.add(p.getCategoria());
		}
		return cant;
	}

	
	
}
