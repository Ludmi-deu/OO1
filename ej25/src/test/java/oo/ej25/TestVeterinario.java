package oo.ej25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestVeterinario {
	
	private Veterinario veterinarioAntiguedad;
	private Veterinario veterinarioSinAntiguedad;
	
	@BeforeEach
	void setUp() {
		veterinarioAntiguedad = new Veterinario ("Pedro", LocalDate.of(2021, 10, 3), 5000);
		veterinarioSinAntiguedad = new Veterinario ("Jose", LocalDate.now(), 2000);
		
	}

	@Test
	void TestGetAntiguedad() {
		assertEquals(3, veterinarioAntiguedad.getAntiguedad());
		assertEquals(0, veterinarioSinAntiguedad.getAntiguedad());
	}
}
