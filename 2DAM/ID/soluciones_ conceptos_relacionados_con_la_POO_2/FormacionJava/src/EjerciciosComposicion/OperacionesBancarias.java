package EjerciciosComposicion;

public class OperacionesBancarias {

	public static void main(String[] args) {

		// Creamos dos instancias de tipo Persona con el constructor vacío.
		Persona pFederico = new Persona();
		Persona pAlfonso = new Persona();

		// Creamos dos instancias de tipo Cuenta usando el constructor vacío.
		Cuenta cta1 = new Cuenta();
		Cuenta cta2 = new Cuenta();

		// Ahora, a las instancias de tipo Cuenta creadas en el punto anterior,
		// vamos a ir asignando valores a sus atributos con los métodos setters.
		cta1.setTitularCta(pFederico);
		cta1.getTitularCta().setNombreCompleto("Federico Garcia");
		cta1.getTitularCta().setNif("11.111.111-H");
		cta1.getTitularCta().setDireccion("Calle Nueva, 5");
		cta1.setNumeroCta("01012020030340400505");
		cta1.setSaldoCta(2890.00);

		pAlfonso.setNombreCompleto("Alfonso de la Calle");
		pAlfonso.setNif("22.222.222-G");
		pAlfonso.setDireccion("Calle Real, 5");
		cta2.setTitularCta(pAlfonso);
		cta2.setNumeroCta("11112222333344445555");
		cta2.setSaldoCta(90.00);

		// Realiza un ingreso sobre la segunda cuenta creada anteriormente
		// Datos para la operación: 100.00
		if (cta2.ingreso(100.00)) {
			System.out.println("Ingreso realizado correctamente");
			System.out.println(cta2);
		} else {
			System.out.println("No se ha podido realizar la operación");
		}
		System.out.println(); // Hacemos un salto de línea para la consola

		// Realiza un reintegro sobre la primera cuenta creada anteriormente
		// Datos para la operación: 290.00
		// Realiza un reintegro sobre la cuenta creada
		if (cta1.reintegro(290.00)) {
			System.out.println("Reintegro realizado correctamente");
			System.out.println(cta1);
		} else {
			System.out.println("No se ha podido realizar la operación");
		}
		System.out.println(); // Hacemos un salto de línea para la consola

		// Realiza una transferencia entre las dos cuentas creadas anteriormente
		// Datos para la operación: 1000.00
		if (cta1.transferencia(cta2, 1000.00)) {
			System.out.println("Transferencia realizada correctamente");
			System.out.println(cta1);
			System.out.println(cta2);
		} else {
			System.out.println("No se ha podido realizar la operación");
		}
		System.out.println(); // Hacemos un salto de línea para la consola
	}

}
