import java.util.*;
import java.io.*;
public class Reverse
{
       public static void main (String[] args)
       {
              int i;
              Scanner s=new Scanner(System.in);
              System.out.print("Enter the size of array  : ");
              int n=s.nextInt();
              System.out.print("Enter "+n+" Elements : ");
              int[] arr=new int[n];
              for (i=0;i<n;i++)
                  arr[i]=s.nextInt(); 
              System.out.print("Array in Reverse Order : ");
              for (i=n-1;i>=0;i--)
                  System.out.print(arr[i]+" ");
       }
} 
