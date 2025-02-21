package EjerciciosColecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListadoMiembrosGruposMusicales {

	public static void main(String[] args) {
		// creamos cuatro instancias de los 4 componentes del grupo de Metallica
		Integrante lars = new Integrante("Lars Ulrich", 56, 1.66, "BATERIA", "METALLICA");
		Integrante robert = new Integrante("Robert Trujillo", 55, 1.75, "BAJO", "METALLICA");
		Integrante kirk = new Integrante("Kirk Hammett", 57, 1.71, "GUITARRA", "METALLICA");
		Integrante james = new Integrante("James Hetfield", 57, 1.85, "VOZ", "METALLICA");

		// Creamos una lista con los componentes del grupo
		List<Integrante> listadoIntegrantes = new ArrayList<Integrante>();
		listadoIntegrantes.add(lars);
		listadoIntegrantes.add(robert);
		listadoIntegrantes.add(kirk);
		listadoIntegrantes.add(james);

		// Mostramos la lista por consola
		System.out.println("Lista de los integrantes de METALLICA - Sin ordenar");
		System.out.println("---------------------------------------------------");
		for (Integrante integrante : listadoIntegrantes) {
			System.out.println(integrante);
		}
		System.out.println();
		
		// Mostramos la lista ordenada por edad por consola
		System.out.println("Lista de los integrantes de METALLICA - Ordenada por edad");
		System.out.println("---------------------------------------------------------");
		Collections.sort(listadoIntegrantes);
		for (Integrante integrante : listadoIntegrantes) {
			System.out.println(integrante);
		}
		System.out.println();
		
		// Mostramos la lista ordenada por altura por consola
		System.out.println("Lista de los integrantes de METALLICA - Ordenada por altura");
		System.out.println("-----------------------------------------------------------");
		Collections.sort(listadoIntegrantes, new OrdenarPorAltura());
		for (Integrante integrante : listadoIntegrantes) {
			System.out.println(integrante);
		}

	}

}
