#include<stdio.h>

int main()
{
	int table[9][9];
	int temp = 0;
	int I = 0 , J = 0;
	for(int i = 0; i < 9 ; i++)
	{
		for(int j = 0; j < 9 ; j++)
		{
			scanf("%d", &table[i][j]);
			if(table[i][j] > temp)
			{
				temp = table[i][j];
				I = i;
				J = j;
				
			}
		}
	}
	printf("%d\n%d %d",temp,I+1,J+1);
	return 0;
}