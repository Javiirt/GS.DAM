package estructurasselectivas;

import java.util.Scanner;

public class EstructurasSelectivas {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
/*            
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 1"); 
        int mas1000=0, suma=0;
        for(int i =0; i<10;i++){
            System.out.println("Introduzca 10 salarios, llevas "+i);
            int salario = sc.nextInt();
            suma+=salario;
            if(salario>1000){
                mas1000++;
            }
        }
        System.out.println("La suma de los salarios es de "+suma+"€ y hay "+mas1000+" salario/s mayor/es de 1000€");
 


        System.out.println("--------------------------");       
        System.out.println("Ejercicio 2");  
        int sumaEdad=0, sumaEstatura=0, mayor18=0, mas175=0;
        for(int i =0; i<5;i++){
            System.out.println("Introduzca la edad de 10 alumnos, llevas "+i);
            int edad = sc.nextInt();
            sumaEdad+=edad;
            if(edad>=18){
                mayor18++;
            }
            System.out.println("Introduzca la altura(cm) de 10 alumnos, llevas "+i);
            int altura = sc.nextInt();
            sumaEstatura+=altura;
            if(altura>=175){
                mas175++;
            }
        }
        System.out.println("La edad media es de "+sumaEdad/10+" cm");
        System.out.println("La altura media es de "+sumaEstatura/10+" cm");
        System.out.println("Hay "+mayor18+" alumnos mayores de 18 años");
        System.out.println("Hay "+mas175+" alumnos más altos de 175 cm");
        
        
        
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 3");  
        int salarios, mayor=0;
        System.out.println("Cuántos salarios quieres introducir?");  
        salarios = sc.nextInt();
        for(int i =0; i<salarios;i++){
            System.out.println("Introduzca un salario");
            int salario = sc.nextInt();
            if(salario>mayor){
                mayor=salario;
            }
        }
        
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 4");  
        int suspensos=0;
        for(int i =0; i<5;i++){
            System.out.println("Introduzca la nota de 5 alumnos, llevas "+i);
            int nota = sc.nextInt();
            if(nota<5){
                suspensos++;
            }            
        }
        if(suspensos>0){
            System.out.println("Hay un total de "+suspensos+" alumnos suspensos"); 
        }else{
            System.out.println("No hay ningún suspenso");
        } 
 

        System.out.println("--------------------------");       
        System.out.println("Ejercicio 5");  
        
        System.out.println("Cuál es el valor del lado del cuadrado?"); 
        int lado= sc.nextInt();
        for(int i=0 ; i<lado; i++){
            for(int j=0 ; j<lado; j++){
            System.out.print("* ");
        }
            System.out.println("");
        }
        
      
        
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 6");  
        int j,num,contPrimo;
        boolean primo;
        contPrimo=0;
        System.out.println("Introduzca un número");
        num=sc.nextInt();
        for(int i=1;i<=num;i++){
            primo=true;
            j=2;
            while (j<=i-1 && primo==true){
                if(i%j==0){
                    primo=false;
                }   
                j++;
            }
            if(primo==true){
                contPrimo++;
            }
        }
        System.out.println("Entre el 1 y el "+num+" hay "+contPrimo+" números primos");

        
       
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 7");  
        int num=2;
        do{
            System.out.println("TABLA DEL "+num); 
            int multiplica=0;
            do{
                System.out.println(num+"*"+multiplica+"="+(num*multiplica));
                multiplica++;
            }while(multiplica<=10);
            System.out.println(""); 
            num++;
        }while(num<=6);
        
       
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 8");  
        //manera 1
        int num=8;
        do{
          num+=2;
          if(num==16){
              continue;
          }
          System.out.println(num);          
        }while(num<20);
        
        //manera 2
        num=9;
        do{
          num++;
          if(num==16 || num%2!=0){
              continue;
          }
          System.out.println(num);          
        }while(num<20);
        
        //manera 3
        num=9;
        do{
          num++;
          if(num==16 || num%2!=0){
              continue;
          }
          System.out.println(num);
          if(num==20){
              break;
          }
        }while(num>9);
        
         
        
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 9");  
        System.out.println("Introduzca un número positivo");
        int num= sc.nextInt();
        if(num<0){
            num*=-1;
            System.out.println("El número introducido es negativo, usaremos el "+num);
        }
        int cont=0;
        System.out.print(num); 
        do{
            if(num%10!=0){
                num/=10;
                cont++;
            }else{
                break;
            }
        }while(num!=0);
        System.out.println(" tiene "+cont+" dígito/s"); 
        
        
        
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 10");
        for (int a=0; a<=9; a++) {
            for (int b=0; b<=9; b++) {
                for (int c=0; c<=9; c++) {
                    for (int d=0; d<=9; d++) {
                        for (int e=0; e<=9; e++) {
                            if(a==3){
                                System.out.print("E-");
                            }else{
                                System.out.print(a+"-");	
                            }
                            if(b==3){
                                System.out.print("E-");
                            }else{
                                System.out.print(b+"-");	
                            }
                            if(c==3){
                                System.out.print("E-");
                            }else{
                                System.out.print(c+"-");	
                            }
                            if(d==3){
                                System.out.print("E-");
                            }else{
                                System.out.print(d+"-");	
                            }
                            if(e==3){
                                System.out.print("E");
                            }else{
                                System.out.print(e);	
                            }
                            System.out.println();
			}
                    }
                }
            }
	}
      
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 11"); 
        int nombre =0, contrasena=0;
        do{
           System.out.println();
           System.out.println("Introduzca su nombre de usuario (número entero)");
           nombre = sc.nextInt();
           System.out.println("Introduzca su contraseña (número entero)");
           contrasena = sc.nextInt();
           if(nombre!=12){
               System.out.println("Nombre incorrecto");
           }
           if(contrasena!=1234){
               System.out.println("Contraseña incorrecta");
           }
        }while(nombre!=12 && contrasena!=1234);
        System.out.println("Iniciando sesión ...");
        
        
          
        System.out.println("--------------------------");       
        System.out.println("Ejercicio 12");  
        
        
        
  */           
            
            
            
    }
    
}