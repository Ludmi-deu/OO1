package ejercicio17.ejercicio17;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	private LocalDate from;
	private LocalDate to;
	
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}


	public LocalDate getFrom() {
		return from;
	}


	public LocalDate getTo() {
		return to;
	}

	public int sizeInDays() {
		return (int)ChronoUnit.DAYS.between(from, to);
	}
	
	public boolean includesDate(LocalDate other) {
		return ((other.isAfter(from)|| other.isEqual(from)) && (other.isBefore(to) || other.isEqual(to)));
	}
	
	public boolean overlaps (DateLapse anotherDateLapse) {
		return ((this.includesDate(anotherDateLapse.getFrom())) && (this.includesDate(anotherDateLapse.getTo())));
		
	}
	
}
