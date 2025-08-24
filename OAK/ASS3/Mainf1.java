import java.util.*;

interface Marker
{     
}

class Product implements Marker
{
      int id;
      String name;
      float cost;
      int quantity;
      static count=0;
      Product(int id,String name,float cost,int quantity)
      {
                this.id=id;
                this.name=name;
                this.cost=cost;
                this.quantity=quantity;
                count++;
                
      }
      void display()
      {
           System.out.print("Product ID : "+id);
           System.out.println();
           System.out.print("Product Name : "+name);
           System.out.println();
           System.out.print("Cost : "+cost);
           System.out.println();
           System.out.print("Quantity : "+quantity);
      }
      void dis()
      {
           System.out.print("Product Count: "+count);
           System.out.println();
      }
}
class Mainf1
{
      public static void main(String[] args)
      {
             Scanner sc=new Scanner(System.in);
             System.out.print("Enter the no. of products : ");
             int n=sc.nextInt();
             Product[] c=new Product[n]; 
             for (int i=0;i<n;i++)
             {
                 System.out.print("Enter the ID : ");
                 int id=sc.nextInt();
                 System.out.println();
                 System.out.print("Enter the Name : "); 
                 String nm=sc.nextLine();
                 System.out.print("Enter the Cost : "); 
                 float co=sc.nextFloat();
                 System.out.print("Enter the Quantity : "); 
                 int q=sc.nextInt();
                 c[i]=new Product(id,nm,co,q);
             }
             for (int i=0;i<n;i++)
                 c[i].display();
             
      }
}


