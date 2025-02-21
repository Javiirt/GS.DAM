package EjerciciosGenericos;

public class Operaciones <N extends Number>{

	 //Devuelve el resultado de sumar dos al parametro pasado
    public double suma(N num){
    	
        return num.doubleValue() + 2;
    }
    
    //Devuelve el resultado de restar dos al parametro pasado
    public double resta(N num){
        return num.doubleValue() - 2; 
    }

    //Devuelve el resultado de multiplicar por dos al parametro pasado
    public double producto(N num){
    	
        return num.doubleValue() * 2;
    }

    //Devuelve el resultado de dividir por dos al parametro pasado
    public double division(N num){
    	
        return num.doubleValue() / 2;
    }
}
