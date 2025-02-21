import java.util.Scanner;
public class Cadenas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 /*       
        System.out.println("Ejercicio 1");
        System.out.println("Introduzca una cadena");
        String cad = sc.nextLine();
        for(int i=0; i<cad.length(); i++){
            if(cad.charAt(i)==' '){
                System.out.println();
            }else{
                System.out.print(cad.charAt(i));
            }
        }
        System.out.println();
        
        
        System.out.println("Ejercicio 2");
        System.out.println("Introduzca una cadena");
        String cadena = sc.nextLine();
        System.out.println("Introduzca un número");
        int num = sc.nextInt();
        if(cadena.length()>=num-1){
            System.out.println(cadena.charAt(num-1));
        }else{
            System.out.println("ERROR");
        }
                
        
       
        System.out.println("Ejercicio 3");
        String repetir;
        sc.nextLine();
        System.out.println("Introduzca su contraseña");
        String contraseña = sc.nextLine();        
        do{
            System.out.println("Repita su contraseña");
            repetir = sc.nextLine();
        }while(!contraseña.equals(repetir));
        

        
	System.out.println("Ejercicio 4");
        System.out.println("Introduzca su nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduzca su primer apellido");
        String apellido1 = sc.nextLine();
        System.out.println("Introduzca su segundo apellido");
        String apellido2 = sc.nextLine();
        String usuario = nombre.charAt(0)+apellido1.substring(0,3)+apellido2.substring(0,3);
        System.out.println("Su usuario es "+usuario.toUpperCase());
        
        
       
        
        System.out.println("Ejercicio 5");
        System.out.println("Introduzca una cadena");
        String repeticion = sc.nextLine(); 
        System.out.println("Introduzca el número de veces que la quieres repetir");
        int lineas = sc.nextInt(); 
        for(int i=0; i<lineas; i++){
            if(i%2==0){
                System.out.println(repeticion.toUpperCase());
            }else{
                System.out.println(repeticion.toLowerCase());
            }
        }
        
    
 
 
        System.out.println("Ejercicio 6");
        System.out.println("Introduzca un nombre");
        String nombre1 = sc.nextLine();
        System.out.println("Introduzca otro nombre");
        String nombre2 = sc.nextLine();
        if(nombre1.compareToIgnoreCase(nombre2)<0){
            System.out.println(nombre1);
            System.out.println(nombre2);
        }else{
            System.out.println(nombre2);
            System.out.println(nombre1);
        }
     
        
        
        System.out.println("Ejercicio 7");
        System.out.println("Introduzca el primer nombre");
        String nombre1 = sc.nextLine();
        System.out.println("Introduzca el segundo nombre");
        String nombre2 = sc.nextLine();
        System.out.println("Introduzca el tercer nombre");
        String nombre3 = sc.nextLine();
        
        if(nombre1.compareToIgnoreCase(nombre2)<0 && nombre1.compareToIgnoreCase(nombre3)<0){
            if(nombre1.compareToIgnoreCase(nombre3)<0){
                System.out.println(nombre1+", "+nombre2+" y "+nombre3);
            }else{
                System.out.println(nombre1+", "+nombre3+" y "+nombre2);
            }
        }else if(nombre2.compareToIgnoreCase(nombre3)<0){
            if(nombre1.compareToIgnoreCase(nombre3)<0){
                System.out.println(nombre2+", "+nombre1+" y "+nombre3);
            }else{
                System.out.println(nombre2+", "+nombre3+" y "+nombre1);
            }
        }else{
            if(nombre1.compareToIgnoreCase(nombre2)<0){
                System.out.println(nombre3+", "+nombre1+" y "+nombre2);
            }else{
                System.out.println(nombre3+", "+nombre2+" y "+nombre1);
            }
        }
 

        System.out.println("Ejercicio 8");
        System.out.println("Introduzca una cadena");
        String cad1 = sc.nextLine();
        System.out.println("Introduzca otra cadena");
        String cad2 = sc.nextLine();
        String cadLarga = "";
        int sobra=0;
        if(cad1.length()>cad2.length()){
            cadLarga = cad1;
            sobra= cad1.length()-cad2.length();            
        }else if(cad1.length()<cad2.length()){
            cadLarga = cad2;
            sobra= cad2.length()-cad1.length(); 
        }else{
            System.out.println("Ambas cadenas tienen la misma longitud");
        }
        if(sobra>0){
            System.out.println("La cadena más larga es: '"+cadLarga+"' con "+sobra+" caracteres de más");
        }
     
 
 
 
        System.out.println("Ejercicio 9");
        System.out.println("Introduzca una cadena");
        String cadena = sc.nextLine();
        cadena= cadena.toUpperCase();
        System.out.println("Introduzca una letra");
        char letra = sc.next().charAt(0);
        letra = Character.toUpperCase(letra);
        int contador=0;
        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i)==letra){
                contador++;
            }
        }
        System.out.println("La letra "+letra+" aparece "+contador+" veces en la cadena introducida");
      
        
       
        System.out.println("Ejercicio 10");
        System.out.println("Introduzca una cadena");
        String cadena = sc.nextLine();
        System.out.println("Introduzca la letra que quieres cambiar");
        char letra1 = sc.next().charAt(0);
        System.out.println("Introduzca la letra que sustituirá a la otra letra");
        char letra2 = sc.next().charAt(0);
        System.out.println(cadena.replace(letra1, letra2));
        
        
     
        
        
        System.out.println("Ejercicio 11");
        System.out.println("Introduzca una cadena");
        String cadena = sc.nextLine();
        cadena= cadena.toUpperCase();
        int vocalA=0, vocalE=0,vocalI=0,vocalO=0,vocalU=0;
        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i)=='A'){
                vocalA++;
            }
            if(cadena.charAt(i)=='E'){
                vocalE++;
            }
            if(cadena.charAt(i)=='I'){
                vocalI++;
            }
            if(cadena.charAt(i)=='O'){
                vocalO++;
            }
            if(cadena.charAt(i)=='U'){
                vocalU++;
            }
        }
        System.out.println("Hay un total de "+(vocalA+vocalE+vocalI+vocalO+vocalU)+" vocales \n"
                            + "Número de A: "+vocalA+"\n"
                            + "Número de E: "+vocalE+"\n"
                            + "Número de I: "+vocalI+"\n"
                            + "Número de O: "+vocalO+"\n"
                            + "Número de U: "+vocalU);


    
 
 
        System.out.println("Ejercicio 12");
        System.out.println("Introduzca una cadena");
        String cadena = sc.nextLine();
        System.out.println("Introduzca la letra que quieres eliminar");
        String letra = sc.nextLine();
        System.out.println(cadena.replaceAll(letra, ""));




        System.out.println("Ejercicio 13");
        System.out.println("Introduzca una palabra para saber si es un palíndromo");
        String fi = sc.nextLine();
        fi= fi.toLowerCase();
        String bi = "";
        for(int i=0; i<fi.length(); i++){
            bi+=fi.charAt(fi.length()-i-1);
        }
        if(fi.equals(bi)){
            System.out.println(fi+" es un palíndromo");
        }else{
            System.out.println(fi+" no es un palíndromo");
        }



        System.out.println("Ejercicio 14");
        System.out.println("Introduzca una frase para saber si es un palíndromo");
        String cadena = sc.nextLine();
        cadena= cadena.toLowerCase();
        String fi = "";
        String bi = "";
        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i)!=' '){
               fi+=cadena.charAt(i); 
            }        
        }
        for(int i=0; i<fi.length(); i++){
            bi+=fi.charAt(fi.length()-i-1);
        }

        if(fi.equals(bi)){
            System.out.println(cadena+" es un palíndromo");
        }else{
            System.out.println(cadena+" no es un palíndromo");
        }



        System.out.println("Ejercicio 15");
        System.out.println("Introduzca la primera cadena");
        String cad1 = sc.nextLine();
        System.out.println("Introduzca la segunda cadena");
        String cad2 = sc.nextLine();
        if(cad1.compareToIgnoreCase(cad2)<0){
            System.out.println(cad1+ " es mayor");
        }else if(cad1.compareToIgnoreCase(cad2)>0){
            System.out.println(cad2+ " es mayor ");
        }else{
            System.out.println("Ambas cadenas son iguales");
        }
        if(cad1.compareTo(cad2)<0){
            System.out.println(cad1+ " es mayor alfabéticamente");
        }else if(cad1.compareTo(cad2)>0){
            System.out.println(cad2+ " es mayor alfabéticamente");
        }else{
            System.out.println("Ambas cadenas son iguales alfabéticamente");
        }




        System.out.println("Ejercicio 16");
        System.out.println("Introduzca una cadena");
        String mensaje = sc.nextLine();
        for(int i=0; i<8 ; i++){
            for(int j=0; j<3; j++){
                System.out.println("\033["+j+";3"+i+"m"+mensaje);
            }
        }




        System.out.println("Ejercicio 17");
        System.out.println("Introduzca una cadena");
        String cadena = sc.nextLine();
        cadena= cadena.toLowerCase();
        System.out.println("¿Qué letra deseas buscar?");
        char letra = sc.next().charAt(0);
        int veces=0;
            for(int i=0; i<cadena.length(); i++){
                if(cadena.charAt(i)==letra){
                    veces++;
                }
            }
        System.out.println("La letra "+letra+" aparece por primera vez en la posición "+cadena.indexOf(letra)+", aparece un total de "+veces+" veces");






        System.out.println("Ejercicio 18");
        System.out.println("Introduzca una cadena");
        String cadena = sc.nextLine();
        cadena= cadena.toLowerCase();
        System.out.println("¿Qué palabra deseas buscar?");
        String palabra = sc.nextLine();
        palabra= palabra.toLowerCase();
        int contador=0;
        int longitud= palabra.length();
        do{
            if(cadena.indexOf(palabra)>-1){
                contador++;
                cadena=cadena.substring(cadena.indexOf(palabra)+longitud-1);
            }
        }while(cadena.indexOf(palabra)>0);
        System.out.println("La palabra "+palabra+" aparece un total de "+contador+" veces");




        System.out.println("Ejercicio 19");
        System.out.println("Introduzca una cadena");
        String cadena = sc.nextLine();
        System.out.println("Introduzca el final de la cadena");
        String fin = sc.nextLine();
        String cadenaReversa = "";
        String finReversa = "";
        boolean termina= true;
        for(int i=0; i<cadena.length(); i++){
            cadenaReversa+=cadena.charAt(cadena.length()-i-1);
        }
        for(int j=0; j<fin.length(); j++){
            finReversa+=fin.charAt(fin.length()-j-1);
        }
        for(int k=0; k<finReversa.length();k++){
            if(finReversa.charAt(k)!=cadenaReversa.charAt(k)){
                termina=false;
                break;
            }
        }
        if(termina){
            System.out.println("La cadena termina por "+fin);
        }else{
            System.out.println("La cadena no termina por "+fin);
        }

        

        System.out.println("Ejercicio 20");
        System.out.println("Introduzca una cadena");
        String cadena = sc.nextLine();
        System.out.println("Introduzca en cuántas partes quieres dividir la cadena");
        int partes = sc.nextInt();
        int caracteres = cadena.length()/partes;
        for(int i=0; i<cadena.length();i++){
            System.out.print(cadena.charAt(i));
            if((i+1)<partes*caracteres && (i+1)%caracteres==0){
                System.out.println();
            }
        }
        
        */
        
        
    }
    
}
