#include<stdio.h>
#include <conio.h>
int main()
{
	clrscr();
	int a;
	printf("Enter a number  ");
	scanf("%d",&a);
	for(int m=1;m<=2;m++){
	for(int i=a/2;i>=0;i--)
	{
		for(int j=i;j>=0;j--)
		{
			printf("* ");
		}
		for(int k=2*(a/2-i);k>0;k--)
		{
			printf("  ");
		}
		for(int j=i;j>=0;j--)
		{
			printf("* ");
		}
	printf("\n");
	}
	for(int i=0;i<=a/2;i++)
	{
		for(int j=0;j<=i;j++)
		{
			printf("* ");
		}
		for(int k=2*(a/2-i);k>0;k--)
		{
			printf("  ");
		}
		for(int j=0;j<=i;j++)
		{
			printf("* ");
		}
		printf("\n");
	}
	}
}
