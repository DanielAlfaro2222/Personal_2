#Tienen 31 días: Enero, marzo, mayo, julio, agosto, octubre y diciembre.
#Tienen 30 días: Abril, junio, septiembre y noviembre.
#Tienen 28 días: Febrero.

print("Programa que pide una fecha y el programa le devuelve la fecha del dia siguiente")
print()

dia = int(input("Ingrese el dia: "))

while True:
    if dia <= 0 or dia > 31:
        print()
        print("Fecha incorrecta un mes tiene maximo 31 dias") 
        dia = int(input("Ingrese el dia: "))
    else:
        break

mes = int(input("Ingrese el mes: "))
while True:
    if mes <= 0 or mes > 12:
        print()
        print("Fecha incorrecta un año tiene 12 meses") 
        mes = int(input("Ingrese el mes: "))
    else:
        break

año = int(input("Ingrese el año: "))

if mes == 1 or mes == 3 or mes == 5 or mes == 7 or mes == 8 or mes == 10 or mes == 12:
    if dia == 31:
        dia = 1
        if mes == 12:
            año += 1
            mes = 1
        else:
            mes += 1
    else:
        dia += 1
    print()
    print("Fecha: ", dia,":", mes, ":", año)
        
elif mes == 4 or mes == 6 or mes == 9 or mes == 11:
    if dia != 30 and dia != 31:
        dia += 1
    else:
        dia = 1
        mes += 1
    print()
    print("Fecha: ", dia, ":", mes, ":",año)
elif mes == 2:
    if dia != 28 and dia < 28:
        dia += 1
    else:
        dia = 1
        mes += 1
    print()
    print("Fecha: ", dia, ":", mes, ":",año)