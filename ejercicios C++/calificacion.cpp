#include <iostream>

using namespace std;
	
int main()
{
	cout << "***PROGRAMA QUE RECIBE CUATRO CALIFICACIONES, Y LE DEVUELVE EL PROMEDIO, LA NOTA MAS ALTA Y LAS PEQUEÑA***" << endl;
	
	float not1, not2, not3, not4, prom;
	
	// PIDE AL USUARIO INGRESAR UNA NOTA DEL 1 AL 10
	
	cout << "\n Ingrese primer nota: ";
	cin >> not1;
	while(not1 > 10 || not1 < 1)
	{
		cout << "\n Por favor ingrese una nota del 1 al 10: ";
		cin >> not1;
	}
	
	cout << "\n Ingrese segunda nota: ";
	cin >> not2;
	while(not2 > 10 || not2 < 1)
	{
		cout << "\n Por favor ingrese una nota del 1 al 10: ";
		cin >> not2;
	}
	
	cout << "\n Ingrese tercera nota: ";
	cin >> not3;
	while(not3 > 10 || not3 < 1)
	{
		cout << "\n Por favor ingrese una nota del 1 al 10: ";
		cin >> not3;
	}
	
	cout << "\n Ingrese cuarta nota: ";
	cin >> not4;
	while(not4 > 10 || not4 < 1)
	{
		cout << "\n Por favor ingrese una nota del 1 al 10: ";
		cin >> not4;
	}
	
	// EVALUA LA MAYOR NOTA
	
	if(not1 >= not2 && not1 >= not3 && not1 >= not4)
	{
		cout << "\n Mayor nota: " << not1;
	}
	if(not2 > not1 && not2 > not3 && not2 > not4)
	{
		cout << "\n Mayor nota: " << not2;
	}
	if(not3 >= not1 && not3 >= not2 && not3 >= not4)
	{
		cout << "\n Mayor nota: " << not3;
	}
	if(not4 >= not1 && not4 >= not2 && not4 >= not3)
	{
		cout << "\n Mayor nota: " << not4;
	}
	
	// EVALUA LA MENOR NOTA
	
	
	if(not1 <= not2 && not1 <= not3 && not1 <= not4)
	{
		cout << "\n Menor nota: " << not1;
	}
	if(not2 < not1 && not2 < not3 && not2 < not4)
	{
		cout << "\n Menor nota: " << not2;
	}
	if(not3 < not1 && not3 < not2 && not3 < not4)
	{
		cout << "\n Menor nota: " << not3;
	}
	if(not4 < not1 && not4 < not2 && not4 < not3)
	{
		cout << "\n Menor nota: " << not4;
	}
	
	prom = (not1 + not2 + not3 + not4) / 4;
		
	cout << "\n Tu promedio es: " << prom;
	
	return 0;
}
