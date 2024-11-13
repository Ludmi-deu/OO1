package ejercicio18.ejercicio19;

import java.util.*;

import ejercicio14.ejercicio14.DateLapse;

public abstract class Cliente {
	
	private String nombre;
	private String direccion;
	private List<Envio> envios;
	
	
	public Cliente(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.envios = new ArrayList<Envio>();
	}

	public void agregarEnvio(Envio e) {
		this.envios.add(e);
	}
	
	public double calcularCostoEnvios(DateLapse periodo) {
		return (envios.stream().filter(e -> periodo.includesDate(e.getFecha())).mapToDouble(e -> e.calcularMonto()).sum())* interes();
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public List<Envio> getEnvios() {
		return envios;
	}

	public abstract double interes();
}
