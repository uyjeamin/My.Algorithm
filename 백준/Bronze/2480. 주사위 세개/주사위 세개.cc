#include <iostream>
using namespace std;
int main()
{
    int max;
    int dice1,dice2,dice3;
    cin >>dice1 >> dice2 >> dice3;
    if(dice1 == dice2 &&dice2 == dice3)
    {
        cout << 10000 + dice1*1000;
    }
    else if(dice1 == dice2) 
    {
        cout << 1000 + dice1*100;
    }
    else if(dice2 == dice3) 
    {
        cout << 1000 + dice2*100;
    }
    else if(dice1 == dice3) 
    {
        cout << 1000 + dice1*100;
    }
    else 
    {
        if(dice1 > dice2)
        {
            if(dice1 > dice3)
            max = dice1;
            else if(dice1 < dice3)
            max= dice3;
        }
        else if(dice2 > dice3)
        {
            if(dice2 > dice1)
            max = dice2;
            else if(dice2 < dice1)
            max= dice1;
        }
        else 
        {
            if(dice3 > dice2)
            max = dice3;
            else if(dice3 < dice2)
            max= dice2;
        }
        cout << max*100;
        
    }
    
    

    return 0;
}