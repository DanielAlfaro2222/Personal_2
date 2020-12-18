#include <iostream>

using namespace std;

int main()
{
	cout << "***Programa que calcula mi sueldo en dias o en horas***" << endl;
	
	 float valorh, valord, usuario1, usuario2;
	
	cout << endl << "Eliga 1 para ingresar cuantas horas trabajo o 2 para cuantos dias trabajo: ";
	cin >> usuario1;
	
	if(usuario1 == 1)
	{
		cout << endl << "Cuantas horas trabajo: ";
		cin >> usuario1;
		
		cout << endl << "Cuanto vale la hora  en pesos: ";
		cin >> valorh;
		
		float hora;
		
		hora = (usuario2 * valorh);
		
		cout << endl << "Tu sueldo por las horas trabajadas es: " << hora << endl;
	}
	if(usuario1 == 2)
	{
		cout << endl << "Cuantas dias  trabajo: ";
		cin >> usuario2;
		
		cout << endl << "Cuanto vale el dia en pesos: ";
		cin >> valord;
		
		float dia;
		
		dia = (usuario2 * valord);
		
		cout << endl << "Tu sueldo  por los dias trabajados es: " << dia <<  " mil pesos" << endl;
	}
	
	return 0;
}
