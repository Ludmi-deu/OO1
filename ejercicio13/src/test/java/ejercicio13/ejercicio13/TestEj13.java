package ejercicio13.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEj13 {

	private Archivo a;
	
	private Carpeta c1;
	private Carpeta c2;
	private Email e1;
	private Email e2;
	private ClienteDeCorreo cd;
	
@BeforeEach
public void setUp() {
	
	
	this.a=new Archivo("Pepe"); //4
	
	this.e1 = new Email("Hola", "como estas"); //14
	this.e2 = new Email ("Buenas tardes", "3"); //14
	
	this.c1 = new Carpeta ("Carpeta 1"); 
	this.c2 = new Carpeta ("Carpeta 2"); 
	
	this.cd = new ClienteDeCorreo();
	
	
}

@Test
public void TestCliente() {
	c1.agregarEmail(e1);
	cd.agregarCarpeta(c1);
	assertEquals(14, cd.espacioOcupado());
	cd.agregarCarpeta(c2);
	assertEquals(14, cd.espacioOcupado());
	cd.recibir(e1);
	assertEquals(28, cd.espacioOcupado());
}

@Test
public void TestEmail() {
	e1.agregarAdjunto(a);
	assertEquals(18, e1.tamanio());
	
	assertEquals(14, e2.tamanio());
	
}

@Test
public void TestCarpeta() {
	c1.agregarEmail(e1);
	assertEquals(14, c1.tamanio());
	
	c1.mover(e1, c1);
	
}


	
}
