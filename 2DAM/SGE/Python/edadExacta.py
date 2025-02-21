#importamos la libreria datetime para obtener la fecha actual
import datetime

#Pedimos la fecha de nacimiento
dia = int(input("Introduzca su dia de nacimiento\n"))
mes = int(input("Introduzca su mes de nacimiento\n"))
anio = int(input("Introduzca su año de nacimiento\n"))

#Calculamos la edad 
fechaActual = datetime.datetime.now()
edad = fechaActual.year-anio

#Si el mes es mayor al mes actual, se resta un año
if mes > fechaActual.month:
    edad = edad-1

#Si el mes coincide con el mes actual pero el dia
#es mayor a la fecha actual, se resta un año   
if mes == fechaActual.month and dia > fechaActual.day :   
    edad = edad-1
    
#Convertimos a cadena    
edad = str(edad)

#Devolvemos la edad
print("Usted tiene "+ edad + " años")