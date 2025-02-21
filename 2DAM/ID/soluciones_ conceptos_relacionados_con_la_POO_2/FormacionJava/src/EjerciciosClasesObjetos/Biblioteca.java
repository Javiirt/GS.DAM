package EjerciciosClasesObjetos;

import java.util.Scanner;

public class Biblioteca {

	public static void main(String[] args) {
		// Creamos un array de 10 posiciones
		Novela[] biblioteca = new Novela[4];

		// Creamos las instancias con el constructor de parametros para la Biblioteca
		Novela elResplandor = new Novela("El resplandor", "Stephen King", 8, 0);
		Novela elCementerio = new Novela("El cementerio de animales", "Stephen King", 8, 4);
		Novela elCodigo = new Novela("El código Da Vinci", "Dan Brown", 6, 6);
		Novela inferno = new Novela("Inferno", "Dan Brown", 6, 0);

		// Guardamos las novelas creadas en el array
		biblioteca[0] = elResplandor;
		biblioteca[1] = elCementerio;
		biblioteca[2] = elCodigo;
		biblioteca[3] = inferno;

		// Creamos una instancia de tipo Scanner para interactuar con la consola
		Scanner consola = new Scanner(System.in);

		// Mostramos un mensaje en consola solicitando el título de la novela a prestar
		System.out.println("Por favor, introduzca el título de la novela a prestar");
		String titulo = consola.nextLine();

		boolean encontrado = false;
		int contador = 0;
		do {

			if (biblioteca[contador].getTitulo().equalsIgnoreCase(titulo)) {
				if (biblioteca[contador].prestamo()) {
					System.out.println("Se ha prestado la novela");
					System.out.println(biblioteca[contador]);
				} else {
					System.out.println(
							"No quedan ejemplares de la novela " + biblioteca[contador].getTitulo() + " para prestar");
				}
				encontrado = true;
			}
			contador++;

		} while (!encontrado);

		System.out.println(); // Hacemos un salto de línea para la consola

		
		// Mostramos un mensaje en consola solicitando el título de la novela a prestar
		System.out.println("Por favor, introduzca el título de la novela a devolver");
		titulo = consola.nextLine();

		encontrado = false;
		contador = 0;
		do {

			if (biblioteca[contador].getTitulo().equalsIgnoreCase(titulo)) {
				if (biblioteca[contador].devolucion()) {
					System.out.println("Se ha devuelto la novela");
					System.out.println(biblioteca[contador]);
				} else {
					System.out.println("No se puede devolver la novela " + biblioteca[contador].getTitulo()
							+ " ya que no hay ejemplares prestados");
				}
				encontrado = true;
			}
			contador++;

		} while (!encontrado);

		System.out.println(); // Hacemos un salto de línea para la consola

	}

}
