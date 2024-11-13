package oo.ej25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestServicio {

	private Consulta consulta;
	private Vacunacion vacunacion;
	private ServicioGuarderia guarderia;
	
	@BeforeEach
	void setUp() {
		consulta = new Consulta (new Mascota ("Canela", LocalDate.of(2022, 5, 4), "Husky"), new Veterinario ("Pedro", LocalDate.of(2020, 3, 9) , 2000));
		
		vacunacion = new Vacunacion(new Mascota ("Tobi", LocalDate.of(2022, 5, 4), "Golden"), new Veterinario ("Pedro", LocalDate.of(2020, 3, 9) , 2000), "Antirrabica", 5000);
		
		guarderia = new ServicioGuarderia(new Mascota ("Tobi", LocalDate.of(2022, 5, 4), "Golden"), 5);
	}
	
	@Test
	void TestCalcularCosto() {
		assertEquals(2700, consulta.calcularCosto());
		assertEquals(7500, vacunacion.calcularCosto());
		assertEquals(2500, guarderia.calcularCosto());
	}
	
	@Test
	void TestAdicional() {
		assertEquals(700, consulta.adicional());
		assertEquals(5500, vacunacion.adicional());
		
	}
	
	
}
