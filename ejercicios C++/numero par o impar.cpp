#include <iostream>

using namespace std;

int main()
{
	int n;
	
	
	cout << "***Programa que mira si un numero es par o impar***" <<endl;
	
	cout << "Introduzca el numero: ";
	cin >> n;
	
	if(n % 2 ==0)
	{
	cout<<"Es par ";
	}
	else
	{
	cout<<"Es impar ";
	}
	
	return 0;
}
