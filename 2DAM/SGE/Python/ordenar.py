#Pedimos 3 números
num1 = int(input("Introduza el primer numero\n"))
num2 = int(input("Introduza el segundo numero\n"))
num3 = int(input("Introduza el tercer numero\n"))

#Ordenamos los numeros y devolvemos el menos, y ordenados
numeros = [num1, num2, num3]
print("Menor:"+str(numeros[1]))

print("Orden ascendente")
for i in range(0,len(numeros)):
    print(str(numeros[i]))

print("Orden descendente")
for i in range(len(numeros),0):
    print(str(numeros[i]))

