package ClasesObjetos;

public class Persona {

	// Atributos
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String dni;
	private int edad;

	// Constructor vacío
	public Persona() {
	}

	// Constructor de copia
	public Persona(Persona p) {
		this.nombre = p.nombre;
		this.primerApellido = p.primerApellido;
		this.segundoApellido = p.segundoApellido;
		this.dni = p.dni;
		this.edad = p.edad;
	}

	// Constructor de parámetros
	public Persona(String nombre, String primerA, String segundoA, String dni, int edad) {
		this.nombre = nombre;
		this.primerApellido = primerA;
		this.segundoApellido = segundoA;
		this.dni = dni;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
				+ segundoApellido + ", dni=" + dni + ", edad=" + edad + "]";
	}

	
}
