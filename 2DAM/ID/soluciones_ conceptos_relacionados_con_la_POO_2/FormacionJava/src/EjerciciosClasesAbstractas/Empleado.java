package EjerciciosClasesAbstractas;

public abstract class Empleado {
	
	//Constantes
	public static final double PRECIO_HORA_EXTRA = 10.0;
	public static final double INC_MESA = 5.0;

	//Atributos
	private String nombre;
	private String puesto;
	private double sueldo;
	
	//Getters & setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public abstract void indicarPuesto();
	
	public abstract double calcuarSalario();


}
