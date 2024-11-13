package ejercicio11.ejercicio11;
import java.time.LocalDate;

public class PlazoFijo implements Inversiones{
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;


	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
		super();
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}


	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}


	public double getMontoDepositado() {
		return montoDepositado;
	}


	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}


	@Override
	public double valorActual() {
		int dias=this.getFechaDeConstitucion().until(LocalDate.now()).getDays();
		return (this.getMontoDepositado()+(this.getPorcentajeDeInteresDiario()*dias));
	}
	
	

}
