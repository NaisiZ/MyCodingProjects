#include <iostream>
using namespace std;

int main()
{
	int a=0,b=0,sum=0;
	cout<<"Please enter two numbers:"<<endl; 
	cin>>a;                                  
	cin>>b;                                    
	cout<<"Counting down:"<<endl;
	if (a>b)
	{
		for (int i=a;i>=b;i--)
		{
			cout<<i<<endl;
			sum=sum+i;
		}
	}	
	else
	{
		for (int i=b;i>=a;i--)
		{
			cout<<i<<endl;
			sum=sum+i;
		}
	}
	cout<<sum<<endl; 
	return 0;
	
}
