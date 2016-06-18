#include <iostream>
#include <string>
using namespace std;

class MyHomeWork4
{
public:
	int SumOfTwoNumberInBetween(int number1, int number2)
	{
		int sum = 0;
		for (int i = number1; i <= number2; i++)
		{
		sum = sum + i;
		}
		return sum;
	}
	int square(int i)
	{
		i = i*i;
		return i;
	}
};
int main()
{
	MyHomeWork4 q1;
	cout<<"The sum is: "<<q1.SumOfTwoNumberInBetween(1, 10)<<endl;
	system("pause");
	
	cout << sqrt(10);
	return 0;
}
