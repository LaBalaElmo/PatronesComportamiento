package bridge.ejercicio2;

public class EmpresaSRL implements IEmpresa {

	@Override
	public void enviarPaquete(Paquete paquete, ITerreno terreno) {
		System.out.println(
				"La empresaSRL envio el paquete de nombre " + paquete.getNombrePaquete() + ", fue enviado por " + terreno.getTipo());
		terreno.showPrecio(paquete.getPrecio());
	}

}
