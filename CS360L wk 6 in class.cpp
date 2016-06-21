
#include <iostream>
using namespace std;
/*
int main()
{
	int a=1, b=2;
	add(a,b);
	cout<< x <<" "<<y<<endl;
	return 0;
}
int add (int x, int y)
{
	x= a+1;
	y= b+1;
	return a+b;
}
//output 1 2;
int main()
{
	int a=1, b=2;
	add(a,b);
	cout<< x <<" "<<y<<endl;
	return 0;
}
int add (int *x, int *y)
{
	*x= *x+1;
	*y= *y+1;
	return *a+*b;
}


//constant -> var
int a=5;
//var -> var
int a=5;
int b;
b=a;
//address -> pointer;
int *p = &a;
//pointer -> pointer;
int *p;
int *r;
p=&a;
r=p; 
*/ 

int main()
{
	int a,b,c,d,e;
	cout<<"Please enter 5 numbers:"<<endl;
	cin>>a>>b>>c>>d>>e>>endl;
	int n[5]={a,b,c,d,e};
	increment(n[5]);
	cout<<n[5];
	return 0;
}
void increment(*x)
{
	*x=*x+1;
	*(x+1)=*(x+1)+1;
	*(x+2)=*(x+2)+1;
	*(x+3)=*(x+3)+1;
	*(x+4)=*(x+4)+1;
} 

/*int main()
{
	int a; a=10;
	int *p;
	p=&a;
	cout <<a<< endl;
	cout <<*p<< endl;
	cout <<p<<endl;
	return 0;
 }*/ 
