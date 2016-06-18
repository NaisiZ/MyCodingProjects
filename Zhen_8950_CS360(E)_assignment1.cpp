#include <iostream>
using namespace std;

int main()
{

 	int widthA = 0, widthB = 0, lengthA = 0, lengthB = 0, retangleA = 0, retangleB = 0;
	cout << "Please enter width and length for retangle A:\n";
	cin >> widthA;
	cin >> lengthA;
	retangleA = widthA*lengthA; 
	cout << "The area of retangle A is:"<<retangleA<<endl;
	cout << "Please enter width and length for retangle B:\n";
	cin >> widthB;
	cin >> lengthB;
	retangleB = widthB*lengthB;
	cout << "The area of retangle B is:"<<retangleB << endl;
	if (retangleA>retangleB)
		{
		cout<<"retangle A has the greater area\n";
		}
	else if(retangleB>retangleA)
		{
		cout<<"retangle B has the greater area\n";
		}
	else
		cout<<"Two retangles have the same area";
	return 0;
}
