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
public class vector10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de alumnos");
        int alumnos = sc.nextInt();
        double []vector = new double [alumnos];
        double mayor=0;
        double menor=10;
        double media=0;
        for(int i=0; i<vector.length;i++){
            do{
                System.out.println("Introduzca la nota del alumno "+(i+1));
                vector[i] = sc.nextDouble();
            }while(vector[i]<0 || vector[i]>10);
            if(vector[i]<menor){
                menor=vector[i];
            }
            if(vector[i]>mayor){
                mayor=vector[i];
            }
            media+=vector[i];
        }
        System.out.println("La media de las nota es "+(media/vector.length));
        System.out.println("La mayor nota es un "+mayor);
        System.out.println("La menor nota es un "+menor);
    }
}
