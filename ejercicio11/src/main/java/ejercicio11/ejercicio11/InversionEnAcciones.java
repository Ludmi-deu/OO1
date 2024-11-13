package ejercicio11.ejercicio11;

public class InversionEnAcciones implements Inversiones {
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	

	public InversionEnAcciones(String nombre, int cantidad, double valorUnitario) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
	}


	public String getNombre() {
		return nombre;
	}


	public int getCantidad() {
		return cantidad;
	}


	public double getValorUnitario() {
		return valorUnitario;
	}

	@Override
	public double valorActual() {
		// TODO Auto-generated method stub
		return this.getValorUnitario()*this.getCantidad();
	}

	
	
}
