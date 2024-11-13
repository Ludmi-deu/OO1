package ejercicio17.ejercicio17;

import java.util.*;
import java.util.stream.Collectors;

public class Propiedad {
	private String direccion;
	private String nombre;
	private double precioPorNoche;
	private List<Reserva> reservas;
	private Usuario propietario;
	private Politica politicaCancelacion;
	


	public Propiedad(String direccion, String nombre, double precioPorNoche,
			Usuario propietario, Politica politicaCancelacion) {
		super();
		this.direccion = direccion;
		this.nombre = nombre;
		this.precioPorNoche = precioPorNoche;
		this.reservas = new ArrayList<Reserva>();
		this.propietario = propietario;
		this.politicaCancelacion = politicaCancelacion;
	}



	public double getPrecioPorNoche() {
		return precioPorNoche;
	}
	
	
	
	public String getDireccion() {
		return direccion;
	}


	public String getNombre() {
		return nombre;
	}

	public Usuario getPropietario() {
		return propietario;
	}


	public void agregarReserva(Reserva r) {
		reservas.add(r);
	}

	public List<Reserva> getReserva (){
		return this.reservas;
	}
	
	public void liberarFecha(Reserva r) {
		this.reservas.remove(r);
	}
	
	public boolean consultarDisponibilidad(DateLapse periodo) {
		List<Reserva> f = reservas.stream().filter(r -> r.getFecha().overlaps(periodo)).collect(Collectors.toList());
		return (f.isEmpty());
		
	}
	
	public double comision(DateLapse periodo) {
		List<Reserva> f = reservas.stream().filter(r -> r.incluyePeriodo(periodo)).collect(Collectors.toList());
		double total = f.stream().mapToDouble(r -> r.calcularPrecioTotal()).sum();
		return total * 0.75;
		
	}
	
	public Politica getPolitica () {
		return this.politicaCancelacion;
	}
}
