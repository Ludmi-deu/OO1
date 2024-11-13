package oo.ej25;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Veterinario {
	private String nombre;
	private LocalDate fechaIngreso;
	private double honorarios;
	
	public Veterinario(String nombre, LocalDate fechaIngreso, double honorarios) {
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.honorarios = honorarios;
	}
	
	public int getAntiguedad() {
		return (int)ChronoUnit.YEARS.between(fechaIngreso, LocalDate.now());
	}
	
	public double getHonorarios() {
		return this.honorarios;
	}
	
	
}
