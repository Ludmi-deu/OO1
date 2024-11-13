package ejercicio11.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversionEnAccionesTest {
	
	private InversionEnAcciones ia1;
	private InversionEnAcciones ia2;
	
	@BeforeEach
	public void setUp() {
		ia1=new InversionEnAcciones("Pedro", 4, 2000);
		ia2=new InversionEnAcciones("Juan", 5, 1000);
	}
	
	@Test
	public void valorActualTest() {
		assertEquals(8000, this.ia1.valorActual());
		assertEquals(5000, this.ia2.valorActual());
	}

}
