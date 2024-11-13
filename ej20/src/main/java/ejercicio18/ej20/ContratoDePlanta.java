package ejercicio18.ej20;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContratoDePlanta extends Contrato {
	
	private double sueldoMensual;
	private double sueldoConConyuge;
	private double sueldoConHijo;	
	private boolean hijos;
	private boolean conyuge;
	
	public ContratoDePlanta(LocalDate fechaInicio, double sueldoMensual, double sueldoConConyuge, double sueldoConHijo,
			boolean hijos, boolean conyuge) {
		super(fechaInicio);
		this.sueldoMensual = sueldoMensual;
		this.sueldoConConyuge = sueldoConConyuge;
		this.sueldoConHijo = sueldoConHijo;
		this.hijos = hijos;
		this.conyuge = conyuge;
	}

	
	

	public double getSueldoMensual() {
		return sueldoMensual;
	}




	public double getSueldoConConyuge() {
		return sueldoConConyuge;
	}




	public double getSueldoConHijo() {
		return sueldoConHijo;
	}




	public boolean isHijos() {
		return hijos;
	}




	public boolean isConyuge() {
		return conyuge;
	}




	public int getAntiguedad() {
		return (int)ChronoUnit.YEARS.between(LocalDate.now(), getFechaInicio());
	}
	
	
	public boolean vigente() {
		return LocalDate.now().isAfter(getFechaInicio());
	}
	@Override
	public double saldoBasico() {
		double saldo = this.sueldoMensual;
		if (isHijos()) saldo += this.getSueldoConHijo();
		if (isConyuge()) saldo += this.getSueldoConConyuge();
		return saldo;
	}
	
	
	
}
