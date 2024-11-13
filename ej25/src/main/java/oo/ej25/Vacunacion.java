package oo.ej25;

import java.time.LocalDate;

public class Vacunacion extends ServicioMedico{
	private String vacuna;
	private double costo;
	
	public Vacunacion(Mascota mascota, Veterinario medico, String vacuna, double costo) {
		super(mascota, medico);
		this.vacuna = vacuna;
		this.costo = costo;
	}

	
	public double adicional() {
		return 500+this.costo;
	}
	
	
	

}
