package composite.ejercicio;

public abstract class ArtefactoElectronico {
	private int precio;
	private String marca;
	private String tipo;

	public ArtefactoElectronico(int precio, String marca, String tipo) {
		this.precio = precio;
		this.marca = marca;
		this.tipo = tipo;
	}

	public void showInfo() {
		System.out.println("Marca: " + marca);
		System.out.println("Tipo: " + tipo);
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public abstract void operation();

	public abstract void add(ArtefactoElectronico component);

	public abstract void remove(ArtefactoElectronico component);

	public abstract void getChild(int position);
}
