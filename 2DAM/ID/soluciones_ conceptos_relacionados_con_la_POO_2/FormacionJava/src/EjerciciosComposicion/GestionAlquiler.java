package EjerciciosComposicion;

public class GestionAlquiler {

	public static void main(String[] args) {
		
		//Creamos una instancia de tipo Vehículo pero utilizando la clase Turismo, la damos valores.
		Vehiculo turismo = new Turismo("Peugeot","307","8917 CFW");

		//Creamos una instancia de tipo Vehiculo pero utilizando la clase Furgoneta, la damos valores.
		Vehiculo furgoneta = new Furgoneta("Fiat","Ducato","4080 FUR ",1200);

		//Creamos dos instancias de tipo Persona.
		Persona cliente1 = new Persona();
		cliente1.setNombreCompleto("Federico Garcia");
		cliente1.setNif("11.111.111-H");
		cliente1.setDireccion("Calle Nueva, 5");
		Persona cliente2 = new Persona();
		cliente2.setNombreCompleto("Alfonso de la Calle");
		cliente2.setNif("22.222.222-G");
		cliente2.setDireccion("Calle Real, 5");
		
		//Creamos dos instancias de tipo Alquiler con los datos de dos alquileres de los dos vehículos y las dos personas.
		Alquiler alquiler1 = new Alquiler(cliente1, turismo, "12/03/2021");
		Alquiler alquiler2 = new Alquiler(cliente2, furgoneta, "19/05/2021");

		//Sacamos un listado con los datos de los distintos alquileres que tenemos.
		System.out.println("Listado de los alquileres");
		System.out.println("-------------------------");
		alquiler1.mostrarAlquiler();
		System.out.println();
		alquiler2.mostrarAlquiler();
	}

}
