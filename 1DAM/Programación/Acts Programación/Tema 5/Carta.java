
package tema5;

import java.util.Scanner;

public class Carta {
    private Scanner input;
    private int numero;
    private char palo;

    public Carta(){
        input = new Scanner(System.in);
        numero = 1;
        palo = 'c';
    }
    public Carta(int numero,char palo){
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public char getPalo() {
        return palo;
    }

    public void setNumero() {
        boolean flag = true;
        int numero = 0;
        System.out.println("Introduce numero");
        do{
            numero = input.nextInt();
            input.nextLine();
            if( numero <= 13 || numero > 0) {
                this.numero = numero;
                flag = false;
            }
        }while(flag);
    }

    public void setPalo() {
        boolean flag = true;
        char palo = ' ';
        do{
            System.out.println("Introduce palo");
            palo = input.next().charAt(0);
            if(palo =='c' || palo =='p' || palo =='d' || palo =='t'){
                this.palo = palo;
                flag = false;
            }
        }while(flag);
    }
    public void mostrarCarta(){
        String cadenaPalo = "";
        switch(palo){
            case 'c': cadenaPalo = "corazones";
            break;
            case 'p': cadenaPalo = "picas";
            break;
            case 'd': cadenaPalo = "diamantes";
            break;
            case 't': cadenaPalo = "treboles";
        }
        switch(numero){
            case 1 : System.out.println("es el As de "+cadenaPalo);
            break;
            case 11:    System.out.println("es el Jack de "+cadenaPalo);
            break;
            case 12:    System.out.println("es la Reina de "+cadenaPalo);
            break;
            case 13:    System.out.println("es el Rey de "+cadenaPalo);
            break;
            default: System.out.println("es el "+numero+" de "+cadenaPalo);
        }
    }
    public  void comparar(Carta carta2){
        System.out.print("El mayor ");
        if(numero > carta2.getNumero()){
            mostrarCarta();
        } else if (numero == carta2.getNumero()){
            if(palo > carta2.getPalo()){
                mostrarCarta();
            }else{
                carta2.mostrarCarta();
            }
        }else{
            carta2.mostrarCarta();
        }
    }
    public static void main(String[]args){
        Carta carta1 = new Carta();
        Carta carta2 = new Carta(2,'p');
        carta1.setNumero();
        carta1.setPalo();
        carta1.mostrarCarta();
        carta2.mostrarCarta();
        carta1.comparar(carta2);
    }
}