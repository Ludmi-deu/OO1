package oo.ej23;

public class Express implements FormaDeEnvio {
	
	private String origen;
	private String destino;

	
	public Express(String origen, String destino) {
		super();
		this.origen = origen;
		this.destino = destino;
	}


	public double costoEnvio() {
		CalculadoraDeDistancia c = new CalculadoraDeDistancia();
		int distancia = c.distanciaEntre(origen, destino);
		return distancia * 0.5;
	}

}
