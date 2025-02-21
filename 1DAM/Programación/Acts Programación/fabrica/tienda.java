
package fabrica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class tienda {
    
    static Scanner sc = new Scanner(System.in);
    static ArrayList<producto> productos = new ArrayList();
    static BufferedReader lector = null; 
    static PrintWriter pw = null;
    
    static void crearProducto(){
        System.out.println("Introduzca el nombre del producto");
        String nombreProducto = sc.nextLine();
        System.out.println("Introduzca el precio del producto");
        double precioProducto = sc.nextDouble();
        sc.nextLine();
        productos.add(new producto(nombreProducto, precioProducto));
    }
    
    static void borrarProducto(){
        System.out.println("Introduzca el nombre del producto");
        String nombreProductoBorrar = sc.nextLine();
        Iterator<producto> iter= productos.iterator();
        while (iter.hasNext()) {
            if (iter.next().getNombre().equals(nombreProductoBorrar)) {
                iter.remove();
            }
        }        
    }
    
    static void mostrarTodo(){
        for(producto este : productos){
            este.resumen();
        }
    }
    
    private static void grabar(String fichero) {
        
        try{            
            pw = new PrintWriter(new FileWriter(fichero));
            for(producto este : productos){
                pw.println(este.getNombre()+";"+este.getSerie()+";"+este.getPrecio());
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR");
        } catch(IOException e){
            System.out.println("ERROR");
        }
        
        
        
    }

    private static void añadirProducto(String fichero) {
        
        try{
            lector = new BufferedReader(new FileReader(fichero));
            String linea;
            String[] nuevoProducto;
            while((linea = lector.readLine()) != null){
                nuevoProducto = linea.split(";");
                String nombre = nuevoProducto[0];
                double precio = Double.parseDouble(nuevoProducto[1]);
                
                producto nuevoProd = new producto(nombre, precio);      
                productos.add(nuevoProd);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR");
        } catch(IOException e){
            System.out.println("ERROR");
        }
    }

    private static void sustituir(String fichero) {
        productos.clear();
        añadirProducto(fichero);
    }
    
    public static void main(String[] args) {
        
        
        producto producto1 = new producto("Tomate", 1.3);
        producto producto2 = new producto("Leche", 0.6);
        producto producto3 = new producto("Pan", 1.0);        
        
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        
        
        char seguir ='0';
        String fichero;
        
        do{
            System.out.println("TIENDA\n"
                    + "-------------------------------------------------------\n"
                    + "1. Crear producto y añadirlo a la lista\n"
                    + "2. Borrar producto de la lista\n"
                    + "3. Mostrar todos los producto de la lista\n"
                    + "4. Grabar la lista de producto en un fichero\n"
                    + "5. Añadir producto de fichero a la lista\n"
                    + "6. Sustituír la lista actual por producto en fichero\n"
                    + "0. Salir\n"
                    + "Qué opción desea realizar?");
            
            seguir = sc.nextLine().charAt(0);
            System.out.println();
            
            switch(seguir){
                case '1':
                    crearProducto();
                    break;
                    
                case '2':
                    borrarProducto();                    
                    break;
                    
                case '3':
                    mostrarTodo();
                    break;
                    
                case '4':
                    System.out.println("Introduzca el nombre del fichero");
                    fichero = sc.nextLine();
                    grabar(fichero);
                    break;
                    
                case '5':
                    System.out.println("Introduzca el nombre del fichero");
                    fichero = sc.nextLine();
                    añadirProducto(fichero);
                    break;
                
                case '6':
                    System.out.println("Introduzca el nombre del fichero");
                    fichero = sc.nextLine();
                    sustituir(fichero);
                    break;

                case '0':
                    System.out.println("Saliendo...");
                    break;
                    
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            System.out.println("-------------------------------------------------------");
        }while(seguir!='0');
    }
}
