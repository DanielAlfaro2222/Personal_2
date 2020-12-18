#include <iostream>

using namespace std;

void conjetura(int x)
{
	cout << x << ",";
	if(x > 1)
	{
		if(x % 2 == 0)
		{
			conjetura(x / 2);
		}
		else
		{
			conjetura(x + x + x + 1);
		}
	}
	
}

int main()
{
	cout << "***PROGRAMA QUE REALIZA LA CONJETURA DE COLLATZ***" << endl;
	
	int x;
	
	cout << " \n Ingrese el numero para empezar la conjetura de collatz: ";
	cin >> x;
	conjetura(x);
	
	
	return 0;
}
