package EjerciciosSobrecargaSobreescritura;

public class Perro extends Animal {
	
	@Override
	public void emitirSonido() {
		System.out.println("Guau, guau, guau!!!");
	}
}
