package ejercicio17.ejercicio17;

import java.time.LocalDate;
import java.util.*;

public class Usuario {
	private String nombre;
	private String direccion;
	private int dni;
	private List<Propiedad> propiedades;
	private List<Reserva> reservas;
	
	
	public Usuario(String nombre, String direccion, int dni) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		this.propiedades = new ArrayList<Propiedad>();
		this.reservas = new ArrayList<Reserva>();
	}

	

	public String getNombre() {
		return nombre;
	}



	public String getDireccion() {
		return direccion;
	}



	public int getDni() {
		return dni;
	}



	public List<Propiedad> getPropiedades() {
		return propiedades;
	}


	public List<Reserva> getReservas() {
		return reservas;
	}
	
	public void agregarPropiedad(Propiedad prop) {
		this.propiedades.add(prop);
	}
	
	public void nuevaReserva (DateLapse periodo, Propiedad propiedad) {
		Reserva r = new Reserva (periodo, propiedad);
		if (propiedad.consultarDisponibilidad(periodo)) {
			this.reservas.add(r);
		}
	}

	public boolean cancelarReserva (Reserva r) {
		boolean aux = false;
		if (! r.getFecha().includesDate(LocalDate.now())) {
			reservas.remove(r);
			r.getPropiedad().liberarFecha(r);
			aux = true;
		}
		return aux;
	}

	public double ingresosPropietario(DateLapse periodo) {
		return this.propiedades.stream().mapToDouble(p -> p.comision(periodo)).sum();
	}
	
	
	

}
