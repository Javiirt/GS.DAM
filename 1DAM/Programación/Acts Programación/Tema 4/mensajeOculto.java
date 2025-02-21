import java.util.*;

public class mensajeOculto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            sc.nextLine();
            String oculto = sc.nextLine().toLowerCase().replace(" ", "");
            String mensaje = sc.nextLine().toLowerCase();
            int contador = 0;
            boolean igual = false;
            for (int j = 0; j < oculto.length(); j++) {
                if (oculto.charAt(j) == mensaje.charAt(contador)) {
                    contador++;
                    if (contador == mensaje.length()) {
                        igual = true;
                        break;
                    }
                }
            }
            if (igual) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }   
    
}