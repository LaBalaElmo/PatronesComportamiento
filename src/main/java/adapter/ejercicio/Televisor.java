package adapter.ejercicio;

public class Televisor implements IElectrodomestico {
	private int tiempo = 1;
	private int costo;
	private String marca;

	public Televisor(int costo, String marca) {
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
		System.out.println("El costo del televisor " + marca + " es de " + tiempo + " bolivianos");

	}

	@Override
	public void tiempoGarantia() {
		System.out.println("El tiempo de garantia del televisor es de " + tiempo + " años");
		tiempo -= 1;
	}

	@Override
	public String getTipo() {
		return "televisor";
	}

}
