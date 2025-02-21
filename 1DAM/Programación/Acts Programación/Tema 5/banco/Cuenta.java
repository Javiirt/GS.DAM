
package banco;

import java.lang.Math;
import java.util.Scanner;
public class Cuenta {
    private int nCuenta ;
    private int saldo;
    private int contraseña;    
    Scanner sc = new Scanner(System.in);
    
    Cuenta(){
        nCuenta = 1;
        saldo = 0;
        contraseña = 1234;
    }
    Cuenta(int nCuentaNueva, int saldoNuevo, int contraseñaNueva){
        nCuenta = nCuentaNueva;
        saldo = saldoNuevo;
        contraseña = contraseñaNueva;
    }
    
    int getNumero(){
        return nCuenta;
    }
    int getSaldo(){
        return saldo;
    }
    int getContraseña(){
        return contraseña;
    }
    
    
    protected void modificarSaldo(int cantidad){
       saldo+=cantidad;
    }
    
    private void generar_contraseña(){
        contraseña =(int)(Math.random()*9000+1000);
        
    }
    
    protected void modificar_contraseña(){
        System.out.println("Introduzca su contraseña actual");
        int contraseñaIntro = sc.nextInt();
        if(contraseñaIntro==contraseña){
            generar_contraseña();
            System.out.println("Su nueva contraseña es:"+contraseña);
        }else{
            System.out.println("Contraseña incorrecta");
        }
    }
    
    protected boolean validar_contraseña(int contraseñaValidar){
        return (contraseñaValidar==contraseña);
    }
      
    protected void mostrar_datos(int contraseñaIntro){
      if (validar_contraseña(contraseñaIntro)){
        System.out.println("Número de cuenta: "+nCuenta+" \n"
                    + "Saldo: "+saldo+" €\n"
                    + "Contraseña: "+contraseña);
        }else{
            System.out.println("contraseña incorrecta");
        }
    }
}
