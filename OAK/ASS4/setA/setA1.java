import java.util.*;
class Patient
{
      String name;
      int age;
      int oxylevel;
      int HRCTreport;
      Patient(String name,int age,int oxylevel,int HRCTreport) 
      {
             this.name=name;
             this.age=age;
             this.oxylevel=oxylevel;
             this.HRCTreport=HRCTreport;
      }
}
public class setA1
{
             public static void main(String[] args)
             {
                 Scanner sc=new Scanner(System.in);
                 System.out.println("How many Patient you want to insert : ");
                 int number=sc.nextInt();
                 Patient[] ob=new Patient[number];
                 for (int j=0;j<number;j++)
                 {
                      System.out.println("Enter Name : ");
                      String name=sc.next();
                      
                      System.out.println("Enter Age : ");
                      int age=sc.nextInt();
                      
                      System.out.println("Enter Oxygen Level : ");
                      int oxylevel=sc.nextInt();
                      
                      System.out.println("Enter HRCTreport : ");
                      int HRCTreport=sc.nextInt();
                      ob[j]=new Patient(name,age,oxylevel,HRCTreport);
                  }
                  for (int j=0;j<number;j++)
                  {
                      if (ob[j].oxylevel < 95 && ob[j].HRCTreport > 10)
                      {
                          try
                          {
                             throw new NullPointerException("NO Covid Positive \n");
                          }
                          catch(Exception e)
                          {
                            System.out.println("Patient is covid positive(+) & need to be Hospitalized : ");
                          }
                      }
                      else
                      {
                          System.out.println("Patient Name : "+ob[j].name);
                          System.out.println("Patient Age : "+ob[j].age);
                          System.out.println("Patient Oxyyen Level : "+ob[j].oxylevel);
                          System.out.println("Patient HRCTreport : "+ob[j].HRCTreport);
                          System.out.println("\n");
                      }
                  }
             }  
}
                      
                      
                      
                      
                      
                      
                      
                      
                      
                      
                      

