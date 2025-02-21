cadena = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme"
print(cadena+"\n")

#Muestra el tamaño de la cadena
print("Tamaño de la cadena: "+str(len(cadena))+"\n")

#Muestra los primeros 5 caracteres
print("Primeros 5 caracteres: "+cadena[:5]+"\n")

#Muestra los últimos 10 caracteres
print("Últimos 10 caracteres: "+cadena[len(cadena)-10:]+"\n")

#En los 10 primeros caracteres, los que ocupan posiciones pares
print("Caracteres pares de los 10 primeros caracteres: "+cadena[:10:2]+"\n")

#En los últimos 13 caracteres, los que ocupan posiciones múltiplos de 3
print("Caracteres múltiplos de 3 de los últimos 13 caracteres: "+cadena[len(cadena)-13::3]+"\n")

#¿Existe la subcadena “ue”? ¿dónde?
mostrar = "¿Existe la subcadena “ue”?"
if "ue" in cadena:
    mostrar+= " Sí, en la posición: "+str(cadena.find("ue"))
else:
    mostrar+= " No"
print(mostrar+"\n")

#¿Existe el carácter “M” en mayúscula?¿Y el carácter “h” en minúscula?
buscarM = "¿Existe el carácter “M” en mayúscula?"
buscarh = "¿Y el carácter “h” en minúscula?"

    #Buscamos M
if "M" in cadena:
    buscarM+= " Sí, en la posición: "+str(cadena.find("M"))
else:
    buscarM+= " No"
print(buscarM)

    #Buscamos h
if "h" in cadena:
    buscarh+= " Sí, en la posición: "+str(cadena.find("h"))
else:
    buscarh+= " No"
print(buscarh+"\n")

#Muestra los caracteres 4-10 en mayúscula
print("Caracteres 4-10 en mayúscula: "+cadena[4:10].upper()+"\n")


