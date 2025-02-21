package EjerciciosSobrecargaSobreescritura;

public class Conversion {

	public static void main(String[] args) {
		//Creamos las variables
		double numDouble = 2145.56;
		char caracter = 'H';
		
		//mostramos por consola la conversión de esas variables usando los métodos anteriores.
		System.out.println("El numero double " + numDouble + " en entero es " + convertirAEntero(numDouble));
		System.out.println("El caracter "+ caracter + " en entero es " + convertirAEntero(caracter));
		
	}

	public static int convertirAEntero (double numero) {
		int entero = 0;
		
		entero = (int) numero;
		
		return entero;
	}
	
	public static int convertirAEntero (char numero) {
		int entero = 0;
		
		entero = numero;
		
		return entero;
	}
	
}
