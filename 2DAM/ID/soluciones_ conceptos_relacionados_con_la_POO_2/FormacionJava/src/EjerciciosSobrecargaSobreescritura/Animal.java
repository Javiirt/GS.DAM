package EjerciciosSobrecargaSobreescritura;

public class Animal {

	//Atributos
	private String tipo;
	private int nPatas;
	private String sonido;

	//Constructor vacio
	public Animal () {
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getnPatas() {
		return nPatas;
	}

	public void setnPatas(int nPatas) {
		this.nPatas = nPatas;
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}
	
	public void emitirSonido() {
		System.out.println("Sonido del animal");
	}
}
