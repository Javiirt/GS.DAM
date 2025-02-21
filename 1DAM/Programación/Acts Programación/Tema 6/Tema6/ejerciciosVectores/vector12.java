/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosVectores;

import java.util.Arrays;
import java.util.Scanner;

public class vector12 {
    Scanner sc = new Scanner(System.in);
    int vector[];
    
    vector12(){
        vector = new int[50];
        for(int i= 0; i<vector.length;i++){
            vector[i]=(int)(Math.random()*100);
        } 
    }
    vector12(int numeros){
        vector = new int[numeros];
        for(int i= 0; i<vector.length;i++){
            vector[i]=(int)(Math.random()*100);
        } 
    }
    
    int getLongitud(){
        int longitud = vector.length;
        return longitud;
    }
    
    void mostrar(){
        for(int i=0; i<vector.length;i++){
            System.out.println(vector[i]);
        }
    }
    
    void inverso(){
        for(int i=vector.length-1; i>=0;i--){
            System.out.println(vector[i]);
        }
    }
    
    int menor(){
        int menor = vector[0];
        for(int i=1; i<vector.length;i++){            
            if(vector[i]<menor){
                menor= vector[i];
            }
        }
        return menor;
    }
    
    int mayor(){
        int mayor = vector[0];
        for(int i=1; i<vector.length;i++){
            if(vector[i]>mayor){
                mayor= vector[i];
            }
        } 
        return mayor;
    }
    
    boolean existe(int valor){
        boolean existe=false;
        for(int i=0; i<vector.length && existe==false;i++){
            if(vector[i]==valor){
                existe=true;
            }
        }
        return existe;
    }
    
    void cambiarValor(int posicion, int nuevoValor){        
        vector[posicion]=nuevoValor;
    }
    
    void sustituitValores(int sustituido, int sustituto){
        for(int i=0; i<vector.length;i++){
            if(vector[i]==sustituido){
                vector[i]=sustituto;
            }
        }
    }
    
    void cambiarPosicion(int posicion1, int posicion2){
        
        int valor1=vector[posicion1];
        int valor2=vector[posicion2];
        vector[posicion1]=valor2;
        vector[posicion2]=valor1;
    }
    
    void ordenar(){
        Arrays.sort(vector);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vector12 objeto = new vector12();
        int entrada;        
        do{
            System.out.println("________________________________________________________\n\n"+
                            "1. Mostrar el vector.\n" +
                            "2. Mostrar el vector en orden inverso.\n" +
                            "3. Buscar el número menor.\n" +
                            "4. Buscar el número mayor.\n" +
                            "5. Comprobar si existe un número en el vector.\n" +
                            "6. Cambiar el valor almacenado en una posición.\n" +
                            "7. Sustituir todas las apariciones de un número por otro\n" +
                            "8. Intercambiar los valores de 2 posiciones.\n" +
                            "9. Ordenar el vector de menor a mayor (sin mostrarlo)\n" +
                            "0. Salir \n"+
                            "________________________________________________________\n");
            System.out.println("--------------------------------------------------------");
            entrada=sc.nextInt();
            System.out.println("--------------------------------------------------------\n"
                    + "________________________________________________________\n");
            switch(entrada){
                case 1:
                    objeto.mostrar();
                    break;
                case 2:
                    objeto.inverso();
                    break;
                case 3:                    
                    System.out.println("El menor numero es el "+objeto.menor());
                    break;
                case 4:
                    System.out.println("El menor numero es el "+objeto.mayor());
                    break;
                case 5:
                    System.out.println("Introduzca el valor que desea buscar");
                    int valor = sc.nextInt();                     
                    if(objeto.existe(valor)){
                        System.out.println("El número introducido existe en el vector");
                    }else{
                        System.out.println("El número introducido no existe en el vector");
                    }                    
                    break;
                case 6:
                    System.out.println("De qué posición desea cambiar el valor?");
                    int posicion = sc.nextInt(); 
                    while(posicion<0 || posicion>=objeto.getLongitud()){
                        System.out.println("POSICIÓN NO VÁLIDA \nDe qué posición desea cambiar el valor?");
                        posicion = sc.nextInt();
                    }
                    System.out.println("Introduzca el nuevo valor");
                    int nuevoValor = sc.nextInt(); 
                    objeto.cambiarValor(posicion,nuevoValor);
                    break;
                case 7:                    
                    System.out.println("Introduzca el valor que desea sustituir");
                    int sustiuido = sc.nextInt(); 
                    System.out.println("Introduzca el nuevo valor");
                    int sustituto = sc.nextInt();
                    objeto.sustituitValores(sustiuido, sustituto);
                    break;
                case 8:
                    System.out.println("Introduzca la posición 1 que desea intercambiar");
                    int posicion1 = sc.nextInt(); 
                    while(posicion1<0 || posicion1>=objeto.getLongitud()){
                        System.out.println("POSICIÓN NO VÁLIDA \nIntroduzca la posición 1 que desea intercambiar");
                        posicion1 = sc.nextInt();
                    }
                    System.out.println("Introduzca la posición 1 que desea intercambiar");
                    int posicion2 = sc.nextInt();
                    while(posicion1<0 || posicion1>=objeto.getLongitud()){
                        System.out.println("POSICIÓN NO VÁLIDA \nIntroduzca la posición 2 que desea intercambiar");
                        posicion1 = sc.nextInt();
                    }
                    objeto.cambiarPosicion(posicion1,posicion2);
                    break;
                case 9:
                    objeto.ordenar();
                    break;
                case 0:
                    System.out.println("--------------------------------------------------------\n"
                            + "Saliendo\n"
                            + "--------------------------------------------------------");
                    break;
                default:
                    System.out.println("--------------------------------------------------------\n"
                            + "Número introducido no válido\n"
                            + "--------------------------------------------------------");
                    break;                
            }
        }while(entrada!=0);        
    }
}
