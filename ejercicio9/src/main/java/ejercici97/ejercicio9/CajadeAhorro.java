package ejercici97.ejercicio9;

public class CajadeAhorro extends Cuenta{
	
	public CajadeAhorro() {
		super();
		
	}

	@Override
	protected boolean puedeExtraer(double monto) {
		return ((monto+monto*0.02) <= this.getSaldo());
	}
	
	protected void extraerSinControlar(double unMonto) {
		super.extraerSinControlar(unMonto+(unMonto*0.02));
	}

}
