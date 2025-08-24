import java.io.*;
import java.util.*;
class MatrixMenu
{
     public static void main (String[] args)
     {
              Scanner s=new Scanner(System.in);
              int ch,m,n,p,q,i,j,k;
              while (true)
              {
                         System.out.println();
                         System.out.println("***FOR FIRST MATRIX***");
                         System.out.print("Enter the size of first matrix :");                                              
                         m=s.nextInt();
                         n=s.nextInt();
                                               int[][] a=new int[m][n];
                                               System.out.println("Enter matrix :"); 
                                               for (i=0;i<m;i++)
                                                      for (j=0;j<n;j++) 
                                                          a[i][j]=s.nextInt(); 
                                               System.out.println();
                                               System.out.println("***FOR SECOND MATRIX***");
                                               System.out.print("Enter the size of second matrix :");
                                               p=s.nextInt();
                                               q=s.nextInt();
                                               int[][] b=new int[p][q];
                                               System.out.println("Enter matrix :"); 
                                               for (i=0;i<p;i++)
                                                   for (j=0;j<q;j++) 
                                                       b[i][j]=s.nextInt(); 
                                                                   
                               System.out.println();
                               System.out.println("****OPERATIONS ON MATRIX****");
                               System.out.println("---------------------------------------------");
                               System.out.println();
                               System.out.println("i.Addition.");
                               System.out.println("ii.Multiplication.");
                               System.out.println("iii.Transpose of FIRST matrix.");
                               System.out.println("iv.Exit.");
                               System.out.println();
                               System.out.print("Enter your choice : ");
                               ch=s.nextInt();
                               switch (ch)
                               {
                                      case 1 : if (m==p && n==q)
                                               {
                                                  int[][] c=new int[m][n]; 
                                                  for (i=0;i<m;i++)
                                                      for (j=0;j<n;j++) 
                                                          c[i][j]=a[i][j]+b[i][j]; 
                                                  System.out.println();
                                                  System.out.println("Addition of Matrices : ");
                                                  System.out.println();
                                                  for (i=0;i<m;i++)
                                                 {
                                                      for (j=0;j<n;j++)
                                                          System.out.print(c[i][j]+" "); 
                                                      System.out.println();
                                                 }
                                               }  
                                               else
                                               {
                                                  System.out.println("SIZE of both matrices NOT same hence addition not possible.");
                                                 
                                               }
                                               
                                               break;     
                                      case 2 : if (n==p)
                                               {
                                                  int[][] c=new int[m][q]; 
                                                  for (i=0;i<m;i++)
                                                      for (j=0;j<q;j++) 
                                                      {
                                                          int sum=0;
                                                          for (k=0;k<n;k++) 
                                                              sum=sum+a[i][k]*b[k][j]; 
                                                          c[i][j]=sum;
                                                      }
                                                  System.out.println();
                                                  System.out.println("Multiplication of Matrices : ");
                                                  System.out.println();
                                                  for (i=0;i<m;i++)
                                                  {
                                                      for (j=0;j<n;j++)
                                                          System.out.print(c[i][j]+" "); 
                                                      System.out.println();
                                                  }
                                               }
                                               else
                                                  System.out.println("Multiplication not possible.");
                                              
                                               
                                              break; 
                                      case 3 : int[][] c=new int[m][n];
                                               for (i=0;i<m;i++)
                                                      for (j=0;j<n;j++) 
                                                          c[i][j]=a[j][i];
                                               for (i=0;i<n;i++)
                                                  {
                                                      for (j=0;j<m;j++)
                                                          System.out.print(c[i][j]+" "); 
                                                      System.out.println();
                                                  }                                                   
                                               break;
                                     case 4 :                                              
                                             System.out.println("PROCESS Terminated.");
                                             return;
                                     default :                                               
                                              System.out.println("ERROR!!!!!...ENTER valid option.");
                                                             
                               }
              }
      } 
}
