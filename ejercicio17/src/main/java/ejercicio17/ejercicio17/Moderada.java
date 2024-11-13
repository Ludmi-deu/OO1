package ejercicio17.ejercicio17;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada implements Politica{

	@Override
	public double calcularReembolso(Reserva r, LocalDate fecha) {
		int cantDias = (int)ChronoUnit.DAYS.between(fecha, r.getFecha().getFrom());
		if (cantDias >= 14) {
			return r.calcularPrecioTotal();
		}
		else return r.calcularPrecioTotal()/2;
	}
	

}
