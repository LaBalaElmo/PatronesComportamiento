package composite.ejercicio;

public class Client {
	public static void main(String[] args) {
		CompositeAparato laboratorio1 = new CompositeAparato("Samsung", "laboratorio1");
		laboratorio1.add(new Computadora("Samsung", "Computadora1"));
		laboratorio1.add(new Computadora("Samsung", "Computadora2"));
		laboratorio1.add(new Computadora("Samsung", "Computadora3"));
		laboratorio1.add(new Computadora("Samsung", "Computadora4"));

		CompositeAparato laboratorio2 = new CompositeAparato("Apple", "laboratorio2");
		laboratorio2.add(new Computadora("Apple", "Computadora5"));
		laboratorio2.add(new Computadora("Apple", "Computadora6"));
		laboratorio2.add(new Computadora("Apple", "Computadora7"));
		laboratorio2.add(new Computadora("Apple", "Computadora8"));

		CompositeAparato laboratorio3 = new CompositeAparato("Sony", "laboratorio3");
		laboratorio3.add(new Computadora("Sony", "Computadora9"));
		laboratorio3.add(new Computadora("Sony", "Computadora10"));
		laboratorio3.add(new Computadora("Sony", "Computadora11"));
		laboratorio3.add(new Computadora("Sony", "Computadora12"));
		laboratorio3.operation();
		laboratorio3.precioTotal();

		CompositeAparato contenedor = new CompositeAparato("Samsung, Apple y Sony", "contenedor");
		contenedor.add(laboratorio3);
		contenedor.add(laboratorio2);
		contenedor.add(laboratorio1);
		
		contenedor.operation();
		contenedor.precioTotal();

	}
}
