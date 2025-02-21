package EjerciciosClasesObjetos;

public class AppNovelas {

	public static void main(String[] args) {
		// Creamos una primera instancia de tipo Novela con el constructor vacío
		Novela elResplandor = new Novela();

		// Asignamos los valores a los atributos de la instancia
		elResplandor.setTitulo("El resplandor");
		elResplandor.setAutor("Stephen King");
		elResplandor.setNumEjemplares(8);
		elResplandor.setNumEjemplaresPrestados(0);

		// Realiza un préstamo sobre la novela creada anteriormente
		if (elResplandor.prestamo()) {
			System.out.println("Se ha prestado la novela");
			System.out.println(elResplandor);
		} else {
			System.out.println("No quedan ejemplares de la novela " + elResplandor.getTitulo() + " para prestar");
		}
		System.out.println(); // Hacemos un salto de línea para la consola

		// Creamos una segunda instancia de tipo Novela con el constructor de copia
		Novela elCementerio = new Novela(elResplandor);

		// Modificamos el titulo y el numero de ejemplares prestados para esta nueva instancia
		elCementerio.setTitulo("El cementerio de animales");
		elCementerio.setNumEjemplaresPrestados(4);

		// Realiza una devolución sobre la novela creada anteriormente
		if (elCementerio.devolucion()) {
			System.out.println("Se ha devuelto la novela");
			System.out.println(elCementerio);
		} else {
			System.out.println("No se puede devolver la novela " + elCementerio.getTitulo()
					+ " ya que no hay ejemplares prestados");
		}
		System.out.println(); // Hacemos un salto de línea para la consola

		// Creamos una tercera instancia de tipo Novela con el constructor de parametros
		Novela elCodigo = new Novela("El código Da Vinci", "Dan Brown", 6, 6);

		// Realiza un préstamo sobre la novela creada anteriormente
		if (elCodigo.prestamo()) {
			System.out.println("Se ha prestado la novela");
			System.out.println(elCodigo);
		} else {
			System.out.println("No quedan ejemplares de la novela " + elCodigo.getTitulo() + " para prestar");
		}
		System.out.println(); // Hacemos un salto de línea para la consola

		// Creamos una segunda instancia de tipo Novela con el constructor de copia
		Novela inferno = new Novela(elCodigo);

		// Modificamos el titulo y el numero de ejemplares prestados para esta nueva instancia
		inferno.setTitulo("Inferno");
		inferno.setNumEjemplaresPrestados(0);

		// Realiza una devolución sobre la novela creada anteriormente
		if (inferno.devolucion()) {
			System.out.println("Se ha devuelto la novela");
			System.out.println(inferno);
		} else {
			System.out.println("No se puede devolver la novela " + inferno.getTitulo()
					+ " ya que no hay ejemplares prestados");
		}
		System.out.println(); // Hacemos un salto de línea para la consola
		
	}

}
