package ejercicio17.ejercicio17;

import java.time.LocalDate;

import org.junit.jupiter.api.*;

public class TestAlquiler {

	private Politica flexible;
	private Politica estricta;
	private Politica moderada;
	private Usuario usuario;
	private Reserva reserva1;
	private Reserva reserva2;
	private Propiedad propiedad1;
	private Propiedad propiedad2;
	private DateLapse periodo;
	
	
@BeforeEach
void setUp() {
	
	flexible = new Flexible();
	estricta = new Estricta();
	moderada = new Moderada();
	usuario = new Usuario("pepe", "598 34", 444444);
	periodo = new DateLapse(LocalDate.of(2024, 10, 5), LocalDate.of(2024, 10, 20));
	propiedad1 = new Propiedad();
	reserva1 = new Reserva(periodo, propiedad1);
	
}

@Test
void UsuarioTest() {
	
}

@Test
void PoliticaTest() {
	
}

@Test
void PropiedadTest() {
	
}

@Test
void ReservaTest() {
	
}


	
}
