#crear lista
r = int(input("ingrese su numero: "))
lista = [r]

#solicitar al usuario que ingrese numeros hasta que ingrese -1
while True:
    r = int(input("ingrese otro numero (o '-1' para terminar): "))
    if r==-1:
        break
    lista.append(r)
#imprimir la lista
print(lista)

#mostrar la cantidad de elementos de la lista
n=len(lista)
print("el numero total de elementos es: ", n)

#mostrar la suma de todos los elementos de la lista
suma = sum(lista)
print("la suma de todos los elementos es: ", suma)

#mostrar el promedio de los elementos de la lista
promedio = sum(lista) / n
print("el promedio de los elementos es: ", promedio)

#mostrar el maximo y el minimo de la lista
maximo = max(lista)
minimo = min(lista)
print("el numero maximo es: ", maximo)
print("el numero minimo es: ", minimo)