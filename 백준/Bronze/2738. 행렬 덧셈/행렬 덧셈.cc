
#include <iostream>
using namespace std;
int main()
{
    int n,m;
    cin >> n >> m;
    int A[n][m];
    int B[n][m];
    for(int i=0 ;i<n ;i++){
        for(int j=0 ;j<m ;j++)
        {
            cin >> A[i][j];
        }
    }
    
    for(int i=0 ;i<n ;i++){
        for(int j=0 ;j<m ;j++)
        {
            cin >> B[i][j];
        }
    }
    
    for(int i=0 ;i<n ;i++){
        for(int j=0 ;j<m ;j++)
        {
            A[i][j] += B[i][j];
            cout << A[i][j] << " ";
        }
        cout << "\n";
        }
    
    
    
    

    return 0;
}
