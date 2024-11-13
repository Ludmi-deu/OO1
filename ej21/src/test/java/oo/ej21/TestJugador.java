package oo.ej21;


import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

	

public class TestJugador {


	private Map <Jugador, Integer> mapa;

	
	
@BeforeEach	
void setUp() {
	mapa = new HashMap<>();
	mapa.put(new Jugador("Lionel", "Messi"), 111);
	mapa.put(new Jugador("Gabriel", "Batistuta"), 56);
	mapa.put(new Jugador("Kun", "Aguero"), 42);	
	
}

@Test
void TestMapa() {
	
	mapa.remove(new Jugador("Kun", "Aguero"));
	assertFalse(mapa.containsKey(new Jugador("Kun", "Aguero")));
	
	mapa.put(new Jugador("Lionel", "Messi"), 112);
	assertEquals(112, mapa.get(new Jugador("Lionel", "Messi")));
	
	
	int goles = mapa.values().stream().mapToInt(Integer::intValue).sum();
	assertEquals(168,goles);
}

}

	

