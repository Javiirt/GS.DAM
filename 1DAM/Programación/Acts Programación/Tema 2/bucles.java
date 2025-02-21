package bucles;

import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*        
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 1");   
        int num, contador=1;
        do{
            System.out.println("Introduzca un número positivo");
            num= sc.nextInt();
            if(num<0){
                System.out.println("El número debe ser positivo");
            }
        }while(num<0); 
        
        //opcion while
        while(contador<=num){
            System.out.println(contador);
            contador++;
        }
        //opcion do-while
        contador=1;
        do{
            System.out.println(contador);
            contador++; 
        }while(contador<=num);
        //opcion for
        for(int i =1; i<=num;i++){
            System.out.println(i);
        }
        
        
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 2"); 
        int num, mult, contador=0;
        System.out.println("Introduzca un número");
        num = sc.nextInt();
        System.out.println("Introduzco el número que lo multiplica");
        mult = sc.nextInt();
        for(int i=0; i<mult; i++){
            contador+=num;
            System.out.println(contador);
        }
        
  
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 3");    
        System.out.println("Introduzca un número");
        int num = sc.nextInt();
        for(int i=num; i>=0; i--){
            System.out.println(i);
        }
        
         
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 4"); 
        System.out.println("Introduzca un número");
        int num = sc.nextInt();
        int cuenta=0;
        System.out.println(cuenta);
        while(cuenta<num){
            cuenta+=2;
            if(cuenta>num){
                System.out.println(num);
            }else{
                System.out.println(cuenta);
            }
        }
        


        System.out.println("--------------------------");       
        System.out.println("Ejercicio 5");    
        System.out.println("Introduzca un número");
        int num1 = sc.nextInt();
        System.out.println("Introduzca por cuánto lo quieres potenciar");
        int exponente = sc.nextInt();
        int total=1;
        for(int i=0; i<exponente; i++){
            total*=num1;
        }
        System.out.println(num1+"^"+exponente+"="+total);
        
        
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 6");    
        System.out.println("Introduzca el número de pisos");
        int pisos = sc.nextInt();
        for(int i=1; i<=pisos; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        

        System.out.println("--------------------------");       
        System.out.println("Ejercicio 7");    
        int num1, num2;
        do{
            System.out.println("Introduzca un número");
            num1 =sc.nextInt();
            System.out.println("Introduzca otro número");
            num2 =sc.nextInt();
            if(num1==num2){
                System.out.println("Los números son iguales");
            }else if(num1==0){
                System.out.println("El primero número es igual a 0");
            }else if(num2==0){
                System.out.println("El segundo número es igual a 0");
            }else{
                System.out.println("Números no válidos");
            }
        }while(num1!=num2 || num1!=0 ||num2!=0);
        
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 8");    
        int contador=0, suma=0;
        for(int i =0; i<10; i++){
            contador++;
            System.out.println("Introduzca un número");
            int num= sc.nextInt();
            suma+=num;
            if (num<0){
                break;
            }
        }
        System.out.println("Se han introducido "+contador+" número y la suma total es de "+suma);
                
        
        
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 9");    
        System.out.println("¿Hasta qué número quieres contar?");
        int num= sc.nextInt();
        System.out.println("¿De cuánto en cuánto quieres contar?");
        int salto= sc.nextInt();
        int cuenta=0;
        System.out.println(cuenta);
        while(cuenta<num){
            cuenta+=salto;
            if(cuenta>num){
                System.out.println(num);
            }else{
                System.out.println(cuenta);
            }
        }
        
        
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 10");
        int num, suma=0;
        do{
            System.out.println("Introduzca un número positivo");
            num= sc.nextInt();
            if(num<0){
                System.out.println("El número debe ser positivo");
            }
        }while(num<0);
        for(int i=0; i<=num; i+=2){
            suma+=i;
        }
        System.out.println("La suma de todos los número pares hasta llegar al "+num+" es de "+suma);
        
       
        
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 11");    
        int nota, contador=0;
        do{
            System.out.println("Introduzca una nota del 0 al 10 (-1 para salir)");
            nota=sc.nextInt();
            if(nota<0 || nota>10){
                System.out.println("Nota no válida");
            }
            if(nota==10){
                contador++;
            }
        }while(nota!=-1);
        if(contador==0){
            System.out.println("No hubo ningún 10");
        }else{
            System.out.println("Se han dado "+contador+" notas iguales a 10");
        }
        
       
       
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 12");
        int cont1=0, cont2=1, cont3=cont1+cont2, num;
        System.out.println("¿Cuántos números de la sucesión de fibonacci quieres ver?");
        num = sc.nextInt();
        System.out.println(cont3);
        for(int i=1; i<num ; i++){
            System.out.println(cont3);
            cont1=cont2;
            cont2=cont3;
            cont3=cont1+cont2;
            
        }
        
        
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 13");          
        System.out.println("Introduzca numero de filas: ");
        int filas = sc.nextInt();
        for(int i =1; i<=filas; i++){
            for(int espacio = 1; espacio<=filas-i; espacio++){
                System.out.print(" ");
            } 
            for(int asteriscos=1; asteriscos<=(i*2-1); asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
         
     
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 14");    
        int contador=0, par=0, impar=0;
        for(int i =0; i<10; i++){
            contador++;
            System.out.println("Introduzca un número");
            int num= sc.nextInt();
            if (num<0){
                break;
            }else if(num%2==0){
                par++;
            }else{
                impar++;
            }            
        }
        System.out.println("Se han introducido "+contador+" números y hay "+par+" números pares y "+impar+" impares");
        
         
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 15");    
        int num1, num2, mayor, menor, contador=0;
        System.out.println("Introduzca un número");
        num1 = sc.nextInt();
        System.out.println("Introduzca otro número");
        num2 = sc.nextInt();
        if(num1<num2){
            menor=num1;
            mayor=num2;
        }else{
            menor=num2;
            mayor=num1;
        }        
        System.out.println("El menor número es el "+menor);
        System.out.print("Entre los dos números ( ");
        for(int i=menor+1; i<mayor; i++){
            System.out.print(i+" ");
            contador++;
        }
        System.out.println(") hay un total de "+contador+" números");
        
         
               
        System.out.println("Ejercicio 16");  
        System.out.println("Aplicación \"El Menor\": \n" +
                            "----------------------");
        char seguir;
        int num, menor;
        System.out.println("Introduzca un número");
            num= sc.nextInt();
            menor=num;
            System.out.println("Desea introducir más números? (s/n)");
            seguir = sc.next().charAt(0);
            while(seguir!='n' || seguir!='N'){
                System.out.println("Introduzca un número");
                num= sc.nextInt();
                if(menor>num){
                    menor=num;
                }
                System.out.println("Desea introducir más números? (s/n)");
                seguir = sc.next().charAt(0);
                        
            }
        System.out.println("El menor de los números introducidos es "+menor+"\n" +
                            "Cerrando aplicacion...\n");   

       
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 17");    
        double precio, sinIva=0, descuento1=0, descuento2=0, conIva;
        int unidad, articulos=0;
        char seguir;
        System.out.println("CAJA REGISTRADORA \n\n" +

        "----------------\n");

        do{
            System.out.print("Precio del producto:");
            precio= sc.nextInt();
            System.out.print("Unidades del producto:");
            unidad= sc.nextInt();
            articulos+=unidad;
            sinIva+=unidad*precio;
            System.out.println("Más productos? (s/n)");
            seguir = sc.next().charAt(0);
        }while(seguir!='n' || seguir!='N');
        conIva=(sinIva*0.21)+sinIva;
        System.out.print("\nRESUMEN COMPRA \n\n" +
                        "-------------\n"+
                        "Total Artículos: "+articulos+"\n"+
                        "Precio sin IVA: "+sinIva+"€\n"+
                        "Precio con IVA(21%): "+conIva+"€\n"+
                        "Descuento por más de 20 artículos(5%): ");

        if(articulos>20){
            descuento1=0.05*conIva;
            System.out.print(descuento1+"€\n");
        }else{
            System.out.print("no alcanzado\n");
        }
        System.out.println("Descuento por más de 50€ (5%): ");
        if(conIva>50){
            descuento2=0.05*conIva;
            System.out.print(descuento2+"€\n");
        }else{
            System.out.print("no alcanzado\n");
        }
        System.out.println("Total a pagar: "+(conIva-descuento1-descuento2)+"€");
       

        System.out.println("--------------------------");       
        System.out.println("Ejercicio 18"); 
        int cantidad, b20=0, b10=0, b5=0, m2=0, m1=0;
        System.out.print("\nDEVOLUCIÓN \n\n" +
                            "-----------\n\n"+
                            "Introduzca la cantidad a devolver:");
        cantidad = sc.nextInt();
        b20=cantidad/20;
        b10=(cantidad%20)/10;
        b5=((cantidad%20)%10)/5;
        m2=(((cantidad%20)%10)%5)/2;
        m1=(((cantidad%20)%10)%5)%2;
        System.out.print("Billetes de 20: "+b20+"\n" +
                        "Billetes de 10: "+b10+"\n" +
                        "Billetes de 5: "+b5+"\n" +
                        "Monedas de 2€: "+m2+"\n" +
                        "Monedas de 1€: "+m1+"\n" +
                        "Cerrando Aplicación...");
*/
    }
}