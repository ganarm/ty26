import java.io.*;
import java.util.*;
class Menu
{
     public static void main (String[] args)
     {
              Scanner s=new Scanner(System.in);
              int c,r=1,h,i;
              double PI=3.142;
              mainLoop : while (true)
              {
                               System.out.println("i.Calculate the volume of cylinder.");
                               System.out.println("ii.Find the factorial of given number.");
                               System.out.println("iii.Check the number is Armstrong OR not.");
                               System.out.println("iv.Exit.");
                               System.out.print("Enter your choice : ");
                               c=s.nextInt();
                               switch (c)
                               {
                                      case 1 : System.out.print("Enter the height of cylinder :");
                                               h=s.nextInt();
                                               System.out.print("Enter the radius of cylinder :");
                                               r=s.nextInt();
                                               System.out.println("Volume of cylinder :"+PI*r*r*h);     
                                               break;     
                                      case 2 : System.out.print("Enter the number :");
                                               h=s.nextInt();
                                               r=1;
                                               for (i=1;i<=h;i++)
                                                   r=r*i;   
                                               System.out.println("Factorial of the number :"+r);
                                               break; 
                                      case 3 : System.out.print("Enter the number :");
                                               h=s.nextInt();
                                               r=h;
                                               int rem,result=0;
                                               while (r!=0)
                                               {
                                                      rem=r%10;
                                                      result=result+(rem*rem*rem);
                                                      r=r/10;
                                               }
                                               if (result==h)
                                                  System.out.println(h+" is Armstrong Number.");
                                               else
                                                  System.out.println(h+" is NOT Armstrong Number.");
                                               break;
                                      case 4 : System.out.println("Thank You...Program Terminated.");
                                               break mainLoop;                              
                               }
              }
      } 
}
