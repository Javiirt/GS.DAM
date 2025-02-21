import java.util.Scanner;

public class ejercicio11{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ejercicio 11");
       	 	System.out.println("Introduzca el día");
        	int dia = sc.nextInt();
        	System.out.println("Introduzca el mes");
        	int mes = sc.nextInt();
        	System.out.println("Introduzca el año");
        	int anio = sc.nextInt();
        	if(dia<=30 && dia>=1 && mes<=12 && mes>=1){
         		System.out.println(dia+"/"+mes+"/"+anio+" es una fecha válida");
        	} else{
            		System.out.println("Fecha no válida");
        	}


	}
        
}