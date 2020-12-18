print("Programa que le pide al usuario ingresar un numero y el programa le imprime una piramide segun el numero que escriba")
print()

num = int(input("Ingrese un numero: "))

while True:
    if num < 1 or num > 10:
        print()
        print("Error, por favor ingrese un numero del 1 al 10")
        num = int(input("Ingrese un numero: "))
    else:
        break

if num == 1:
    print("1")
elif num == 2:
    print("1")
    print("22")
elif num == 3:
    print("1")
    print("22")
    print("333")
elif num == 4:
    print("1")
    print("22")
    print("333")
    print("4444")
elif num == 5:
    print("1")
    print("22")
    print("333")
    print("4444")
    print("55555")
elif num == 6:
    print("1")
    print("22")
    print("333")
    print("4444")
    print("55555")
    print("666666")
elif num == 7:
    print("1")
    print("22")
    print("333")
    print("4444")
    print("55555")
    print("666666")
    print("7777777")
elif num == 8:
    print("1")
    print("22")
    print("333")
    print("4444")
    print("55555")
    print("666666")
    print("7777777")
    print("88888888")
elif num == 9:
    print("1")
    print("22")
    print("333")
    print("4444")
    print("55555")
    print("666666")
    print("7777777")
    print("88888888")
    print("999999999")
elif num == 10:
    print("1")
    print("22")
    print("333")
    print("4444")
    print("55555")
    print("666666")
    print("7777777")
    print("88888888")
    print("999999999")
    print("10101010101010101010")