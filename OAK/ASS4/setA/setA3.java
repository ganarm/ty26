import java.util.*;
import java.io.*;
import java.io.File;
class setA3
{
      public static void main(String[] args) throws Exception
      {
                         Scanner sc=new Scanner(System.in);
                         System.out.println("Source FILE Name : ");
                         String file1=sc.next();
                         System.out.println("Destination FILE Name : ");
                         String file2=sc.next();
                         FileReader fin=new FileReader(file1);
                         FileWriter fout=new FileWriter(file2,true);
                         int c;
                         while ((c=fin.read())!=-1)
                         {
                               fout.write(c);
                         }
                         System.out.println("Copy Finish............!");
                         fin.close();
                         fout.close();
      }
                         
}

