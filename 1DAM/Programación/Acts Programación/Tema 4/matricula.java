import java.util.*;

public class matricula {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        String matricula, nuevaMatricula;
        String numero, nuevoNumero, letras, nuevaLetra;
        int viejos, nuevos;

        for (int i = 0; i < casos; i++) {
            sc .nextLine();
            matricula = sc.next();
            numero = matricula.substring(0, 4);
            letras = matricula.substring(4, 7);
            nuevos = 0;
            viejos = 0;
            while (sc.hasNext()) {
                nuevaMatricula = sc.next();
                if (nuevaMatricula.equals("0")){
                    break;
                }
                nuevoNumero = nuevaMatricula.substring(0, 4);
                nuevaLetra = nuevaMatricula.substring(4, 7);
                if (letras.equals(nuevaLetra)) {
                    if (nuevoNumero.compareTo(numero) < 0){
                        viejos++;
                    }else {
                        nuevos++;
                    }
                } else {
                    if (letras.compareTo(nuevaLetra) < 0){
                        nuevos++;
                    }else {
                        viejos++;
                    }
                }
            }
            System.out.println( viejos + " " + nuevos );
        }
    }
}
