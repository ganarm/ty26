import java.util.*;
class Continent
{
      String c;
      public Continent (String c)
      {
             this.c=c;
      }
      void displaycont()
      {
           System.out.println("Continent Name : "+c);
      }
}
class Country extends Continent
{
      String co;
      public Country (String co,String c)
      {
             super(c);
             this.co=co;      
      }
      void displayc()
      {
           System.out.println("Country Name : "+co);
           displaycont();
      }
}
class State extends Country
{
      String s;
      public State (String s,String co,String c)
      {
             super(co,c);
             this.s=s;
                  
      }  
      void display()
      {
           System.out.println("State Name : "+s);
           displayc();
      }  
}
class Mainf
{
      public static void main(String[] args)
      {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter State Name : ");
            String n=sc.nextLine();
            System.out.print("Enter Country Name : ");
            String p=sc.nextLine();
            System.out.print("Enter Continent Name : ");
            String q=sc.nextLine();
            State c=new State(n,p,q);
            c.display();
             
      }
}


