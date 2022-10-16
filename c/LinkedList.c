#include<stdio.h>
#include<stdlib.h>

typedef struct Node
{
    int key;
    struct Node *next;
};

void printList(struct Node* n)
{
    if(!n)
        return;
    
    printf("%d ",n->key);
    printList(n->next);
}

void insertion(struct Node **head,int data)
{
    struct Node *newNode = (struct Node*)malloc(sizeof(struct Node)), *p = *head;
    newNode->key = data;
    newNode->next = NULL;

    if(*head == NULL)
    {
        *head = newNode;
        return;
    }

    while(p->next != NULL)
        p = p->next;
    
    p->next = newNode;
    return;
}

void deletion(struct Node **head,int data)
{
    if(!*head)
    {
        printf("The Linked List is empty");
        return;
    }
    else if((*head)->key == data)
    {
        *head = (*head)->next;
        return;
    }

    struct Node *p = (*head)->next, *q = *head;
    while(p != NULL)
    {
        if(p->key == data)
        {
            struct Node *temp = p;
            p = p->next;
            q->next = p;
            free(temp);
            return;
        }
        else
        {
            q = q->next;
            p = p->next;
        }
    }
    printf("\nThe Element wasn't found");
}

int main(void)
{
    int n,i;
    printf("Enter the size of the Linked List :- ");
    scanf("%d",&n);
    printf("Enter your elements:- ");

    struct Node* myLinkedList = NULL; 

    for(i=0;i<n;i++)
    {
        int data;
        scanf("%d",&data);
        insertion(&myLinkedList, data);
    }
    printf("\nThe Linked List created is:- ");
    printList(myLinkedList);

    int a;
    printf("\nEnter the element that need to be deleted:- ");
    scanf("%d",&a);

    deletion(&myLinkedList,a);

    printf("\nThe linked list after deleting %d in  it is :- ",a);
    printList(myLinkedList);

    return 0;
}
