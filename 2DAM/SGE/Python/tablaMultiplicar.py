
#Definimos la variable
entrada = input("Introduzca un numero para saber su tabla de multiplicar\n")

#Mientras metas no metas un número válido te pedirá número
while entrada.isdigit() == False or entrada=="0":
    print("Valor introducido no válido")
    entrada = input("Introduzca un numero para saber su tabla de multiplicar\n")

#Muestra la tala de multiplicar
entrada = int(entrada)
for i in range (1,11):
    print(str(entrada)+"x"+str(i)+"="+str(i*entrada))