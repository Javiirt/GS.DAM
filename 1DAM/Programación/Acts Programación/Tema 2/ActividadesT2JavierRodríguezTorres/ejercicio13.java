import java.util.Scanner;

public class ejercicio13{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ejercicio 13");          
        	System.out.println("Introduzca numero de filas: ");
        	int filas = sc.nextInt();
        	for(int i =1; i<=filas; i++){
            		for(int espacio = 1; espacio<=filas-i; espacio++){
                		System.out.print(" ");
            		} 
            		for(int asteriscos=1; asteriscos<=(i*2-1); asteriscos++){
                		System.out.print("*");
            		}
            		System.out.println();
        	}
	}        
}