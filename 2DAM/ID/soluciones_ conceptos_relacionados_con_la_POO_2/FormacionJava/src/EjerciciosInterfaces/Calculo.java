package EjerciciosInterfaces;

public class Calculo {
	// Constantes
	public final static double LADO_CUADRADO = 2.0;
	public final static double RADIO_CIRCULO = 2.0;
	public final static double LADO_EQUILATERO = 3.0;
	public final static double LADO_ISOSCELES = 3.0;
	public final static double BASE_ISOSCELES = 2.0;
	public final static double LADO1_ESCALENO = 4.0;
	public final static double LADO2_ESCALENO = 5.0;
	public final static double BASE_ESCALENO = 3.0;

	public static void main(String[] args) {
		
		// Creamos las instancias de los distintos tipos Cuadrado, Circulo, TrianguloEquilatero, TrianguloIsosceles y TrianguloEscaleno
		Cuadrado cuadrado = new Cuadrado();
		Circulo circulo = new Circulo();
		TrianguloEquilatero equilatero = new TrianguloEquilatero();
		TrianguloIsosceles isosceles = new TrianguloIsosceles();
		TrianguloEscaleno escaleno = new TrianguloEscaleno();

		// Damos valor a los atributos de las distintas instancias
		cuadrado.setLado(LADO_CUADRADO);
		circulo.setRadio(RADIO_CIRCULO);
		equilatero.setBase(LADO_EQUILATERO);
		isosceles.setBase(BASE_ISOSCELES);
		isosceles.setLado(LADO_ISOSCELES);
		escaleno.setBase(BASE_ESCALENO);
		escaleno.setLado1(LADO1_ESCALENO);
		escaleno.setLado2(LADO2_ESCALENO);
	
		//Ahora creamos una instancia de tipo FiguraGeometrica y le damos la forma de cuadrado		
		FiguraGeometrica figura = cuadrado;
		//Calculamos su perimetro y area
		System.out.println("Dado un cuadrado de lado " + LADO_CUADRADO);
		System.out.println("El perimetro es: " + figura.calcularPerimetro());
		System.out.println("El area es: " + figura.calcularArea());

		//Ahora sobre la instancia de tipo FiguraGeometrica anterior y le damos la forma de circulo		
		figura = circulo;
		System.out.println("Dado un circulo de radio " + RADIO_CIRCULO);
		System.out.println("El perimetro es: " + figura.calcularPerimetro());
		System.out.println("El area es: " + figura.calcularArea());

		//Ahora sobre la instancia de tipo FiguraGeometrica anterior y le damos la forma de Triangulo equilatero		
		System.out.println("Dado un triangulo equilatero de lado " + LADO_EQUILATERO);
		figura = equilatero;
		System.out.println("El perimetro es: " + figura.calcularPerimetro());
		System.out.println("El area es: " + figura.calcularArea());

		//Ahora sobre la instancia de tipo FiguraGeometrica anterior y le damos la forma de Triangulo isosceles		
		System.out.println("Dado un triangulo isosceles de lado " + LADO_ISOSCELES + " y  base " + BASE_ISOSCELES);
		figura = isosceles;
		System.out.println("El perimetro es: " + figura.calcularPerimetro());
		System.out.println("El area es: " + figura.calcularArea());

		//Ahora sobre la instancia de tipo FiguraGeometrica anterior y le damos la forma de Triangulo escaleno		
		System.out.println("Dado un triangulo escaleno de lados " + LADO1_ESCALENO + ", " + LADO2_ESCALENO + " y "
				+ BASE_ESCALENO);
		figura = escaleno;
		System.out.println("El perimetro es: " + figura.calcularPerimetro());
		System.out.println("El area es: " + figura.calcularArea());

	}

}
