package ejercicio12.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEj12 {
	
	private Cilindro c;
	private Esfera e;
	private PrismaRectangular p;
	private ReporteDeConstruccion rp;
	
	@BeforeEach
	public void setUp() {
		c=new Cilindro("Hierro", "rojo", 3, 5);
		e=new Esfera("Hierro", "rosa", 2);
		p=new PrismaRectangular("Metal", "rojo", 5, 3, 2);
		rp=new ReporteDeConstruccion();
	}
	
	@Test
	public void testGetter() {
		assertEquals(141.371, c.getVolumenDeMaterial(),1e-3);
		assertEquals(150.796, c.getSuperficieDeColor(),1e-3);
		
		assertEquals(33.426, e.getVolumenDeMaterial(),1e-3);
		assertEquals(50.265, e.getSuperficieDeColor(),1e-3);
		
		assertEquals(30, p.getVolumenDeMaterial());
		assertEquals(62, p.getSuperficieDeColor());
	}
	
	@Test
	public void testReportes() {
		rp.addPiezas(e);
		rp.addPiezas(p);
		rp.addPiezas(c);
		
		assertEquals(212.796, rp.superficieDeColor("rojo"), 1e-3);
		assertEquals(174.798, rp.volumenDeMaterial("Hierro"), 1e-3);
		
		assertEquals(30, rp.volumenDeMaterial("Metal"));
		assertEquals(50.265, rp.superficieDeColor("rosa"), 1e-3);
		
	}
	

}
