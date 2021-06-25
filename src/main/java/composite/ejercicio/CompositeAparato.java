package composite.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class CompositeAparato extends ArtefactoElectronico {
	private List<ArtefactoElectronico> artefactoList = new ArrayList<>();

	public CompositeAparato(String marca, String tipo) {
		super(0, marca, tipo);
	}

	public void precioTotal() {
		System.out.println(getTipo() + " con un precio de " + getPrecio());
	}

	@Override
	public void operation() {
		if (artefactoList.size() <= 2) {
			if (artefactoList.get(0) instanceof Computadora) {
				System.out.println("No hay suficientes computadoras para ser un laboratorio");				
			}
			if (artefactoList.get(0) instanceof CompositeAparato) {
				System.out.println("Hacen falta elementos para que sea un " + getTipo());
			}
		} else {
			this.showInfo();
			for (ArtefactoElectronico artefacto : artefactoList) {
				artefacto.operation();
				setPrecio(getPrecio() + artefacto.getPrecio());
			}
		}
	}

	@Override
	public void add(ArtefactoElectronico component) {
		if(!(component instanceof Computadora))
			component.setPrecio(0);
		artefactoList.add(component);
	}

	@Override
	public void remove(ArtefactoElectronico component) {
		artefactoList.remove(component);
	}

	@Override
	public void getChild(int position) {
		artefactoList.get(position);
	}

}
