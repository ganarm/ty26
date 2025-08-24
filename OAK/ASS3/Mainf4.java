import java.util.*;
interface Cubef
{
         int cube(int x);
}
class calculate 
{
      public static void main(String[] args)
      {
            Cubef cfs=(int x)->x*x*x;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Ineteger : ");
            int i=sc.nextInt();
            int result=cfs.cube(i);
            System.out.print("The Cube of "+i+" is : "+result);
            System.out.println("\n");
      }
}
