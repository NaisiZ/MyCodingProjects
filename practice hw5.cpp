#include <iostream>
#include <string>

using namespace std;

class myHomeWork6
{
public:
	void greaterN(int a[], int size, int n)
	{
		cout << "The number(s) greater than the bench mark number: " << endl;
		for (int i = 0; i < size; i++)
		{
			if (a[i]>=n)
			{
				cout << a[i] << endl;
			}
		}
	}
};
int main()
{
	int i = 0;
	int s = 0;//size
	int n=0;//the bench mark standard "N"
	cout << "Please enter the bench mark number:" << endl;
	cin >> n; 
	
	cout << "Please enter the array size: ";//user type in value for "size"
	cin >> s;
	int x[s];
	cout << "Please enter the numbers that you want to put in the array:" <<endl; 
	for (i=0;i<s;i++)
	{
		cin >> x[i];
	}
	myHomeWork6 ass2;
	ass2.greaterN(x, s, n);
	system("pause");
	return 0;
}
