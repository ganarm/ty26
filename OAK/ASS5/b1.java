import java.io.*;
import javax.swing.*;
import java.awt.*;
public class b1
{
       public static void main(String[] args)
       {
              JFrame f = new JFrame("GUI Screen");
              f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              f.setSize(400,400);
              f.setVisible(true);
              TextArea t=new TextArea(10,20);
              f.add(t);
        //      t.setBounds(10,10,10,40);
              
       }
}
