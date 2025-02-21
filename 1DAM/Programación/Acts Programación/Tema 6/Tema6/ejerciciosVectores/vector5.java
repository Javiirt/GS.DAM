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
public class vector5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []vector = new int [10];
        int suma = 0;
        long producto = 1;
        for(int i=0; i<vector.length;i++){
            vector[i]=1+(int)(Math.random()*100);
            suma+=vector[i];
            producto*=vector[i];
        } 
        for(int i=0; i<vector.length;i++){
            System.out.println(vector[i]);
        }
        System.out.println("La suma de todos los numeros es: "+suma);
        System.out.println("El producto de todos los numeros es: "+producto);
    }
}
