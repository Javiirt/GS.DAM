package EjerciciosClasesAbstractas;

public class Cuadrado extends FiguraGeometrica {
	//Constante
	public static final int NUM_LADOS_IGUALES = 4;
	
	//Atributos
	private double lado;
	
	//Getters & setters	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	
	@Override
	public double calcularArea() {
		
		double area = Math.pow(lado, 2);
		
		return area;
	}

	@Override
	public double calcularPerimetro() {
		
		double perimetro = lado * NUM_LADOS_IGUALES;
		
		return perimetro;
	}

}
