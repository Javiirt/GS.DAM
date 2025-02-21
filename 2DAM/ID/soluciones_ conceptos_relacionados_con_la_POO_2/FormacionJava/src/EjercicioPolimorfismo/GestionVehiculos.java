package EjercicioPolimorfismo;

public class GestionVehiculos {

	public static void main(String[] args) {
		//Creamos una instancia de tipo Vehículo pero utilizando la clase Turismo, la damos valores 
		// y mostramos sus atributos.
		Vehiculo vehiculo = new Turismo("Peugeot","307","8917 CFW");
		vehiculo.mostrarAtributos();
		System.out.println();
		
		//Ahora, a la variable referencia anterior de tipo Vehiculo le damos la forma de Deportivo, 
		//es decir, a la variable de referencia anterior de tipo Vehiculo ahora la usamos para crear la instancia 
		//usando la clase Deportivo y mostramos sus atributos.
		vehiculo = new Deportivo("Ford","Mustang","4070 DEP",150);
		vehiculo.mostrarAtributos();
		System.out.println();
		
		// Ahora, a la variable referencia anterior de tipo Vehiculo le damos la forma de Furgoneta, 
		//es decir, a la variable de referencia anterior de tipo Vehiculo ahora la usamos para crear la instancia 
		//usando la clase Furgoneta y mostramos sus atributos.
		vehiculo = new Furgoneta("Fiat","Ducato","4080 FUR",1200);
		vehiculo.mostrarAtributos();
		System.out.println();
	}

}
