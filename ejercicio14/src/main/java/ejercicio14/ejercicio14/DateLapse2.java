package ejercicio14.ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse2 {
	private LocalDate from;
	private int sizeInDays;
	
	
	public DateLapse2(LocalDate from, int sizeInDays) {
		this.from = from;
		this.sizeInDays = sizeInDays;
	}


	public LocalDate getFrom() {
		return from;
	}


	public LocalDate getTo() {
		return this.from.plusDays(sizeInDays);
	}

	public int sizeInDays() {
		return this.sizeInDays;
	}
	
	public boolean includesDate(LocalDate other) {
		return ((other.isAfter(from)|| other.isEqual(from)) && (other.isBefore(this.getTo()) || other.isEqual(this.getTo())));
	}
	
	
}
