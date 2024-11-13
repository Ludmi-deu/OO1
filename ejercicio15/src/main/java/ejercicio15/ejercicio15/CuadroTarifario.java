package ejercicio15.ejercicio15;

public class CuadroTarifario {
	private static double precio;
	
	
	public  static void actualizarPrecio(double precio) {
		CuadroTarifario.precio=precio;
	}
	
	public static double getPrecio() {
		return CuadroTarifario.precio; 
	}

}
