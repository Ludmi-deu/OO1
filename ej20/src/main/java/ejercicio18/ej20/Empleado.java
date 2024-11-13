package ejercicio18.ej20;

import java.util.*;
import java.time.LocalDate;

public class Empleado {
	
	private String nombre;
	private String apellido;
	private int cuit;
	private LocalDate fechaNacimiento;
	private boolean hijos;
	private boolean conyuge;
	private List<Contrato> contratos;
	
	
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getCuit() {
		return cuit;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public boolean isHijos() {
		return hijos;
	}

	public boolean isConyuge() {
		return conyuge;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}

	public int getAntiguedad() {
		return contratos.stream().mapToInt(c -> c.getAntiguedad()).sum();
	}
	
	public Contrato vigente() {
		return (getContratos().stream().filter(c -> c.vigente()).findFirst().orElse(null));
	}
	
	public double montoACobrar() {
		double porcentaje = 1;
		int a = getAntiguedad();
		if (a >= 5 && a<10)
			porcentaje = 1.30;
		else if (a >= 10 && a<15)
			porcentaje = 1.5;
		else if (a>=15 && a<20)
			porcentaje = 1.7;
		else if (a>=20)
			porcentaje = 2;
		
		return vigente().saldoBasico() * porcentaje;
		
	}
	
	public ReciboDeSueldo getRecibo() {
		ReciboDeSueldo r = new ReciboDeSueldo (getNombre(), getApellido(), getCuit(), getAntiguedad(), LocalDate.now(), montoACobrar() ) ;
		return r;
	}

}
