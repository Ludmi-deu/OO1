package oo.ej24;

public class Conductor extends Usuario {
	
	private Vehiculo vehiculo;

	public Conductor(String nombre, double saldo, Vehiculo vehiculo) {
		super(nombre, saldo);
		this.vehiculo = vehiculo;
	}

	@Override
	public double bonificacion() {
		return vehiculo.getValorMercado() * 0.1;
	}

	@Override
	public double comision() {
		if (vehiculo.menorCincoAnios()) return 0.01;
		else return 0.1;
	}
	
	public Vehiculo getVehiculo() {
		return this.vehiculo;
	}

}
