package bridge.ejercicio;

public class Client {
	public static void main(String[] args) {
		Windows w = new Windows(new Arquitecturax64());
		w.inicializar();
	}
}
