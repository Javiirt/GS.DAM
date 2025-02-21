public class Persona {
    private int edad;
    
    public Persona (int edad){
        this.edad=edad;
    }
    
    public boolean isMayorDeEdad() {
        return (edad >=18);
    }
}