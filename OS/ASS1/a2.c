//Fork System Call
#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
void main()
{  
   int i=0;
    pid_t pid=fork();
    while(i!=10)
    {
         if (pid==0)
         {
            printf("\nchild process gets higher priority.\npriority of child : %d.",nice(-19));
            sleep(10);
         }
         else 
            if (pid>0)
            {
                printf("\nparent process gets lower priority.\npriority of parent : %d.",nice(5));
                sleep(10);
             }
        else 
           printf("\nfailed to create child process.");
        i++;
    }
}
