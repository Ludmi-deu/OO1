package ejercicio16.ejercicio16;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EvenNumberSet extends HashSet<Integer>{


	private boolean esValido (Integer num) {

		return num % 2 == 0;
			
	}

	@Override
	public boolean add(Integer e) {
		if (esValido(e)) {
			return super.add(e);		
		}
		return false;
	}





	

}
