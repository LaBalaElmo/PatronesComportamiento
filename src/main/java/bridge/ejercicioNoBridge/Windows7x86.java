package bridge.ejercicioNoBridge;

public class Windows7x86 extends Windows {

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
