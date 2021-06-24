package proxy.ejercicio;

public class Producto {
	private String nombre;
	private double monto;
	private String divisa;

	public Producto(String nombre, double monto, String divisa) {
		this.nombre = nombre;
		this.monto = monto;
		this.divisa = divisa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getDivisa() {
		return divisa;
	}

	public void setDivisa(String divisa) {
		this.divisa = divisa;
	}

}
