package bridge.ejercicioNoBridge;

public class Linuxx86 extends Linux {

	@Override
	public void showSistemaOperativo() {
		System.out.println("El sistema operativo es " + getSo());
	}

	@Override
	void inicializando() {
		System.out.print("Inicializando " + getSo() + " de ");
		showBits();
	}

	@Override
	void showBits() {
		System.out.println("86 bits");
	}

}
