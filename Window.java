import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {
    JButton submit_button;
    JPasswordField TF_pass;
    JTextField tf_surname;
    JTextField textField_for_name;
    JLabel jLabel;
    JLabel lab11;
    JLabel lab;
    JLabel sur;
    JLabel UN;
    JLabel male = new JLabel();
    JLabel female = new JLabel();
    JFrame f;
    JRadioButton rb;
    JRadioButton rb1;
    private static final String name = "name";
    private static final String surename = "Surname";
    private static final String password = "Password";
    private static final String Pass = "britain";
    private static final String Pass2 = "Britain";
    private static final String labb = "Welcome";
    private static String entered_name;
    private static String entered_surname;
    private static String entered_password;

    public Window() {
        this.setBounds(200, 100, 350, 400);
        this.setTitle("Hello!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        ;
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        jLabel = new JLabel("Welcome Enter your character");
        jLabel.setBounds(100, 50, 400, 120);
        jLabel.setHorizontalTextPosition(JLabel.CENTER);
        jLabel.setVerticalTextPosition(JLabel.TOP);
        jLabel.setForeground(Color.WHITE);
        jLabel.setFont(new Font("MV Boil", Font.PLAIN, 20));
        textField_for_name = new JTextField();
        textField_for_name.setText(name);
        textField_for_name.setBackground(Color.BLACK);
        textField_for_name.setPreferredSize(new Dimension(250, 20));
        textField_for_name.setForeground(new Color(18, 116, 26));
        textField_for_name.setCaretColor(Color.GREEN);
        tf_surname = new JTextField();
        tf_surname.setText(surename);
        tf_surname.setForeground(new Color(18, 116, 26));
        tf_surname.setCaretColor(Color.GREEN);
        tf_surname.setBackground(Color.BLACK);
        tf_surname.setPreferredSize(new Dimension(270, 20));
        rb = new JRadioButton("male");
        rb1 = new JRadioButton("female");
        rb.addActionListener(this);
        rb1.addActionListener(this);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb);
        bg.add(rb1);
        TF_pass = new JPasswordField();
        TF_pass.setPreferredSize(new Dimension(250, 20));
        TF_pass.setForeground(Color.GREEN);
        TF_pass.setBackground(Color.BLACK);
        TF_pass.setCaretColor(Color.GREEN);
        submit_button = new JButton();
        submit_button.setSize(250, 705);
        submit_button.addActionListener(this);
        submit_button.setText("Submit");
        this.add(jLabel);
        this.add(textField_for_name);
        this.add(tf_surname);
        this.add(rb);
        this.add(rb1);
        this.add(TF_pass);
        this.add(submit_button);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit_button) {
            System.out.println("Hello");
            entered_name = textField_for_name.getText();
            entered_surname = tf_surname.getText();
            entered_password = TF_pass.getText();
            if (entered_password.equals(Pass) || entered_password.equals(Pass2)) {
                System.out.println(entered_name + " " + entered_surname + " " + entered_password);
                f = new JFrame();
                f.setTitle("Hello");
                f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                f.setResizable(false);
                f.setBounds(200, 100, 300, 300);
                f.getContentPane().setBackground(Color.LIGHT_GRAY);
                lab = new JLabel();
                lab.setText(labb);
                lab.setHorizontalTextPosition(JLabel.CENTER);
                lab.setVerticalTextPosition(JLabel.TOP);
                lab.setFont(new Font("MV Boil", Font.PLAIN, 20));
                lab.setForeground(Color.RED);
                lab11 = new JLabel();
                lab11.setText("Your surname is: " + entered_surname);
                lab11.setHorizontalTextPosition(JLabel.CENTER);
                lab11.setVerticalTextPosition(JLabel.TOP);
                lab11.setFont(new Font("MV Boil", Font.PLAIN, 20));
                sur = new JLabel();
                sur.setText("Your password is: " + entered_password);
                sur.setHorizontalTextPosition(JLabel.CENTER);
                sur.setVerticalTextPosition(JLabel.TOP);
                sur.setFont(new Font("MV Boil", Font.PLAIN, 20));
                f.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
                UN = new JLabel();
                UN.setText("Your Name is: " + entered_name);
                UN.setHorizontalTextPosition(JLabel.CENTER);
                UN.setVerticalTextPosition(JLabel.TOP);
                UN.setFont(new Font("MV Boil", Font.PLAIN, 25));
                f.add(lab);
                f.add(UN);
                f.add(lab11);
                f.add(sur);
                f.setVisible(true);
            }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

}
