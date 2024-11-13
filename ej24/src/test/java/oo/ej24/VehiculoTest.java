package oo.ej24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class VehiculoTest {

	private Vehiculo v1;	
	
	
	@BeforeEach
	void setUp() {
		v1 = new Vehiculo ("Toyota", 5, 2024, 22650);
	}
	
	@Test 
	void HayCapacidadTest() {
		assertTrue(v1.hayCapacidad(4));
		assertFalse(v1.hayCapacidad(5));
		assertTrue(v1.hayCapacidad(0));
	}
	
}
