package EjerciciosExcepciones;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		//Definimos las variables que vamos a necesitar
		int numerador, denominador;
		double resultado;
		
		//Creamos el objeto de tipo Scanner para poder solicitar datos por consola
		Scanner consola = new Scanner(System.in);
		
		//Solicitamos los dos numeros para la operacion
		System.out.println("Vamos a realizar una división, introduce el numerador");
		numerador = consola.nextInt();
		System.out.println("Ahora introduce el denominador");
		denominador = consola.nextInt();
		
		//Realizamos la operación pero controlando la posibilidad de que ocurra un error al intentar dividir
		try {
			resultado = numerador / denominador;
			//Si va bien, mostramos el resultado
			System.out.println("El resultado es " + resultado);
		} catch (Exception e) {
			//Si salta una excepción al intentar dividir, mostramos el mensaje con el error producido
			System.out.println("No se ha podido realizar la division - " + e.getMessage());
		}
	}

}
