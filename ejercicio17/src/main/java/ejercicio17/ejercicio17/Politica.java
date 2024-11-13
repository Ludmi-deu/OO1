package ejercicio17.ejercicio17;

import java.time.LocalDate;

public interface Politica {
	
	public double calcularReembolso (Reserva r, LocalDate fecha);

}
