import java.util.Scanner;
import java.lang.Math;
public class sanFermin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
    }    
}
