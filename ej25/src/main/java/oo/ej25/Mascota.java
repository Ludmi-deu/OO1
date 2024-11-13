package oo.ej25;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Mascota {
	private String nombre;
	private LocalDate fechaNacimiento;
	private String especie;
	private List<Servicio> servicios;
	
	public Mascota (String nombre, LocalDate fechaNacimiento, String especie) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.especie = especie;
		this.servicios = new ArrayList<Servicio>();
	}
	
	public Consulta altaConsultaMedica(Veterinario veterinario) {
        Consulta servicio = new Consulta(this, veterinario);
        addServicios(servicio);
        return servicio;
    }

    public Vacunacion altaVacunacion(Veterinario veterinario, String vacuna, double precioVacuna) {
        Vacunacion servicio = new Vacunacion(this, veterinario, vacuna, precioVacuna);
        addServicios(servicio);
        return servicio;
    }

    public ServicioGuarderia altaGuarderia(int cantDias) {
        ServicioGuarderia servicio = new ServicioGuarderia(this, cantDias);
        addServicios(servicio);
        return servicio;
    }
	
	public void addServicios(Servicio servicio) {
		this.servicios.add(servicio);
	}
	
	public boolean descuento() {
		return (this.servicios.size() >= 5);
	}
	
	public double recaudacion (LocalDate fecha) {
		List<Servicio> s =  servicios.stream().filter(servicio -> servicio.getFecha().isEqual(fecha)).collect(Collectors.toList());
				return s.stream().mapToDouble(servicio -> servicio.calcularCosto()).sum();
	}

}
