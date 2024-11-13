package ejercicio12.ejercicio12;
import java.util.*;

public class ReporteDeConstruccion {
	
	private List<Pieza> piezas;
	
	
	
	public ReporteDeConstruccion() {
		piezas=new ArrayList<Pieza>();
	}
	
	public void addPiezas(Pieza unaPieza) {
		this.piezas.add(unaPieza);
	}

	public double volumenDeMaterial (String material) {
		return this.piezas.stream().filter(p -> p.getMaterial().equals(material)).mapToDouble(Pieza :: getVolumenDeMaterial).sum();
		
	}

	public double superficieDeColor (String color) {
		return this.piezas.stream().filter(p -> p.getColor().equals(color)).mapToDouble(Pieza :: getSuperficieDeColor).sum();
	}
}
