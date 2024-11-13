package oo.ej21;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPruebaMap {
	
	private Map <String, Integer> mapa;
	
@BeforeEach	
void setUp() {
	mapa = new HashMap<>();
	mapa.put("Lionel Messi", 111);
	mapa.put("Gabriel Batistuta", 56);
	mapa.put("Kun Aguero", 42);	
	
}

@Test
void TestMapa() {
	
	mapa.remove("Kun Aguero");
	assertFalse(mapa.containsKey("Kun Aguero"));
	
	mapa.put("Lionel Messi", 112);
	assertEquals(112, mapa.get("Lionel Messi"));
	
	
	int goles = mapa.values().stream().mapToInt(Integer::intValue).sum();
	assertEquals(168,goles);
}

}
