#include <iostream>
using namespace std;
int main()
{
    long total,n,a,b,temp = 0;
    
    cin >>total>>n;
    
    for(int i=0 ;i<n ; i++){
        cin >> a>>b;
        temp += a*b;
    }
    
    if(temp == total)
    cout << "Yes";
    else
    cout << "No";
    
    return 0;
}