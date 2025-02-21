#Definimos la variable
entrada = input("Introduzca un numero para saber su factorial\n")

#Mientras metas algún numero entra al bucle
while entrada!="":
    
    #Pedimos un numero para saber su factorial
    numero = int(entrada)
    factorial = 1

    #Comprueba que el numero sea > 0
    if numero>0: 

        #Bucle para multiplicar los numeros de 1 a n
        for i in range(2,numero+1):
            factorial*=i

        #Mostramos el factorial por pantalla
        print("Factorial de "+str(numero)+": "+str(factorial))

    #Si el valor no es valido muestra un mensaje
    else:
        print("valor no valido")
        
    #Vuelve a preguntar un número
    entrada = input("Introduzca un numero para saber su factorial\n")

#Muestra un mensaje de salida    
print("exit")
