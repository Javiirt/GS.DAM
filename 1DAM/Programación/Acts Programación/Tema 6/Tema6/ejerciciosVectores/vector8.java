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
public class vector8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char []vector = new char [10];
        for(int i=0; i<vector.length;i++){
            System.out.println("Introduzca una letra ("+(i+1)+")");
            vector[i] = sc.next().charAt(0);
        }
        for(int i=vector.length-1; i>=0;i--){
            System.out.println(vector[i]);
        }
    }
}
