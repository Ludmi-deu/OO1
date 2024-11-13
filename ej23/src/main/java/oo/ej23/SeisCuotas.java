package oo.ej23;

public class SeisCuotas implements FormaDePago {

	
	public double precioFinal(double precio) {
		return precio + (precio * 0.2);
	}

}
