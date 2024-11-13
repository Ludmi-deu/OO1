package ejercicio11.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversorTest {
	
	private Inversor inv1;
	private PlazoFijo pf1;
	private InversionEnAcciones ia1;
	
	@BeforeEach
	public void setUp() {
		inv1=new Inversor("Juan Perez");
		pf1=new PlazoFijo(LocalDate.now(),10000,0.2 );
		ia1=new InversionEnAcciones("Pedro Sanchez", 20, 5000);
		
		
	}
	
	@Test
	public void TestAddInversion() {
		this.inv1.addInversion(ia1);
		this.inv1.addInversion(pf1);
		assertEquals(2, this.inv1.getInversiones().size());
	}
	
	@Test
	public void TestValorActual() {
		this.inv1.addInversion(ia1);
		assertEquals(100000, this.inv1.valorActual());
	}

}
