package ejercicio18.ej20;

import java.time.LocalDate;

public class ReciboDeSueldo {
	
	private String nombre;
	private String apellido;
	private int cuit;
	private int antiguedad;
	private LocalDate fecha;
	private double montoTotal;
	
	
	public ReciboDeSueldo(String nombre, String apellido, int cuit, int antiguedad, LocalDate fecha,
			double montoTotal) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuit = cuit;
		this.antiguedad = antiguedad;
		this.fecha = fecha;
		this.montoTotal = montoTotal;
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public int getCuit() {
		return cuit;
	}


	public int getAntiguedad() {
		return antiguedad;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public double getMontoTotal() {
		return montoTotal;
	}

	
	
	
	

}
