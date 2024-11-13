package ejercicio14.ejercicio14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDateLapse {

	private DateLapse dl1;
	private DateLapse2 dl2;
	private LocalDate from = LocalDate.of(1975, 10, 5);
	private LocalDate to = LocalDate.of(1975, 12, 3);
	private LocalDate other = LocalDate.of(1975, 12, 1);
	private LocalDate other2 = LocalDate.of(1975, 10, 30);
	
	@BeforeEach
	public void setUp() {
		
		dl1 = new DateLapse(from, to);
		dl2 = new DateLapse2(from, 30);
		
	}
	
	@Test
	public void testDateLapse(){
		assertEquals(5, dl1.getFrom().getDayOfMonth());
		assertEquals(3, dl1.getTo().getDayOfMonth());
		assertEquals(59, dl1.sizeInDays());
		assertEquals(30, dl2.sizeInDays());
		assertFalse(dl2.includesDate(other));
		assertTrue(dl1.includesDate(other));
		assertTrue(dl2.includesDate(other2));
		assertFalse(dl1.includesDate(LocalDate.now()));
		
	}
	
	@Test
	public void testOverlaps() {
		DateLapse dateLapse1= new DateLapse(LocalDate.of(2024, 10, 10), LocalDate.of(2024, 10, 20));
		DateLapse dateLapse2= new DateLapse(LocalDate.of(2024, 10, 5), LocalDate.of(2024, 10, 11));
		DateLapse dateLapse3= new DateLapse(LocalDate.of(2024, 10, 19), LocalDate.of(2024, 10, 25));
		DateLapse dateLapse4= new DateLapse(LocalDate.of(2024, 10, 11), LocalDate.of(2024, 10, 19));
		DateLapse dateLapse5= new DateLapse(LocalDate.of(2024, 10, 5), LocalDate.of(2024, 10, 21));
		DateLapse dateLapse6= new DateLapse(LocalDate.of(2024, 10, 5), LocalDate.of(2024, 10, 10));
		DateLapse dateLapse7= new DateLapse(LocalDate.of(2024, 10, 20), LocalDate.of(2024, 10, 25));
		DateLapse dateLapse8= new DateLapse(LocalDate.of(2024, 10, 10), LocalDate.of(2024, 10, 20));
		DateLapse dateLapse9= new DateLapse(LocalDate.of(2024, 10, 5), LocalDate.of(2024, 10, 9));
		DateLapse dateLapse10= new DateLapse(LocalDate.of(2024, 10, 21), LocalDate.of(2024, 10, 25));
		
		assertTrue(dateLapse1.overlaps(dateLapse2));
		assertTrue(dateLapse1.overlaps(dateLapse3));
		assertTrue(dateLapse1.overlaps(dateLapse4));
		assertTrue(dateLapse1.overlaps(dateLapse5));
		assertTrue(dateLapse1.overlaps(dateLapse6));
		assertTrue(dateLapse1.overlaps(dateLapse7));
		assertTrue(dateLapse1.overlaps(dateLapse8));
		assertFalse(dateLapse1.overlaps(dateLapse9));
		assertFalse(dateLapse1.overlaps(dateLapse10));
		
	}
	
}
