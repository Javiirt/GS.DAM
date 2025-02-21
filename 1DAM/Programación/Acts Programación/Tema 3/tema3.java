package tema3;
import java.util.Scanner;
import java.lang.Math;
public class Tema3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
/*
        System.out.println("Bienvenido a 'Adivina el número'\n"
                            +"Estoy pensando en un número entre 1 y 20 \n"
                            + "Trata de adivinarlo en no más de 6 intentos");
        int numero = (int)(Math.random()*20+1);
        for(int i=1; i<=6; i++){
            System.out.println("Adivina");
            int entrada = sc.nextInt();     
            if(entrada<numero){
                System.out.println("Es muy bajo");
            }else if(entrada>numero){
                System.out.println("Es muy alto");
            }else{
                System.out.println("-Buen trabajo, has adivinado el numero en "+i+" intentos!");
                break;
            }
            if(i==6){
                System.out.println("-Has agotado tus intentos, el numero era el "+i);
            }
        }
        
        
        System.out.println("San Fermín");
        while(sc.hasNext()){
            int toros= sc.nextInt();
            int velocidad = 0;
            for(int i=0;i<toros;i++){
                int velocidadToro = sc.nextInt();
                if(velocidadToro>velocidad){
                    velocidad=velocidadToro;
                }            
            }
            System.out.println(velocidad);
        }
        
       
        System.out.println("Radares de tramo");
        boolean seguir = true;
        while(sc.hasNext() && seguir==true){
            for(int i=0;i<3;i++){
                double distancia = sc.nextInt();
                double velocidad = sc.nextInt();
                double segundos = sc.nextInt();
                double media=(distancia/segundos)*3.6;
                if(distancia==0 && velocidad==0 && segundos==0){
                    seguir=false;
                    break;
                }
                if(distancia<0 || velocidad<0 || segundos<0){
                    System.out.println("ERROR");
                    break;
                }                
                if(media<=velocidad){
                    System.out.println("OK"); 
                }else if(media>velocidad*1.2){
                    System.out.println("PUNTOS");
                    
                }else{
                    System.out.println("MULTA");
                    
                }
                
            }
        }

        System.out.println("¡A dibujar hexágonos!");
        boolean seguir = true;
        while(sc.hasNext() && seguir==true){
                char relleno ='o';           
                int lado=0, espacio=0, fila=0;
            for(int i=0;i<2;i++){
                lado = sc.nextInt();
                relleno = sc.next().charAt(0);           
                espacio=lado-1;
                fila=lado;
                int auxEspacio = espacio;
                int auxFila=fila;
                
                if(lado==0 && relleno==0){
                    seguir=false;
                    break;
                }else{                    
                    for(int j=0; j<lado*2-1; j++){
                        while(espacio>0){
                            System.out.print(" ");
                            espacio--;
                        }
                        while(fila>0){
                            System.out.print(relleno);
                            fila--;
                        }
                        if(j<=lado){
                           auxEspacio--;
                           auxFila=auxFila+2;     
                        }else{
                           auxEspacio++;
                           auxFila=auxFila-2;
                        }
                        espacio=auxEspacio;
                        fila=auxFila;
                        System.out.println();
                         
                    }
                }
                
            }
        }

        System.out.println("Probando el Random");

        Random rnd = new Random();
        
        //int a1=rnd.nextInt();
        //System.out.println(a1);
        
        //a1=rnd.nextInt(100);
        //System.out.println(a1);
        
        //float a2=rnd.nextFloat();
        //System.out.println(a2);
        
        //double a3=rnd.nextDouble();
        //System.out.println(a3);

        //long a4=rnd.nextLong();
        //System.out.println(a4);
        
        //boolean a5=rnd.nextBoolean();
        //System.out.println(a5);
    /*    
        System.out.println("Ejercicio 1");
        boolean seguir = true;
        do{
            int dado=rnd.nextInt(7);
            System.out.println(dado); 
            System.out.println("Quieres tirar otra vez el dado?(s/n)");
            char respuesta = sc.next().charAt(0);
            if(respuesta!='s'){
                seguir=false;
            }
        }while(seguir==true);
        
        
        System.out.println("Ejercicio 2");
        int moneda=rnd.nextInt(2);
        if(moneda==0){
            System.out.println("Cara");
        }else{
            System.out.println("Cruz");
        }
        
        
        System.out.println("Ejercicio 3");
        int max=0, min=200;
        double media=0;
        for(int i=0; i<=50 ; i++){
            int numero =(rnd.nextInt(100)+100);
            System.out.print(numero+" ");
            if(numero>max){
                max=numero;
            }
            if(numero<min){
                min=numero;
            }
            media+=numero;
        }
        System.out.println();
        System.out.println("El máximo ha sido "+max+", el mínimo ha sido "+min+" y la media ha sido "+(media/50));
        
*/      
	System.out.println("Ejercicio 1");
        boolean seguir = true;
        do{
            int dado=(int)(Math.random()*6+1);
            System.out.println(dado); 
            System.out.println("Quieres tirar otra vez el dado?(s/n)");
            char respuesta = sc.next().charAt(0);
            if(respuesta!='s'){
                seguir=false;
            }
        }while(seguir==true);
        
      
        System.out.println("Ejercicio 2");
        int j=2,num,contPrimo;
        boolean primo=true;
        System.out.println("Introduzca un número");
        num=sc.nextInt();
        double raiz= Math.sqrt(num);
        while (j<=raiz && primo==true){
            if(num%j==0){
                primo=false;
            }   
            j++;
        }
        if(primo){
            System.out.println(num+" es primo");
        }else{
            System.out.println(num+" no es primo");
        }  
    }   
}
