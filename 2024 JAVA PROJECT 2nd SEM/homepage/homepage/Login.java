package homepage;
import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JTextField usernameField;
    private JTextField passwordField;

    public Login(String usernameFromRegistration, String passwordFromRegistration) {
        
        setTitle("Login Form");
        setSize(450, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon Image = new ImageIcon("Gray.png");
        JLabel Background = new JLabel(Image);
        Background.setBounds(80, 115, 270, 320);
        
        ImageIcon Cursor = new ImageIcon("Cursor2.png");
        JLabel logo = new JLabel(Cursor);
        logo.setBounds(147, 10, Cursor.getIconWidth(), Cursor.getIconHeight());
        
        Font font = new Font("Sans_Seriff", Font.BOLD, 25);

        JPanel panel = new JPanel();
        
        JLabel userLabel = new JLabel("");
        JLabel passLabel = new JLabel(""); 
        
        JLabel LogIn = new JLabel("LogIn to Cursor");
        JLabel Not = new JLabel("Not Signed In?");
        
        usernameField = new JTextField();
        passwordField = new JTextField();
        
        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Sign In");
        
        LogIn.setFont(font);
        LogIn.setBounds(120, 155, 300, 30);
        LogIn.setBackground(new Color(17,18,18));
        LogIn.setForeground(Color.WHITE);
        
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
        
        Not.setBounds(116, 370, 120, 15);
        Not.setBackground(new Color(17,18,18));
        Not.setForeground(new Color(189, 190, 190));
        
        
        loginButton.setBounds(116, 340, 200, 30);
        loginButton.setBackground(new Color (57, 59, 61));
        loginButton.setForeground(new Color (189, 190, 190));
        loginButton.setBorder(BorderFactory.createLineBorder(new Color(189, 190, 190), 2));
        
        registerButton.setBounds(196, 370, 40, 15);
        registerButton.setBackground(new Color (57, 59, 61));
        registerButton.setForeground(new Color (30,144,255));
        registerButton.setBorder(BorderFactory.createEmptyBorder());
        
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                registerButton.setForeground(new Color(0,191,255));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                registerButton.setForeground(new Color (30,144,255));
            }
        });
        
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                loginButton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
                loginButton.setForeground(Color.WHITE);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                loginButton.setBorder(BorderFactory.createLineBorder(new Color(189, 190, 190), 2));
                loginButton.setForeground(new Color (189, 190, 190));
            }
        });
        
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String uname = usernameField.getText();
                String getUname = new String(usernameFromRegistration);
                String pass = passwordField.getText();
                String getPass = new String(passwordFromRegistration);
                
                // Add your login logic here
                if(uname.isEmpty() && pass.isEmpty()){
                    userLabel.setText("Input Your Username");
                    passLabel.setText("Input Your Password");
                }else if(uname.matches(".*[!@#$%^&*(){};:',.<>/?-_=+ ].*") || pass.matches(".*[!@#$%^&*(){};:',.<>/?-_=+ ].*") ){
                    userLabel.setText("No Special Characters Allowed!");
                    passLabel.setText("");
                    usernameField.setText("");
                    passwordField.setText("");
                }else{
                    if(uname.isEmpty() && !pass.isEmpty()){
                        userLabel.setText("Input Your Username First");
                        passLabel.setText("");
                        return;
                    }else if(!uname.equals(getUname)){
                        userLabel.setText("User Not Found");
                        passLabel.setText("");
                        return;
                    }else if (uname.equals(getUname) && pass.isEmpty()){
                        userLabel.setText("");
                        passLabel.setText("Input Your Password");
                        return;
                    }else if (uname.equals(getUname) && !pass.equals(getPass)){
                        userLabel.setText("");
                        passLabel.setText("Incorrect Password");
                        return;
                    }else if(uname.equals(getUname) && pass.equals(getPass));{
                        dispose();
                    }
                } 
            }
        });
        
        registerButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new Register().setVisible(true);
            }
        });

        panel.setLayout(null);
        panel.setBackground(new Color(35, 37, 39));
        panel.add(LogIn);
        panel.add(Not);
        panel.add(userLabel);
        panel.add(usernameField);
        panel.add(passLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(registerButton);
        panel.add(logo);
        panel.add(Background);

        add(panel);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Login("testUser", "testPass"));
    }
}
