package ejercicio18.ejercicio19;

public class PersonaFisica extends Cliente {
	
	private int dni;
	
	
	public PersonaFisica(String nombre, String direccion, int dni) {
		super(nombre, direccion);
		this.dni = dni;
	}

	public double interes() {
		return 0.1;
	}

	public int getDni() {
		return dni;
	}
}
