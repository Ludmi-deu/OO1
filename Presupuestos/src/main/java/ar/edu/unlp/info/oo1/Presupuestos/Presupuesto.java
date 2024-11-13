package ar.edu.unlp.info.oo1.Presupuestos;
import java.time.LocalDate;
import java.util.*;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items=new ArrayList<Item>();
	
	public Presupuesto(String cliente) {
		
		this.fecha= LocalDate.now();
		this.cliente = cliente;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public List<Item> getItems() {
		return items;
	}
	
	public void agregarItem(Item items) {
		this.items.add(items);
	}
	
	public double calcularTotal() {
		double aux =0;
		for (Item it:this.items) {
			aux += it.costo();
		}
		return aux;
	}

	public Presupuesto() {
		super();
	}


	
}
