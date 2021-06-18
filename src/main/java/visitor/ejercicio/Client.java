package visitor.ejercicio;

public class Client {
	public static void main(String[] args) {
		Word word = new Word();
		Notepad notepad = new Notepad();
		Sublime sublime = new Sublime();

		PuglinGuardar plugin = new PuglinGuardar();
		
		word.crear("Este texto es de prueba");
		word.crear("Segundo texto");
		word.editar(1, "Cambio de texto");
		
		word.guardar(plugin);
		
		notepad.crear("Este texto");
		notepad.crear("Segundo texto");
		
		notepad.guardar(plugin);
		
		sublime.crear("prueba");
		sublime.crear("Segundo texto");
		sublime.editar(1, "Cambio de texto");
		
		sublime.guardar(plugin);
	}
}
