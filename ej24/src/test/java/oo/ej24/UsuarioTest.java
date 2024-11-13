package oo.ej24;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	
	private Pasajero pasajeroViaje30;
	private Pasajero pasajeroViajeAntes30;
	private Pasajero pasajeroViajeDespues30;
	private Pasajero pasajeroSinViaje;
	private Pasajero pasajeroSaldoRojo;
	private Pasajero pasajeroSaldo0;
	private Conductor conductorAuto5;
	private Conductor conductorAutoMenor5;
	private Conductor conductorAutoMayor5;
	private Vehiculo auto5;
	private Vehiculo autoMenor5;
	private Vehiculo autoMayor5;
	
	@BeforeEach
	void SetUp() {
		
		pasajeroViaje30 = new Pasajero ("Rodrigo", 500) ;
		pasajeroViajeAntes30 = new Pasajero ("Pedro", 100) ;
		pasajeroViajeDespues30 = new Pasajero ("Juan", 700);
		pasajeroSinViaje = new Pasajero ("Roberto", 1500);
		pasajeroSaldoRojo = new Pasajero ("Juana", -10);
		pasajeroSaldo0 = new Pasajero ("Alberto", 0);
		
		pasajeroViaje30.setFechaUltViaje(LocalDate.of(2024, 10, 14));
		pasajeroViajeAntes30.setFechaUltViaje(LocalDate.of(2024, 11, 5));
		pasajeroViajeDespues30.setFechaUltViaje(LocalDate.of(2024, 9, 10));
		
		auto5 = new Vehiculo ("Camioneta", 6, 2019, 600000) ;
		autoMenor5 = new Vehiculo ("Auto", 5, 2022, 150000) ;
		autoMayor5 = new Vehiculo ("Tito", 2, 2015, 30000) ;
		
		
		conductorAuto5 = new Conductor ("Ruperta", 2000, auto5) ;
		conductorAutoMenor5 = new Conductor  ("Alfredo", 5000, autoMenor5);
		conductorAutoMayor5 = new Conductor  ("Francisco", 300, autoMayor5);
		
		
	}
	
	@Test
	void TestBonificacion() {
		assertEquals(3000, conductorAutoMayor5.bonificacion());
		assertEquals(500, pasajeroViaje30.bonificacion());
		assertEquals(0, pasajeroSinViaje.bonificacion());
	}
	
	@Test
	void TestComision() {
		assertEquals(0.01, conductorAutoMenor5.comision());
		assertEquals(0.1, conductorAutoMayor5.comision());
		assertEquals(0.1, conductorAuto5.comision());
		
		assertEquals(0, pasajeroViaje30.comision());
		assertEquals(0, pasajeroViajeAntes30.comision());
		assertEquals(0.1, pasajeroViajeDespues30.comision());
		
	}
	
	@Test
	void TestMontoAPagar() {
		assertEquals(2000, conductorAutoMayor5.montoAPagar(5000));
		assertEquals(300, pasajeroViaje30.montoAPagar(800));
		assertEquals(500, pasajeroSinViaje.montoAPagar(500));
		
	}
	
	@Test
	void TestCargarSaldo() {
		conductorAuto5.cargarSaldo(500);
		assertEquals(2450, conductorAuto5.getSaldo());
		
		conductorAutoMenor5.cargarSaldo(200);
		assertEquals(5198, conductorAutoMenor5.getSaldo());
		
		conductorAutoMayor5.cargarSaldo(13000);
		assertEquals(12000, conductorAutoMayor5.getSaldo());
		
		pasajeroViaje30.cargarSaldo(500);
		assertEquals(1000, pasajeroViaje30.getSaldo());
		
		pasajeroViajeAntes30.cargarSaldo(2000);
		assertEquals(2100, pasajeroViajeAntes30.getSaldo());
		
		pasajeroViajeDespues30.cargarSaldo(400);
		assertEquals(1060, pasajeroViajeDespues30.getSaldo());
		
	}
	
	@Test
	void TestSaldoRojo() {
		assertTrue(pasajeroSaldoRojo.saldoRojo());
		assertTrue(pasajeroSaldo0.saldoRojo());
		assertFalse(pasajeroSinViaje.saldoRojo());
		
	}
	
	@Test
	void TestDescontarSaldo() {
		assertTrue(pasajeroSinViaje.descontarSaldo(500));
		assertEquals(1000, pasajeroSinViaje.getSaldo());
		
		assertFalse(pasajeroSaldo0.descontarSaldo(1000));
		assertEquals(0, pasajeroSaldo0.getSaldo());
		
		assertFalse(pasajeroSaldoRojo.descontarSaldo(100));
		assertEquals(-10, pasajeroSaldoRojo.getSaldo());
	}
	

}
