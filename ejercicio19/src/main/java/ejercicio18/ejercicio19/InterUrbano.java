package ejercicio18.ejercicio19;


public class InterUrbano extends Envio {
	
	private double distancia;

	@Override
	public double calcularMonto() {
		double monto = 0;
		if (distancia < 100) {
			monto = this.getPeso() * 20;
		} 
		else if (distancia >= 100 && distancia<=500) {
			monto = this.getPeso() * 25;
		}
		else if (distancia>500) {
				monto = this.getPeso()*30;
		}
		return monto;
	}

}
