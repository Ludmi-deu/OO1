package oo.ej24;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vehiculo {
	
	private String descripcion;
	private int capacidad;
	private int anioFabricacion;
	private double valorMercado;
	
	
	public Vehiculo(String descripcion, int capacidad, int anioFabricacion, double valorMercado) {
		super();
		this.descripcion = descripcion;
		this.capacidad = capacidad;
		this.anioFabricacion = anioFabricacion;
		this.valorMercado = valorMercado;
	}

	
	public double getValorMercado() {
		return valorMercado;
	}


	public boolean hayCapacidad(int cantidad) {
		return (capacidad - cantidad) > 0;
	}
	
	public boolean menorCincoAnios() {
		return (2024-anioFabricacion) < 5;
	}
	
	
}
