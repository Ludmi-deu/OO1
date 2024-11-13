package ejercicio15.ejercicio15;

import java.time.LocalDate;

public class Consumo {
	private LocalDate fecha;
	private double energiaActiva;
	private double energiaReactiva;
	
	
	public Consumo(double energiaActiva, double energiaReactiva) {
		this.fecha= LocalDate.now();
		this.energiaActiva = energiaActiva;
		this.energiaReactiva = energiaReactiva;
	}


	public double getEnergiaActiva() {
		return energiaActiva;
	}


	public double getEnergiaReactiva() {
		return energiaReactiva;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}


	
	public double factorPotencia() {
		return this.getEnergiaActiva() / (Math.sqrt(Math.pow(energiaActiva, 2) + Math.pow(energiaReactiva, 2)));
	}
	
	public double costoConsumo () {
		return CuadroTarifario.getPrecio() * this.energiaActiva;
	}

}
