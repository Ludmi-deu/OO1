package oo.ej25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMascota {

	private Mascota mascota5Servicios;
	private Mascota mascotaSinServicios;
	private Mascota mascotaDosServicios;

	
	@BeforeEach
	void setUp() {
		mascota5Servicios = new Mascota("Canela", LocalDate.of(2015, 10, 3), "Husky");
		mascotaSinServicios = new Mascota("Morita", LocalDate.of(2019, 10, 3), "Pitbull");
		mascotaDosServicios = new Mascota("Onur", LocalDate.of(2016, 10, 3), "Caniche");
		
		mascota5Servicios.altaConsultaMedica(new Veterinario("Pedro", LocalDate.of(2021, 10, 3), 5000));
		mascota5Servicios.altaConsultaMedica(new Veterinario("Pedro", LocalDate.of(2021, 10, 3), 5000));
		mascota5Servicios.altaGuarderia(5);
		mascota5Servicios.altaGuarderia(2);
		mascota5Servicios.altaConsultaMedica(new Veterinario("Pedro", LocalDate.of(2021, 10, 3), 5000));
		
		mascotaDosServicios.altaGuarderia(12);
		mascotaDosServicios.altaGuarderia(2);
	}
	
	@Test
	void TestDescuento() {
		assertTrue(mascota5Servicios.descuento());
		assertFalse(mascotaSinServicios.descuento());
		assertFalse(mascotaDosServicios.descuento());
	}
	
	@Test
	void TestRecaudacion() {
		assertEquals(0, mascotaSinServicios.recaudacion(LocalDate.now()));
		assertEquals(7000, mascotaDosServicios.recaudacion(LocalDate.now()));
		assertEquals(19950, mascota5Servicios.recaudacion(LocalDate.now()));
	}
}
