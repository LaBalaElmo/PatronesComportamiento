package bridge.ejercicio;

public class Linux extends Plataforma{

	public Linux(Arquitectura arch) {
		super(arch);
		setSo("Linux");
	}

	@Override
	public void inicializar() {
		System.out.print("Inicializando el sistema " + getSo() + " de ");
		getArch().showBits();
		
	}

}
