//Copyright Naisi Zhen 6/20/2016

#include <iostream>
#include <string>
using namespace std;

class MyHomeWork5
{
public:
		void setRadius(double r)
		{
			Radius=r;
		}
		double getRadius() const
		{
			return Radius;
		}
		double getPerimeter(double r) const
		{
			return 2*3.14*r;
		}
		double getArea(double r) const
		{
			return 3.14*r*r;
		}
		void printInfo(double x)
		{
			cout<<x<<endl;
		}
private:
		double Radius; 
};
class Student
{
public:
	void setName(string x) {
		 Name= x;
	}
	string getName() {
		return	Name;
	}
	void setId(int x)
	{
		Id = x;
	}
	int getId() {
		return Id;
	}
	void printInfo(string Name, int Id) {
		cout << "Name: "<<Name << endl;
		cout << "ID: "<<Id << endl;
	}
private:
	string Name;
	int Id;
};
int main()
{
	MyHomeWork5 q1;
	double a;
	cout << "Q1:" << endl;
	cout<<"Please enter a Radius: "<<endl;
	cin >> a;
	q1.setRadius(a);
	cout<<"The Area of the circle is: ";
	q1.printInfo(q1.getArea(a));
	cout<<"The Perimeter of the circle is: ";
	q1.printInfo(q1.getPerimeter(a));
	cout << endl;

	cout << "Q2: " << endl;
	Student s1, s2;
	string str1 = "Naisi Zhen", str2 = "Fan Yang";
	int int1 = 8950, int2 = 9981;

	cout << "Student 1 info: " << endl;
	s1.setId(int1);
	s1.setName(str1);
	s1.printInfo(s1.getName(str1), s1.getId(int1));

	cout << endl;

	cout << "Student 2 info: " << endl;
	s2.setId(int2);
	s2.setName(str2);
	s2.printInfo(s2.getName(str2),s2.getId(int2));
	system("pause");
	return 0;
}