#include <iostream>

using namespace std;

int main()
{
	cout << "***PROGRAMA QUE PIDE AL USUARIO INGRESAR DOS NUMEROS Y LE DICE SI ES O NO DIVISOR UNO DE OTRO***" << endl;
	
	int num1, num2;
	
	cout << "Ingrese primer numero: ";
	cin >> num1;
	
	cout << endl << "Ingrese el segundo numero: ";
	cin >> num2;
	
	if(num1 / num2 == 0)
	{
		cout << num1 << " Si es divisor de " << num2;
	}
	else
	{
		cout << num1 << " No es divisor de " << num2;
	}
	
	return 0;
}
