package ejercicio5.Figuras_y_cuerpos;

public class Cuadrado implements Figuras2D {
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getPerimetro() {
		return this.lado*4;
	}
	
	public double getArea() {
		return this.lado * this.lado;
	}
}
