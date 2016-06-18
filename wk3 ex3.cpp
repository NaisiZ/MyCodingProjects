#include <iostream>
using namespace std;

int main()
{
	
	int row=0, col=0;
	
	for (row=1;row<=6;++row){
		for (col=1;col<row;++col)
		{
			cout<<col<<" ";
		}
		cout<<row<<endl;
	}
		
	return 0;
}
