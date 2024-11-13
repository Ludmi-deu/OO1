package oo.ej22;

import java.util.*;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<Email>();
	}
	
	

	public String getNombre() {
		return nombre;
	}



	public List<Email> getEmails() {
		return emails;
	}



	public void mover(Email email, Carpeta destino) {
		this.eliminarEmail(email);
		destino.agregarEmail(email);
		
	}
	
	public int tamanio() {
		
		return this.emails.stream().mapToInt(e -> e.tamanio()).sum();
		
	}
	
	public void agregarEmail(Email email) {
		this.emails.add(email);
	}
	
	public void eliminarEmail (Email email) {
		this.emails.remove(email);
	}

}
