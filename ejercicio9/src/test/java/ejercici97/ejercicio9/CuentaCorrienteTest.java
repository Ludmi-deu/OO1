package ejercici97.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
	private CuentaCorriente cuenta;
	private CajadeAhorro caja;
	
	@BeforeEach
	void setUp() throws Exception {
		this.cuenta = new CuentaCorriente();
		this.caja = new CajadeAhorro();
		
		this.cuenta.depositar(2000);
		this.cuenta.setDescubierto(1000);
		
		this.caja.depositar(1000);
		
	}
	@Test
	void testDepositar() {
		cuenta.depositar(3000);
		assertEquals(5000, cuenta.getSaldo());
	}
	
	@Test
	void testExtraer() {
		assertTrue(cuenta.extraer(2500));
		assertFalse(cuenta.extraer(5000));
	}
	
	@Test
	void testTransferir() {
		cuenta.transferirACuenta(1000, caja);
		assertEquals(1000, cuenta.getSaldo());
	}
	
	
}
