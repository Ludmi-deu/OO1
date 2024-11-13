package oo.ej21;

import java.util.Objects;

public class Jugador {

	private String nombre;
	private String apellido;
	
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public Jugador(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof Jugador)) return false;
	        Jugador jugador = (Jugador) o;
	        return Objects.equals(nombre, jugador.nombre) && 
	               Objects.equals(apellido, jugador.apellido);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(nombre, apellido);
	    }
	
	
}
