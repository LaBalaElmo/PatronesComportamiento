package visitor.ejercicio2;

public class Italia implements IPais {
	private double euro = 0.84;
	private double cambio;

	@Override
	public void cambioAMonedaLocal(ICambio libreCambista, int monto) {
		cambio = monto;
		libreCambista.cambio(this, "dolares", "reales", monto * euro);
	}

	@Override
	public void cambioADolares(ICambio libreCambista, int monto) {
		cambio = monto;
		libreCambista.cambio(this, "reales", "dolares", monto / euro);

	}
	
	public double getEuro() {
		return euro;
	}

	public void setEuro(double euro) {
		this.euro = euro;
	}

	public double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}

}
