//Fork System Call
#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
void main()
{
    pid_t pid=fork();
    if (pid==0)
        printf("\nprocess ID : %d \nI am child process.",getpid());
    else 
       if (pid>0)
        printf("\nprocess ID : %d \nI am parent process.",getpid());
    else 
        printf("\nchild process can not be created.");
}
