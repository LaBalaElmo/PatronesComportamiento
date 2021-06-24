package proxy.ejercicio;

public class TarjetaDebito implements IBanco {
	private String titular;
	private int cuenta;
	private double monto;
	CuentaBanco cuentaBanco;

	public TarjetaDebito(String titular, int cuenta, double monto) {
		this.titular = titular;
		this.cuenta = cuenta;
		this.monto = monto;
		cuentaBanco = new CuentaBanco(titular, cuenta, monto);
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
	
	public void dineroEnLaCuenta() {
		System.out.println("Se tiene " + monto + " bolivianos en la cuenta");
	}

	@Override
	public void pagar(Producto producto) {
		if (!producto.getDivisa().toLowerCase().equals("bolivianos")) {
			if(producto.getDivisa().toLowerCase().equals("dolares"))
				producto.setMonto(producto.getMonto()*6.96);
			
			if(producto.getDivisa().toLowerCase().equals("euros"))
				producto.setMonto(producto.getMonto()*8.25);
		}
		if(producto.getMonto() < monto) {
			monto -= producto.getMonto();
			System.out.println("Pagando con la tarjeta de debito a nombre de " + titular + " el siguiente producto");
			cuentaBanco.pagar(producto);
		}else {
			System.out.println("No se pudo completar la compra, no se tiene el dinero suficiente");
		}

	}

}
