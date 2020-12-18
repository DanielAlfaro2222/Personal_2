print("""Programa que recibe como dato de entrada una hora expresada horas, minutos y
segundos y escribe la nueva hora transcurrido 1 segundo. Controlar el valor de las
entradas""")

print()

hora = int(input("Ingrese la hora: "))
while hora < 1 or hora > 12:
    print("Error por favor ingrese una hora valida")
    hora = int(input("Ingrese la hora: "))

minutos = int(input("Ingrese los minutos: "))
while minutos < 0 or minutos > 59:
    print("Error por favor ingrese una hora valida")
    minutos = int(input("Ingrese los minutos: "))

segundos = int(input("Ingrese los segundos: "))
while segundos < 0 or segundos > 59:
    print("Error por favor ingrese una hora valida")
    segundos = int(input("Ingrese los segundos: "))

if segundos + 1 != 60:
    segundos += 1
    print("HORA: ", hora, ":", minutos, ":",segundos)
else:
    segundos = str("00")
    if minutos + 1 != 60:
        minutos += 1
    else:
        minutos = str("00")
        if hora + 1 != 13:
            hora += 1
        else:
            hora = str("01")
    print("HORA: ", hora, ":", minutos, ":",segundos)       