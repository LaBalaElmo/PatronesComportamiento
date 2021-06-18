package visitor.ejercicio2;

public class Bolivia implements IPais {
	private double bolivianos = 6.90;
	private double cambio;

	@Override
	public void cambioAMonedaLocal(ICambio libreCambista, int monto) {
		cambio = monto;
		libreCambista.cambio(this, "dolares", "bolivianos", monto * bolivianos);
	}

	@Override
	public void cambioADolares(ICambio libreCambista, int monto) {
		cambio = monto;
		libreCambista.cambio(this, "bolivianos", "dolares", monto/bolivianos);
	}

	public double getBolivianos() {
		return bolivianos;
	}

	public void setBolivianos(double bolivianos) {
		this.bolivianos = bolivianos;
	}

	public double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}

}
