package EjerciciosColecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListadoPersonas {

	public static void main(String[] args) {
		// Creamos las cuatro instancias de tipo Persona
		Persona alex = new Persona("Alex", "Muñoz", "Velasco", "12.345.678-L", 25);
		Persona ana = new Persona("Ana", "Gil", "Gil", "12.345.678-L", 55);
		Persona erik = new Persona("Erik", "Muñoz", "Velasco", "12.345.678-L", 34);
		Persona sara = new Persona("Sara", "Sanz", "Perez", "12.345.678-L", 48);
		
		//Creamos una List usando la implementación ArrayList donde vamos a guardar objetos de tipo Persona. 
		List<Persona> listadoPersonas = new ArrayList<Persona>();

		//Una vez creada la lista, vamos a añadir en ella las distintas instancias de tipo persona que hemos creado en el primer punto.
		listadoPersonas.add(alex);
		listadoPersonas.add(ana);
		listadoPersonas.add(erik);
		listadoPersonas.add(sara);
		
		//Sacamos por consola un listado de las personas que tenemos sin ordenar.
		System.out.println("Listado de personas sin ordenar");
		System.out.println("-------------------------------");
		for (Persona persona : listadoPersonas) {
			System.out.println(persona);
		}
		System.out.println();
		
		//Después, podemos ordenar la lista creada por edad de menor a mayor.
		Collections.sort(listadoPersonas);
		
		//Y por último, volvemos a mostrar por consola el listado de personas pero esta vez ordenados por la edad.
		System.out.println("Listado de personas ordenadas por edad");
		System.out.println("--------------------------------------");
		for (Persona persona : listadoPersonas) {
			System.out.println(persona);
		}
		System.out.println();
	
	}
	
}
