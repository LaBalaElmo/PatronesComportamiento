package visitor.ejercicio2;

public class Argentina implements IPais {
	private double peso = 95.37;
	private double cambio;

	@Override
	public void cambioAMonedaLocal(ICambio libreCambista, int monto) {
		cambio = monto;
		libreCambista.cambio(this, "dolares", "pesos argentinos", monto * peso);
	}

	@Override
	public void cambioADolares(ICambio libreCambista, int monto) {
		cambio = monto;
		libreCambista.cambio(this, "pesos argentinos", "dolares", monto / peso);

	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}

}
