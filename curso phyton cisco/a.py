def main():
    print("Programa que le pide al usuario tres numeros y le devuelve el promedio")
    num1 = int(input("Ingrese el primer numero: "))
    num2 = int(input("Ingrese el segundo numero: "))
    num3 = int(input("Ingrese el tercer numero: "))
    res = float(num1 + num2 + num3) / 3
    print("El resultado es: ",res)

if __name__ == '__main__':
    main()