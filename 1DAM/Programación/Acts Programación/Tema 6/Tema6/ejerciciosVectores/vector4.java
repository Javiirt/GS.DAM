/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosVectores;

import java.util.Scanner;

public class vector4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []vector = new int [10];
        for(int i=0; i<vector.length;i++){
            int x;
            do{
                System.out.println("Introduzca un número negativo ("+(i+1)+")");
                x=sc.nextInt();
            }while(x>=0);
            vector[i]=x;
        }
        for(int i=0; i<vector.length;i++){
            System.out.println(vector[i]);
        }        
    }
}
