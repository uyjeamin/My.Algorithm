#include <iostream>
#include <string.h>
using namespace std;
int main()
{
    int num1;
    int num2;
    int temp;
    int s1[3];
    int s2[3];
    cin >> num1 >> num2;
    
        s1[2] = num1/100;
        num1 = num1%100;
        s1[1] = num1/10;
        num1 = num1%10;
        s1[0] = num1;
        
        s2[2] = num2/100;
        num2 = num2%100;
        s2[1] = num2/10;
        num2 = num2%10;
        s2[0] = num2;
        
        for(int i=0 ; i<3 ; i++){
            if(s1[i] > s2[i])
            {
                for(int i=0 ;i<3 ; i++)
                cout << s1[i];
                break;
            }
            else if(s1[i] < s2[i])
            {
                for(int i=0 ;i<3 ; i++)
                cout << s2[i];
                break;
            }
            }
    
    

    return 0;
}