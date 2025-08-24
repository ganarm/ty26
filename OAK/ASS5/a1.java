import java.io.*;
import javax.swing.*;
import java.awt.*;
public class MouseEventDemo
{
       public static void main(String[] args)
       {
              JFrame f = new JFrame("MouseEventDemo");
              f.setDefaultCloseOperation(JFrame.EXIT_NO_CLOSE);
              f.setSize(400,400);
              JPanel panel=new JPanel();
              f.add(panel);
              JTextField t = new JTextField(20);
              panel.add(t);
              panel.addMouseListener(new MouseAdapter()
              {
                   @Override
                   public void MouseMoved(MouseEvent e)
                   {
                          t.setText("Mouse Position "+e.getx()+","+e.gety());
                   }
                   @Override
                   public void mouse(licked(MouseEvent e))
                   {
                          t.setText("MouseClickedat:"+e.getx()+","+e.gety());
                   }
              
              });
              f.setVisible(true);
       }
}
