#include <iostream>

using namespace std;

int main()
{
	cout << "***PROGRAMA QUE LE PIDE AL USUARIO QUE INGRESE DIA/S, HORA/S, MINUTO/S Y DEVUELVE CUANTOS SEGUNDOS HAY EN CADA UNO " << endl;
	
	
	int dia, minuto, hora, a, b, c, d, e, f;
	
	dia = 86400;
	minuto = 60;
	hora = 3600;
	
	cout << endl <<  "Ingrese cuantos dias quiere pasar a segundos: ";
	cin >> a;
	
	b = dia * a;
	
	cout << endl <<  "Ingrese cuantos horas quiere pasar a segundos: ";
	cin >> c;
	
	d = hora * c;
	
	cout << endl <<  "Ingrese cuantos minutos quiere pasar a segundos: ";
	cin >> e;
	
	f = minuto * e;
	
	cout << endl << a << " Dias son: " << b;
	cout << endl << c << " Horas son: " << d;
	cout << endl << e << " Minutos son: " << f;
	
	return 0;
	
}
