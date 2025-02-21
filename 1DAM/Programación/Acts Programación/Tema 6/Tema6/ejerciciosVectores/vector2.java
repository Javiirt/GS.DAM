/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosVectores;

import java.util.Scanner;

/**
 *
 * @author javierroto
 */
public class vector2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de números con deciamles que va a introducir");
        int decimales = sc.nextInt();
        double []vector = new double [decimales];
        for(int i=0; i<vector.length;i++){
            System.out.println("Introduzca el decimal "+(i+1));
            vector[i]=sc.nextDouble() ;
        }
        for(int i=0; i<vector.length;i++){
            System.out.println("El número "+(i+1)+" es: "+vector[i]);
        }
    }
}
