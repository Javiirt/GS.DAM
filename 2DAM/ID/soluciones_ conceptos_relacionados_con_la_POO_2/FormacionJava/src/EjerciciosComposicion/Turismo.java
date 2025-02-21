package EjerciciosComposicion;

public class Turismo extends Vehiculo {
	
	// Constructor vacío
	public Turismo() {

	}

	// Constructor de copia
	public Turismo(Turismo t) {
		super(t);
	}
	
	//Constructor de parametros
	public Turismo(String marca, String modelo, String matricula) {
		super(marca, modelo, matricula);
	}

	
}
