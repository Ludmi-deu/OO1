package oo.ej25;

import java.time.LocalDate;

public class Consulta extends ServicioMedico {
	
	public Consulta(Mascota mascota, Veterinario medico) {
		super(mascota, medico);
	
	}

	public double adicional() {
		double adicional = 300;
		if (this.getMedico().getAntiguedad()>0) {
			adicional += this.getMedico().getAntiguedad() * 100;
		}
		return adicional;
	}

}
