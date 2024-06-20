#include <iostream>
#include<string.h>
using namespace std;
int main()
{
    int sum = 1;
    string content;
    getline(cin,content);
    
    if(content[0] == ' ' && content.length() == 1)
    {
        cout << 0;
        return 0;
    }
    
    for(int i=1 ; i< content.length()-1 ; i++)
    {
        
        if(content[i] == ' ')
        {
            sum++;
        }
        
    }
    cout << sum;
    return 0;
}