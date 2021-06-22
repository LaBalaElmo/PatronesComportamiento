package adapter.ejercicio;

public class Celular implements IElectronico {

	private int precio;
	private String marca;
	private int tiempo = 5;

	public Celular(int precio, String marca) {
		this.precio = precio;
		this.marca = marca;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public void precio() {
		System.out.println("El precio del celular " + marca + " es de " + precio + " bolivianos");
	}

	@Override
	public void tiempoVida() {
		System.out.println("El tiempo de vida del celular es de " + tiempo + " años");
		tiempo -= 1;
	}

}
