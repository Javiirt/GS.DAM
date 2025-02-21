
package fabrica;

import java.util.Scanner;

public class producto{
    
    
    private String nombre;
    private int serie;
    private double precio;

    public producto() {
        nombre = "Sin nombre";
        precio = 0;
        serie = generar();
    }

    public producto(String nombre, double precio) {
        this.nombre = comprobarNombre(nombre);
        this.precio = comprobarPrecio(precio);
        serie = generar();
    }
    
    private int generar(){
        return (int)(Math.random()*100000)+1;
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getSerie() {
        return serie;
    }    

    public void setPrecio(double precio) {
        this.precio = comprobarPrecio(precio);
    }
    
    public void setNombre(String nombre) {
        this.nombre = comprobarNombre(nombre);
    }

    private String comprobarNombre(String nombre){
        Scanner sc = new Scanner(System.in);
        while(nombre.equals("")){
            System.out.println("Nombre no válido, introduzca un nombre: ");
            nombre = sc.nextLine();
        }        
        return nombre;
    }
    
    private double comprobarPrecio(double precio){
        Scanner sc = new Scanner(System.in);
        while(precio<0){
            System.out.println("Precio no válido, introduzca el precio: ");
            precio = sc.nextDouble();
        }        
        return precio;
    }    
        
    public String pedirNombre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un nombre:");
        String nuevoNombre = sc.nextLine();
        return comprobarNombre(nuevoNombre);      
    }
    
    public double pedirPrecio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un precio:");
        double nuevoPrecio = sc.nextDouble();
        return comprobarPrecio(nuevoPrecio);        
    }
    
    public void resumen(){
        System.out.println("INFORME DEL PRODUCTO\n"
                         + "--------------------\n"
                         + "Nombre: "+nombre+"\n"
                         + "Serie: "+serie+"\n"
                         + "Precio: "+precio+"€\n");
    }
    
    public boolean iguales(producto otroProducto){
        if(this.getNombre().equalsIgnoreCase(otroProducto.getNombre())){
            if(this.getSerie() == otroProducto.getSerie()){
                return true;
            }
        }
        return false;
    }
    
}
