package ejercicio13.ejercicio13;

import java.util.*;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<Email>();
	}
	
	public int cantidadEmails() {
		return emails.size();
	}
	


	public String getNombre() {
		return nombre;
	}



	public List<Email> getEmails() {
		return emails;
	}


	public HashMap<String, Integer> cantidadPorCategoria(){
		HashMap<String, Integer> categorias = new HashMap<>();
		Integer p = (int) emails.stream().filter(e -> e.tamanio() <= 300).count();
		Integer m = (int) emails.stream().filter(e -> e.tamanio() > 300 && e.tamanio() <=500).count();
		Integer g = (int) emails.stream().filter(e -> e.tamanio() > 500).count();
		categorias.put("Pequeño", p);
		categorias.put("Mediano", m);
		categorias.put("Grande", g);
		return categorias;
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
