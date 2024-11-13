package ejercicio15.ejercicio15;
import java.time.LocalDate;


public class Factura {
	private String usuario;
	private LocalDate fecha;
	private double bonificacion;
	private double montoFinal;
	
	
	public Factura(String usuario, LocalDate fecha, double bonificacion, double montoFinal) {
		
		this.usuario = usuario;
		this.fecha = fecha;
		this.bonificacion = bonificacion;
		this.montoFinal = montoFinal;
	}


	public String getUsuario() {
		return usuario;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public double getBonificacion() {
		return bonificacion;
	}


	public double getMontoFinal() {
		return montoFinal;
	}
	
	
	
	
	

}
