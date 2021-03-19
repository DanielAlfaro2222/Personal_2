#include <iostream>

using namespace std;

int main()
{
	float  emp, usuario, num1, num2, suma, resta, multi, div;
	
	suma = 1;
	resta = 2;
	multi = 3;
	div = 4;
	emp = 5;
	
	cout << "***Programa que realiza operaciones aritmeticas basicas***" << endl;
	
	while(true)
	{
		cout  << endl << endl << "Presione 5 para empezar o 6 para salir:  ";
		cin >> usuario;
		if(usuario == 5)
		{
			cout << endl << suma << "-para sumar" << endl;
			cout << resta << "-para restar" << endl;
			cout << multi << "-para multiplicar" << endl;
			cout << div << "-para dividir" << endl;
			cout << endl << "Eliga que operacion quiere realizar: "; 
			cin >> usuario;;
	
			cout << endl << "Ingresa primer numero: ";
			cin >> num1;
	
			cout << endl <<  "Ingresa segundo numero: ";
			cin >> num2;
	
			if(usuario == 1)
			{
				cout << endl << "el resultado es " << (num1 + num2) << endl;
				cout << endl << "Proceso seleccionado: suma";
			}
			if(usuario == 2)
			{
				cout << endl << "el resultado es " << (num1 - num2) << endl;
				cout << endl << "Proceso seleccionado: resta";
			}
			if(usuario == 3)
			{
				cout << endl << "el resultado es " << (num1 * num2) << endl;
				cout << endl << "Proceso seleccionado: multiplicacion";
			}
			if(usuario == 4)
			{
				cout << endl << "el resultado es " << (num1 / num2) << endl;
				cout << endl << "Proceso seleccionado: division";
			}
		}
		if(usuario == 6)
		{
			break;
		}
	}
	
	return 0;
}
