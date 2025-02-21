package ClasesObjetos;

public class Empleado extends Persona {
	
	//Atributos
	private int antiguedad;
	private double salario;
	private String puesto;
	
	//Constructor vacio
	public Empleado() {
		
	}

	//Constructor de copia
	public Empleado (Empleado emp) {
		super(emp);
		antiguedad = emp.antiguedad;
		salario = emp.salario;
		puesto = emp.puesto;
	}
	
	//Constructor de parametros
	public Empleado(String nombre, String primerA, String segundoA, String dni, int edad, int antiguedad, double salario, String puesto) {
		super(nombre, primerA, segundoA, dni, edad);
		this.antiguedad = antiguedad;
		this.salario = salario;
		this.puesto = puesto;
	}
	
	//Getters & setters
	
	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return super.toString() + "\nEmpleado [antiguedad=" + antiguedad + ", salario=" + salario + ", puesto=" + puesto + "]";
	}
	
	/**
	 * Metodo que actualiza el salario del empleado con el incremento que se le pasa como parametro.
	 * @param incremento - valor a incrementar al salario
	 */
	public void actualizarSalario(double incremento) {
		salario = salario + incremento;
	}
	
	
}
