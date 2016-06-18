#include <iostream>
using namespace std;

int main()
{
	int widthA,widthB,lengthA,lengthB,areaA=widthA*lengthA,areaB=widthB*lengthB;
	cout<<"Please enter the width and length of the retangle A:"<<endl;
	cin>> widthA >> lengthA;
	cout<<"Please enter the width and length of the retangle B:"<<endl;
	cin>> widthB >> lengthB;
	if (areaA>areaB)
	{
		cout<<"Retangle A has the greater area."<<endl;
	}
	else 
	{
		cout<<"Retangle B has the greater area."<<endl;
	}
	/*else
	{
		cout<<"The are of Retangle A and B are the same."<<endl;
	}*/
	return 0;
}
