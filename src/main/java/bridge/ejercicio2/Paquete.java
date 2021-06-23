package bridge.ejercicio2;

public class Paquete {
	private int precio;
	private String nombrePaquete;

	public Paquete(int precio, String nombrePaquete) {
		this.precio = precio;
		this.nombrePaquete = nombrePaquete;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombrePaquete() {
		return nombrePaquete;
	}

	public void setNombrePaquete(String nombrePaquete) {
		this.nombrePaquete = nombrePaquete;
	}

}
