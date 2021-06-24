package proxy.ejercicio;

public class CuentaBanco implements IBanco {
	private String titular;
	private int cuenta;
	private double monto;

	public CuentaBanco(String titular, int cuenta, double monto) {
		this.titular = titular;
		this.cuenta = cuenta;
		this.monto = monto;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getCuenta() {
		return cuenta;
	}

	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	@Override
	public void pagar(Producto producto) {
		System.out.println("nombre del producto: " + producto.getNombre());
		System.out.println("Monto del producto: " + producto.getMonto() + " bolivianos");
	}

}
