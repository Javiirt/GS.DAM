
package banco;

import java.util.Scanner;

public class Cliente {
    private int dni;
    private int sueldo;
    Cuenta cuentaCliente;     
    Scanner sc = new Scanner(System.in);
    
    Cliente(){
        dni=0;
        sueldo= 0;        
        cuentaCliente = new Cuenta();
    }
    
    Cliente(int nuevoDni, int nuevoSaldo, int nuevoSueldo){
        dni=nuevoDni;
        sueldo=nuevoSueldo;
        cuentaCliente = new Cuenta(dni,nuevoSaldo, dni);        
    }
    
    void setDni(int dniIntroducido){
        if(dniIntroducido>=10000000 && dniIntroducido<=99999999){
            dni = dniIntroducido;
        }        
    }
    
    void setSueldo(int saldoIntroducido){
        if(saldoIntroducido>0){
            sueldo=saldoIntroducido;
        }
    }
    void setCuenta(){
        cuentaCliente = new Cuenta();
    }
    
    int getDni(){
        return dni;
    }
    
    int getSueldo(){
        return sueldo;
    }
    
    void ingresar_nomina(){
        cuentaCliente.modificarSaldo(sueldo);
    }
    
    void sacar_dinero(int meterDni, int meterContraseña){
        if (cuentaCliente.validar_contraseña(meterContraseña)){
            System.out.println("Introduzca la cantidad que desea retirar");
            int retirar = sc.nextInt();
            cuentaCliente.modificarSaldo(-retirar);
        }else{
            System.out.println("Contraseña incorrecta");
        }
    }
    
    void mostrar(){
        System.out.println("DNI: "+dni+" \n" +
                            "Sueldo: "+sueldo);                            
        cuentaCliente.mostrar_datos(cuentaCliente.getContraseña());
    }
}
