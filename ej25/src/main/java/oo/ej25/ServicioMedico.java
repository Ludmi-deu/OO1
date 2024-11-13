package oo.ej25;

import java.time.LocalDate;

public abstract class ServicioMedico extends Servicio{
	
	private Veterinario medico;
	
	public ServicioMedico (Mascota mascota, Veterinario medico) {
		super(mascota);
		this.medico = medico;
	}
	
	public Veterinario getMedico() {
		return this.medico;
	}
	
	public double calcularCosto() {
		double costo = this.medico.getHonorarios() + adicional();
		if (this.esDomingo()) 
			costo+=200;	
		return costo;
		
	}
	
	public abstract double adicional();
	
	
	

}
