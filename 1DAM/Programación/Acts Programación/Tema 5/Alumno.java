
package tema5;

public class Alumno {
    
    String nombre;
    int anioNac;
    
    
    String getNombre(){
        return nombre;
    }
    
    
    int edad(){
        int resultado;
        resultado=2021-anioNac;
        return resultado;
    }
    
    
    public static void main(String[] args) {
        Alumno manuel = new Alumno();
        manuel.nombre = "Manuel";
        manuel.anioNac= 2008;
        System.out.println(manuel.getNombre()+" tiene "+manuel.edad()+" años");

    }
    
}
