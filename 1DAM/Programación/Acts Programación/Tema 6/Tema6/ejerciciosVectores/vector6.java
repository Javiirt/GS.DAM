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
public class vector6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []vector = new int [5];
        vector[0]=1+(int)(Math.random()*100);
        int mayor = vector[0];
        int menor = vector[0];
        for(int i=1; i<vector.length;i++){
            vector[i]=1+(int)(Math.random()*100);
            if(vector[i]>mayor){
                mayor= vector[i];
            }
            if(vector[i]<menor){
                menor= vector[i];
            }
        } 
        for(int i=0; i<vector.length;i++){
            System.out.println(vector[i]);
        }
        System.out.println("El mayor numero es el "+mayor);
        System.out.println("El menor numero es el "+menor);
    }
}
