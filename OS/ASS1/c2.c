#include<stdio.h>
#include<stdlib.h>
#include<sys/wait.h>
#include<sys/types.h>
#include<unistd.h>
int main(int argc,char *argv[])
{  
    pid_t pid = fork();
    if (pid < 0)
    {
       printf("\nfailed to create child process.");
       return 1;
    }
    else if (pid==0)
    {  
        sleep(4);
        execv("./a1",argv);
        
    }
    else 
       if (pid>0)
       {  
          printf("\nprocess ID : %d \nI am parent process.",getpid());
          printf("\nmy child ID : %d \n",getpid());
       }   
}

