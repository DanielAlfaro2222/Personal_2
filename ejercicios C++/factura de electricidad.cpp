#include <iostream>

using namespace std;

int main()
{
	float cuenta_1, cuenta_2, cuenta_3, tarifa_1, tarifa_2, tarifa_3,a,b,c;
	
	
	tarifa_1 = 140;
	tarifa_2 = 170;
	tarifa_3 = 310;
	
	cuenta_1 = 139;
	cuenta_2 = 150;
	cuenta_3 = 315;
	
	a = cuenta_1 * 3.20;
	b = a + 1.5;
	c = a + (175 * 0.06);
	
	if(cuenta_1 <= tarifa_1)
	{
		cout << endl <<  "habiente 1 |" << " total consumido:" << cuenta_1 << " | total a pagar: " << a; 
	}
	if(cuenta_2 > 141 && cuenta_2 <= tarifa_2 )
	{
		cout << endl << "habiente 2 |" << " total consumido:" << cuenta_2 << " | total a pagar: " << b; 
	}
	if(cuenta_3 > 171 && cuenta_3 >= tarifa_3 )
	{
		cout << endl << "habiente 3 |" << " total consumido:" << cuenta_3 << " | total a pagar: " << c; 
	}
	
	return 0;
}
