package EjercicioCuentaBancaria;

public class OperacionesBancarias {

	public static void main(String[] args) {
		// Creamos una primera instancia de tipo Cuenta con el constructor vacío
		Cuenta cta1 = new Cuenta();

		// Asignamos los valores a los atributos de la instancia
		cta1.setTitularCta("Federico Garcia");
		cta1.setNumeroCta("01012020030340400505");
		cta1.setSaldoCta(2890.00);

		// Realiza un ingreso sobre la cuenta creada
		if (cta1.ingreso(100.00)) {
			System.out.println("Ingreso realizado correctamente");
			System.out.println(cta1);
		} else {
			System.out.println("No se ha podido realizar la operación");
		}
		System.out.println(); // Hacemos un salto de línea para la consola

		// Creamos una segunda instancia de tipo Cuenta con el constructor de copia
		Cuenta cta2 = new Cuenta(cta1);

		// Realiza un reintegro sobre la cuenta creada
		if (cta2.reintegro(290.00)) {
			System.out.println("Reintegro realizado correctamente");
			System.out.println(cta2);
		} else {
			System.out.println("No se ha podido realizar la operación");
		}
		System.out.println(); // Hacemos un salto de línea para la consola

		// Creamos una tercera instancia de tipo Cuenta con el constructor de parametros
		Cuenta cta3 = new Cuenta("Alfonso de la Calle", "11112222333344445555", 0.00);

		// Realiza un ingreso sobre la cuenta creada
		if (cta1.transferencia(cta3, 1000.00)) {
			System.out.println("Transferencia realizada correctamente");
			System.out.println(cta1);
			System.out.println(cta3);
		} else {
			System.out.println("No se ha podido realizar la operación");
		}
		System.out.println(); // Hacemos un salto de línea para la consola
		
	}

}
