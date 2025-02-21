
package tema5;

public class Coche {
    
    String Color = "blanco";
    int Velocidad = 0;
    
    void acelerar(){
        Velocidad+=10;
    }
    
    void desacelerar(){
        Velocidad-=10;
    }
    
    void frenar(){
        Velocidad=0;
    } 
    
    void pintar(String nuevoColor){
        Color = nuevoColor;
    }
    
    void informe(){
        System.out.println("El coche "+Color+" va a "+Velocidad+" Km/h");
    }
    
    public static void main(String[] arg) {
        Coche miCoche= new Coche();
        
        miCoche.pintar("azul");
        miCoche.acelerar();
        miCoche.acelerar();
        miCoche.acelerar();
        miCoche.acelerar();
        miCoche.acelerar();
        miCoche.informe();
        miCoche.desacelerar();
        miCoche.desacelerar();
        miCoche.desacelerar();
        miCoche.informe();
        miCoche.pintar("verde");
        miCoche.frenar();
        miCoche.informe();        
   }    
}
