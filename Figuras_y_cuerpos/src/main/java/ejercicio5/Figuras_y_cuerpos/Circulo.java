package ejercicio5.Figuras_y_cuerpos;

public class Circulo implements Figuras2D{
	
	private double diametro;
	private double radio;
	
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
		this.radio = diametro/2;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
		this.diametro = radio*2;
	}
	
	public double getPerimetro() {
		return this.diametro * Math.PI;
	}
	
	public double getArea() {
		return (this.radio * this.radio) * Math.PI;
		
	}

}
