import java.util.*;
class Employee
{
       int id;
       String name;
       String deptname;
       float salary;
       static int numberofobjects=0;
       Employee()
       {
              id = 0;
              name ="";
              deptname="";
              salary=0;      
       }
       Employee(int id,String name,String deptname,float salary)
       {
              this.id = id;
              this.name = name;
              this.deptname= deptname;
              this.salary=salary;   
              numberofobjects++;   
       }
       public void display()
       {
              System.out.println("Employee ID : "+id);
              System.out.println("Employee NAME : "+name);              
              System.out.println("Employee DEPARTMENT NAME : "+deptname);
              System.out.println("Employee SALARY : "+salary);      
       }
      
       public static void main (String[] args)
       {
              int n=0;
              Scanner sc=new Scanner(System.in);
              System.out.println(" How Many EMPLOYEES you want to enter : ");
              n=sc.nextInt();
              Employee[] ob=new Employee[n];
              for (int i=0;i<n;i++)
              {
                  System.out.print("Enter Employee ID : ");
                  int id=sc.nextInt();
                  System.out.print("Enter Employee NAME : ");
                  sc.nextLine();
                  String name=sc.nextLine();              
                  System.out.print("Enter Employee DEPARTMENT NAME : ");
                  String deptname=sc.nextLine();  
                  System.out.print("Enter Employee SALARY : ");    
                  float salary=sc.nextFloat();
                  ob[i]=new Employee(id,name,deptname,salary);
                  System.out.println("no of objects : "+numberofobjects); 
                  System.out.println();                   
              }
              for (int i=0;i<n;i++)
                  ob[i].display();              
              
       }
} 
