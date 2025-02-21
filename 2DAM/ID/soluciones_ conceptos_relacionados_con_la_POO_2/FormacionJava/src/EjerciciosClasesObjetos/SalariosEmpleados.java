/**
 *
 */
package EjerciciosClasesObjetos;

import java.util.Scanner;

/**
 * @author rebeca.velasco
 *
 */
public class SalariosEmpleados {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creamos la instancia de tipo Empleado usando el constructor de parametros
		Empleado lucas = new Empleado("12345678A", "Lucas Guerrero Arjona", 1150.00, 4, 15.0, true, 2);

		System.out.println(lucas);
		System.out.println("\nEl salario de " + lucas.getNombre() + " es " + lucas.calcularSueldo());

		System.out.println(); // Hacemos un salto de línea para la consola

		// Creamos la instancia de tipo Empleado usando el constructor de parametros
		Empleado fran = new Empleado("11111111H", "Francisco Perez Antón", 1150.00, 4, 15.0, false, 0);

		System.out.println(fran);
		System.out.println("\nEl salario de " + fran.getNombre() + " es " + fran.calcularSueldo());

		// Creamos la instancia de tipo Empleado usando el constructor de parametros
		Empleado marta = new Empleado("22222222G", "Marta Antón Sanz", 1150.00, 0, 15.0, true, 0);

		System.out.println(marta);
		System.out.println("\nEl salario de " + marta.getNombre() + " es " + marta.calcularSueldo());
	}

}
