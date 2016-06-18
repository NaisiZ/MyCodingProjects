#include <iostream>
using namespace std;

class MyMath
{
	public:
		int Add(int x, int y)
		{
			return x+y;
		}
		int Sub(int x, int y)
		{
			return x-y;
		}
		int Mul(int x, int y)
		{
			return x*y;
		}
		int Divide(int x, int y)
		{
			return x/y;
		}
		int Mod(int x, int y)
		{
			return x%y;
		}
		 
};
int main()
{
	int a,b;
	cout<<"Please enter 2 numbers:";
	cin>>a>>b>>endl;
	MyMath m;
	cout<<m.Add(a,b)<<endl;	
	cout<<m.Sub(a,b)<<endl;
	cout<<m.Mul(a,b)<<endl;
	cout<<m.Divide(a,b)<<endl;
	cout<<m.Mod(a,b)<<endl;
	return 0;
}
