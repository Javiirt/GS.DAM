package EjerciciosClasesAbstractas;

public class Restaurante {

	public static void main(String[] args) {
		
		//Creamos una instancia de tipo Camarero. 
		Camarero empleado1 = new Camarero();
		
		//Le asignamos valores a la instancia creada anteriormente. 
		//Valores: Nombre=”Pedro Sanchez”, puesto=”Camarero”, sueldo=1200.00, numMesasAsignadas = 5, horasExtras=10
		empleado1.setNombre("Erik Rodriguez");
		empleado1.setPuesto("Camarero");
		empleado1.setSueldo(1200.00);
		empleado1.setNumMesasAsignadas(5);
		empleado1.setHorasExtras(10);
		
		//Creamos una segunda instancia de tipo Camarero. 
		Camarero empleado2 = new Camarero();
		
		//Le asignamos valores a la instancia creada anteriormente. 
		//Valores: Nombre=”Luz Delgado”, puesto=”Camarero”, sueldo=1200.00, numMesasAsignadas = 10, horasExtras=10
		empleado2.setNombre("Luz Delgado");
		empleado2.setPuesto("Camarero");
		empleado2.setSueldo(1200.00);
		empleado2.setNumMesasAsignadas(10);
		empleado2.setHorasExtras(10);
		
		//Creamos una instancia de tipo Cocinero. 
		Cocinero empleado3 = new Cocinero();
		
		//Le asignamos valores a la instancia creada anteriormente. 
		//Valores: Nombre=”Luz Delgado”, puesto=”Cocinero”, sueldo=1500.00, horasExtras=10
		empleado3.setNombre("Alex Municio");
		empleado3.setPuesto("Camarero");
		empleado3.setSueldo(1500.00);
		empleado3.setHorasExtras(10);
		
		//Ahora mostramos por pantalla el puesto de cada empleado del restaurante junto con su salario 
		System.out.println("Listado de empleados del Restaurante");
		System.out.println("------------------------------------");
		empleado1.indicarPuesto();
		System.out.println("Su salario es " + empleado1.calcuarSalario());
		System.out.println();
		
		empleado2.indicarPuesto();
		System.out.println("Su salario es " + empleado2.calcuarSalario());
		System.out.println();
		
		empleado3.indicarPuesto();
		System.out.println("Su salario es " + empleado3.calcuarSalario());
	}

}
