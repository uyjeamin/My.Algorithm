#include <iostream>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int age;
    cin >> age;
    if(age %4 == 0 && age %100 != 0)
    cout << 1;
    else if(age % 400 == 0)
    cout << 1;
    else
    cout <<0;
    

    return 0;
}