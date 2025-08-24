#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<sys/stat.h>
#include<sys/types.h>
#include<unistd.h>
#include<dirent.h>
#include<sys/wait.h>
#define MAX_INPUT_SIZE 1024
#define MAX_TOKENS 100

void list_files(const char *dirname)
{
     DIR *dir=opendir(dirname);
     if (dir==0)
     {
        perror("eroor to opening directry");
        return;
     }
     struct dirent *entry;
     while ((entry=readdir(dir))!=NULL)
     {
           printf("%s\n",entry->d_name);
     }
     closedir(dir);
}

void list_num_entries(const char *dirname)
{
     DIR *dir=opendir(dirname);
     if (dir==NULL)
     {
        perror("erorr to opening directry");
        return;
     }
     int count=0;
     struct dirent *entry;
     while (readdir(dir)!=NULL)
     {
           printf("%s\n",entry->d_name);
           count++;
     }
       printf("No of entries in %s : %d\n",dirname,count);
     closedir(dir);
}
void list_inode(const char *dirname)
{
     DIR *dir=opendir(dirname);
     if (dir==NULL)
     {
        perror("erorr to opening directry");
        return;
     }
     int count=0;
     struct dirent *entry;
     while ((entry=readdir(dir))!=NULL)
     {
           struct stat file_stat;
           char file_path[MAX_INPUT_SIZE];
           snprintf(file_path,sizeof(file_path),"%s/%s",dirname,entry->d_name);
           if (stat(file_path,&file_stat)==0)
           {
              printf("%s (inode : %1d)\n",entry->d_name,(long)file_stat.st_ino);
             
           }
     }
      printf("No of entries in %s : %d\n",dirname,count);
     closedir(dir);

}
void main()
{
    char input[MAX_INPUT_SIZE];
    char *tokens[MAX_TOKENS];
    const char *delimeters=" \t\n";
    int num_tokens;
    while (1)
    {
          printf("myshell$ ");
          fgets(input,sizeof(input),stdin);
          num_tokens=0;
          tokens[num_tokens]=strtok(input,delimeters);
          while (tokens[num_tokens]!=NULL)
          {
                 num_tokens++;
                 tokens[num_tokens]=strtok(NULL,delimeters);
          }
          if (num_tokens > 0)
          { 
             if (strcmp(tokens[0],"list")==0 && num_tokens>=3)
             {
                const char *command=tokens[1];
                const char *dirname=tokens[2];
                if (strcmp(command,"f")==0)
                   list_files(dirname);
                else
                   if (strcmp(command,"n")==0)
                      list_num_entries(dirname);
                else 
                   if (strcmp(command,"i")==0)
                      list_inode(dirname);
               else
                  printf("Invalid List Command...\n");
        }
        else
        { 
           pid_t pid=fork();
           if (pid<0)
           {
              perror("fork failed..");
           }
           else
              if (pid==0)
              {
                 execvp(tokens[0],tokens);
                 perror("exec failed");
                 exit(1);
              }
          else
             wait(NULL);
        }  
    }
}
}
