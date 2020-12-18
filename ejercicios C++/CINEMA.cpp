#include <iostream>

using namespace std;

int main()
{
	cout << "***PROGRAMA QUE IMPRIME LA LISTA DE PELICULAS Y SI EL USUARIO COMPRA LAS DOS DE MENOR PRECIO DEJA COMPRAR UNA TERCERA E IMPRIME EL TOTAL A PAGAR***" << endl;
	
	float A, B, C, D, E, PEL1, PEL2, PEL3, W, f, g, h, i;
	
	A = 4.229;
	B = 1.567;
	C = 3.299;
	D = 5.322;
	E = 2.111;
	
	cout << endl << " PELICULAS DISPONIBLES " << endl;
	
	cout << " 1-AVENGER ENDGAME " << "                    $" << A << endl;
	cout << " 2-GOL " << "                                $" << B << endl;
	cout << " 3-DONDE ESTA EL FANTASMA " << "             $" << C << endl;
	cout << " 4-THOR  " << "                              $" << D << endl;
	cout << " 5-THE BIG BANG THEORY " << "                $" << E << endl;
	
	cout << endl << "Ingrese el numero de la pelicula que desea llevar: ";
	cin >> PEL1;
	
	cout << endl << "Ingrese el numero de la pelicula que desea llevar: ";
	cin >> PEL2;
	
	if(PEL1 == 2 && PEL2 ==5)
	{
		cout << endl << "Felicidades por la compra de las dos peliculas anteriores puede comprar otra ingrese el numero de la pelicula que desea llevar: ";
		cin >> PEL3;
		if(PEL3 == 1)
		{
			float W = B + E + A;
			cout << endl << "TOTAL A PAGAR: " << W;
		}
		if(PEL3 == 2)
		{
			float f = B + E + B;
			cout << endl << "TOTAL A PAGAR: " << f;
		}
		if(PEL3 == 3)
		{
			float g = B + E + C;
			cout << endl << "TOTAL A PAGAR: " << g;
		}
		if(PEL3 == 4)
		{
			float h = B + E + D;
			cout << endl << "TOTAL A PAGAR: " << h;
		}
		if(PEL3 == 5)
		{
			float i = B + E + E;
			cout << endl << "TOTAL A PAGAR: " << i;
		}
	}
	
	if(PEL1 == 5 && PEL2 ==2)
	{
		cout << endl << "Felicidades por la compra de las dos peliculas anteriores puede comprar otra ingrese el numero de la pelicula que desea llevar: ";
		cin >> PEL3;
		if(PEL3 == 1)
		{
			float W = B + E + A;
			cout << endl << "TOTAL A PAGAR: " << W;
		}
		if(PEL3 == 2)
		{
			float f = B + E + B;
			cout << endl << "TOTAL A PAGAR: " << f;
		}
		if(PEL3 == 3)
		{
			float g = B + E + C;
			cout << endl << "TOTAL A PAGAR: " << g;
		}
		if(PEL3 == 4)
		{
			float h = B + E + D;
			cout << endl << "TOTAL A PAGAR: " << h;
		}
		if(PEL3 == 5)
		{
			float i = B + E + E;
			cout << endl << "TOTAL A PAGAR: " << i;
		}
	}
	
	if(PEL1 == 1 && PEL2 == 2)
	{
		float j = A + B;
		cout << endl << "TOTAL A PAGAR: " << j;
	}
	if(PEL1 == 1 && PEL2 == 3)
	{
		float k = A + C;
		cout << endl << "TOTAL A PAGAR: " << k;
	}
	if(PEL1 == 1 && PEL2 == 4)
	{
		float l = A + D;
		cout << endl << "TOTAL A PAGAR: " << l;
	}
	if(PEL1 == 1 && PEL2 == 5)
	{
		float m = A + E;
		cout << endl << "TOTAL A PAGAR: " << m;
	}
	
	
	if(PEL1 == 2 && PEL2 == 1)
	{
		float z = A + B;
		cout << endl << "TOTAL A PAGAR: " << z;
	}
	if(PEL1 == 2 && PEL2 == 3)
	{
		float n = B + C;
		cout << endl << "TOTAL A PAGAR: " << n;
	}
	if(PEL1 == 2 && PEL2 == 4)
	{
		float x = B + D;
		cout << endl << "TOTAL A PAGAR: " << x;
	}
	
	
	if(PEL1 == 3 && PEL2 == 1)
	{
		float v = C + A;
		cout << endl << "TOTAL A PAGAR: " << v;
	}
	if(PEL1 == 3 && PEL2 == 2)
	{
		float J = C + B;
		cout << endl << "TOTAL A PAGAR: " << J;
	}
	if(PEL1 == 3 && PEL2 == 4)
	{
		float K = C + D;
		cout << endl << "TOTAL A PAGAR: " << K;
	}
	if(PEL1 == 3 && PEL2 == 5)
	{
		float M = E + C;
		cout << endl << "TOTAL A PAGAR: " << M;
	}
	
	
	if(PEL1 == 4 && PEL2 == 1)
	{
		float W = D + A;
		cout << endl << "TOTAL A PAGAR: " << W;
	}
	if(PEL1 == 4 && PEL2 == 2)
	{
		float Q = D + B;
		cout << endl << "TOTAL A PAGAR: " << Q;
	}
	if(PEL1 == 4 && PEL2 == 3)
	{
		float R = D + C;
		cout << endl << "TOTAL A PAGAR: " << R;
	}
	if(PEL1 == 4 && PEL2 == 5)
	{
		float L = D + E;
		cout << endl << "TOTAL A PAGAR: " << L;
	}
	
	
	if(PEL1 == 5 && PEL2 == 1)
	{
		float G = E + A;
		cout << endl << "TOTAL A PAGAR: " << G;
	}
	if(PEL1 == 5 && PEL2 == 3)
	{
		float Y = E + C;
		cout << endl << "TOTAL A PAGAR: " << Y;
	}
	if(PEL1 == 4 && PEL2 == 5)
	{
		float U = D + E;
		cout << endl << "TOTAL A PAGAR: " << U;
	}
	
	return 0;
}

