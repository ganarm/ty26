#include<stdio.h>
void main()
{
     int i,j,n;
     printf("\nEnter The No of Process : ");
     scanf("%d",&n);
     int at[n],bt[n],wt[n],tat[n],temp[n+1],avgtat,avgwt;
     for (i=0;i<n;i++)
     {
         printf("\nEnter the Arrival Time for Process %d: ",i);
         scanf("%d",&at[i]);
         printf("\nEnter the Brust Time for Process %d: ",i);
         scanf("%d",&bt[i]);      
     } 
     wt[0]=temp[0]=tat[0]=0;   
     for (i=1;i<n+1;i++)
     {
          temp[i]=bt[i-1]+temp[i-1];
          wt[i]=temp[i]-at[i];
     }
     avgwt=avgtat=0;
     for (i=0;i<n;i++)
     {
         tat[i]=wt[i]+bt[i];
         avgwt=avgwt+wt[i];
         avgtat=avgtat+tat[i];
     }
     printf("\n\n\nGantt Chart : ");
     printf("\n-------------------------------------------------\n");
     for (i=0;i<n;i++)
          printf("|   P%d   ",i);
     printf("|\n-------------------------------------------------\n");
     for (i=0;i<n+1;i++)
         printf("%d        ",temp[i]);
     printf("\n\n");
     printf("\nProcess | ArrivalTime | BrustTime | WaitingTime | TurnAroundTime ");
     printf("\n--------------------------------------------------------------------");
     for (i=0;i<n;i++)
         printf("\n   P%d   |%7d      |%7d    |%7d      | %7d ",i,at[i],bt[i],wt[i],tat[i]);
     printf("\n\n\n\nAverage Waiting Time : %d",avgwt/n);
     printf("\nAverage Turnaround Time : %d\n\n",avgtat/n);            
}





