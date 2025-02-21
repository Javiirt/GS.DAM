package entrega;

import java.util.*;

public class partido {
    private String equipo1;
    private String equipo2;
    ArrayList<gol> goles = new ArrayList<>();
    
    //Constructores
    partido(){
        equipo1 = "Equipo 1";
        equipo2 = "Equipo 2";  
        //El resultado sería 0-0
    }
    
    partido(String equipo1, String equipo2){
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        
        for(int i = 1; i<=90; i++){
            if(((int)(Math.random()*100)<3)){
                String jugador = "Jugador Nº"+((int)(Math.random()*11)+1 );
                if((int)(Math.random()*2)+1>1.5){
                    goles.add(new gol(equipo1, jugador, i));
                }else{
                    goles.add(new gol(equipo2, jugador, i));
                }                
            }
        }
    }
    
    //Métodos get y set
    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public ArrayList<gol> getGoles() {
        return goles;
    }

    public void setGoles(ArrayList<gol> goles) {
        this.goles = goles;
    }
    
    //Métodos para recoger los goles de cada equipo en un partido
    public int golesLocal(){
        int local = 0;
        for (gol actualGol : goles) {
            if(actualGol.getEquipo().equalsIgnoreCase(equipo1)){
                local++;
            }
        }
        return local;
    }
    public int golesVisitante(){
        int visitante = 0;
        for (gol actualGol : goles) {
            if(actualGol.getEquipo().equalsIgnoreCase(equipo2)){
                visitante++;
            }
        }
        return visitante;
    }
    
    //Método para obtener el resultado
    public String resultado(){        
        return equipo1+" "+golesLocal()+" - "+golesVisitante()+" "+equipo2;
    }
}