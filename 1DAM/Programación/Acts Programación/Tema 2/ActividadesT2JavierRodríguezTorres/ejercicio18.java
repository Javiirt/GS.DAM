import java.util.Scanner;

public class ejercicio18{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ejercicio 18"); 
        	int cantidad, b20=0, b10=0, b5=0, m2=0, m1=0;
        	System.out.print("\nDEVOLUCIÓN \n\n" +
                            	"-----------\n\n"+
                            	"Introduzca la cantidad a devolver:");
        	cantidad = sc.nextInt();
        	b20=cantidad/20;
        	b10=(cantidad%20)/10;
        	b5=((cantidad%20)%10)/5;
        	m2=(((cantidad%20)%10)%5)/2;
        	m1=(((cantidad%20)%10)%5)%2;
        	System.out.print("Billetes de 20: "+b20+"\n" +
                        	"Billetes de 10: "+b10+"\n" +
                        	"Billetes de 5: "+b5+"\n" +
                        	"Monedas de 2€: "+m2+"\n" +
                        	"Monedas de 1€: "+m1+"\n" +
                        	"Cerrando Aplicación...");
	}        
}