import java.util.*;
class Student
{
       private int rollNo;
       private String name;
       private double percentage;
       static int numberofobjects=0;
       
       public Student(int rollNo,String name,double percentage)
       {
              this.rollNo = rollNo;
              this.name = name;
              this.percentage=percentage;
              numberofobjects++;   
       }
       public double getPercentage()
       {
              return percentage;
       }
        
       public void display()
       {
              System.out.println("Student Roll No : "+rollNo);
              System.out.println("Student NAME : "+name);              
              System.out.println("Percentage: "+percentage);      
       }
       public static void sortStudent(Student[] stds)
       {
              for (int i=0;i<stds.length-1;i++)
                  for (int j=0;j<stds.length-1-i;j++)
                      if (stds[j].getPercentage()<stds[j+1].getPercentage())
                      {
                         Student temp = stds[j];
                         stds[j]=stds[j+1];
                         stds[j+1]=temp;
                      
                      }
       }
}
public class StudentDemo
{
       public static void main (String[] args)
       {
              int n=0;
              Scanner sc=new Scanner(System.in);
              System.out.print(" Enter the no of students : ");
              n=sc.nextInt();
              Student[] stds=new Student[n];
              for (int i=0;i<n;i++)
              {
                  System.out.print("Enter ROLL no : ");
                  int rollNo=sc.nextInt();
                  System.out.print("Enter NAME : ");
                  sc.nextLine();
                  String name=sc.nextLine();              
                  System.out.print("Enter Percentage : ");   
                  double percentage=sc.nextFloat();
                  stds[i]=new Student(rollNo,name,percentage);
  //                System.out.println("no of objects : "+numberofobjects); 
                  System.out.println();                   
              }
              Student.sortStudent(stds);
              System.out.print(" SORTED DATA : ");
             System.out.println();
              for (Student st:stds)
              {
                  st.display();     
                  System.out.println();      
              }   
              
       }
} 
