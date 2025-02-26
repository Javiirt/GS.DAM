package EjercicioPolimorfismo;

public class Vehiculo {

	// Declaramos sus atributos
	private String marca;
	private String modelo;
	private String matricula;

	// Constructor vac�o
	public Vehiculo() {

	}

	// Constructor de copia
	public Vehiculo(Vehiculo veh) {
		this.marca = veh.marca;
		this.modelo = veh.modelo;
		this.matricula = veh.matricula;
	}
	
	//Constructor de parametros
	public Vehiculo(String marca, String modelo, String matricula) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
	}

	// Metemos los metodos getters y setters para todos los atributos
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void mostrarAtributos() {
		String datos = "Datos del veh�culo" + 
					   "\n------------------" +
			           "\nMarca: " + this.marca + 
			           "\nModelo: " + this.modelo + 
			           "\nMatr�cula: " + this.matricula;
		System.out.println(datos);
	}

}
