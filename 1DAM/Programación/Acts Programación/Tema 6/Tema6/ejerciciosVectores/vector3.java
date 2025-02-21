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
public class vector3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []vector = {1,2,10,7,9,3,4,6,8,5};  
        for(int i=0; i<vector.length;i++){
            if(vector[i]%2==0){
                System.out.println(vector[i]);
            }
        }
        for(int i=0; i<vector.length;i++){
            if(vector[i]%2!=0){
                System.out.println(vector[i]);
            }
        }
    }
}
