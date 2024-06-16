#include <iostream>
using namespace std;
int main()
{
    int n1,n2,n3,n4,n5,n6,temp;
    cin >> n1 >> n2;
    temp = n2;
    n5 = n2/100;
    n2 %= 100;
    n4 = n2 / 10;
    n2 %= 10;
    n3 = n2;
    cout << n1*n3 << "\n" << n1*n4 << "\n" << n1*n5 << "\n" << n1*temp;

    return 0;
}