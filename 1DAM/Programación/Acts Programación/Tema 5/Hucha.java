
package tema5;

public class Hucha {
 
	int saldo = 0;
        
        void introducir(int num){
            saldo+=num;
        }
        
        void sacar(int num){
            saldo-=num;
        }
        
        void informar(){
            System.out.println("Hay "+saldo+" en la hucha");
        }
        
        
    public static void main(String[] arg) {
        Hucha miHucha= new Hucha();
 
        miHucha.introducir(50);   // Debe meter 50 en la hucha
  	miHucha.sacar(20);   // Debe sacar 20 de la hucha
        miHucha.introducir(40);
  	miHucha.informar();  // Debe mostrar por pantalla "Hay 70 en la hucha";
   }
}
