#include <iostream>
#include <string>      

using namespace std;

int main()
{
	string miarreglo[7];                               //DEFINIR QUE TIPO DE VARIABLE VA A CONTENER EL ARREGLO Y CUANTAS [7] VARIABLES VA A CONTENER
	
	cout << "Escriba nombres de personas: ";
	
	for(int i=0; i<7; i++)                            //ESTE BUCLE FOR VA A RECORRER NUESTRO ARREGLO PRIMERO EMPIEZA DESDE EL 0, SEGUNDO VA A TERMINAR ANTES DEL 7 Y TERCERO VA IR DE 1 EN 1
	{
		cin >> miarreglo[i];                         //EL ARREGLO VA A CONTENER LAS PALABRAS QUE VA A INGRESAR EL USUARIO
	}
	int a = 0;
	
	while(a < 7)                                     //AHORA VAMOS A IMPRIMIR LO QUE CONTIENE EL ARREGLO, IMPRIME PRIMERO LO QUE HAY EN LA POSICION 0 HASTA LA 6 CONSTANTEMENTE SE VA A EJECUTAR HASTA QUE LLEGA A LO QUE HAY EN LA POSICION 6 AHI PARA
	{
		cout << endl << miarreglo[a] << endl;
		a++;
	}
	
}
