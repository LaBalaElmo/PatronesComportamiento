package adapter.ejercicio;

public class Lavadora implements IElectrodomestico {
	private int tiempo = 5;
	private int costo;
	private String marca;

	public Lavadora(int costo, String marca) {
		this.costo = costo;
		this.marca = marca;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public void costo() {
		System.out.println("El costo de la lavadora " + marca + " es de " + tiempo + " bolivianos");

	}

	@Override
	public void tiempoGarantia() {
		System.out.println("El tiempo de garantia de la lavadora es de " + tiempo + " años");
		tiempo -= 1;
	}

	@Override
	public String getTipo() {
		return "lavadora";
	}

}
