#include <iostream>
using namespace std;

int main()
{
	int ss;
	cout<<"Please enter the student's score:";
	cin>>ss;
	
	if(ss<0 || ss>100)
	{
		cout<<"Error";
	} 
	else if (ss>=90){
		cout<<"Student has scored A grade";
	}
	else if (ss>=80){
		cout<<"Student has scored B grade";
	}
	else if (ss>=70){
		cout<<"Student has scored C grade";
	}
	else if(ss>=60){
		cout<<"Student has scored D grade";
	}
	else if (ss>0)
	{
		cout<<"Student has scored F grade";
	}
	else {
		cout<<"Error";
	}
	return 0;
}
