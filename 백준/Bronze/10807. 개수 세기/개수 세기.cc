#include <stdio.h>

int main()
{
    int N;
    scanf("%d",&N);
    int ar[N];
    int f,total = 0;
    
    for(int i = 0 ; i < N; i++)
    {
        scanf("%d", &ar[i]);
        
    }
    scanf("%d",&f);
    for(int i = 0 ; i < N ; i++)
    {
        if(ar[i] == f)
        total++;
    }
    printf("%d",total);
    

    return 0;
}