/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
using namespace std;

int main()
{
    int a,b;
    cin >> a>>b;
    
    while(a != 0 && b != 0){
        
        if(b%a == 0){
            cout << "factor" <<endl;
        }
        else if(a%b == 0)
        {
            cout << "multiple"<<endl;
        }
        else
        {
            cout << "neither"<<endl;
        }
        
            cin >> a>>b;
        
    }

    return 0;
}