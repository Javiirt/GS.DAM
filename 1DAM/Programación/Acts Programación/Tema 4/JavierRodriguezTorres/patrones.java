
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patrones {
    /*De un texto (leer por fichero o teclado) mostrar las palabras 
    que acaben en ar er ir com por ejemplo vivir, lavar etc.. puedes 
    pensar que las palabras se delimitan por espacios puntos o comas*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un texto");        
        String texto = sc.nextLine();
        String palabra = "";
        for(int i = 0; i<texto.length(); i++){
            if(texto.charAt(i)==' ' || texto.charAt(i)==',' || texto.charAt(i)=='.'  || i==texto.length()-1){
                if(texto.charAt(i)!=' ' && texto.charAt(i)!=',' && texto.charAt(i)!='.'){
                    palabra+=texto.charAt(i);
                }
                Pattern pat = Pattern.compile("[aei][r]$"); 
                Matcher mat = pat.matcher(palabra);
                if(mat.matches()){
                    System.out.println(palabra);
                } 
                palabra="";                
            }else{
                palabra+=texto.charAt(i);
            }             
        }        
    }
}