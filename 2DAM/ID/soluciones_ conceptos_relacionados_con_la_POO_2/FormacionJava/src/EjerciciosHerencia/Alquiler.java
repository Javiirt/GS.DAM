package EjerciciosHerencia;

import java.util.Scanner;

public class Alquiler {

	public static void main(String[] args) {
		// Creamos un array de tipo Ejemplar
		Ejemplar[] listaEjemplares = new Ejemplar[8];

		// Damos valores al array
		listaEjemplares[0] = new Serie("Juego de tronos", "George R. R. Martin", true, 8, "Aventuras");
		listaEjemplares[1] = new Serie("Los Simpsons", "Matt Groening", false, 25, "Humor");
		listaEjemplares[2] = new Serie("Padre de familia", "Seth MacFarlane", true, 12, "Humor");
		listaEjemplares[3] = new Serie("Breaking Bad", "Vince Gilligan", false, 5, "Thriller");

		listaEjemplares[4] = new Pelicula("Memorias de una Geisha", "Drama", true, "Rob Marshall");
		listaEjemplares[5] = new Pelicula("La milla verde", "Drama/Fantástico", false, "Frank Darabont");
		listaEjemplares[6] = new Pelicula("Hermanos por pelotas", "Comedia", true, "Adam McKay");
		listaEjemplares[7] = new Pelicula("El resplandor", "Terror", false, "Stanley Kubrick");

		// Creamos una instancia de tipo Scanner para interactuar con la consola
		Scanner consola = new Scanner(System.in);

		// Mostramos un mensaje en consola solicitando el título de la novela a prestar
		System.out.println("Por favor, introduzca el título de la serie o pelicula a prestar");
		String titulo = consola.nextLine();
		
		prestarEjemplar(listaEjemplares, titulo);
		
		// Mostramos un mensaje en consola solicitando el título de la novela a prestar
		System.out.println("Por favor, introduzca el título de la novela a devolver");
		titulo=consola.nextLine();

		devolverEjemplar(listaEjemplares, titulo);

		//Mostrar un listado con el título de las películas y series que se encuentran disponibles.  
		listarDisponibles(listaEjemplares);
		
		//Mostrar un listado con el título de las películas y series que se encuentran alquiladas.
		listarAlquiladas(listaEjemplares);
		
	}

	private static void prestarEjemplar(Ejemplar[] listaEjemplares, String titulo) {
		
		boolean encontrado = false;
		int contador = 0;
		do {

			if (listaEjemplares[contador].getTitulo().equalsIgnoreCase(titulo)) {
				listaEjemplares[contador].entregar();
				System.out.println(listaEjemplares[contador]);
				encontrado = true;
			}				
			contador++;
		} while(!encontrado);

		System.out.println(); // Hacemos un salto de línea para la consola
		
	}

	private static void devolverEjemplar(Ejemplar[] listaEjemplares, String titulo) {
		boolean encontrado=false;
		int contador=0;
		
		do {

			if (listaEjemplares[contador].getTitulo().equalsIgnoreCase(titulo)) {
				listaEjemplares[contador].devolver();
				System.out.println(listaEjemplares[contador]);
				encontrado = true;
			}
			contador++;
		} while(!encontrado);

		System.out.println(); // Hacemos un salto de línea para la consola
		
	}
	
	private static void listarDisponibles(Ejemplar[] listaEjemplares) {
	
		System.out.println("Listado de peliculas disponibles");
		System.out.println("--------------------------------");
		for (Ejemplar ejemplar : listaEjemplares) {
			if (ejemplar.isDisponible())
				System.out.println(ejemplar.getTitulo());
		}
		System.out.println();
	}
	
	private static void listarAlquiladas(Ejemplar[] listaEjemplares) {
		System.out.println("Listado de peliculas alquiladas");
		System.out.println("-------------------------------");
		
		for (Ejemplar ejemplar : listaEjemplares) {
			if (!ejemplar.isDisponible())
				System.out.println(ejemplar.getTitulo());
		}
		System.out.println();
	}

}
