package EjerciciosClasesAbstractas;

public class Camarero extends Empleado {

	//Atributos
	private int horasExtras;
	private int numMesasAsignadas;
	
	//Getters & setters
	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public int getNumMesasAsignadas() {
		return numMesasAsignadas;
	}

	public void setNumMesasAsignadas(int numMesasAsignadas) {
		this.numMesasAsignadas = numMesasAsignadas;
	}

	@Override
	public void indicarPuesto() {
		System.out.println(super.getNombre() + " es un camarero");
	}

	@Override
	public double calcuarSalario() {

		double salario = super.getSueldo() + (horasExtras * Empleado.PRECIO_HORA_EXTRA) + (numMesasAsignadas * Empleado.INC_MESA);
		
		return salario;
	}

}
