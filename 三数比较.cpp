#include <iostream>
using namespace std;

int main()
{
	int a,b,c;
	cout << "Enter three numbers\n";
	cin >> a;
	cin >> b;
	cin >> c;
	if (b>a)
	{
		a=b;
	}
	if(c>a)
	{
		a = c;}
		
		cout << a << endl;
	
	return 0;
}
