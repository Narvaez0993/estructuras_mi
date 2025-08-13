import random

n = 3

#crear la matriz
matriz = []
for i in range(n):
    matriz.append([])
    for j in range(n):
        matriz[i].append(random.randint(0, 20))

print(matriz)


#Buscar un numero en la matriz

numero = int(input("Ingrese un numero: "))

for i in range(n):
    for j in range(n):
        if matriz[i][j] == numero:
            print(f"El numero {numero} se encuentra en la posicion {i}, {j}")




