package visitor.ejercicio;

public interface IEditorTexto {
	void crear(String texto);

	void editar(int linea, String texto);

	void eliminar(int linea);

	void guardar(IPlugin plugin);
}
