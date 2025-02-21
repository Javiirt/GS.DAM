package entrega;

public class gol {
    private String equipo ;
    private String jugador ;
    private int minuto ;
    
    //Constructores
    gol(){
        equipo = "Cadiz";
        jugador = "Jugador 10";
        minuto = 15;
    }
    
    gol(String equipo, String jugador, int minuto){
        this.equipo = equipo;
        this.jugador = jugador;
        this.minuto = minuto;
    }
    
    //Métodos get y set
    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        //Comprueba que el minuto sea válido
        if(minuto>0 && minuto<=90){
           this.minuto = minuto; 
        }else{
            System.out.println("Minuto introducido no válido");
        }        
    }    
}