package ejercicio12.ejercicio12;

public class Esfera extends Pieza {
	private int radio;
	
	

	public Esfera(String material, String color, int radio) {
		super(material, color);
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	@Override
	public double getVolumenDeMaterial() {
		
		return 1.33*Math.PI*Math.pow(radio, 3);
	}

	@Override
	public double getSuperficieDeColor() {
		
		return 4*Math.PI*Math.pow(radio, 2);
	}
	
	

}
