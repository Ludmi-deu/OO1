package ejercicio18.ejercicio19;

import java.time.*;


public abstract class Envio {
	
	private LocalDate fecha;
	private String origen;
	private String destino;
	private int peso;
	private double costo;
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public int getPeso() {
		return this.peso;
	}
	
	public String getOrigen() {
		return origen;
	}

	public String getDestino() {
		return destino;
	}

	public double getCosto() {
		return costo;
	}

	public abstract double calcularMonto ();
	

};
