package ar.edu.unlp.info.oo1.balanzaElectronica;
import java.time.LocalDate;
import java.util.*;

public class Ticket {
	private LocalDate fecha;
	private List<Producto> productos;
	private int cantidadDeProductos;
	private double pesoTotal=0;
	private double precioTotal=0;
	
	 public Ticket(List<Producto> productos) {
	        this.fecha = LocalDate.now();
	        this.productos = new ArrayList<>(productos);
	        for (Producto p : productos) {
	        	this.pesoTotal += p.getPeso();
		        this.precioTotal += p.getPrecio();
	        }
	        this.cantidadDeProductos = productos.size();
	    }
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	public List<Producto> getProductos(){
		return productos;
	}
	
	public double getPesoTotal() {
		return pesoTotal;
	}
	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	public double impuesto() {
		return this.precioTotal*0.21;
	}

}
