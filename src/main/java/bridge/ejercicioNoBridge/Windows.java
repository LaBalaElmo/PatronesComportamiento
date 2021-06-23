package bridge.ejercicioNoBridge;

public abstract class Windows extends Plataforma {
	private String so = "Windows";

	public abstract void showSistemaOperativo();

	public String getSo() {
		return so;
	}

}
