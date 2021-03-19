#include <iostream>

using namespace std;

int main()
{
	cout << "***PROGRAMA QUE SOLUCIONA LA SIGUIENTE FORMULA ((A + B) / 2) * ((C * D) / A) + 1 " << endl;
	
	
	float a, b, c, d, e;
	
	cout << "\n INGRESE LA VARIABLE A: ";
	cin >> a;
	
	cout << "INGRESE LA VARIABLE B: ";
	cin >> b;
	
	cout << "INGRESE LA VARIABLE C: ";
	cin >> c;
	
	cout << "INGRESE LA VARIABLE D: ";
	cin >> d;
	
	if(a == 0)
	{
		cout << "\n EL PROGRAMA TERMINO ";
	}
	else
	{
		e = ((a + b) / 2) * ((c * d) / a) + 1;
		cout << "\n EL RESULTADO DE ESTA FORMULA ES: " << e;
	}
	
	return 0;
}
