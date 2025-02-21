package ClasesObjetos;

public class Empresa {

	public static void main(String[] args) {
		//Crear una instancia de tipo Empleado
		Empleado empleado = new Empleado();
		
		//Damos valores a los atributos
		empleado.setNombre("Rebeca");
		empleado.setPrimerApellido("Velasco");
		empleado.setSegundoApellido("Gonzalez");
		empleado.setDni("12345678L");
		empleado.setEdad(30);
		empleado.setAntiguedad(20);
		empleado.setPuesto("Jefe");
		empleado.setSalario(1800.0);
		
		//Mostramos la informacion del empleado
		System.out.println(empleado.toString());
		System.out.println();
		
		//Actualizamos su salario
		empleado.actualizarSalario(150.0);
		
		//Mostramos la informacion del empleado
		System.out.println(empleado);

	}

}
