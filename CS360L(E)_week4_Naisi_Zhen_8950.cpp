#include <iostream>
#include <string>
using namespace std;

class MyHomeWork5
{
public:
	void setRadius(double r)
	{
		Radius = r;
	}
	double getRadius() const
	{
		return Radius;
	}
	double getPerimeter(double r) const
	{
		return 2 * 3.14*r;
	}
	double getArea(double r) const
	{
		return 3.14*r*r;
	}
	void printInfo(double x)
	{
		cout << x << endl;
	}
private:
	double Radius;
};
int main()
{
	MyHomeWork5 q1;
	double Radius;
	cout << "please enter a Radius: " << endl;
	getline(cin, Radius);
	q1.getArea(Radius);
	q1.getPerimeter(Radius);
	q1.printInfo(q1.getArea(Radius));
	q1.printInfo(q1.getPerimeter(Radius));

	return 0;
}