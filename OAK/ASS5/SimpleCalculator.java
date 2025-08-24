import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator 
{
    private JFrame frame;
    private JTextField display;
    private JButton[] db;
    private JButton add, sub, mul, div, per, clearButton, calculate;

    private double num1, num2;
    private char operator;

    public SimpleCalculator() 
    {
        frame = new JFrame("Calculator Made By G.R.Mali");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout()); 
        
        frame.setResizable(false);
        
        display = new JTextField();
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        db = new JButton[10];
        for (int i = 0; i < 10; i++) {
            db[i] = new JButton(String.valueOf(i));
            db[i].addActionListener(new DigitButtonListener());
            buttonPanel.add(db[i]);
        }

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        per = new JButton("%");
        clearButton = new JButton("C");
        calculate = new JButton("=");

        add.addActionListener(new OperatorButtonListener('+'));
        sub.addActionListener(new OperatorButtonListener('-'));
        mul.addActionListener(new OperatorButtonListener('*'));
        div.addActionListener(new OperatorButtonListener('/'));
        per.addActionListener(new OperatorButtonListener('%'));
        clearButton.addActionListener(new ClearButtonListener());
        calculate.addActionListener(new CalculateButtonListener());

        buttonPanel.add(add);
        buttonPanel.add(sub);
        buttonPanel.add(mul);
        buttonPanel.add(div);
        buttonPanel.add(per);
        buttonPanel.add(clearButton);
        buttonPanel.add(calculate);

        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    class DigitButtonListener implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            JButton button = (JButton) e.getSource();
            String buttonText = button.getText();
            display.setText(display.getText() + buttonText);
        }
    }

    class OperatorButtonListener implements ActionListener 
    {
        private char op;

        public OperatorButtonListener(char operator) 
        {
            this.op = operator;
        }

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            num1 = Double.parseDouble(display.getText());
            operator = op;
            display.setText("");
        }
    }

    class ClearButtonListener implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            display.setText("");
            num1 = 0;
            num2 = 0;
            operator = ' ';
        }
    }

    class CalculateButtonListener implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            num2 = Double.parseDouble(display.getText());
            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        display.setText("Error");
                        return;
                    }
                    break;
                case '%':
                    result = num1 % num2;
                    break;
            }

            display.setText(Double.toString(result));
        }
    }

    public static void main(String[] args) 
    {
        new SimpleCalculator();
    }
}
