package EjerciciosColecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GestionGruposMusicales {

	public static void main(String[] args) {
		// Creamos las instancias de tipo Integrante con los miembros de los distintos
		// grupos musicales
		Integrante lars = new Integrante("Lars Ulrich", 56, 1.66, "BATERIA", "METALLICA");
		Integrante robert = new Integrante("Robert Trujillo", 55, 1.75, "BAJO", "METALLICA");
		Integrante kirk = new Integrante("Kirk Hammett", 57, 1.71, "GUITARRA", "METALLICA");
		Integrante james = new Integrante("James Hetfield", 57, 1.85, "VOZ", "METALLICA");

		Integrante brian = new Integrante("Brian Johnson", 73, 1.65, "VOZ", "AC/DC");
		Integrante angus = new Integrante("Angus Young", 66, 1.57, "GUITARRA", "AC/DC");
		Integrante malcolm = new Integrante("Malcolm Young", 64, 1.60, "GUITARRA", "AC/DC");
		Integrante cliff = new Integrante("Cliff Williams", 71, 1.70, "BAJO", "AC/DC");
		Integrante phil = new Integrante("Phil Rudd", 67, 1.68, "BATERIA", "AC/DC");

		// Creamos un mapa con todos los integrantes donde las claves van a ser de tipo
		// String y los valores son de tipo Integrante
		Map<String, Integrante> integrantesGruposMusicales = new HashMap<>();

		// Añadimos al mapa anterior todos los integrantes creados anteriormente
		integrantesGruposMusicales.put("META1", lars);
		integrantesGruposMusicales.put("META2", robert);
		integrantesGruposMusicales.put("META3", kirk);
		integrantesGruposMusicales.put("META4", james);
		integrantesGruposMusicales.put("ACDC1", brian);
		integrantesGruposMusicales.put("ACDC2", angus);
		integrantesGruposMusicales.put("ACDC3", malcolm);
		integrantesGruposMusicales.put("ACDC4", cliff);
		integrantesGruposMusicales.put("ACDC5", phil);

		// Sacamos un listado de todos los componentes
		Set<String> grupos = new HashSet<String>();
		grupos = integrantesGruposMusicales.keySet();
		System.out.println("Listado de todos los integrantes");
		System.out.println("--------------------------------");
		for (String grupo : grupos) {
			System.out.println(integrantesGruposMusicales.get(grupo));
		}
		
		System.out.println();

		//Creamos una lista para guardar solo los componentes de ACDC y poder despues ordenarla
		List<Integrante> listadoIntegrantesACDC = new ArrayList<Integrante>();
		for (String grupo : grupos) {
			if (grupo.equals("ACDC1") || grupo.equals("ACDC2") || grupo.equals("ACDC3") || 
					grupo.equals("ACDC4") ||grupo.equals("ACDC5") ) {
				listadoIntegrantesACDC.add(integrantesGruposMusicales.get(grupo));
			}
		}
		//ordenamos la lista
		Collections.sort(listadoIntegrantesACDC);
		
		// Sacamos un listado de todos los componentes de AC/DC
		System.out.println("Listado de todos los integrantes de AC/DC ordenados por edad");
		System.out.println("------------------------------------------------------------");
		for (Integrante integrante : listadoIntegrantesACDC) {
			System.out.println(integrante);
		}
	}

}
