#include <iostream>
using namespace std;

int main()
{
    int n,x;
    cin >> n>>x;
    int arr[n];
    int result[n];
    int a=0;
    for(int i=0 ;i<n ;i++)
    {
        cin >>arr[i];
        if(arr[i] < x)
        {
         result[a++] = arr[i];    
        }
    }
    
    for(int i = 0; i < a ; i++)
    {
        cout << result[i];
        cout << " ";
    }
    

    return 0;
}