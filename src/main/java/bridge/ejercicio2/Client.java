package bridge.ejercicio2;

public class Client {
	public static void main(String[] args) {
		EmpresaSA e1 = new EmpresaSA();
		EmpresaSRL e2 = new EmpresaSRL();

		Paquete p1 = new Paquete(100, "Joyas");

		e1.enviarPaquete(p1, new Aire());
		e1.enviarPaquete(p1, new Tierra());
		e2.enviarPaquete(p1, new Mar());
	}
}
