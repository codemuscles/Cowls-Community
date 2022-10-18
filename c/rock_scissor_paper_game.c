#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#include<conio.h>
int compare(char c1,char c2)
{
    if (c1=='R'&& c2=='S')
    {
        return 1;
    }
    else if (c1=='S'&& c2=='R')
    {
        return 0;
    }
    else if (c1=='P'&& c2=='R')
    {
        return 1;
    }
    else if (c1=='R'&& c2=='P')
    {
        return 0;
    }
    else if (c1=='S'&& c2=='P')
    {
        return 1;
    }
    else if (c1=='P'&& c2=='S')
    {
        return 0;
    }
    else if (c1== c2)
    {
        return -1;
    }
}
int main()
{
    srand(time(NULL));
    int playerScore=0,compScore=0,temp,score=0;
    char play,comp;
    char array[]={'R','P','S'};
    printf("Let's play Stone , paper , scissors \nThere will be three trials");
    for (int i = 0; i < 3; i++)
    {
        printf("\nEnter 1 for Stone.\nEnter 2 for paper.\nEnter 3 for scissors.");
        printf("\nPlayer's choice : ");
        scanf("%d",&temp);
        play = array[temp-1];
        printf("You select : %c",play);
        temp = (rand()%3) +1;
        comp = array[temp-1];
        printf("\n\nComputer select : %c\n",comp);
        score=compare(play,comp);
        if (score==1)
        {
            playerScore++;
            printf("\nYou Got it!");
        }
        else if (score==0)
        {
            compScore++;
            printf("\nYou lose it!");
        }
        else if (score==-1)
        {
            compScore++;
            playerScore++;
            printf("\nTie!");
        }
        printf("\nYour score : %d\nComputer score : %d\n\n",playerScore,compScore);
    }
    if (playerScore>compScore)
    {
        printf("\n~~~~~~~You win the game!!!!!!!!~~~~~~~~");
    }
    else if (playerScore<compScore)
    {
        printf("\n~~~~~~You lose the game~~~~~~~~~");
    }
    else if (playerScore==compScore)
    {
        printf("\n~~~~~~~~~~Game Tie!!!!~~~~~~~~~~");
    }
    getch();
    return 0;
}