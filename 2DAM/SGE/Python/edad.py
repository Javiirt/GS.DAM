#Pedimos el año de nacimiento
num = input("Introduzca su año de nacimiento\n")
#Convertimos a int
num = int(num)
#Calculamos la edad y convertimos a cadena
num = str(2023-num)
#Devolvemos la edad
print("Usted tiene "+ num + " años")