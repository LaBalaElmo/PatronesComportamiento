package bridge.ejercicio2;

public class EmpresaSA implements IEmpresa {

	@Override
	public void enviarPaquete(Paquete paquete, ITerreno terreno) {
		System.out.println(
				"La empresaSA envio el paquete de nombre " + paquete.getNombrePaquete() + ", fue enviado por " + terreno.getTipo());
		terreno.showPrecio(paquete.getPrecio());
	}

}
