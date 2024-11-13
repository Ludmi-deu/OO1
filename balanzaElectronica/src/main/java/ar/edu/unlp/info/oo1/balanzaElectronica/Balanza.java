package ar.edu.unlp.info.oo1.balanzaElectronica;

import java.util.*;

public class Balanza {
	private List<Producto> productos;
	
	public void ponerEnCero() {
		this.productos.clear();
	}
	
	public void agregarProducto(Producto prod) {
		this.productos.add(prod);
	}
	
	public Ticket emitirTicket() {
		Ticket aux = new Ticket(this.productos);
		return aux;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	
}
