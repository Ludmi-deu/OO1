package ejercicio12.ejercicio12;

public abstract class Pieza {
	private String material;
	private String color;
	
	
	public Pieza(String material, String color) {
		super();
		this.material = material;
		this.color = color;
	}
	
	

	public String getMaterial() {
		return material;
	}



	public String getColor() {
		return color;
	}



	public abstract double getVolumenDeMaterial ();

	public abstract double getSuperficieDeColor ();

}
