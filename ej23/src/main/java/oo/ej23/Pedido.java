package oo.ej23;


public class Pedido {
	private Persona comprador;
	private Producto producto;
	private FormaDePago pago;
	private FormaDeEnvio envio;
	private int cantidad;
	
	
	public Pedido(Persona comprador, Producto producto, FormaDePago pago, FormaDeEnvio envio, int cantidad) {
		super();
		this.comprador = comprador;
		this.producto = producto;
		this.pago = pago;
		this.envio = envio;
		this.cantidad = cantidad;
	}
	
	public double costoTotal() {
		return pago.precioFinal(producto.getPrecio()) + envio.costoEnvio();
	}
	
}
