import java.util.Scanner;
public class PruebaPrimo {  

	//un nÃºmero primo es un nÃºmero natural mayor que 1 que 
	//tiene Ãºnicamente dos divisores distintos: el mismo y el 1
	public boolean esPrimo(String numero){
	
		try {
			int num = Integer.parseInt(numero);
			if (num < 1){
				System.out.println("Número no natural o natural no mayor que 1");
				return false;
			}
			else {
				for (int i=2; i<num; i++)
					if (num%i==0)
						return false;
				return true;
			}
		} catch (NumberFormatException e){
			System.out.println("Error al convertir a número");
			return false;
		}
	}
	
	public static void main (String[] args) {
		PruebaPrimo prueba = new PruebaPrimo();
		
		System.out.println("Dime un número : ");
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		System.out.println(n + " es primo: " + prueba.esPrimo(n));
	}
}