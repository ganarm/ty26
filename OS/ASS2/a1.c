#include<stdio.h>
#include<stdlib.h>
#include<string.h>

#include<sys/types.h>
#include<unistd.h>
#include<sys/wait.h>
#define MAX_INPUT_SIZE 1024
#define MAX_TOKENS 100
void count_characters(const char *filename)
{
     FILE *file=fopen(filename,"r");
     if (file==NULL)
     {
        perror("Error to Opening File\n");
        return;
     }
     int count=0;
     char c;
     while ((c=fgetc(file))!=EOF)
           count++;
     fclose(file);
     printf("No of CHARACTERS in %s : %d\n",filename,count);
}

void count_words(const char *filename)
{
     FILE *file=fopen(filename,"r");
     if (file==NULL)
     {
        perror("Error to Opening File\n");
        return;
     }
     int count=0;
     char c;
     int in_word=0;
     while ((c=fgetc(file))!=EOF)
     {
           if (c==' ' || c=='\t' || c=='\n')
              in_word=0;
           else
              if (!in_word)
              {
                 in_word=1;
                 count++;
              }
     }
     fclose(file);
     printf("No of WORDS in %s : %d\n",filename,count);
}
void count_lines(const char *filename)
{
     FILE *file=fopen(filename,"r");
     if (file==NULL)
     {
        perror("Error to Opening File\n");
        return;
     }
     int count=0;
     char c;
     while ((c=fgetc(file))!=EOF)
           if (c=='\n')
               count++;
     fclose(file);
     printf("No of lines in %s : %d\n",filename,count);
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
       if (strcmp(tokens[0],"count")==0 && num_tokens>=3)
       {
         const char *command=tokens[1];
         const char *filename=tokens[2];
         if (strcmp(command,"c")==0)
         {
            count_characters(filename);
         }
         else
            if (strcmp(command,"w")==0)
            {
              count_words(filename);
              }
         else 
            if (strcmp(command,"l")==0)
            {
               count_lines(filename);
               }
        else
        {
           printf("Invalid count Command...\n");
        }
        }
        else
        { 
           pid_t pid=fork();
           if (pid<0)
           {
              perror("fork failed..\n");
           }
           else
              if (pid==0)
              {
                 execvp(tokens[0],tokens);
                 perror("exec failed\n");
                 exit(1);
              }
          else
          {
             wait(NULL);
           }
        }  
    }
 }
}




