package fabrica;

import java.util.Scanner;
import java.lang.Math;

public class producto {
    private String nombre;
    private int serie;
    private double precio;
    Scanner sc = new Scanner(System.in);
    
    private int generar(){
        int random = (int)(Math.random()*100000+1);
        return random;
    }
    
    producto(){
        nombre = "";
        precio = 0;
        serie= generar();
    }
    
    private void setNombre(String nuevoNombre) {
        if(nuevoNombre.equals("")){
            boolean seguir = true;
            while(seguir){
                System.out.println("No puede dejar el nombre en blanco, introduzca un nombre:");
                String otroNombre = sc.nextLine();
                if(!otroNombre.equals("")){
                    seguir=false;
                    nombre=otroNombre;
                }                
            }
        }else{
            nombre=nuevoNombre;
        }
    }

    private void setPrecio(double nuevoPrecio) {
        if(nuevoPrecio<0){
            boolean seguir = true;
            while(seguir){
                System.out.println("El precio no puede ser negativo, introduzca un precio válido:");
                int otroPrecio = sc.nextInt();
                if(otroPrecio>=0){
                    seguir=false;
                    precio=otroPrecio;
                }                
            }
        }else{
            precio=nuevoPrecio;
        }
        serie= generar();
    }
    
    producto(String nuevoNombre, int nuevoPrecio){
        setNombre(nuevoNombre);
        setPrecio(nuevoPrecio);
    }

    String getNombre() {
        return nombre;
    }

    double getPrecio() {
        return precio;
    }

    int getSerie() {
        return serie;
    }

    void pedirNombre(){
        boolean seguir = true;
            while(seguir){
                System.out.println("Introduzca un nombre válido:");
                String otroNombre = sc.nextLine();
                if(!otroNombre.equals("")){
                    seguir=false;
                    nombre=otroNombre;
                }                
            }
    }
    
    void pedirPrecio(){
        boolean seguir = true;
            while(seguir){
                System.out.println("Introduzca un precio válido:");
                double otroPrecio = sc.nextDouble();
                if(otroPrecio>=0){
                    seguir=false;
                    precio=otroPrecio;
                }
                
            }
    }
    
    void resumen(){
        System.out.println("INFORME DE PRODUCTO \n" +
                           "------------------- \n" +
                           "Nombre: "+nombre+" \n" +
                           "Serie: "+serie+" \n" +
                           "Precio: "+precio+"€");
    }
    
    boolean iguales(producto otroProducto){
        if(nombre.equals(otroProducto.getNombre())){
            return serie==otroProducto.getSerie();
        }else{
            return false;
        }
    }
}