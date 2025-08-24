package pckg;
import SY.*;
import TY.*;
import java.util.*;

public class Student
{
       int rollNo;
       String name;
       SYMarks sym;
       TYMarks tym;      
       public Student(int rollNo,String name,SYMarks sym,TYMarks tym)
       {
              this.rollNo = rollNo;
              this.name = name;
              this.sym=sym;
              this.tym=tym;  
       }
       public double calculateAverage()
       {
              int totalsym=sym.ComputerTotal;
              int totaltym=tym.Theory+tym.Practicals;
              return ((totalsym+totaltym)/2);
       }
       public char calculateGrade()
       {
              double avg=calculateAverage();
              if (avg>=70)
                 return('A');
              else 
                 if (avg>=60)
                    return('B');
              else 
                 if (avg>=50)
                    return('C');
              else
                 if (avg>=40)
                    return ('P');
              else
                 return ('F');        
       } 
       
       public void display()
       {
              System.out.print("Student Roll No : "+rollNo);
              System.out.println();
              System.out.print("Student NAME : "+name);    
              System.out.println();          
              System.out.print("Computers Avg : "+calculateAverage());  
              System.out.println();
              System.out.print("Grade : "+calculateGrade());
       }
}
/*
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
                  int rn=sc.nextInt();
                  System.out.print("Enter NAME : ");
                  sc.nextLine();
                  String name=sc.nextLine();              
                  System.out.print("Enter Computer Total : ");   
                  int syCs=sc.nextInt();
                  System.out.print("Enter Maths Total : ");  
                  int syMs=sc.nextInt();
                  System.out.print("Enter Electronics Total : ");  
                  int syEs=sc.nextInt();
                  System.out.print("Enter TY Theory Marks : ");  
                  int tyT=sc.nextInt();
                  System.out.print("Enter TY Practical Marks : ");  
                  int tyP=sc.nextInt();
                  SYMarks sym=new SYMarks(syCs,syMs,syEs);
                  TYMarks tym=new TYMarks(tyT,tyP);
                  stds[i]=new Student(rn,name,sym,tym);
               }
        }
} */
