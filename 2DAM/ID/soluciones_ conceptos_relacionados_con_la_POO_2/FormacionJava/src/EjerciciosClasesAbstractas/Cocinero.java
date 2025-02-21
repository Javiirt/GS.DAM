package EjerciciosClasesAbstractas;

public class Cocinero extends Empleado {

	//Atributos
	private int horasExtras;
	
	//Getters & setters
	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	@Override
	public void indicarPuesto() {
		System.out.println(super.getNombre() + " es un cocinero");
	}

	@Override
	public double calcuarSalario() {
		
		double salario = super.getSueldo() + (horasExtras * Empleado.PRECIO_HORA_EXTRA);
		
		return salario;
	}

}
