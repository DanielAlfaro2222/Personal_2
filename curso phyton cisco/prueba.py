def main():
    print("PROGRAMA QUE LE PIDE INGRESAR AL USUARIO UN NUMERO Y LUEGO IMPRIME LOS CONSECUTIVOS HASTA 20 \n ")
    num1 = int(input("Ingrese un numero: "))
    num2 = int(0)
    while(True):
        num2 += 1
        print("\n",num2)
        if num2 >= num1:
            break
    
    

if __name__ == '__main__':
    main()