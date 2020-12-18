print("Programa que le pide al usuario ingresar un numero de cuatro cifras para luego imprimirlo al reves")
print()

num = int(input("Ingrese un numero de cuatro cifras: "))

while True:
    if num < 1000 or num > 9999:
        print("ERROR RECUERDA QUE DEBE SER DE CUATRO CIFRAS")
        num = int(input("Ingrese un numero de cuatro cifras: "))
    else:
        break

c4 = num % 10
c3 = int((num % 100) / 10)
c2 = int((num % 1000) / 100)
c1 = int((num - (num % 1000)) / 1000)

print(str(c4) + str(c3) + str(c2) + str(c1))