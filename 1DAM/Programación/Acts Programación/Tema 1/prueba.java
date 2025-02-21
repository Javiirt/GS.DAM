import java.util.Scanner;
import java.lang.Math;
public class prueba {

    public static void main(String[] args) {

      	Scanner leer = new Scanner(System.in);
/*
	
       	System.out.println("----------------------------------");

      
      	//Ejercicio 1
       	System.out.println("Ejercicio 1");
       	System.out.println("Introduzca un número");
       	double num1 = leer.nextDouble();
       	System.out.println("Introduzca un número");
       	double num2 = leer.nextDouble();
       	System.out.println("La media de "+num1+" y "+num2+" es: "+(num1+num2)/2);
       
 
       	//Ejercicio 2
       	System.out.println("Ejercicio 2");
       	System.out.println("Introduzca la temperatura en grados centígrados");
       	double temperatura = leer.nextDouble();
       	System.out.println("Equivale a "+(temperatura*9/5+32)+" ºF");
       	

    	//Ejercicio 3
       	System.out.println("Ejercicio 3");
       	System.out.println("Introduzca su año de nacimiento");
       	short nacimiento = leer.nextShort();
       	System.out.println("Introduzca el año actual");
       	short actual = leer.nextShort();
       	System.out.println("Usted tiene "+(actual-nacimiento)+" años");


	//Ejercicio 4
       	System.out.println("Ejercicio 4");
       	System.out.println("Introduzca la base de un triángulo");
       	double base = leer.nextDouble();
       	System.out.println("Introduzca la altura de un triángulo");
       	double altura = leer.nextDouble();
       	System.out.println("La superficie del riángulo es de: "+(base*altura/2));


	//Ejercicio 5
       	System.out.println("Ejercicio 5");
       	System.out.println("Introduzca una cantidad de dinero");
       	double dinero = leer.nextDouble();
       	System.out.println("El iva de ese producto es de: "+dinero*0.21+"€");


	//Ejercicio 6
	System.out.println("Ejercicio 6");
	int i = 3;
	i++;
	System.out.println(i); // Imprime 4
	++i;
	System.out.println(i); // Imprime 5
	System.out.println(++i); // Imprime 6
	System.out.println(i++); // Imprime 6
	System.out.println(i); // Imprime 7


	//Ejercicio 7
	System.out.println("Ejercicio 7");
	System.out.println("Introduzca un número");
       	int num = leer.nextInt();
	int resultado = num/2+num%2;
	System.out.println(resultado);


	//Ejercicio 8
	System.out.println("Ejercicio 8");
	int a=1, b=-5;
	double c= 6;
	double x1 = (-b + Math.sqrt(b*b-4*a*c))/2*a;
        double x2 = (-b - Math.sqrt(b*b-4*a*c))/2*a;
	System.out.println("X = "+x1+" y "+x2);


	//Ejercicio 9
	System.out.println("Ejercicio 9");
	System.out.println("Introduzca el número total de horas");
       	int horas = leer.nextInt();
	System.out.println("Semanas: "+horas/168+"\n Días: "+(horas%168)/24+"\n Horas: "+(horas%24);


	//Ejercicio 10
	System.out.println("Ejercicio 10");
	int i = -3;
	byte b = 5;
	float f = 1e-10f;
	double d = 3.14;
	boolean b1 = i > i;
	boolean b2 = i < b;
	boolean b3 = b <= f;
	boolean b4 = f >= d;
	boolean b5 = d != 0;
	boolean b6 = 1 == f;
	System.out.println(b1);//False
	System.out.println(b2);//True
	System.out.println(b3);//False
	System.out.println(b4);//False
	System.out.println(b5);//True
	System.out.println(b6);//False

	
	//Ejercicio 11
	System.out.println("Ejercicio 11");
	System.out.println("\tLínea 1 \n\t\tLínea 2 \nLínea 3");


	//Ejercicio 12
	System.out.println("Ejercicio 12");
	System.out.println("Introduzca un número entero");
       	int entero = leer.nextInt();
	System.out.println("Introduzca un número decimal");
       	double decimal = leer.nextDouble();
	System.out.println("Introduzca una letra");
       	char letra = leer.next().charAt(0);
	System.out.println(entero+"\n"decimal+"\n"+letra);


	//Ejercicio 13
	System.out.println("Ejercicio 13");
	System.out.println("Introduzca un número");
       	int num1 = leer.nextInt();
	System.out.println("Introduzca otro número");
       	int num2 = leer.nextInt();
	System.out.println("Resultado: "+num1+num2);



	//Ejercicio 14
	System.out.println("Ejercicio 14");
	System.out.println("Introduzca una cadena");
       	String cad1 = leer.nextLine();
	System.out.println("Introduzca otra cadena");
       	String cad2 = leer.nextLine();
	boolean orden = cad1.charAt(0)<cad2.charAt(0);
	System.out.println(orden);



	//Ejercicio 15
	System.out.println("Ejercicio 15");
	System.out.println("Introduzca una cadena");
       	String cad = leer.nextLine();
	System.out.println(cad.substring(cad.length/2));


	//Ejercicio 16
	System.out.println("Ejercicio 16");
	int num, segundos, minutos, horas;
	num = (int)(Math.random()*100000+1);
	horas = num/3600;
	minutos = num%3600/60;
	segundos = num%60;
	System.out.println(horas+":"+minutos+":"+segundos+"("+num+"segundos totales)");
	
	

	//Ejercicio 17
	System.out.println("Ejercicio 17");
	System.out.println("Introduzca un número entero");
       	String cad1 = leer.nextLine();
	int entero = Integer.parseInt(cad1);
	System.out.println("Introduzca un número decimal");
       	String cad2 = leer.nextLine();
	double decimal = Double.parseDouble(cad2);
	String cadFinal = ""+0+(entero+decimal);
	System.out.println(cadFinal);
	
	



	//Ejercicio 18
	System.out.println("Ejercicio 18");
	System.out.println("Introduzca un número tipo Int");
       	int entero = leer.nextInt(); 				
	System.out.println("Introduzca un número tipo Byte");
       	byte corto = leer.nextByte();
	byte suma = (byte)(entero+corto);
	System.out.println(suma);
	
*/	
	
    }    
}


















