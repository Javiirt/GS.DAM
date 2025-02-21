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
public class vector9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []vector1 = new int [10];
        int []vector2 = new int [10];
        int suma=0;
        for(int i=1; i<vector1.length;i++){
            vector1[i]=1+(int)(Math.random()*100);
            suma+=vector1[i];
        } 
        for(int i=1; i<vector2.length;i++){
            vector2[i]=1+(int)(Math.random()*100);
            suma+=vector2[i];
        } 
        System.out.println("La suma de ambos vectores es "+suma);
    }
}
