package EjerciciosInterfaces;

public class TrianguloEquilatero extends Triangulo {
	
	//Constante
	public static final int NUM_LADOS_IGUALES = 3;

    //Constructores
    public TrianguloEquilatero(){
    	
    }

	@Override
	public double calcularAltura() {
		double altura = (Math.sqrt(3.0)/2) * super.getBase();

        return altura;
	}

	@Override
	public double calcularPerimetro() {
		double perimetro = super.getBase() * NUM_LADOS_IGUALES;

        return perimetro;
	}

}
