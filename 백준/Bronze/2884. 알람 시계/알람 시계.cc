#include <iostream>
using namespace std;

int main()
{
    int hour,min;
    cin >> hour >> min;
    if(min - 45 >= 0)
    {
       cout << hour<<" " << min -45;
    }
    else if(hour != 0)
    {
    if(min - 45 < 0)
    {
        cout << hour-1<< " "<< 15 + min;
    }
    }
    else
    {
        cout << 23 <<" "<< 15 + min;   
    }
  
    return 0;
}