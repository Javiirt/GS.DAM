package ClasesObjetos;

public class Comercial extends Empleado {

	// Atributo
	private double comision;

	// Constructor vacio
	public Comercial() {

	}

	// Constructor de copia
	public Comercial(Comercial c) {
		super(c);
		this.comision = c.comision;
	}

	// Constructor de parametros
	public Comercial(String nombre, String primerA, String segundoA, String dni, int edad, int antiguedad,
			double salario, String puesto, double comision) {
		super(nombre, primerA, segundoA, dni, edad, antiguedad, salario, puesto);
		this.comision = comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return super.toString() + "\nComercial [comision=" + comision + "]";
	}

	public void calcularComision(double incremento) {
		comision = comision + incremento;
	}

	public void calcularComision(double incremento, double plus) {
		comision = comision + incremento + plus;
	}

	@Override
	public void actualizarSalario(double incremento) {
		double salarioActual = this.getSalario();
		
		if (this.getAntiguedad() <= 5) {
			calcularComision(25.0);
		} else {
			calcularComision(25.0, 100.0);
		}
		
		double nuevaComision = comision;
		
		this.setSalario(salarioActual + incremento + nuevaComision);
	}

}
