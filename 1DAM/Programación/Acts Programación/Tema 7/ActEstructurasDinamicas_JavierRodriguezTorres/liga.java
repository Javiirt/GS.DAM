package entrega;

import java.util.*;

public class liga {
    private String equipo1;
    private String equipo2;
    private String equipo3;
    private String equipo4;
    ArrayList<partido> partidos = new ArrayList<>();
    
    //Constructor por defecto
    liga(){
        equipo1 = "Cadiz";
        equipo2 = "Sevilla";
        equipo3 = "Betis";
        equipo4 = "Granada";        
        for(int i=0; i<4;i++){
            String local = "";
            String visitante = "";
            for(int y=0; y<4; y++){
                switch(i){
                        case 0: local = equipo1; break;
                        case 1: local = equipo2; break;
                        case 2: local = equipo3; break;
                        case 3: local = equipo4; break;
                }
                if(y!=i){                    
                    switch(y){
                        case 0: visitante = equipo1; break;
                        case 1: visitante = equipo2; break;
                        case 2: visitante = equipo3; break;
                        case 3: visitante = equipo4; break;
                    }
                    partidos.add(new partido(local, visitante));
                }
            }
        }        
    }
    
    liga(String equipo1, String equipo2, String equipo3 ,String equipo4){
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.equipo3 = equipo3;
        this.equipo4 = equipo4; 
        
        //Los partidos se siguen generando aleatoriamente
        for(int i=0; i<4;i++){
            String local = "";
            String visitante = "";
            for(int y=0; y<4; y++){
                switch(i){
                        case 0: local = equipo1; break;
                        case 1: local = equipo2; break;
                        case 2: local = equipo3; break;
                        case 3: local = equipo4; break;
                }
                if(y!=i){                    
                    switch(y){
                        case 0: visitante = equipo1; break;
                        case 1: visitante = equipo2; break;
                        case 2: visitante = equipo3; break;
                        case 3: visitante = equipo4; break;
                    }
                    partidos.add(new partido(local, visitante));
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

    public String getEquipo3() {
        return equipo3;
    }

    public void setEquipo3(String equipo3) {
        this.equipo3 = equipo3;
    }

    public String getEquipo4() {
        return equipo4;
    }

    public void setEquipo4(String equipo4) {
        this.equipo4 = equipo4;
    }

    public ArrayList<partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<partido> partidos) {
        this.partidos = partidos;
    }
    
    
    //Método para mostrar todos los partidos de liga
    public void mostrarPartidos(){
        System.out.println("PARTIDOS DE LA LIGA\n"
                         + "-------------------");
        for(partido actual: partidos){            
            System.out.println(actual.resultado());
        }
        System.out.println();
    }
    
    //Método para comprobar que el equipo existe
    public boolean existe(String equipo){
        if(equipo.equalsIgnoreCase(equipo1) || 
            equipo.equalsIgnoreCase(equipo2) ||
            equipo.equalsIgnoreCase(equipo3) ||
            equipo.equalsIgnoreCase(equipo4)){
             return true;
         }else{
            return false;
        }
    }
    
    //Método que devuelve los puntos de un equipo
    public int puntoEquipo(String equipo){
        int puntosEquipo = 0;
        for(partido actual: partidos){ 
            int resultado;
            if(actual.getEquipo1().equalsIgnoreCase(equipo) || actual.getEquipo2().equalsIgnoreCase(equipo)){
                if(actual.getEquipo1().equalsIgnoreCase(equipo)){
                    resultado = actual.golesLocal()-actual.golesVisitante();
                }else{
                    resultado = actual.golesVisitante()-actual.golesLocal();
                }
                if (resultado==0){
                    puntosEquipo++;
                }  else if(resultado>0){
                    puntosEquipo+=3;
                }
            }
        } 
        return puntosEquipo;
    }
    
    //Método que muestra el ranking de la liga
    public void ranking(){        
        
        String [] equipos =  {equipo1, equipo2, equipo3, equipo4};
        ArrayList<String> ranking = new ArrayList<>();
        
        ranking.add(equipo1);
        for(int i=1; i<equipos.length;i++){
            for(String equipoActual: ranking){
                if(puntoEquipo(equipos[i])>puntoEquipo(equipoActual)){
                    ranking.add(ranking.indexOf(equipoActual),equipos[i]);
                    break;
                }
            }
            if(puntoEquipo(equipos[i])<=puntoEquipo(ranking.get(ranking.size()-1))){
                ranking.add(equipos[i]);
            }
        }       
                
        System.out.println("RANKING DE LA LIGA\n"
                + "------------------");
        for(String equipoActual: ranking){
            System.out.println(equipoActual +": "+puntoEquipo(equipoActual)+" puntos");    
        } 
        System.out.println();
    }
    
    //Método que muestra los goles de cada jugador de un equipo
    public void golesJugadores(String equipo){
        int[] jugadores = new int[12];
        for(partido actual: partidos){            
            if(actual.getEquipo1().equalsIgnoreCase(equipo) || actual.getEquipo2().equalsIgnoreCase(equipo)){
                
                for(gol esteGol: actual.getGoles()){
                    if(esteGol.getEquipo().equalsIgnoreCase(equipo)){
                        jugadores[0]++;
                    switch(esteGol.getJugador()){
                        case "Jugador Nº1": jugadores[1]++; break;
                        case "Jugador Nº2": jugadores[2]++; break;
                        case "Jugador Nº3": jugadores[3]++; break;
                        case "Jugador Nº4": jugadores[4]++; break;
                        case "Jugador Nº5": jugadores[5]++; break;
                        case "Jugador Nº6": jugadores[6]++; break;
                        case "Jugador Nº7": jugadores[7]++; break;
                        case "Jugador Nº8": jugadores[8]++; break;
                        case "Jugador Nº9": jugadores[9]++; break;
                        case "Jugador Nº10": jugadores[10]++; break;
                        case "Jugador Nº11": jugadores[11]++; break;
                    }
                    }                    
                }                
            }
        } 
        System.out.println("GOLEADORES ("+equipo+")\n"
                + "----------------------");        
        for(int i=1; i<jugadores.length; i++){
            if(jugadores[i]>0){
                System.out.println("Jugador Nº"+i+": "+jugadores[i]+" goles");
            }
        }
        System.out.println("Total de goles: "+jugadores[0]+"\n"); 
    }
    
    //Método que muestra los goles de cada jugador
    public void todosGoleadores(){
        golesJugadores(equipo1);
        golesJugadores(equipo2);
        golesJugadores(equipo3);
        golesJugadores(equipo4);
    }
}