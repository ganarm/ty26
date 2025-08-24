import java.util.*;
class Name
{
       public static void main (String[] args)
       {
             Scanner sc=new Scanner(System.in);
             System.out.println(" Enter Name : ");
             String first=sc.nextLine();
             String second=sc.nextLine();
             String third=sc.nextLine();
             second=second.substring(0,1).toUpperCase()+second.substring(1);
             System.out.println(" Formated Name : "+third+" "+first+" "+second);
       }    
}
