#include <iostream>

using namespace std;

int main()
{
	float miarreglo[7];
	
	
	cout << "Escribe tus calificaciones: ";
	
	
	for(int i = 0; i < 7; i++)
	{
		cin >> miarreglo[i];
	}
	
	int a =0;
	while(a < 7)
	{
		cout << endl << miarreglo[a] << endl;
		a++;
	}
	
	
	return 0;
}
