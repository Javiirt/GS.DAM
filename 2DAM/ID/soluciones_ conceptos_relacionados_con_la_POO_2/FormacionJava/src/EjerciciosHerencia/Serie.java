package EjerciciosHerencia;

public class Serie extends Ejemplar {

	//Atributos
	private int numTemporadas;
	private String tipo;

	//Constructor vacio
	public Serie() {
		
	}
	
	//Constructor de copia
	public Serie(Serie s) {
		super(s);
		this.numTemporadas = s.numTemporadas;
		this.tipo = s.tipo;
	}
	
	//Constructor de parametros
	public Serie(String titulo, String genero, boolean disponible, int numTemporadas, String tipo) {
		super(titulo, genero, disponible);
		this.numTemporadas = numTemporadas;
		this.tipo = tipo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Nº de temporadas:" + numTemporadas + 
				                  "\n Tipo:" + tipo + 
				                  "\n Disponible: " + super.isDisponible();
	}
		
}