package ejercicio17.ejercicio17;

import java.time.LocalDate;

public class Flexible implements Politica {
	

	@Override
	public double calcularReembolso(Reserva r, LocalDate fecha) {
		if (r.getFecha().getFrom().isAfter(fecha)) {
			return r.calcularPrecioTotal();
		}
		return 0;
		
	}
	
	

}
