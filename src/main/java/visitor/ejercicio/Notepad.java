package visitor.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Notepad implements IEditorTexto {
	private List<String> texto = new ArrayList<>();
	private String nombre = "Sublime";

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<String> getTexto() {
		return texto;
	}

	public void setTexto(List<String> texto) {
		this.texto = texto;
	}

	@Override
	public void crear(String texto) {
		this.texto.add(texto);
	}

	@Override
	public void editar(int linea, String texto) {
		this.texto.remove(linea);
		this.texto.add(linea, texto);
	}

	@Override
	public void eliminar(int linea) {
		this.texto.remove(linea);
	}

	@Override
	public void guardar(IPlugin plugin) {
		plugin.guardar(this);
	}

}
