#Pedimos un numero para saber si es primo o no
numero = int(input("Introduzca un numero para saber si es primo\n"))

#Definimos variables
primo = True
cadena = "Primos entre 2 y "+str(numero)+" :"

#Comprobamos si el numero es primo
for i in range(2,(numero)):
    if numero%i==0:
        primo=False

    #Comprobamos si el número del bucle es primo
    subPrimo = True
    for j in range (2,i):
        if i%j==0:
            subPrimo=False
    #En caso de ser primo lo añadimos a una cadena    
    if subPrimo:
        cadena += str(i)+" "


#Mostramos si el numero introducido es primo o no 
if primo:
    print(str(numero)+" es primo")
    #En el caso de ser primo, muestra los primos entre el 2 y el número
    print(cadena+str(numero))

else:
    print(str(numero)+" no es primo")


