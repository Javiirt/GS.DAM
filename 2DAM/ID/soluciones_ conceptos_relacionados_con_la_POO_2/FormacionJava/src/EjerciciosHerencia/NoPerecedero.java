package EjerciciosHerencia;

public class NoPerecedero extends Producto {

	// Atributo
	private String tipo;

	// Constructor vacio
	public NoPerecedero() {

	}

	// Constructor de copia
	public NoPerecedero(NoPerecedero p) {
		super(p);
		tipo = p.tipo;
	}

	// Constructor de parametros
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	//Getters & setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + "\n NoPerecedero [tipo=" + tipo + "]";
	}

	
}
