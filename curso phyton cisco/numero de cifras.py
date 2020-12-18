print("Programa que le pide al usuario ingresar un numero para luego imprimir el numero de digitos")

print()

num = int(input("Ingrese un numero: "))

if num <= 9 and num >= -9:
    print("Se necesita un digito")
elif num <= -10 and num >= -99 or num >= 10 and num <= 99:
    print("Se necesita dos digitos")
elif num <= -100 and num >= -999 or num >= 100 and num <= 999:
    print("Se necesita tres digitos")
elif num <= -1000 and num >= -9999 or num >= 1000 and num <= 9999:
    print("Se necesita cuatro digitos")