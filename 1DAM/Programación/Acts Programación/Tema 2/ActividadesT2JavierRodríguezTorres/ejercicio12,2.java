import java.util.Scanner;

public class ejercicio12{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ejercicio 12.2");
        	int anio, dia=0;
        	System.out.println("Introduzca un mes"); 
        	String mes = sc.nextLine();
        	System.out.println("Introduzca el año"); 
        	anio = sc.nextInt();        
        	switch (mes){
                	case "enero":
                    		dia =31;
                    		break;
                	case "febrero":
                    		if(anio%400==0 || (anio%100!=0 && anio%4==0)){
                        		dia=29;
                    		}else{
                        		dia=28;
                    		}
                    		break;
                	case "marzo":
                    		dia =31;
                    		break;
                	case "abril":
                    		dia =30;
                    		break;
                	case "mayo":
                    		dia =31;
                    		break;
                	case "junio":
                    		dia =30;
                    		break;
                	case "julio":
                    		dia =31;
                    		break;
                	case "agosto":
                    		dia =31;
                    		break;
                	case "septiembre":
                    		dia =30;
                    		break;
                	case "octubre":
                    		dia =31;
                    		break;
                	case "noviembre":
                    		dia =30;
                    		break;
                	case "diciembre":
                    		dia =31;
                    		break;
                	default:
                		System.out.println("Mes introducido no válido");        
        }
        System.out.println(mes+" tiene "+dia+" días en "+anio);
	}        
}