package oo.ej22;

import java.util.*;

public class Email {
	
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	

	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>();
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getCuerpo() {
		return cuerpo;
	}
	
	public List<Archivo> getAdjuntos() {
		return adjuntos;
	}
	
	public int tamanio() {
		int aux = this.adjuntos.stream().mapToInt(a -> a.tamanio()).sum();
		aux += this.cuerpo.length() + this.titulo.length();
		return aux;
	}
	
	public void agregarAdjunto(Archivo adjunto) {
		this.adjuntos.add(adjunto);
	}

	

}
