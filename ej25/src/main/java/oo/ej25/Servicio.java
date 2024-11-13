package oo.ej25;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class Servicio {
	private LocalDate fecha;
	private Mascota mascota;
	
	
	public Servicio(Mascota mascota) {
		this.fecha = LocalDate.now();
		this.mascota = mascota;
	}

	public boolean esDomingo() {
		return (getFecha().getDayOfWeek() == DayOfWeek.SUNDAY);
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public Mascota getMascota() {
		return this.mascota;
	}

	public abstract double calcularCosto();

}
