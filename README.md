#include <stdio.h>
#include <stdlib.h>
 

struct node
{
    char info;
    struct node *ptr;
}*top=NULL,*top1,*temp,*rear, *front;
 
;
void push(int data);
char pop();
void enqueue(int value);
char delQueue(); 

 
void main()
{
   
   char str[100];
   int i=0,j=0,flag=0;
   printf("enter string");
   scanf("%s",str);
   for(i=0;str[i]!='\0';i++)
   {
       push(str[i]);
       enqueue(str[i]);
   }
   for(j=0;j<i;j++){
       if(pop()!=delQueue()){
           printf("it's not a palindrome");
           flag=1;
           break;
       }
   }
   if(flag==0) printf("it's a palindrome");
}
 



void push(int data)
{
    if (top == NULL)
    {
        top =(struct node *)malloc(1*sizeof(struct node));
        top->ptr = NULL;
        top->info = data;
    }
    else
    {
        temp =(struct node *)malloc(1*sizeof(struct node));
        temp->ptr = top;
        temp->info = data;
        top = temp;
    }
    
}
 
char pop()
{
    char ch;
    ch=top->info;
    top1 = top;
    
    
        top1 = top1->ptr;
    free(top);
    top = top1;
    return ch;
    
}
 
char delQueue()
{
       struct node  *var=rear;
       char ch;
           ch=rear->info;
           
             rear = rear->ptr;
             free(var);
             return ch;
      
}

void enqueue(int value)
{
     struct node *temp;
     temp=(struct node *)malloc(sizeof(struct node));
     temp->info=value;
     if (front == NULL)
     {
           front=temp;
           front->ptr=NULL;
           rear=front;
     }
     else
     {
           front->ptr=temp;
           front=temp;
           front->ptr=NULL;
     }
}
