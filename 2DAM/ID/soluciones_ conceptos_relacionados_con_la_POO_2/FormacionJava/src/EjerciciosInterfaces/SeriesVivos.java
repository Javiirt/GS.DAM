package EjerciciosInterfaces;

public class SeriesVivos {

	public static void main(String[] args) {
		//Creamos una instancia de tipo Persona con los siguientes valores: “Sara”,“femenino”.
		Persona persona = new Persona();
		persona.setNombre("Sara");
		persona.setGenero("femenino");
		
		//Para esta instancia llamamos a los métodos respirar, dormir y comer.
		System.out.println("Comportamientos de la persona");
		persona.respirar();
		persona.comer();
		persona.dormir();
		
		System.out.println();
		
		//Creamos varias instancias de tipo Animal con los siguientes valores:
		//“Mamífero”, “carnívoro” , “Mamífero”, “hervivoro” y “Mamífero”, “omnivoro”
		Animal aCarnivoro = new Animal();
		aCarnivoro.setEspecie("Mamifero");
		aCarnivoro.setTipoAlimentacion("carnivoro");
		
		Animal aHervivoro = new Animal();
		aHervivoro.setEspecie("Mamifero");
		aHervivoro.setTipoAlimentacion("hervivoro");
		
		Animal aOmnivoro = new Animal();
		aOmnivoro.setEspecie("Mamifero");
		aOmnivoro.setTipoAlimentacion("omnivoro");
		
		//Para cada una de las instancias creadas anteriormente llamamos a los métodos respirar, dormir y comer.
		System.out.println("Comportamientos del animal carnívoro");
		aCarnivoro.respirar();
		aCarnivoro.comer();
		aCarnivoro.dormir();
		System.out.println();
		
		System.out.println("Comportamientos del animal hervivoro");
		aHervivoro.respirar();
		aHervivoro.comer();
		aHervivoro.dormir();
		System.out.println();
		
		System.out.println("Comportamientos del animal omnivoro");
		aOmnivoro.respirar();
		aOmnivoro.comer();
		aOmnivoro.dormir();
	}

}
