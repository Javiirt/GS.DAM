package EjerciciosSobrecargaSobreescritura;

public class Granja {

	public static void main(String[] args) {
		//Creamos las distintas instancias
		Animal animal = new Animal();
		Perro perro = new Perro();
		Gato gato = new Gato();
		Vaca vaca = new Vaca();
		
		//Mostramos el sonido para cada instancia
		animal.emitirSonido();
		perro.emitirSonido();
		gato.emitirSonido();
		vaca.emitirSonido();
		
	}

}
