package ejercicio13.ejercicio13;

import java.util.*;

public class ClienteDeCorreo {
	private List<Carpeta> carpetas;
	
	
	
	public ClienteDeCorreo() {
		this.carpetas = new ArrayList<Carpeta>();
	}

	public void recibir (Email email) {
		this.carpetas.get(0).agregarEmail(email);
	}
	
	public Email buscar(String texto) {
		
		Email e=null;
		for (Carpeta c : carpetas) {
			for (Email em : c.getEmails()) {
				if (em.getCuerpo().equals(texto) || em.getTitulo().equals(texto)) {
					return em;
				}
			}
		}
		return e;
		
	}
	
	public int cantidadTotalDeMails() {
		return (carpetas.stream().mapToInt(c -> c.cantidadEmails()).sum());
	}
	
	public int espacioOcupado() {
		
		return this.carpetas.stream().mapToInt(c -> c.tamanio()).sum();
		
	}

	public void agregarCarpeta (Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
}
