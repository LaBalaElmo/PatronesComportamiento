package bridge.ejercicio;

public class Windows extends Plataforma{

	public Windows(Arquitectura arch) {
		super(arch);
		setSo("Windows");
	}

	@Override
	public void inicializar() {
		System.out.print("Inicializando el sistema " + getSo() + " de ");
		getArch().showBits();
		
	}

}
