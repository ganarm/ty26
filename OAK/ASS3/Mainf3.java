import java.util.*;
interface Operation
{
          double PI=3.142;
          double area();
          double volume();
}
class Cylinder implements Operation
{
      private double r;
      private double h;
      public Cylinder (double r,double h)
      {
             this.r=r;
             this.h=h;
      }
      public double area()
      {
             return 2*PI*r*(r+h);
      }
      public double volume()
      {
             return PI*r*h;
      }
}
public class Mainf3
{
       public static void main(String[] agrs)
       {
              Scanner sc=new Scanner(System.in);
              System.out.print("Enter Radius of Cylinder : ");
              int r=sc.nextInt();
              System.out.print("Enter Height of Cylinder : ");
              int h=sc.nextInt();
              Cylinder c=new Cylinder(r,h);
              System.out.print("area of Cylinder : "+c.area());
              System.out.println();
              System.out.print("volume of Cylinder : "+c.volume());
              System.out.println();
          
       }
}
