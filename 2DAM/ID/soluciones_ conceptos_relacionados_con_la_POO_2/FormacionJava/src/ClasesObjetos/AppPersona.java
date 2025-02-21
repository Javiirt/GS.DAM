package ClasesObjetos;

import java.util.Scanner;

public class AppPersona {

	public static void main(String[] args) {
		// Creamos una instanccia de Persona con el constructor vacío
		Persona persona = new Persona();
		
		// Creamos una instacia del consolaanner para la entrada de datos
		Scanner consola = new Scanner(System.in);
		System.out.println("Introduce el nombre");
		persona.setNombre(consola.next());
		System.out.println("Primer apellido");
		persona.setPrimerApellido(consola.next());
		System.out.println("Segundo apellido");
		persona.setSegundoApellido(consola.next());
		System.out.println("Introduce dni");
		persona.setDni(consola.next());
		System.out.println("Introduce edad");
		persona.setEdad(consola.nextInt());

	}

}
