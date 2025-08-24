#include<stdio.h>
#include<sys/wait.h>
#include<sys/types.h>
#include<unistd.h>
void main()
{
    pid_t pid=fork();
    if (pid==0)
    { 
        sleep(10);
        printf("\nprocess ID : %d \nI am child process.",getpid());
        printf("\nmy parent ID = %d",getppid());
    }
    else 
       if (pid>0)
       {
          printf("\nprocess ID : %d \nI am parent process.",getpid());
          printf("\nmy child ID = %d",pid);
       }
    else 
        printf("\nchild process can not be created.");
}
