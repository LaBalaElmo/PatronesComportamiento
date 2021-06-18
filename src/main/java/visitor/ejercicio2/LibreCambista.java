package visitor.ejercicio2;

import java.text.DecimalFormat;

public class LibreCambista implements ICambio {
	private DecimalFormat formato = new DecimalFormat("#.00");

	@Override
	public void cambio(Bolivia bolivia, String from, String to, double monto) {
		System.out.println("El cambio de " + formato.format(bolivia.getCambio()) + " " + from + " a " + to + " es de "
				+ formato.format(monto));
	}

	@Override
	public void cambio(Argentina argentina, String from, String to, double monto) {
		System.out.println("El cambio de " + formato.format(argentina.getCambio()) + " " + from + " a " + to + " es de "
				+ formato.format(monto));
	}

	@Override
	public void cambio(Brasil brasil, String from, String to, double monto) {
		System.out.println("El cambio de " + formato.format(brasil.getCambio()) + " " + from + " a " + to + " es de "
				+ formato.format(monto));
	}

	@Override
	public void cambio(Italia italia, String from, String to, double monto) {
		System.out.println("El cambio de " + formato.format(italia.getCambio()) + " " + from + " a " + to + " es de "
				+ formato.format(monto));
	}

}
