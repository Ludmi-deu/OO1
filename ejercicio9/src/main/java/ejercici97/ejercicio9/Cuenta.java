package ejercici97.ejercicio9;

public abstract class Cuenta {
	private double saldo;

	public Cuenta() {
		this.saldo=0;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double unMonto) {
		this.saldo+=unMonto;
	}
	
	protected void extraerSinControlar(double unMonto) {
		this.saldo-=unMonto;
	}
	
	public boolean extraer(double unMonto) {
		if (this.puedeExtraer(unMonto)) {
			this.extraerSinControlar(unMonto);
			return true;
		}
		return false;
	}
	
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	
	protected abstract boolean puedeExtraer(double monto);
	

}
