#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
void main(int argc,int *argv[])
{
        printf("\nprocess ID : %d \nI am child process.",getpid());
}
