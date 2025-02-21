import java.util.Scanner;
import java.lang.Math;
public class radar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
    }    
}
