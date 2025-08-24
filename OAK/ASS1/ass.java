import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Locale;
public class ass 
{
       public static void main (String[] args)
       {
              Date d = new Date();
              SimpleDateFormat t1= new SimpleDateFormat("dd/MM/yyyy");
              SimpleDateFormat t2= new SimpleDateFormat("dd-MM-yyyy");
              SimpleDateFormat t3= new SimpleDateFormat("EEEE MMMM dd yyyy");
              SimpleDateFormat t4= new SimpleDateFormat("EEE MMMM dd HH:mm:ss z yyyy");
              SimpleDateFormat t5= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a Z");
              SimpleDateFormat t6= new SimpleDateFormat("HH:mm:ss");
              SimpleDateFormat t7= new SimpleDateFormat("ww");
              SimpleDateFormat t8= new SimpleDateFormat("W");
              SimpleDateFormat t9= new SimpleDateFormat("D");
              System.out.println("Current date is : "+t1.format(d));
              System.out.println("Current date is : "+t2.format(d));
              System.out.println("Current date is : "+t3.format(d));
              System.out.println("Current date is : "+t4.format(d));
              System.out.println("Current date is : "+t5.format(d));
              System.out.println("Current time is : "+t6.format(d));
              System.out.println("Current week of year is : "+t7.format(d));
              System.out.println("Current week of month : "+t8.format(d));
              System.out.println("Current day of the year : "+t9.format(d));
       }
} 
