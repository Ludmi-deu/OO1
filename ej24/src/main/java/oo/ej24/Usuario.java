package oo.ej24;

public abstract class Usuario {
	
	private String nombre;
	private double saldo;
	
	
	public Usuario(String nombre, double saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public boolean saldoRojo() {
		return saldo <= 0;
	}
	
	public void cargarSaldo(double monto) {
		this.saldo += (monto - (monto * comision()));
	}
	
	public boolean descontarSaldo(double monto) {
		if (saldo >0) {
			this.saldo -= montoAPagar(monto);
			return true;
		} return false;
		
	}
	
	protected double montoAPagar(double monto) {
		return monto - bonificacion();
	}
	
	public abstract double bonificacion();
	
	public abstract double comision();
}
