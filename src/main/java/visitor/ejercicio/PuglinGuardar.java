package visitor.ejercicio;

public class PuglinGuardar implements IPlugin {

	@Override
	public void guardar(Notepad notepad) {
		System.out.println("Convirtiendo a pdf el archivo de tipo: " + notepad.getNombre());
		int aux = 0;
		for (String s : notepad.getTexto()) {
			aux = aux + s.replace(" ", "").toCharArray().length;
		}
		System.out.println("El texto tiene " + aux + " caracteres");

	}

	@Override
	public void guardar(Sublime sublime) {
		System.out.println("Convirtiendo a pdf el archivo de tipo: " + sublime.getNombre());
		int aux = 0;
		for (String s : sublime.getTexto()) {
			aux = aux + s.replace(" ", "").toCharArray().length;
		}
		System.out.println("El texto tiene " + aux + " caracteres");

	}

	@Override
	public void guardar(Word word) {
		System.out.println("Convirtiendo a pdf el archivo de tipo: " + word.getNombre());
		int aux = 0;
		for (String s : word.getTexto()) {
			aux = aux + s.replace(" ", "").toCharArray().length;
		}
		System.out.println("El texto tiene " + aux + " caracteres");

	}

}
