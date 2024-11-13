package ejercicio11.ejercicio11;
import java.util.*;

public class Inversor {
	private String nombre;
	private List<Inversiones> inversiones;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Inversiones> getInversiones(){
		return this.inversiones;
	}
	
	public double valorActual() {
		return this.inversiones.stream().mapToDouble(Inversiones::valorActual).sum();
	}
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones=new ArrayList<>();
	}
	public void addInversion(Inversiones inversion) {
		this.inversiones.add(inversion);
	}
}
