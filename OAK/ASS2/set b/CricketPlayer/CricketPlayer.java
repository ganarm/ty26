import java.util.*;
public class CricketPlayer
{
       String name;
       int noi;
       int noto;
       int totalRuns;
       double bAvg;
       public CricketPlayer(String name,int noi,int noto,int totalRuns)
       {
              this.name = name;
              this.noi=noi;
              this.noto=noto;
              this.totalRuns=totalRuns;
              this.bAvg=totalRuns/(noi-noto);  
       }
       public static void sortPlayers(CricketPlayer[] p)
       {
              for (int i=0;i<p.length-1;i++)
                  for (int j=0;j<p.length-1-i;j++)
                      if (p[j].bAvg < p[j+1].bAvg)
                      {
                         CricketPlayer temp=p[j];
                         p[j]=p[j+1];
                         p[j+1]=temp;
                      }
       }
       
       public void display()
       {
              System.out.print("Player NAME : "+name);    
              System.out.println();          
              System.out.print("No of Innings : "+noi);  
              System.out.println();
              System.out.print("No of Times Notout : "+noto);
              System.out.println();
              System.out.print("Batting Avg : "+bAvg);
              System.out.println();
              System.out.println("-------------------------------------------------");
              
       }
       public static void main (String[] args)
       {
              int n=0;
              Scanner sc=new Scanner(System.in);
              System.out.print(" Enter the no of Players : ");
              n=sc.nextInt();
              CricketPlayer[] p=new CricketPlayer[n];
              for (int i=0;i<n;i++)
              {
                  System.out.print("Enter NAME : ");
                  sc.nextLine();
                  String name=sc.nextLine();              
                  System.out.print("Enter No of Innings  : ");   
                  int a=sc.nextInt();
                  System.out.print("Enter No of Times Notout : ");  
                  int b=sc.nextInt();
                  System.out.print("Enter total Runs : ");  
                  int c=sc.nextInt();
                  System.out.println();
                  p[i]=new CricketPlayer(name,a,b,c);
               }
               CricketPlayer.sortPlayers(p);
               System.out.print("Sorted Players Acc to Batting Average : ");
               for (int i=0;i<n;i++)
                   p[i].display();
               
        }
}
