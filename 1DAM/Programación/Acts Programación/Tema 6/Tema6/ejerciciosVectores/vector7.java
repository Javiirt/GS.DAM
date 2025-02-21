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
public class vector7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char []vector = new char [20];
        int contadora =0;
        for(int i=0; i<vector.length;i++){
            System.out.println("Introduzca una letra ("+(i+1)+")");
            vector[i] = sc.next().charAt(0);
            if(vector[i]=='a'){
                contadora++;
            }
        }
        System.out.println("Hay un total de "+contadora+" 'a'");
        if(contadora!=0){
            System.out.print("Las a están en las posiciones: ");
            for(int i=0; i<vector.length;i++){
                if(vector[i]=='a'){                
                    System.out.print(" "+i);
                }
            } 
        }
        
    }
}
