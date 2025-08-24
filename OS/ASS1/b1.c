//Sorting using fork
#include<stdio.h>
#include<stdlib.h>
#include<sys/wait.h>
#include<sys/types.h>
#include<unistd.h>
#define MAX 10
void insertionsort(int[],int);
void bubblesort(int[],int);
void main()
{  
   
   int n,i,a[MAX];
   printf("\nEnter size of array : ");
   scanf("%d",&n);
   printf("\nEnter Elements of Array : ");
   for (i=0;i<n;i++)
       scanf("%d",&a[i]);
    int pid = fork();
    if (pid==0)
    {
        insertionsort(a,n);
        printf("\nI am child process.");
       
        printf("\nSorted elements using insertion sort by child process : ");
        for (i=0;i<n;i++)
            printf("%d ",a[i]);
    }
    else 
       if (pid>0)
       {  
          wait(NULL);
          bubblesort(a,n);
          printf("\nI am parent process.");
         
          printf("\nSorted elements using bubble sort by parent process : ");
          for (i=0;i<n;i++)
              printf("%d ",a[i]);
       }
    else 
        printf("\nfailed to create child process.");
    i++;
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


void insertionsort(int a[],int n)
{ 
     int i,j,temp;
     for (i=1;i<n;i++)
     {
         temp=a[i];
         j=i-1;
         while (j>=0 && a[j]>temp)
         {
                a[j+1]=a[j];
                j--;
         }   
         a[j+1]=temp;
     }
}

