package EjerciciosInterfaces;

public class Cuadrado implements FiguraGeometrica {
    //Constante
	private static final int NUM_LADOS_IGUALES = 4;
    
	//Atributo
	private double lado;

    // Constructores
    public Cuadrado() {
    }

    public Cuadrado(Cuadrado cuadrado) {
        this.lado = cuadrado.lado;
    }

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
		double perimetro = this.lado * NUM_LADOS_IGUALES;

        return perimetro;
	}

}
