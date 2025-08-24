#include<stdio.h>
struct process 
{
       int at,bt,wt,tat,pid,pt,bt1;
};

void main()
{
     int i,j,n,avgtat,avgwt,k=0,temp[20];
     printf("\nEnter The No of Process : ");
     scanf("%d",&n);
     struct process p[n];
     for (i=0;i<n;i++)
     {
         printf("\nEnter the Arrival Time for Process %d: ",i);
         scanf("%d",&p[i].at);
         printf("\nEnter the Brust Time for Process %d: ",i);
         scanf("%d",&p[i].bt); 
         p[i].pid=i;
         p[i].bt1=p[i].bt;   
         temp[i]=p[i].bt;   
     } 
     p[9].bt=1000;
     int t,count=0,shopt_p=9;
      printf("\n\n\nGantt Chart : ");
     printf("\n-------------------------------------------------\n");
     for (t=0;count!=n;t++)
     {
         shopt_p=9;
         for (i=0;i<n;i++)
         {
                 if ( p[shopt_p].bt > p[i].bt && p[i].at<=t && p[i].bt>0)
                 {
                    shopt_p=i;
                 }     
         }
         p[shopt_p].bt--;
         printf(" P%d |",shopt_p);
         if (p[shopt_p].bt==0)
         {
             count++;
             p[shopt_p].wt=t+1-p[shopt_p].at-temp[shopt_p];
             p[shopt_p].tat=t+1-p[shopt_p].at;
             avgwt=avgwt+p[shopt_p].wt;
             avgtat=avgtat+p[shopt_p].tat;
         }
          
     }
     printf("|\n-------------------------------------------------\n");
     printf("\n\n");
     printf("\nProcess | ArrivalTime | BrustTime | WaitingTime | TurnAroundTime ");
     printf("\n--------------------------------------------------------------------");
     for (i=0;i<n;i++)
         printf("\n   P%d   |%7d      |%7d    |%7d      | %7d ",i,p[i].at,p[i].bt1,p[i].wt,p[i].tat);
   /*  printf("\n\n\n\nAverage Waiting Time : %d",avgwt/n);
     printf("\nAverage Turnaround Time : %d\n\n",avgtat/n);    */
}





