package EjerciciosExcepciones;

import java.util.Scanner;

public class AltaIntegrante {

	public static void main(String[] args) {
		
		// Creamos una instancia de tipo Integrante
		Integrante nuevoIntegrante = new Integrante();

		// Creamos el objeto de tipo Scanner para poder solicitar datos por consola
		Scanner consola = new Scanner(System.in);

		// Solicitamos los datos del integrante y se los asignamos a los atributos de la instancia
		System.out.println("Datos del nuevo integrante");
		System.out.println("Nombre");
		nuevoIntegrante.setNombre(consola.nextLine());
		
		System.out.println("Edad");
		try {
			nuevoIntegrante.setEdad(consola.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Altura");
		nuevoIntegrante.setAltura(consola.nextDouble());
		
		System.out.println("Instrumento");
		nuevoIntegrante.setInstrumento(consola.next());
		
		System.out.println("Grupo");
		nuevoIntegrante.setGrupo(consola.next());

		System.out.println();
		
		//Mostramos la informacion del nuevo integrante
		System.out.println("Datos introducidos para el nuevo integrante");
		System.out.println(nuevoIntegrante);
	}

}
