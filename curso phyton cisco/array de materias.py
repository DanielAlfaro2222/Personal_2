print("Programa que le pide al usuario ingresar 8 materias para guardarlas en un array y luego mostrar el array")
print()

array = []

for i in range (0, 8):
    materias = str(input("Ingrese las 8 materias: "))
    array.append(materias)

print()
print(array)