package ejercicio18.ej20;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContratoPorHoras extends Contrato {
	
	private double valorPorHora;
	private int horasPorMes;
	private LocalDate fechaFin;
	
	public ContratoPorHoras(LocalDate fechaInicio, LocalDate fechaFin, double valorPorHora, int horasPorMes) {
		super(fechaInicio);
		this.fechaFin = fechaFin;
		this.valorPorHora = valorPorHora;
		this.horasPorMes = horasPorMes;
	}
	
	public double getValorPorHora() {
		return valorPorHora;
	}
	public int getHorasPorMes() {
		return horasPorMes;
	}
	
	public LocalDate getFechaFin() {
		return this.fechaFin;
	}

	@Override
	public int getAntiguedad() {
		return (int)ChronoUnit.YEARS.between(getFechaFin(), getFechaInicio());
	}

	@Override
	public boolean vigente() {
		return LocalDate.now().isBefore(fechaFin);
	}

	@Override
	public double saldoBasico() {
		return getHorasPorMes()*getValorPorHora();
	}

	
	
}
