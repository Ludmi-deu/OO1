package oo.ej24;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Pasajero extends Usuario {

	private LocalDate fechaUltViaje;

	public Pasajero(String nombre, double saldo) {
		super(nombre, saldo);
		fechaUltViaje = null;
	}
	
	

	public LocalDate getFechaUltViaje() {
		return fechaUltViaje;
	}



	public void setFechaUltViaje(LocalDate fechaUltViaje) {
		this.fechaUltViaje = fechaUltViaje;
	}



	@Override
	public double bonificacion() {
		double b = 0;
		if (fechaUltViaje != null)
			b = 500;
		return b;
	}
	

	@Override
	public double comision() {
		if ( (int)ChronoUnit.DAYS.between(fechaUltViaje, LocalDate.now()) > 30 )
			return 0.1;
		else return 0;
	}
	
}
