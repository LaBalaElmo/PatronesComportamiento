package visitor.ejercicio;

public interface IPlugin {
	void guardar(Notepad notepad);

	void guardar(Sublime sublime);

	void guardar(Word word);
}
