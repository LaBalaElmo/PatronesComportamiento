package bridge.ejercicioNoBridge;

public class Client {
	public static void main(String[] args) {
		Windows7x64 w1 = new Windows7x64();
		w1.inicializando();

		Windows7x86 w2 = new Windows7x86();
		w2.inicializando();
	}
}
