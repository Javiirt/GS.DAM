package EjerciciosInterfaces;

public class Circulo implements FiguraGeometrica {

	//Atributo
	private double radio;

    //Constructores
    public Circulo(){
    	
    }

    public Circulo(Circulo circulo){
        this.radio = circulo.radio;
    }
    
    //Setters & getters
    public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	@Override
	public double calcularArea() {
		double area = PI * Math.pow(radio, 2);

        return area;
	}

	@Override
	public double calcularPerimetro() {
		double perimetro = 2 * PI * this.radio;

        return perimetro;
	}

}
