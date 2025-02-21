package EjerciciosInterfaces;

public class TrianguloIsosceles extends Triangulo {
	// Constante
	public static final int NUM_LADOS_IGUALES = 2;

	// Atributo
	private double lado;

	// Constructores
	public TrianguloIsosceles() {
	}

	public TrianguloIsosceles(TrianguloIsosceles triangulo) {
		this.lado = triangulo.lado;
	}

	// Getters & setters
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularAltura() {
		double altura = Math.sqrt((Math.pow(lado, 2) - (Math.pow(super.getBase(), 2) / 4)));

		return altura;
	}

	@Override
	public double calcularPerimetro() {
		double perimetro = super.getBase() + lado * NUM_LADOS_IGUALES;

		return perimetro;
	}

}
