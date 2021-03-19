def  main():
    print("PROGRAMA QUE SIMULA UNA CACULADORA \n")
    while(True):
        usuario = int(input("\n Por favor ingrese 1 para comenzar/realizar otra operacion o 2 para salir: "))
        
        while(usuario > 2 or usuario < 1):
            usuario = int(input("\n Por favor ingrese 1 para comenzar/realizar otra operacion o 2 para salir, no numeros mayores que 2 ni menores que 1: "))
       
        suma = int(1)
        resta = int(2)
        multi = int(3)
        div = int(4)

        if usuario == 1:
            print("""\n Operaciones que realiza la calculadora
                        1- es para suma
                        2- es para resta
                        3- es para multiplicar
                        4- es para dividir
            """)

            usuario = int(input("Por favor selecciona que operacion deseas realizar: "))

            while(usuario < 1 or usuario > 4):
                print("""\n Operaciones que realiza la calculadora
                        1- es para suma
                        2- es para resta
                        3- es para multiplicar
                        4- es para dividir
                """)
                usuario = int(input("\n Por favor ingrese un identificador valido de la operacion que desea realizar, deacuerdo al menu ya presentado anteriormente: "))
            
            if usuario == 1:
                num1 = int(input("\nIngrese el primer numero: "))
                num2 = int(input("Ingrese el segundo numero: "))
                print("\n El resultado de la suma es: ",num1 + num2)
            if usuario == 2:
                num1 = int(input("\nIngrese el primer numero: "))
                num2 = int(input("Ingrese el segundo numero: "))
                print("\n El resultado de la resta es: ",num1 - num2)
            if usuario == 3:
                num1 = int(input("\nIngrese el primer numero: "))
                num2 = int(input("Ingrese el segundo numero: "))
                print("\n El resultado de la multiplicacion es: ",num1 * num2)
            if usuario == 4:
                num1 = float(input("\nIngrese el primer numero: "))
                num2 = float(input("Ingrese el segundo numero: "))
                print("\n El resultado de la division es: ",num1 / num2)
        else:
            break

if __name__ == '__main__': 
    main()