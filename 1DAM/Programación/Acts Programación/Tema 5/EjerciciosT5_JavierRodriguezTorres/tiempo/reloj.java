package tiempo;

import java.util.Scanner;

public class reloj {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        hora reloj = new hora();
        int seguir = 0;
        do{
            System.out.println("Reloj \n" +
                               "----- \n" +
                               "1. Mostrar hora 12 \n" +
                               "2. Mostrar hora 24 \n" +
                               "3. Modificar horas \n" +
                               "4. Modificar minutos \n" +
                               "5. Modificar segundos \n" +
                               "6. Salir");
            seguir = sc.nextInt();
            int sumar = 0;
            System.out.println("______________________________________________________");
            switch(seguir){
                
                case 1:
                    reloj.mostrarhora12();
                    break;
                case 2:
                    reloj.mostrarhora24();
                    break;
                case 3:
                    System.out.println("Introduzca las horas que desea añadir");
                    sumar = sc.nextInt();
                    reloj.setHora(sumar);
                    break;
                case 4:
                    System.out.println("Introduzca los minutos que desea añadir");
                    sumar = sc.nextInt();
                    reloj.setMinuto(sumar);
                    break;
                case 5:
                    System.out.println("Introduzca los segundos que desea añadir");
                    sumar = sc.nextInt();
                    reloj.setSegundo(sumar);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;              
                default:
                    System.out.println("Valor introducido no válido");
                    break; 
            }
            System.out.println("______________________________________________________");
        }while(seguir!=6);
    }
}
