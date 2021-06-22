package adapter.ejercicio;

public class Client {
	public static void main(String[] args) {
		Lavadora lavadora = new Lavadora(7500, "Samsung");

		Refrigerador refrigerador = new Refrigerador(4900, "Samsung");

		Televisor televisor = new Televisor(7000, "Sony");

		Celular celular = new Celular(2800, "Samsung");

		Computadora computadora = new Computadora(7000, "HP");

		Tablet tablet = new Tablet(3500, "Apple");

		celular.precio();
		celular.tiempoVida();
		celular.tiempoVida();

		computadora.precio();
		computadora.tiempoVida();
		computadora.tiempoVida();

		tablet.precio();
		tablet.tiempoVida();
		tablet.tiempoVida();

		AparatoElectronicoAdaptado lavadoraAdaptada = new AparatoElectronicoAdaptado(lavadora);
		lavadoraAdaptada.precio();
		lavadoraAdaptada.tiempoVida();
		lavadoraAdaptada.tiempoVida();

		AparatoElectronicoAdaptado refrigeradorAdaptada = new AparatoElectronicoAdaptado(refrigerador);
		refrigeradorAdaptada.precio();
		refrigeradorAdaptada.tiempoVida();
		refrigeradorAdaptada.tiempoVida();

		AparatoElectronicoAdaptado televisorAdaptada = new AparatoElectronicoAdaptado(televisor);
		televisorAdaptada.precio();
		televisorAdaptada.tiempoVida();
		televisorAdaptada.tiempoVida();
	}
}
