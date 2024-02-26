package homepage;
import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame {
    private JTextField usernameField;
    private JTextField passwordField;
    public Register() {
        Components();
    }
    private void Components(){
        setTitle("Registration Form");
        setResizable(false);
        setSize(450, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon Cursor = new ImageIcon("Cursor2.png");
        JLabel logo = new JLabel(Cursor);
        logo.setBounds(147, 10, Cursor.getIconWidth(), Cursor.getIconHeight());
        
        ImageIcon Image = new ImageIcon("Gray.png");
        JLabel Background = new JLabel(Image);
        Background.setBounds(80, 115, 270, 320);
        
        ImageIcon Parts = new ImageIcon("Parts.jpg");
        JLabel BackgroundParts = new JLabel(Parts);
        BackgroundParts.setBounds(-82, -20, Parts.getIconWidth(), Parts.getIconHeight());
        
        Font font = new Font("Sans_Seriff", Font.BOLD, 14);
        
        JPanel panel = new JPanel();
        
        JLabel userLabel = new JLabel("");
        JLabel passLabel = new JLabel("");
        
        JLabel SignIn = new JLabel("SIGN UP AND START UPGRADING!");
        
        usernameField = new JTextField();
        passwordField = new JTextField();
       
        JButton registerButton = new JButton("Sign Up");
        
        SignIn.setFont(font);
        SignIn.setBounds(98, 155, 300, 30);
        SignIn.setBackground(new Color(17,18,18));
        SignIn.setForeground(Color.WHITE);
        
        usernameField.setBounds(116, 205, 200, 30);
        usernameField.setBackground(new Color(17,18,18));
        usernameField.setForeground(new Color(189, 190, 190));
        usernameField.setBorder(BorderFactory.createLineBorder(new Color(189, 190, 190), 2));
        
        userLabel.setBounds(116, 185, 300, 20);
        userLabel.setBackground(new Color(17,18,18));
        userLabel.setForeground(new Color(189, 190, 190));
        
        passwordField.setBounds(116, 260, 200, 30);
        passwordField.setBackground(new Color(17,18,18));
        passwordField.setForeground(new Color(189, 190, 190));
        passwordField.setBorder(BorderFactory.createLineBorder(new Color(189, 190, 190), 2));
        
        passLabel.setBounds(116, 235, 300, 30);
        passLabel.setBackground(new Color(17,18,18));
        passLabel.setForeground(new Color(189, 190, 190));
        
        registerButton.setBounds(116, 340, 200, 30);
        registerButton.setBackground(new Color (145,146,147));
        registerButton.setForeground(new Color(47, 49, 51));
        registerButton.setBorder(BorderFactory.createEmptyBorder());
        
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                registerButton.setBackground(Color.WHITE);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                registerButton.setBackground(new Color (145,146,147));
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                int userlength = usernameField.getText().length();
                String password = passwordField.getText();
                int passlength = passwordField.getText().length();
                
                if(username.isEmpty() && password.isEmpty()){
                    userLabel.setText("Create Your Username");
                    passLabel.setText("Create Your Password");
                    usernameField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    passwordField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    return;
                }else if(username.matches(".*[!@#$%^&*(){};:',.<>/?-_=+ ].*") || password.matches(".*[!@#$%^&*(){};:',.<>/?-_=+ ].*") ){
                    userLabel.setText("No Special Characters Allowed!");
                    passLabel.setText("");
                    usernameField.setText("");
                    passwordField.setText("");
                    usernameField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    passwordField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    return;
                }else{
                    if(userlength < 6 && userlength > 0){
                        userLabel.setText("Atleast 6 Characters Long");
                        usernameField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                        passLabel.setText("");
                        passwordField.setBorder(BorderFactory.createLineBorder(new Color(189, 190, 190), 2));
                        
                        return;
                    }else if(!username.isEmpty() && password.isEmpty()){
                        userLabel.setText("");
                        usernameField.setBorder(BorderFactory.createLineBorder(new Color(189, 190, 190), 2));
                        passLabel.setText("Create Your Password");
                        passwordField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                        return;
                    }else if(username.isEmpty() && !password.isEmpty()){
                        userLabel.setText("Create Your Username First");
                        usernameField.setBorder(BorderFactory.createLineBorder(Color.red, 2));                        
                        passLabel.setText("");
                        passwordField.setBorder(BorderFactory.createLineBorder(new Color(189, 190, 190), 2));
                        return;
                    }else if(userlength >= 6 && passlength < 6){
                        userLabel.setText("");
                        usernameField.setBorder(BorderFactory.createLineBorder(new Color(189, 190, 190), 2)); 
                        passLabel.setText("Atleast 6 Characters Long");
                        passwordField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                        return;
                    }
                }
                dispose();
                new Login(username, password); // Open the login form with the entered username
            }
        });

        panel.setLayout(null);
        panel.add(SignIn);
        panel.add(userLabel);
        panel.add(usernameField);
        panel.add(passLabel);
        panel.add(passwordField);
        panel.add(registerButton);
        panel.add(logo);
        panel.add(Background);
        panel.add(BackgroundParts);
        
        add(panel);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Register());

    }
}
