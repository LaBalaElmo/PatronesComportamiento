package proxy.ejercicio;

public class Client {
	public static void main(String[] args) {
		TarjetaDebito tarjeta = new TarjetaDebito("Jose Perez", 15846932, 200);
		tarjeta.dineroEnLaCuenta();
		tarjeta.pagar(new Producto("Bolso", 150, "bolivianos"));
		tarjeta.dineroEnLaCuenta();
		tarjeta.pagar(new Producto("juguete", 2.50, "Dolares"));
		tarjeta.dineroEnLaCuenta();
		tarjeta.pagar(new Producto("insumos", 10, "euros"));
		tarjeta.dineroEnLaCuenta();
	}
}
