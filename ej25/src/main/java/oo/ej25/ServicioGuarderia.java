package oo.ej25;

import java.time.LocalDate;

public class ServicioGuarderia extends Servicio{
	
	public int cantidadDias;
	
	public ServicioGuarderia(Mascota mascota, int cantidadDias) {
		super(mascota);
		this.cantidadDias = cantidadDias;
	}
	
	public double calcularCosto() {
		double costo = cantidadDias*500;
		if (this.getMascota().descuento())
			costo -= (costo * 0.1);
		return costo;
	}

}
