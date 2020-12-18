#include <iostream>

using namespace std;

int main()
{
	int exam1, exam2, resultado;
	
	cout << "***Programa que te dice si pasaste la materia o la perdiste ***" << endl;
	
	cout << endl << "Ingresa la calificacion del primer examen: ";
	cin >> exam1;
	
	while(exam1 <=0 || exam1 >100)
	{
		cout << endl << "por favor ingresa una nota mayor que 0 y menor a 100" << endl;
		cout << endl << "Ingresa la calificacion del primer examen: ";
		cin >> exam1;
		if(exam1 <=100 && exam1 > 0)
		{
			break;
		}
	}
	
	cout << endl << "Ingresa la calificacion del segundo examen: ";
	cin >> exam2;
	
	while(exam2 <=0 || exam2 >100)
	{
		cout << endl << "por favor ingresa una nota mayor que 0 y menor a 100" << endl;
		cout << endl << "Ingresa la calificacion del segundo examen: ";
		cin >> exam2;
		if(exam2 <=100 && exam2 > 0)
		{
			break;
		}
	}
	
	resultado = (exam1 + exam2) / 2;
	
	cout << endl << "Tu semestre quedo en: " << resultado;
	
	if(resultado >= 50  &&  resultado <=100)
	{
		cout << endl << "Felicidades pasaste!";
	}
	else
	{
		cout << endl << "Lo siento perdiste el semestre, debiste estudiar mas ";
	}
	
	return 0;
}
