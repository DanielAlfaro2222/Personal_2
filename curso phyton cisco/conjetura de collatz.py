print("Programa que realiza la conjetura de collatz \n")

n = int(input("Ingrese un numero: "))

pasos = 1 

print(n)

while True:
    if n != 1:
        if n % 2 == 0:
            n = float(n / 2)
            print(n)
            pasos += 1
        elif n % 2 != 0:
            n = int((n *3) + 1)
            print(n)
            pasos += 1
    else:
        print()
        print("Numeros de pasos para llegar a 1: ", pasos)
        break