import java.util.Date.*;
import java.text.SimpleDateFormat;
import java.io.*;
import java.text.ParseException;
import java.util.Locale;
public class Date
{
       public static void main (String[] args)
       {
              Date d = new Date();
              SimpleDateFormat t= new SimpleDateFormat("dd/MM/yyyy");
              System.out.println("Current date is : "+t.format(d));
       }
} 
