package ejercicio11.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlazoFijoTest {
	
	private Inversiones inversion1;
	
	
	@BeforeEach
	public void setUp() {
		this.inversion1=new PlazoFijo(LocalDate.now().minusDays(5),2000,0.2);
		
		
	}
	
	@Test
	public void TestvalorActual() {
		assertEquals(2001, this.inversion1.valorActual());
	}
	

}
