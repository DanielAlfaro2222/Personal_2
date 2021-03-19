#include <iostream>

using namespace std;

int main()
{
	int i, a;
	
	cout << "Ingresa un numero: ";
	cin >> a;
	
	for(i = a ;i >= 1;i-= 1)  //el ciclo for empieza en i= lo que quiera el usuario; 
	{
		cout << i << endl;
	}
	
	return 0;
}
