import java.io.*;
import java.util.*;
class Rectangle
{
       
       public static void main (String[] args)
       {
              Scanner s=new Scanner(System.in);
              int l,b;
              System.out.print("Enter Lenght : ");
              l=s.nextInt();
              System.out.print("Enter Breadth : ");
              b=s.nextInt();
              System.out.println("Area : "+(l*b));
              System.out.println("Perimeter : "+2*(l+b));
       }
} 
