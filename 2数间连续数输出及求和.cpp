#include <iostream>
using namespace std;

int main()
{
	int a,b,sum;
	cin>>a;
	cin>>b;
	//if a=1 b=5 a<b 
	for (a;a<b;b=b-1)
	{
		cout<<b<<endl;
	}
	sum=sum+b;
	cout<<sum<<endl;
	//if a=5 b=1 b<a 
	for (b;b<=a;a=a-1)
	{
		cout<<a<<endl;
	}
	sum=sum+a;
	cout<<sum<<endl;
	return 0;
}
