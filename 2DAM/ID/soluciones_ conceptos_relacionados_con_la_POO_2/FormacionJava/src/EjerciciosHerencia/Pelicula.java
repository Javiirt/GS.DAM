package EjerciciosHerencia;

public class Pelicula extends Ejemplar {

	//Atributo
	private String director;
	
	//Constructor vacio
	public Pelicula() {
		
	}
	
	//Constructo de copia
	public Pelicula(Pelicula p) {
		super(p);
		this.director = p.director;
	}
	
	//Constructor de parametros
	public Pelicula(String titulo, String genero, boolean disponible, String director) {
		super(titulo, genero, disponible);
		this.director = director;
	}

	//Getters & setters
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Director:" + director + 
                                  "\n Disponible: " + super.isDisponible();
	}
	
	
}
