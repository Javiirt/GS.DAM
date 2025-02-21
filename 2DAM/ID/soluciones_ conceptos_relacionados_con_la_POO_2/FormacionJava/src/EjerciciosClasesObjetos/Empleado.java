/**
 *
 */
package EjerciciosClasesObjetos;

/**
 * @author rebeca.velasco
 *
 */
public class Empleado {

	// Constante
	private static final double PAGO_HORA_EXTRA = 10;

	// Atributos
	private String nif;
	private String nombre;
	private double sueldoBase;
	private int horasExtras;
	private double tipoIRPF;
	private boolean casado;
	private int numHijos;

	// Constructor vacío
	public Empleado() {

	}

	public Empleado(Empleado e) {
		this.nif = e.nif;
		this.nombre = e.nombre;
		this.sueldoBase = e.sueldoBase;
		this.horasExtras = e.horasExtras;
		this.tipoIRPF = e.tipoIRPF;
		this.casado = e.casado;
		this.numHijos = e.numHijos;

	}
	
	public Empleado(String nif, String nombre, double sueldoBase, int horasExtras, double tipoIRPF, boolean casado, int numHijos) {
		this.nif = nif;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.horasExtras = horasExtras;
		this.tipoIRPF = tipoIRPF;
		this.casado = casado;
		this.numHijos = numHijos;
	}

	// Getters y setters

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double getTipoIRPF() {
		return tipoIRPF;
	}

	public void setTipoIRPF(double tipoIRPF) {
		this.tipoIRPF = tipoIRPF;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getNumHijos() {
		return numHijos;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}

	// Método que modifica el syso
	public String toString() {
		return "Datos del empleado: " + this.nif + " " + this.nombre + "\nSueldo Base: " + this.sueldoBase
				+ "\nHoras Extras: " + this.horasExtras + "\nTipo IRPF: " + this.tipoIRPF + "\nCasado: " + this.casado
				+ "\nNúmero de hijos: " + this.numHijos;
	}

	// Método que calcula el importe de las horas extras realizadas
	public double calcularImporteHorasExtras() {
		double calculo = this.horasExtras * PAGO_HORA_EXTRA;

		return calculo;
	}

	// Método que calcula el sueldo bruto
	public double calcularSueldoBruto() {
		double calculo = this.sueldoBase + this.calcularImporteHorasExtras();

		return calculo;
	}

	// Método que calcula la retención del IRPF
	public double calcularRetencionIRPF() {
		double tipo = this.tipoIRPF;

		if (casado) {
			tipo = tipo - 2;
		}
		tipo = tipo - this.numHijos;

		double calculo = (this.calcularSueldoBruto() * tipo) / 100;

		return calculo;
	}

	// Método que calcula el sueldo
	public double calcularSueldo() {
		double calculo = this.calcularSueldoBruto() - this.calcularRetencionIRPF();

		return calculo;
	}

}
