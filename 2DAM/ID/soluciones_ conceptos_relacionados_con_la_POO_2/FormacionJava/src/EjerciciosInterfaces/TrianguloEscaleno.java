package EjerciciosInterfaces;

public class TrianguloEscaleno extends Triangulo {

	// Atributos
	private double lado1;
	private double lado2;

	// Constructores
	public TrianguloEscaleno() {
	}

	public TrianguloEscaleno(TrianguloEscaleno escaleno) {
		this.lado1 = escaleno.lado1;
		this.lado2 = escaleno.lado2;
	}

	// Getters & setters
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	@Override
	public double calcularAltura() {
		double midPer = calcularPerimetro() / 2;

		double area = Math.sqrt(midPer * (midPer - lado1) * (midPer - lado2) * (midPer - super.getBase()));

		double altura = (2 * area) / super.getBase();

		return altura;
	}

	@Override
	public double calcularPerimetro() {
		double perimetro = this.lado1 + this.lado2 + super.getBase();

		return perimetro;
	}

}
