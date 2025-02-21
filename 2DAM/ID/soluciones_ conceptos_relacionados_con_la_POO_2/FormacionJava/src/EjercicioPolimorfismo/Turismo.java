package EjercicioPolimorfismo;

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

	@Override
	public void mostrarAtributos() {
		String datos = "Datos del turismo" + 
			 "\n------------------" +
			 "\nMarca: " + super.getMarca() + 
			 "\nModelo: " + super.getModelo() + 
			 "\nMatrícula: " + super.getMatricula();
		System.out.println(datos);
	}

}
