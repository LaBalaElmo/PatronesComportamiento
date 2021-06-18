package visitor.ejercicio2;

public interface ICambio {
	void cambio(Bolivia bolivia, String from, String to, double monto);

	void cambio(Argentina argentina, String from, String to, double monto);

	void cambio(Brasil brasil, String from, String to, double monto);

	void cambio(Italia italia, String from, String to, double monto);
}
