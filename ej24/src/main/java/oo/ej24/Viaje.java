package oo.ej24;

import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Viaje {

	private String origen;
	private String destino;
	private double costoTotal;
	private LocalDate fecha;
	private List<Usuario> pasajeros;
	private Vehiculo vehiculo;
	
	
	public Viaje(String origen, String destino, double costoTotal, LocalDate fecha,
			Conductor conductor) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.costoTotal = costoTotal;
		this.fecha = fecha;
		this.pasajeros = new ArrayList<Usuario>();
		this.vehiculo = conductor.getVehiculo();
		pasajeros.add(conductor);
	}

	public boolean addPasajero(Pasajero pasajero) {
		if (!pasajero.saldoRojo() && this.getVehiculo().hayCapacidad(getCantidadPasajeros()+1) && ((int)ChronoUnit.DAYS.between(LocalDate.now(), this.getFecha()) >= 2)) {
			pasajeros.add(pasajero);
			pasajero.setFechaUltViaje(fecha);
			return true;
		}
		return false;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void setPasajeros(List<Usuario> pasajero) {
		this.pasajeros = pasajero;
	}

	public int getCantidadPasajeros() {
		return pasajeros.size();
	}

	

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	
	protected double costoPorParte() {
		return costoTotal / pasajeros.size();
	}

	public void procesarViaje() {
		double costo = costoPorParte();
		this.pasajeros.stream().forEach(p -> p.descontarSaldo(costo));
	}
	
	
}
