package ejercicio17.ejercicio17;

import java.time.LocalDate;

public class Estricta implements Politica {

	@Override
	public double calcularReembolso(Reserva r, LocalDate fecha) {
		return 0;
	}
	

}
