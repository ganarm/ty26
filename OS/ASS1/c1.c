#include<stdio.h>
#include<stdlib.h>
#include<sys/wait.h>
#include<sys/types.h>
#include<unistd.h>
#define MAX 10
void bubblesort(int[],int);
int main()
{  
   
   int n,i,a[MAX];
   printf("\nEnter size of array : ");
   scanf("%d",&n);
   printf("\nEnter Elements of Array : ");
   for (i=0;i<n;i++)
       scanf("%d",&a[i]);
    pid_t pid = fork();
    if (pid < 0)
    {
       printf("\nfailed to create child process.");
       return 1;
    }
    else if (pid==0)
    {  
        sleep(4);
        execv("./ex2",*a);
        
    }
    else 
       if (pid>0)
       {  
          bubblesort(a,n);
          printf("\nI am parent process.");
         
          printf("\nSorted elements by parent process : ");
          for (i=0;i<n;i++)
              printf("%d ",a[i]);
       }   
 }


void bubblesort(int a[],int n)
{ 
     int i,j,temp;
     for (i=0;i<n;i++)
         for (j=0;j<n-1-i;j++)
             if (a[j] >  a[j+1])
             {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
             }   
}


