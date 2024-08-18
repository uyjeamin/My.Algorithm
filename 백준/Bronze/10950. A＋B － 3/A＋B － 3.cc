#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >>n;
    int a[n],b[n];
    for(int i=0 ; i<n ; i++){
    cin >> a[i]>>b[i];    
    }
    
    for(int j=0 ; j<n ; j++){
    cout << a[j]+b[j]<<endl; 
    }
    
        
    
    return 0;
}