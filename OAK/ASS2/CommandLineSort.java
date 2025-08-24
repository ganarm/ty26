import java.util.*;
class CommandLineSort
{
       public static void main (String[] args)
       {
             int no[]=new int[5];
             for (int i=0;i<5;i++)
                 no[i]=Integer.parseInt(args[i]);
          /*    for (int i=0;i<5;i++)
                  for (int j=0;j<5-i;j++)
                      if (no[j]>no[j+1])
                      {
                         int temp=no[j];
                         no[j+1]=no[j];
                         no[j]=temp;
                      }*/
             Arrays.sort(no);
             System.out.print(" SORTED DATA : ");
             for (int i=0;i<5;i++)
             {
                  System.out.print(no[i]+" ");   
             }   
       }    
              
}
 
