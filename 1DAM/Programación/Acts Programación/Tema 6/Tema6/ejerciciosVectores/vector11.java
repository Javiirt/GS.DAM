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
public class vector11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []vector = new int [10];
        for(int i=0; i<vector.length;i++){
            System.out.println("Introduzca un número positivo");
            int numero = sc.nextInt();
            while(numero<0){
                System.out.println("ERROR-DEBE SER POSITIVO \nIntroduzca un número positivo");
                numero = sc.nextInt();
            }
            System.out.println("Introduzca la posición del vector");
            int posicion = sc.nextInt();
            while(vector[posicion]>0){
                System.out.println("ERROR-DEBE SER UNA POSICIÓN VACÍA \nIntroduzca la posición del vector");
                posicion = sc.nextInt();
            }
            vector[posicion]=numero;
        }
    }
}
