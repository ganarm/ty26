Better spam filters … 
Now Drive automatically moves suspicious files shared with you to spam. You can still report spam on your own.Learn more

//setA1
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

    public SimpleCalculator() {
        frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());

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

    class DigitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String buttonText = button.getText();
            display.setText(display.getText() + buttonText);
        }
    }

    class OperatorButtonListener implements ActionListener {
        private char op;

        public OperatorButtonListener(char operator) {
            this.op = operator;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            num1 = Double.parseDouble(display.getText());
            operator = op;
            display.setText("");
        }
    }

    class ClearButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
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

//setA2
import javax.swing.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventDemo {
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("Mouse Event Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 200);

        JPanel panel = new JPanel();
        f.add(panel);

        JTextField textField = new JTextField(20);
        panel.add(textField);

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                // Display mouse cursor position during MOUSE_MOVED
                textField.setText("Mouse Position: " + e.getX() + ", " + e.getY());
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // Display mouse click position during MOUSE_CLICKED
                textField.setText("Mouse Clicked at: " + e.getX() + ", " + e.getY());
            }
        });

        f.setVisible(true);
    }
}

//setB1
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;

public class UIGUI {
    private JFrame f;
    private JPanel panel;
    private JLabel nameLabel, classLabel, hobbiesLabel, fontLabel;
    private JTextField nameField;
    private JComboBox<String> classComboBox; // Add a combo box for class
    private JCheckBox sportsCheckBox, musicCheckBox, readingCheckBox;
    private JComboBox<String> fontComboBox; // Add a combo box for font selection
    private JButton submitButton;
    private JTextArea result;

    public UIGUI() {
        f = new JFrame("User Information");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600, 500);

        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        classLabel = new JLabel("Class:");
        String[] classOptions = {"FY", "SY", "TY"};
        classComboBox = new JComboBox<>(classOptions);

        hobbiesLabel = new JLabel("Hobbies:");
        sportsCheckBox = new JCheckBox("Sports");
        musicCheckBox = new JCheckBox("Music");
        readingCheckBox = new JCheckBox("Reading");

        fontLabel = new JLabel("Font:");
        String[] fontOptions = {"Arial", "Times New Roman", "Verdana"};
        fontComboBox = new JComboBox<>(fontOptions);

        submitButton = new JButton("Submit");

        result = new JTextArea(5, 20);
        result.setEditable(false);

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(classLabel);
        panel.add(classComboBox);
        panel.add(hobbiesLabel);
        panel.add(sportsCheckBox);
        panel.add(new JLabel("")); // Empty space for layout
        panel.add(musicCheckBox);
        panel.add(new JLabel("")); // Empty space for layout
        panel.add(readingCheckBox);
        panel.add(new JLabel("")); // Empty space for layout
        panel.add(fontLabel);
        panel.add(fontComboBox);
        panel.add(submitButton);

        f.add(panel, BorderLayout.NORTH);
        f.add(result, BorderLayout.CENTER);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String userClass = classComboBox.getSelectedItem().toString();
                StringBuilder hobbies = new StringBuilder("Selected Hobbies: ");

                if (sportsCheckBox.isSelected()) {
                    hobbies.append("Sports, ");
                }
                if (musicCheckBox.isSelected()) {
                    hobbies.append("Music, ");
                }
                if (readingCheckBox.isSelected()) {
                    hobbies.append("Reading, ");
                }

                String selectedFont = fontComboBox.getSelectedItem().toString();
                Font font = new Font(selectedFont, Font.PLAIN, 12);
                result.setFont(font);

                result.setText("Name: " + name);
                result.append("\nClass: " + userClass);
                result.append("\n" + hobbies.toString());
            }
        });

        f.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new UIGUI());
    }
}


//SetB2

import java.awt.*;
import java.awt.event.*;

public class Login extends Frame 
{
    private TextField usernameField, passwordField;
    private Label usernameLabel, passwordLabel, messageLabel;
    private Button loginButton, clearButton;
    private int attempts = 3;

    public Login() 
    {
        setTitle("Login Screen");
        setSize(500, 300);
        setLayout(new GridLayout(4, 2));
        addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent we) 
            {
                dispose();
            }
        });

        usernameLabel = new Label("Username: ");
        usernameField = new TextField(20);
        passwordLabel = new Label("Password: ");
        passwordField = new TextField(20);
        passwordField.setEchoChar('*');
        messageLabel = new Label("");

        loginButton = new Button("Login");
        clearButton = new Button("Clear");

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(messageLabel);
        add(loginButton);
        add(clearButton);

        loginButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                String username = usernameField.getText();
                String password = passwordField.getText();

                if (attempts > 0) 
                {
                    if (username.equals(password)) 
                    {
                        messageLabel.setText("Login Successful!");
                        attempts = 3; // Reset login attempts
                    } 
                    else 
                    {
                        attempts--;
                        messageLabel.setText("Login Failed. Remaining attempts: " + attempts);
                    }
                } 
                else               
                    messageLabel.setText("Login Attempts Exhausted!");            
            }
        });

        clearButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                usernameField.setText("");
                passwordField.setText("");
                messageLabel.setText("");
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) 
    {
        new Login();
    }
}


