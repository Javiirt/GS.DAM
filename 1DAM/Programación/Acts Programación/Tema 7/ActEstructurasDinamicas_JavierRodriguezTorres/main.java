package entrega;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creamos la liga por defecto
        liga nuevaLiga = new liga();
        char seguir = '0';
        
        //Mostraremos el menu en bucle hasta que se desee salir
        do{
            System.out.println("MENÚ DE LA LIGA\n"
                    + "---------------\n"
                    + "1. Mostrar los partidos de la liga\n"
                    + "2. Mostrar el ranking de un equipo\n"
                    + "3. Mostrar el ranking total\n"
                    + "4. Mostrar goleadores de un equipo\n"
                    + "5. Mostrar todos los goleadores\n"
                    + "0. Salir\n");
            System.out.print("¿Qué opción desea ver?: ");
            seguir = sc.nextLine().charAt(0);
            System.out.println();
            
            switch(seguir){
                case '1':
                    nuevaLiga.mostrarPartidos();
                    break;
                case '2':
                    System.out.print("Equipos de la liga: "+nuevaLiga.getEquipo1()
                            +", "+nuevaLiga.getEquipo2()+", "
                            +nuevaLiga.getEquipo3()+" y "
                            +nuevaLiga.getEquipo4()+
                            "\nIntroduzca el equipo del que desea ver el ranking: ");
                    String equipoRanking = sc.nextLine();
                    if(nuevaLiga.existe(equipoRanking)){
                        System.out.println("\n"+
                                equipoRanking +": "+nuevaLiga.puntoEquipo(equipoRanking)+" puntos\n");
                    }else{
                        System.out.println("Equipo introducido no válido\n");
                    }
                    break;

                case '3':
                    nuevaLiga.ranking();
                    break;
                case '4':
                    System.out.print("Equipos de la liga: "+nuevaLiga.getEquipo1()
                            +", "+nuevaLiga.getEquipo2()+", "
                            +nuevaLiga.getEquipo3()+" y "
                            +nuevaLiga.getEquipo4()+
                            "\nIntroduzca el equipo del que desea ver el ranking: ");
                    String equipoGoleadores = sc.nextLine();
                    if(nuevaLiga.existe(equipoGoleadores)){
                        nuevaLiga.golesJugadores(equipoGoleadores);
                    }else{
                        System.out.println("Equipo introducido no válido\n");
                    }
                    break;
                case '5':
                    nuevaLiga.todosGoleadores();
                    break;
                case '0':
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción seleccionada no válida\n");
                    break;                
            }   
        }while(seguir!='0');
    }
}