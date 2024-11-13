package ejercicio18.ej20;

import java.time.LocalDate;


public abstract class Contrato {
	private LocalDate fechaInicio;	
	
	public Contrato(LocalDate fechaInicio) {
		super();
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	
	
	public abstract int getAntiguedad() ;
	
	
	public abstract boolean vigente() ;
		
	
	public abstract double saldoBasico();
	
}
