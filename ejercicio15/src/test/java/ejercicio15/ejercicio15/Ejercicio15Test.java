package ejercicio15.ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio15Test {
	
	private CuadroTarifario cuadro;
	private Consumo consumo;
	private Usuario us;
	private Factura f;
	
	
	@BeforeEach
	public void setUp() {
		cuadro = new CuadroTarifario();
		CuadroTarifario.actualizarPrecio(20.5);
		consumo = new Consumo(20, 15);
		us = new Usuario("Lucio", "Av 155");
	}
	
	@Test
	public void TestConsumo() {
		assertEquals(0.8, consumo.factorPotencia());
		assertEquals(410, consumo.costoConsumo());
	}

	@Test
	public void TestUsuario() {
		 new Factura("Lucio", LocalDate.now(), 0, 410);
		us.agregarConsumo(consumo);
		f = us.emitirFactura();
		assertEquals("Lucio", f.getUsuario() );
		assertEquals(LocalDate.now(), f.getFecha());
		assertEquals(0, f.getBonificacion());
		assertEquals(410, f.getMontoFinal());
		
	}
	
}
