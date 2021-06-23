package bridge.ejercicio2;

public class Aire implements ITerreno {
	private double porcentaje = 0.1;

	@Override
	public double getPrecio(int monto) {
		return (porcentaje * monto) + monto;
	}

	@Override
	public void showPrecio(int monto) {
		System.out.println("El monto a pagar por el paquete enviado por aire es de " + ((monto * porcentaje) + monto));
	}

	public double getPorcentaje() {
		return porcentaje * 100;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public String getTipo() {
		return "aire";
	}

}
