package ejercici97.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajadeAhorroTest {
	private CuentaCorriente cuenta;
	private CajadeAhorro caja;
	
	@BeforeEach
	void setUp() throws Exception {
		this.cuenta = new CuentaCorriente();
		this.caja = new CajadeAhorro();
		
		this.cuenta.depositar(2000);
		this.cuenta.setDescubierto(1000);
		
		this.caja.depositar(10000);
		
	}
	@Test
	void testDepositar() {
		caja.depositar(2500);
		assertEquals(12500, caja.getSaldo());
	}
	
	@Test
	void testExtraer() {
		assertTrue(caja.extraer(500));
		assertFalse(caja.extraer(50000));
	}
	
	@Test
	void testTransferir() {
		caja.transferirACuenta(1000, cuenta);
		assertEquals(8980, caja.getSaldo());
	}
	
	


	
	
}