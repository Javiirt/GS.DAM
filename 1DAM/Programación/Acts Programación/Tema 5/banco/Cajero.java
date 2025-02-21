
package banco;

import java.util.Scanner;

public class Cajero {
    
    public static void main(String[]args){
        
    Scanner sc = new Scanner(System.in);
        Cliente cliente1 = new Cliente(98765478,15000,1200);
        cliente1.mostrar();
        int respuesta;
        do{
            System.out.println("\n\n CAJERO AUTOMÁTICO \n" +
                                "--------------------------- \n" +
                                "1. Consultar/Modificar Datos personales \n" +
                                "2. Ingresar Nomina \n" +
                                "3. Consultar Datos Bancarios \n" +
                                "4. Sacar Dinero \n" +
                                "5. Modificar Contraseña \n" +
                                "6. Salir");
            respuesta = sc.nextInt();
            System.out.println("\n-------------------------------------------------");
            switch (respuesta){
                case 1:
                    System.out.println("DNI: "+cliente1.getDni());
                    System.out.println("SUELDO: "+cliente1.getSueldo());
                    System.out.println("Desea cambiar los valores (s)");
                    char si = sc.next().charAt(0);
                    if(si=='s'){
                        System.out.println("Introduzca el nuevo valor del DNI");
                        int nuevoDni = sc.nextInt();
                        cliente1.setDni(nuevoDni);
                        System.out.println("Introduzca el nuevo valor del Sueldo");
                        int nuevoSueldo = sc.nextInt();
                        cliente1.setSueldo(nuevoSueldo);
                    }
                    break;
                case 2:
                    cliente1.ingresar_nomina();
                    break;
                case 3:
                    System.out.println("Introduzca su contraseña para obtener los datos bancarios");
                    int contraseña = sc.nextInt();                    
                    cliente1.cuentaCliente.mostrar_datos(contraseña);
                    break;
                case 4:
                    System.out.println("Introduzca la cantidad de dinero a retirar");
                    int retirar = sc.nextInt();
                    cliente1.cuentaCliente.modificarSaldo(-retirar);
                    break;
                case 5:
                    cliente1.cuentaCliente.modificar_contraseña();
                    break;
                case 6:
                    System.out.println("Cerrando aplicación...");
                    break;
                default:
                    System.out.println("Número introducido no válido");
                    break;                
            }
            System.out.println("-------------------------------------------------");
            
        }while(respuesta!=6);
    
    }
    
}
