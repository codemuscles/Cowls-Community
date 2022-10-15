#include <stdio.h>
#include<string.h>
main()
{
    char line[81];
    int i,n,count=0;
    printf("Input the line:");
    sscanf("%[^ \n]",line);
    n=strlen(line);
    for ( i = 0; i < n; i++)
    {
        if (isupper(line[i]));

    }
    printf("\n The no of total uppercase is %s is %d",line,count);
    
}