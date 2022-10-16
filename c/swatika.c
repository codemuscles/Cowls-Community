#include <stdio.h>
#include <conio.h>
int main()
{
	int m,a;
	printf("Enter the size of the pattern  ");
	scanf("%d",&a);
	clrscr();
	if(a%2!=0)
	{
		a=a+1;
	}
	m=a/2;
	for(int k=1;k<m;k++)
		{
			if(k==1){
			printf ("* ");}
			else
			printf("  ");
		}
		for(int i=1;i<=a/2;i++)
	{
		printf("* ");
	}
	printf("\n");
	for(int i=1;i<=m;i++)
	{
		for(int j=1;j<a;j++)
		{
			if(j==1||j==m||i==m)
			{
				printf("* ");}
			else
			{
				printf("  ");}
			}
		printf ("\n");
	}
	for(int i=1;i<=m-1;i++)
	{
		for(int k=1;k<m;k++)
		{
			printf ("  ");
		}
		for(int j=1;j<=m;j++)
		{
			if(j==1||j==m)
			{
				printf("* ");}
			else
			{
				printf("  ");}
			}
			
		printf ("\n");
	}
	for(int i=1;i<=m;i++)
	{
		
		printf("* ");
	}
	for(int i=1;i<=m;i++)
	{
		if(i==m-1)
		{
			printf("*");
		}
		else{
		printf("  ");}
	}
}
