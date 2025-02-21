package EjerciciosSobrecargaSobreescritura;

public class SonidosAnimales {

	public static void main(String[] args) {
		// Creamos las distintas instancias
		Animal animal = new Animal();
		animal.emitirSonido();
		
		animal = new Perro();
		animal.emitirSonido();
		
		animal = new Gato();
		animal.emitirSonido();
		
		animal = new Vaca();
		animal.emitirSonido();

	}

}
