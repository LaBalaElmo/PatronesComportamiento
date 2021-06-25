package composite.ejercicio;

public class Computadora extends ArtefactoElectronico {

	public Computadora(String marca, String tipo) {
		super(100, marca, tipo);
	}

	@Override
	public void operation() {
		this.showInfo();
	}

	@Override
	public void add(ArtefactoElectronico component) {
		System.out.println("No se puede realizar esta operacion");
	}

	@Override
	public void remove(ArtefactoElectronico component) {
		System.out.println("No se puede realizar esta operacion");
	}

	@Override
	public void getChild(int position) {
		System.out.println("No se puede realizar esta operacion");
	}

}
