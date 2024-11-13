package ejercicio16.ejercicio16;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

class EvenNumberSetTest {
		
	private EvenNumberSet numbers;
	
	@BeforeEach
	void setUp() {
		numbers = new EvenNumberSet();
	}
	
	@Test
	void testAdd() {
		Integer i = 1;
		assertFalse(numbers.add(i));
		i = 2;
		assertTrue(numbers.add(i));
		assertFalse(numbers.add(i));
		
	}
	
	@Test
	void testAddAll() {
		
		List<Integer> num = new ArrayList<Integer>();
		num.add(2);
		num.add(2);
		num.add(3);
		num.add(4);
		
		assertFalse(numbers.addAll(num));
		numbers.clear();
		
		List<Integer> num2 = new ArrayList<Integer>();
		num2.add(14);
		num2.add(16);
		num2.add(18);
		
		assertTrue(numbers.addAll(num2));
	}

}
