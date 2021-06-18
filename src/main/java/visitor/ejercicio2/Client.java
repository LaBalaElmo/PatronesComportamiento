package visitor.ejercicio2;

public class Client {
	public static void main(String[] args) {
		Argentina argentina = new Argentina();
		Bolivia bolivia = new Bolivia();
		Brasil brasil = new Brasil();
		Italia italia = new Italia();
		
		LibreCambista libreCambista = new LibreCambista();
		
		argentina.cambioADolares(libreCambista, 400);
		argentina.cambioAMonedaLocal(libreCambista, 100);
		
		bolivia.cambioADolares(libreCambista, 400);
		bolivia.cambioAMonedaLocal(libreCambista, 100);
		
		brasil.cambioADolares(libreCambista, 400);
		brasil.cambioAMonedaLocal(libreCambista, 100);
		
		italia.cambioADolares(libreCambista, 400);
		italia.cambioAMonedaLocal(libreCambista, 100);
	}
}
