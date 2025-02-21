package prueba;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*        
        System.out.println("Ejercicio 1");
        System.out.println("Introduzca su nota");
        float nota = sc.nextFloat();
        
        if(nota<5){
            System.out.println("SUSPENSO");
        }else{
            System.out.println("APROBADO");
        }

        System.out.println("--------------------------");
        
        System.out.println("Ejercicio 2");
        float ingresos, gastos, saldo;
        System.out.println("Introduzca sus ingresos");
        ingresos = sc.nextFloat();
        System.out.println("Introduzca sus gastos");
        gastos = sc.nextFloat();
        saldo=ingresos-gastos;
        if(saldo<0){
            System.out.println("¡Lo siento!, estás en números rojos");
        }else{
            System.out.println("¡Enhorabuena!, te sobran "+saldo+"€");
        }
        
        System.out.println("--------------------------");
       
        System.out.println("Ejercicio 3");
        System.out.println("Introduzca un número");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
        
        System.out.println("--------------------------");
       
        System.out.println("Ejercicio 4");
        int num1, num2;
        System.out.println("Introduzca un número");
        int num1 = sc.nextInt();
        System.out.println("Introduzca otro número");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("El mayor es "+num1);
        }else if(num1<num2){
            System.out.println("El mayor es "+num2);
        }else{
            System.out.println("Ambos números son iguales");
        }
        

        System.out.println("--------------------------");
       
        System.out.println("Ejercicio 5");
        float dividendo, divisor;
        System.out.println("Introduzca el dividendo");
        dividendo = sc.nextFloat();
        System.out.println("Introduzca el divisor");
        divisor = sc.nextFloat();
        if(divisor==0){
            System.out.println("No se puede dividir");
        }else{
            System.out.println(dividendo+"/"+divisor+"="+(dividendo/divisor));
        }
        

        System.out.println("--------------------------");
       
        System.out.println("Ejercicio 9");
        System.out.println("Introduzca la nota");
        int nota = sc.nextInt();
        switch(nota){
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
                System.out.println("Suspenso");
                break;            
            case 5: 
                System.out.println("Aprobado");
                break;
            case 6: 
                System.out.println("Bien");
                break;
            case 7: 
            case 8: 
                System.out.println("Notable");
                break;            
            case 9: 
            case 10: 
                System.out.println("Sobresaliente");
                break;            
            default: 
                System.out.println("Nota no válida");
                break;
        }

        System.out.println("--------------------------");
       
        System.out.println("Ejercicio 10");
        System.out.println("Introduzca un número");
        int num1 = sc.nextInt();
        System.out.println("Introduzca otro número");
        int num2 = sc.nextInt();
        System.out.println("Calculadora v.1.1\n" +
                            "-----------------------\n" +
                            "1. Sumar\n" +
                            "2. Restar\n" +
                            "3. Multiplicar\n" +
                            "4. Dividir\n" +
                            "0 no hacer nada");
        int elegir = sc.nextInt();
        
        switch(elegir){
            case 1:
                System.out.println(num1+"+"+num2+"="+(num1+num2));
                break;
            case 2:
                System.out.println(num1+"-"+num2+"="+(num1-num2));
                break;                
            case 3:
                System.out.println(num1+"*"+num2+"="+(num1*num2));
                break;              
            case 4:
                System.out.println(num1+"/"+num2+"="+(num1/num2));
                break;                
            case 0:
                break;                         
            default: 
                System.out.println("Error");
                break;
        }


        System.out.println("--------------------------");
       
        System.out.println("Ejercicio 11");
        System.out.println("Introduzca el día");
        int dia = sc.nextInt();
        System.out.println("Introduzca el mes");
        int mes = sc.nextInt();
        System.out.println("Introduzca el año");
        int anio = sc.nextInt();
        if(dia<=30 && dia>=1 && mes<=12 && mes>=1){
            System.out.println(dia+"/"+mes+"/"+anio+" es una fecha válida");
        } else{
            System.out.println("Fecha no válida");
        }
        
        
        System.out.println("--------------------------");
       
        System.out.println("Ejercicio 12");
        System.out.println("Introduzca un mes"); 
        String mes = sc.nextLine();
        int dia;
         switch (mes){
                case "enero":
                    dia =31;
                    break;
                case "febrero":
                    dia =28;
                    break;
                case "marzo":
                    dia =31;
                    break;
                case "abril":
                    dia =30;
                    break;
                case "mayo":
                    dia =31;
                    break;
                case "junio":
                    dia =30;
                    break;
                case "julio":
                    dia =31;
                    break;
                case "agosto":
                    dia =31;
                    break;
                case "septiembre":
                    dia =30;
                    break;
                case "octubre":
                    dia =31;
                    break;
                case "noviembre":
                    dia =30;
                    break;
                case "diciembre":
                    dia =31;
                    break;
                default:
                System.out.println("Mes introducido no válido");        
        }
        System.out.println(mes+" tiene "+dia+" días");
 

        System.out.println("--------------------------");
       
        System.out.println("Ejercicio 12.2");
        int anio, dia=0;
        System.out.println("Introduzca un mes"); 
        String mes = sc.nextLine();
        System.out.println("Introduzca el año"); 
        anio = sc.nextInt();
        
        switch (mes){
                case "enero":
                    dia =31;
                    break;
                case "febrero":
                    if(anio%400==0 || (anio%100!=0 && anio%4==0)){
                        dia=29;
                    }else{
                        dia=28;
                    }
                    break;
                case "marzo":
                    dia =31;
                    break;
                case "abril":
                    dia =30;
                    break;
                case "mayo":
                    dia =31;
                    break;
                case "junio":
                    dia =30;
                    break;
                case "julio":
                    dia =31;
                    break;
                case "agosto":
                    dia =31;
                    break;
                case "septiembre":
                    dia =30;
                    break;
                case "octubre":
                    dia =31;
                    break;
                case "noviembre":
                    dia =30;
                    break;
                case "diciembre":
                    dia =31;
                    break;
                default:
                System.out.println("Mes introducido no válido");        
        }

        System.out.println(mes+" tiene "+dia+" días en "+anio);


        System.out.println("--------------------------");
       
        System.out.println("Ejercicio 13");
        System.out.println("Introduzca el día");
        int dia = sc.nextInt();
        System.out.println("Introduzca el mes");
        int mes = sc.nextInt();
        System.out.println("Introduzca el año");
        int anio = sc.nextInt();
        System.out.println(dia+"/"+mes+"/"+anio);
        if(dia+1<30){
            dia++;
        } else {
            dia=1;
            if(mes+1<12){
                mes++;
            }else{
                mes=1;
                anio++;
            }                 
        }
        System.out.println("El día siguiente es: "+dia+"/"+mes+"/"+anio);


        System.out.println("--------------------------");
       
        System.out.println("Ejercicio 14");
        System.out.println("Introduzca un número");
        int num1 = sc.nextInt();
        System.out.println("Introduzca otro número");
        int num2 = sc.nextInt();
        System.out.println("Introduzca otro número más");
        int num3 = sc.nextInt();
        
        if (num1<num2 && num1<num3){
            if (num2<num3){
               System.out.println(num1+", "+num2+", "+num3); 
            }else{
                System.out.println(num1+", "+num3+", "+num2);
            }
        } else if(num2<num1 && num2<num3){
            if (num1<num3){
               System.out.println(num2+", "+num1+", "+num3); 
            }else{
                System.out.println(num2+", "+num3+", "+num1);
            }
        }else{
            if (num1<num2){
               System.out.println(num3+", "+num1+", "+num2); 
            }else{
                System.out.println(num3+", "+num2+", "+num1);
            }
        }


        System.out.println("--------------------------");
       
        System.out.println("Ejercicio 15");
        int horas, salario;
        System.out.println("Introduzca el número de horas trabajadas");
        horas = sc.nextInt();
        if(horas<=40){
            salario = horas*16;
        } else{
            salario = 40*16+(horas-40)*20;
        }
        System.out.println("Su salario semanal es de: "+salario+"€");
        
       
        System.out.println("--------------------------");
       
        System.out.println("Ejercicio 17");
        int numero, cifras;
        System.out.println("Introduzca un número del 0 al 9999");
        numero = sc.nextInt();
        if(numero<10){
            cifras=1;
        }else if(numero<100){
            cifras=2;
        }else if(numero<1000){
            cifras=3;
        }else {
            cifras=4;
        }
        System.out.println("El número introducido tiene "+cifras+" cifras");
  

        System.out.println("--------------------------");
       
        System.out.println("Ejercicio 18");
        int numero, decena, unidad;
        String cadena ="";
        System.out.println("Introduzca un número del 1 al 99");
        numero = sc.nextInt();
        decena = numero/10;
        unidad = numero - decena*10;
        if (numero == 10 || numero ==11 || numero ==12 || numero ==13 || numero ==14 || numero ==15 || numero ==20 || numero ==30 || numero ==40 || numero ==50 || numero ==60 || numero ==70 || numero ==80 || numero ==90){
            switch (numero){
            case 10:
                cadena +="diez";
                break;
            case 11:
                cadena +="once";
                break;
            case 12:
                cadena +="doce";
                break;
            case 13:
                cadena +="trece";
                break;
            case 14:
                cadena +="catroce";
                break;
            case 15:
                cadena +="quince";
                break;
            case 20:
                cadena +="veinte";
                break;
            case 30:
                cadena +="treinta";
                break;
            case 40:
                cadena +="cuarenta";
                break;
            case 50:
                cadena +="cincuenta";
                break; 
            case 60:
                cadena +="sesenta";
                break;
            case 70:
                cadena +="setenta";
                break;
            case 80:
                cadena +="ochenta";
                break;
            case 90:
                cadena +="noventa";
                break;
            } 
        }else{
            switch (decena){
                case 1:
                    cadena +="dieci";
                    break;
                case 2:
                    cadena +="venti";
                    break;
                case 3:
                    cadena +="trenta y ";
                    break;
                case 4:
                    cadena +="cuarenta y ";
                    break;
                case 5:
                    cadena +="cincuenta y ";
                    break;
                case 6:
                    cadena +="sesenta y ";
                    break;
                case 7:
                    cadena +="setetenta y ";
                    break;
                case 8:
                    cadena +="ochenta y ";
                    break;
                case 9:
                    cadena +="noventa y ";
                    break;
            }

            switch (unidad){
                case 0:
                    cadena +="cero";
                    break;
                case 1:
                    cadena +="uno";
                    break;
                case 2:
                    cadena +="dos";
                    break;
                case 3:
                    cadena +="tres";
                    break;
                case 4:
                    cadena +="cuatro";
                    break;
                case 5:
                    cadena +="cinco";
                    break;
                case 6:
                    cadena +="seis";
                    break;
                case 7:
                    cadena +="siete";
                    break;
                case 8:
                    cadena +="ocho";
                    break;
                case 9:
                    cadena +="nueve";
                    break;
            }
        }
        System.out.println(cadena);
    

        System.out.println("--------------------------");
       
        System.out.println("Ejercicio 19");
        System.out.println("Introduzca un número");
        int num = sc.nextInt();
        System.out.println("Menú\n" +
                            "----\n" +
                            "1. Calcular si es múltiplo de 2.\n" +
                            "2. Calcular si es múltiplo de 3.\n" +
                            "3. Calcular si es múltiplo de 5.\n" +
                            "0 Salir");
        int num2 = sc.nextInt();
        switch (num2){
            case 1:
                if(num%2==0){
                   System.out.println(num+" es múltiplo de 2"); 
                }else{
                   System.out.println(num+" es múltiplo de 2");  
                }
                break;
            case 2:
                if(num%3==0){
                   System.out.println(num+" es múltiplo de 3"); 
                }else{
                   System.out.println(num+" es múltiplo de 3");  
                }
                break;
            case 3:
                if(num%5==0){
                   System.out.println(num+" es múltiplo de 5"); 
                }else{
                   System.out.println(num+" es múltiplo de 5");  
                }
                break;
            case 0:
                break;
            default:
                System.out.println("Número introducido no válido");
                break;
        }
        
        
        
        System.out.println("--------------------------");
       
        System.out.println("Ejercicio 19");
        System.out.println("Introduzca un número");
        int num1 = sc.nextInt();
        System.out.println("Introduzca otro número");
        int num2 = sc.nextInt();
        System.out.println("Introduzca otro número más");
        int num3 = sc.nextInt();
        System.out.println("Menú\n" +
                            "----\n" +
                            "1. Buscar el mayor.\n" +
                            "2. Nuscar el menor.\n" +
                            "3. Comprobar si todos son iguales.\n" +
                            "4. Calcular la suma.\n" +
                            "5. Mostrar cuales son pares o impares.\n" +
                            "0 Salir");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                if(num1>num2 && num1>num3){
                    System.out.println("El número mayor es el "+num1);
                }else if(num2>num1 && num2>num3){
                    System.out.println("El número mayor es el "+num2);
                }else{
                    System.out.println("El número mayor es el "+num3);
                }
                break;
            case 2:
                if(num1<num2 && num1<3){
                    System.out.println("El número menor es el "+num1);
                }else if(num2<num1 && num2<3){
                    System.out.println("El número menor es el "+num2);
                }else{
                    System.out.println("El número menor es el "+num3);
                }
                break;
            case 3:
                if(num1==num2 && num2==num3){
                    System.out.println("Todos los números son iguales");
                }else{
                    System.out.println("Todos los números no son iguales");
                }
                break;
            case 4:
                System.out.println("La suma de todos los números es: "+(num1+num2+num3));
                break;
            case 5:
                if(num1%2==0){
                   System.out.println(num1+" es par"); 
                }else{
                   System.out.println(num1+" es impar"); 
                }
                if(num2%2==0){
                   System.out.println(num2+" es par"); 
                }else{
                   System.out.println(num2+" es impar"); 
                }
                if(num3%2==0){
                   System.out.println(num3+" es par"); 
                }else{
                   System.out.println(num3+" es impar"); 
                }
                break;
            case 0:
                break;
            default:
                System.out.println("Número introducido no válido");
                break;
        }

*/
    }
        
}