package adapter.ejercicio;

public class AparatoElectronicoAdaptado implements IElectronico {
	private IElectrodomestico electrodomestico;

	public AparatoElectronicoAdaptado(IElectrodomestico electrodomestico) {
		this.electrodomestico = electrodomestico;
	}

	@Override
	public void precio() {
		System.out.println("Adaptando " + electrodomestico.getTipo() + " como aparato electronico");
		electrodomestico.costo();

	}

	@Override
	public void tiempoVida() {
		System.out.println("Adaptando " + electrodomestico.getTipo() + " como aparato electronico");
		electrodomestico.tiempoGarantia();

	}

}
