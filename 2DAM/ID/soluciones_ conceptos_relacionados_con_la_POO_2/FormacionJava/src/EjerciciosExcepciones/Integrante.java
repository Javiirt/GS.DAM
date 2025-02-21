package EjerciciosExcepciones;

public class Integrante implements Comparable<Integrante>{
	// Lista de atributos
	private String nombre;
	private int edad;
	private double altura;
	private String instrumento;
	private String grupo;

	//Constructor vacío
	public Integrante() {
	}
	
	//Constructor de copia
	public Integrante(Integrante integrante) {
		this.nombre = integrante.nombre;
		this.edad = integrante.edad;
		this.altura = integrante.altura;
		this.instrumento = integrante.instrumento;
		this.grupo = integrante.grupo;
	}
	
	//Constructor de parametros
	public Integrante(String nombre, int edad, double altura, String instrumento, String grupo) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.instrumento = instrumento;
		this.grupo = grupo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad >= 18 && edad <= 99) {
			this.edad = edad;
		} else {
			throw new ExcepcionesPropias(ExcepcionesPropias.ERM_001);
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	//Metodo toString para mostrar los datos
	@Override
	public String toString() {
		return this.nombre + " (" + this.edad + " y " + this.altura + ") - " + this.instrumento + " - " + this.grupo;
	}

	@Override
	public int compareTo(Integrante integrante) {
		// Ordenamos por edad
		
		return this.edad - integrante.edad;
	}

	
}
