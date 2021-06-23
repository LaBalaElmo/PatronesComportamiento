package bridge.ejercicio;

public abstract class Plataforma {
	private String so;
	private Arquitectura arch;

	public Plataforma(Arquitectura arch) {
		this.setArch(arch);
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}
	
	public abstract void inicializar();

	public Arquitectura getArch() {
		return arch;
	}

	public void setArch(Arquitectura arch) {
		this.arch = arch;
	}
}
