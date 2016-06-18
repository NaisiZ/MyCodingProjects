#include <iostream>
using namespace std;

class MyMath
{
	public:
		int add(int x, int y)
		{
			int z;
			z=x+y;
			return z;
		}
		int sub(int x, int y)
		{
			int z;
			z=x-y;
			return z;
		}
};

int main()
{
	MyMath practice;
	int a, b;
	cout<<"Please enter 2 numbers:";
	cin >> a >> b;
	cout << "The sum of the 2 numbers is:"<<endl;
	cout<<practice.add(a,b)<<endl;
	cout << "The differece of the 2 number is :"<<endl;
	cout<<practice.sub(a,b)<<endl;
	return 0;
}

//below is the class and object introduction
/*int add(int, int);


class MyClass
{
public:

	int add(int a, int b)
	{
		int c;
		c = a + b;
		return c;
	}


};
int main()
{
	int x, y;
	cout << "enter the number x:\n";
	cin >> x;
	cout << "enter the number y:\n";
	cin>>y;
	cout<<"the sum of x and y is:"<<add(x, y)<<endl;
	system("pause");
	return 0;
}*/

