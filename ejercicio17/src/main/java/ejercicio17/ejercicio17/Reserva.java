package ejercicio17.ejercicio17;

public class Reserva {
	private DateLapse fecha;
	private Propiedad propiedad;
	
	public Reserva(DateLapse fecha, Propiedad propiedad) {
		this.fecha = fecha;
		this.propiedad = propiedad;
		propiedad.agregarReserva(this);
	}
	
	
	public double calcularPrecioTotal() {
		return this.propiedad.getPrecioPorNoche() * this.fecha.sizeInDays();
	}
	
	public DateLapse getFecha() {
		return this.fecha;
	}
	
	public Propiedad getPropiedad() {
		return this.propiedad;
	}

	public boolean incluyePeriodo(DateLapse periodo) {
		return (fecha.includesDate(periodo.getFrom())&& fecha.includesDate(periodo.getTo()));
	}
	
}
