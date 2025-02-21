package EjerciciosInterfaces;

public abstract class Triangulo implements FiguraGeometrica {

	//Atributo
	private double base;
	
	 //Constructores
	public Triangulo(){
		
	}

    public Triangulo(Triangulo triangulo){
        this.base = triangulo.base;
    }
	
    //Setters & getters
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public abstract double calcularAltura();
	
	@Override
	public double calcularArea() {
		 double area = (this.base * calcularAltura())/2;

	     return area;
	}

	@Override
	public abstract double calcularPerimetro();

}
