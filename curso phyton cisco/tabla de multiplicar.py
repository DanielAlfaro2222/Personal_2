print("Programa que le pide al usuario un numero y el programa le devuelve la tabla de multiplicar de dicho numero \n")

n = int(input("Ingrese un numero: "))
e = 0  #esta variable va a ser los numeros del 1 al 10 de la tabla 

for i in range(1,11):
    e += 1 #esto recorre la tabla del 1 al 10 
    res = n * e
    print(n, "X", e, "=", res)