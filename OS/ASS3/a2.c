#include<stdio.h>
void main()
{
     int i,j,n;
     printf("\nEnter The No of Process : ");
     scanf("%d",&n);
     int at[n],bt[n],wt[n],tat[n],temp[n+1],avgtat,avgwt,p[n],t,min,x;
     for (i=0;i<n;i++)
     {
         printf("\nEnter the Arrival Time for Process %d: ",i);
         scanf("%d",&at[i]);
         printf("\nEnter the Brust Time for Process %d: ",i);
         scanf("%d",&bt[i]);            
     } 
     for (i=0;i<n;i++)
         p[i]=i;   
     wt[0]=temp[0]=tat[0]=0;  
   /*  for (i=0;i<n;i++)
          printf("\n   P%d   |%7d      |%7d",p[i],at[i],bt[i]);*///1 4   2  9   3 5   0 8
     min=at[0];
     x=0;
     for (i=1;i<n;i++)
          if (min > at[i])
          {
             min=at[i];
             x=i;
          }
     if (x!=0)
     {
        t=at[x];
        at[x]=at[0];
        at[0]=t;
         
        t=bt[x];
        bt[x]=bt[0];
        bt[0]=t;  
        
        t=p[x];
        p[x]=p[0];
        p[0]=t;
        printf("%d %d %d",p[x],bt[x],at[x]);
     }
     
     for (i=1;i<n;i++)
         for (j=1;j<n-i;j++)
             if (bt[j]>bt[j+1])
             {
                 t=bt[j];
                 bt[j]=bt[j+1];
                 bt[j+1]=t;
                 
                 t=p[j];
                 p[j]=p[j+1];
                 p[j+1]=t;
                 
                 t=at[j];
                 at[j]=at[j+1];
                 at[j+1]=t;       
             }      
     for (i=1;i<n+1;i++)
     {
          temp[i]=bt[i-1]+temp[i-1];
     }
      for (i=1;i<n;i++)
     {
       //   temp[i]=bt[i-1]+temp[i-1];
       //   printf("%d ",temp[i]);
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
          printf("|   P%d   ",p[i]);
     printf("|\n-------------------------------------------------\n");
     for (i=0;i<n+1;i++)
         printf("%d        ",temp[i]);
     printf("\n\n");
     printf("\nProcess | ArrivalTime | BrustTime | WaitingTime | TurnAroundTime ");
     printf("\n--------------------------------------------------------------------");
     for (i=0;i<n;i++)
         printf("\n   P%d   |%7d      |%7d    |%7d      | %7d ",p[i],at[i],bt[i],wt[i],tat[i]);
     printf("\n\n\n\nAverage Waiting Time : %d",avgwt/n);
     printf("\nAverage Turnaround Time : %d\n\n",avgtat/n);        
}





