#include <iostream>

using namespace std;

int mayor(int num1, int num2);

int main()
{
	int num1, num2, ret;
	
	cout << "***Programa que compara dos numeros e imprime el mayor***" << endl;
	
	cout << "Ingrese primer numero: ";
	cin >> num1;
	
	cout << endl << "Ingrese segundo numero: ";
	cin >> num2;
	
	ret = mayor(num1,num2);
	
	cout << endl << "El numero mayor es: " << ret;
	
	return 0;	
}

int mayor(int num1, int num2)
{
	int resultado;
	
	if(num1 > num2)
	{
		resultado = num1;
	}
	else
	{
		resultado = num2;
	}
	
	return resultado;
}
