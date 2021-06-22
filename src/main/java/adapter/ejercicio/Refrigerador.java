package adapter.ejercicio;

public class Refrigerador implements IElectrodomestico {
	private int tiempo = 3;
	private int costo;
	private String marca;

	public Refrigerador(int costo, String marca) {
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
		System.out.println("El costo del refrigerador " + marca + " es de " + tiempo + " bolivianos");

	}

	@Override
	public void tiempoGarantia() {
		System.out.println("El tiempo de garantia del refrigerador es de " + tiempo + " años");
		tiempo -= 1;
	}

	@Override
	public String getTipo() {
		return "refrigerador";
	}

}
