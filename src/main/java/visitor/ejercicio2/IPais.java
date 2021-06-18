package visitor.ejercicio2;

public interface IPais {
	void cambioAMonedaLocal(ICambio libreCambista, int monto);

	void cambioADolares(ICambio libreCambista, int monto);
}
