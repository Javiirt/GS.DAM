package EjerciciosComposicion;

public class Furgoneta extends Turismo {
	// Declaramos sus atributos
	private int carga;
	
	// Constructor vacío
	public Furgoneta() {

	}

	// Constructor de copia
	public Furgoneta(Furgoneta f) {
		super(f);
		carga = f.carga;
	}
	
	//Constructor de parametros
	public Furgoneta(String marca, String modelo, String matricula, int carga) {
		super(marca, modelo, matricula);
		this.carga = carga;
	}

	@Override
	public String toString() {
		String datos = "\n      Marca: " + super.getMarca() + 
			 "\n      Modelo: " + super.getModelo() + 
			 "\n      Matrícula: " + super.getMatricula() +
			 "\n      Carga: " + carga;
		return datos;
	}
	
}
