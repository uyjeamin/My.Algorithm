#include <iostream>
using namespace std;

int main()
{
    int a,b,plus,min,hour;
    cin >> a>>b>>plus;
    min = a*60 +b;
    min += plus;
    hour = min/60;
    min = min%60;
    if(hour >= 24)
    hour -= 24;
    cout << hour <<" " << min;
    
    

    return 0;
}