package oo.ej23;

public class Producto {
	
	private String nombre;
	private String categoria;
	private double precio;
	private int stock;
	
	
	public Producto(String nombre, String categoria, double precio, int stock) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}


	public String getCategoria() {
		return categoria;
	}


	public double getPrecio() {
		return precio;
	}


	public int getStock() {
		return stock;
	}
	
	public boolean HayStock(int cantidad) {
		return (stock - cantidad) > 0;
	}
	
	public void descontarStock(int cantidad) {
	
		if (HayStock(cantidad)) 
			this.stock -= cantidad;
			
	}
}
