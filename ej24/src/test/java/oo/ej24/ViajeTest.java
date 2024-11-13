package oo.ej24;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.*;
import java.time.LocalDate;

import org.junit.jupiter.api.*;

public class ViajeTest {

	private Viaje viaje;
	private Viaje viajePasajero;
	private Viaje viajePasajero2;
	private Viaje viajeHoy;
	private Viaje viajeDosDias;
	private Conductor c;
	private Conductor c2;
	private Vehiculo v;
	private Vehiculo v2;
	private Pasajero pConViaje;
	private Pasajero pSaldoRojo;

	private List<Usuario> listaPasajero = new ArrayList<Usuario>();  //para llenar el auto
	
	
	
	
	@BeforeEach
	void setUp() {
		v = new Vehiculo ("Toyota", 5, 2023, 35698);
		c = new Conductor ("Raul", 500, v);
		
		v2 = new Vehiculo ("Fiat", 5, 2023, 35698);
		c2 = new Conductor ("Jose", 500, v2);
		
		pConViaje = new Pasajero ("Pedro", 200);
		pSaldoRojo = new Pasajero ("Julian", 0);
		
		viaje = new Viaje("La Plata", "Las Flores", 900, LocalDate.of(2024, 12, 31),c2);
		viajeHoy = new Viaje("La Plata", "Las Flores", 500, LocalDate.now(),c2);
		viajeDosDias = new Viaje("La Plata", "Las Flores", 1500, LocalDate.of(2024, 11, 15),c2);
		viajePasajero = new Viaje ("Madrid", "Barcelona", 200, LocalDate.of(2024, 12, 30), c);
		viajePasajero2 = new Viaje ("Madrid", "Barcelona", 800, LocalDate.now(), c);
		
		listaPasajero.add(new Pasajero("Pepe", 300));
		listaPasajero.add(new Pasajero("Juan", 300));
		listaPasajero.add(new Pasajero("Miguel", 300));
		listaPasajero.add(new Pasajero("Rodrigo", 300));
		listaPasajero.add(c);
		
		viajePasajero.setPasajeros(listaPasajero);
		viajePasajero2.setPasajeros(listaPasajero);
		
		pConViaje.setFechaUltViaje(LocalDate.of(2024, 10, 20));
	}
	
	@Test
	void TestAddPasajero() {
		assertTrue(viaje.addPasajero(pConViaje));  //capacidad, <2, sin saldo rojo
		assertTrue(viajeDosDias.addPasajero(pConViaje)); //capacidad, =2, saldo
		assertFalse(viaje.addPasajero(pSaldoRojo)); //capacidad, <2, saldo rojo
		assertFalse(viajeHoy.addPasajero(pConViaje)); //capacidad, >2, sin saldo rojo
		assertFalse(viajeHoy.addPasajero(pSaldoRojo));  //capacidad, >2, con saldo rojo
		
		assertFalse(viajePasajero.addPasajero(pConViaje));  //sin capacidad, <2, sin saldo rojo
		assertFalse(viajePasajero.addPasajero(pSaldoRojo)); //sin capacidad, <2, saldo rojo
		assertFalse(viajePasajero2.addPasajero(pConViaje)); //sin capacidad, >2, sin saldo rojo
		assertFalse(viajePasajero2.addPasajero(pSaldoRojo));  //sin capacidad, >2, con saldo rojo
		
	}
	
	@Test
	void TestCostoPorParte() {
		assertEquals(40, viajePasajero.costoPorParte());
		assertEquals(500, viajeHoy.costoPorParte());
	}
	
}
