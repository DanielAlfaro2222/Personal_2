#include <iostream>

using namespace std;

int main()
{
	int total_a_pagar;
	
	float dias,valordia,dolarxdia;
	
	valordia = 29,260;
	dolarxdia =  valordia * 3.657,5125;
	total_a_pagar = (dias *valordia) * dolarxdia;
	
	cout << "***PROGRAMA QUE CALCULA CUANTO DINERO GANASTE EN EL MES ***" << endl;
	
	cout << "Introduzca cuantos dias trabajo: ";
	cin >> dias;
	
	cout << endl << "TU SUELDO EN DOLARES ES: " << total_a_pagar;
	
	return 0;
	
}
