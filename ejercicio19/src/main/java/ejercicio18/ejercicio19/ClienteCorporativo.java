package ejercicio18.ejercicio19;

public class ClienteCorporativo extends Cliente {
	
	private int cuit;
	
	public ClienteCorporativo(String nombre, String direccion, int cuit) {
		super(nombre, direccion);
		this.cuit = cuit;
	}

	public double interes() {
		return 1;
	}

	public int getCuit() {
		return cuit;
	}

}
