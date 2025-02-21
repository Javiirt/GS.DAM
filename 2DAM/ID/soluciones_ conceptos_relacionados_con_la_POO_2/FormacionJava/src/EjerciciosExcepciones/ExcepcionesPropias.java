package EjerciciosExcepciones;

public class ExcepcionesPropias extends RuntimeException {
	
	//Constante de error
	public static final String ERM_001 = "Edad incorrecta!!";
	
	//Constructor de parámetro
	public ExcepcionesPropias(String mensaje) {
		super(mensaje);
	}

}
