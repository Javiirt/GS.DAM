
package tema5;

/**
 3 Crea una clase Libro con atributos título, autor, 
 fecha de edición y isbn crea sus métodos get set 
 y en un programa instancia 3 libros diferentes

 */
public class Libro {
    String titulo;
    String autor;
    String fechaEdicion;
    String isbn;
    
    String getTitulo(){
        return titulo;
    }
    String getAutor(){
        return autor;
    }
    String getFechaEdicion(){
        return fechaEdicion;
    }
    String getIsbn(){
        return isbn;
    }
    
    void setTitulo(String cadena){
        titulo=cadena;
    }
    void setAutor(String cadena){
        autor=cadena;
    }
    void setFechaEdicion(String cadena){
        fechaEdicion=cadena;
    }
    void setIsbn(String cadena){
        isbn=cadena;
    }
    
    
    public static void main(String[] arg) {
        Libro libro1= new Libro();
        Libro libro2= new Libro();
        Libro libro3= new Libro();
        
        
        
    }
}
