package tiempo;

public class hora {
    private int hora;
    private int minuto;
    private int segundo;
    
    hora(){
        hora=0;
        minuto=0;
        segundo=0;        
    }
    hora(int nuevaHora, int nuevoMinuto, int nuevoSegundo){
        hora=nuevaHora;
        minuto=nuevoMinuto;
        segundo=nuevoSegundo; 
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int nuevaHora) {        
        hora+= nuevaHora;
            while(nuevaHora>=24){
            nuevaHora-=24;
        }
    }

    public void setMinuto(int nuevoMinuto) {
        minuto+=nuevoMinuto;
        int contador = 0;
        while(minuto>=60){
            minuto-=60;
            contador++;
        }
        setHora(contador);
    }

    public void setSegundo(int nuevoSegundo) {
        segundo+=nuevoSegundo;
        int contador = 0;
        while(segundo>=60){
            segundo-=60;
            contador++;
        }
        setMinuto(contador);
    }
    
    void mostrarhora24(){
        System.out.println("Son las "+hora+" horas "+minuto+" minutos y "+segundo+" segundos");
    }
    
    void mostrarhora12(){
        if(hora>=12){
            System.out.println("Son las "+(hora-12)+" horas "+minuto+" minutos y "+segundo+" segundos de la tarde");
        }else{
            System.out.println("Son las "+hora+" horas "+minuto+" minutos y "+segundo+" segundos de la mañana");
        }
    }
    
}
