import javax.swing.*;
import java.awt.event.*;
import java.awt.event.*;

public class MouseEventDemo {
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("Mouse Event Demo");
     //   JLabel l=new JLabel();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);

        JPanel panel = new JPanel();
        f.add(panel);
      //  f.add(l);
        JTextField textField = new JTextField(20);
        panel.add(textField);

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField.setText("Mouse Clicked at: X=" + e.getX() + ", Y=" + e.getY());
            }
        });
      /*  panel.addMouseMotionListener(new MouseMotionAdapter()
        {
              public void mouseMoved(MouseEvent me)
              {
                    l.setText("Mouse Moved : X="+me.getX()+" Y="+me.getY());
              }
        });*/
        f.setVisible(true);
    }
}
