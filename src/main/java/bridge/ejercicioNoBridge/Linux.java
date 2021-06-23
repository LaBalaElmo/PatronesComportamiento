package bridge.ejercicioNoBridge;

public abstract class Linux extends Plataforma {
	private String so = "Linux";

	public abstract void showSistemaOperativo();

	public String getSo() {
		return so;
	}

}
