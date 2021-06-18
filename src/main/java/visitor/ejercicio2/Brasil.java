package visitor.ejercicio2;

public class Brasil implements IPais {
	private double real = 5.01;
	private double cambio;

	@Override
	public void cambioAMonedaLocal(ICambio libreCambista, int monto) {
		cambio = monto;
		libreCambista.cambio(this, "dolares", "reales", monto * real);
	}

	@Override
	public void cambioADolares(ICambio libreCambista, int monto) {
		cambio = monto;
		libreCambista.cambio(this, "reales", "dolares", monto / real);

	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}

}
