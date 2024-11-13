package ejercicio18.ejercicio19;


public class Local extends Envio {
	
	private boolean entregaRapida;

	
	public double calcularMonto() {
		double monto = 1000;
			if (entregaRapida)
				monto +=500;
		
		return monto;
	}
}
