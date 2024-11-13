package ejercicio18.ejercicio19;


public class Internacional extends Envio {

	@Override
	public double calcularMonto() {
		double monto = 5000;
		if (this.getPeso()<1000) {
			monto += 10 * this.getPeso();
		} else monto += 12 * this.getPeso();
		return monto;
	}
	

}
