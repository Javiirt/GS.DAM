package ClasesObjetos;

public class AppEmpresa {

	public static void main(String[] args) {
		// Crear las instancias para los dos empleados de tipo Comercial.
		Comercial jefeZona = new Comercial("Lucas", "Guerrero", "Arjona","12345678A", 42, 12, 2400.00, "Jefe de zona", 100.00);
		Comercial comercial = new Comercial("Francisco", "Perez", "Antón","11111111H ", 24, 2, 1200.00, "“Comercial",50.00);
		
		//Ahora vamos a actualizar el salario a los dos empleados creados anteriormente.
		jefeZona.actualizarSalario(200.00);
		comercial.actualizarSalario(200.00);
		
		//Por último, debemos mostrar la información de ambos empleados para comprobar su nuevo salario.
		System.out.println(jefeZona);
		System.out.println();
		System.out.println(comercial);
		
	}

}
