package ejercicio15.ejercicio15;

import java.util.*;

public class Usuario {
	private String nombre;
	private String domicilio;
	private List<Consumo> consumos;
	
	public Usuario(String nombre, String domicilio) {
		
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.consumos = new ArrayList<Consumo>();
		
	}

	public String getNombre() {
		return nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public List<Consumo> getConsumos() {
		return consumos;
	}
	
	public void agregarConsumo(Consumo consumo) {
		this.consumos.add(consumo);
	}
	
	private Consumo getUltimoConsumo() {
		return consumos.stream().sorted((c1, c2) -> c2.getFecha().compareTo(c1.getFecha())).findFirst().orElse(null);
	}
	
	public Factura emitirFactura(){
		Consumo consumo = this.getUltimoConsumo();
		double bonificacion = 0;
		double montoFinal = consumo.costoConsumo();
		if (consumo.factorPotencia()>0.8) {
			bonificacion = 0.1;
			montoFinal = montoFinal - bonificacion;
		}
		Factura f = new Factura(this.nombre,consumo.getFecha(), bonificacion, montoFinal);
		return f;
	}

}
