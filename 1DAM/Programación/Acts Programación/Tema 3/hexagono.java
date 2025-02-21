import java.util.Scanner;
import java.lang.Math;
public class hexagono {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
                    for(int j=0; i<lado*2-1; i++){
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
    }    
}
