package finalyearproject;


import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginFrame() {
        initComponents();
    }

    private void initComponents() {
        // Initialize components
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");

        // Set layout
        setLayout(new FlowLayout());

        // Add components
        add(new JLabel("Name:"));
        add(usernameField);
        add(loginButton);

        // Set frame properties
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);

        // Ensure frame is opaque
        getContentPane().setBackground(Color.WHITE); // Set background color

        // Add action listener for login button
        loginButton.addActionListener(e -> login());
    }

    private void login() {
        // Read username from the file
        String usernameToMatch = usernameField.getText().trim();
        boolean validUsername = false;
    
        try (BufferedReader br = new BufferedReader(new FileReader("./DB.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line by whitespace and get the first element (the name)
                String[] parts = line.split("\\s+");
                String name = parts[0]; // Assuming the name is the second element
    
                // Check if the entered username matches the name
                if (name.equals(usernameToMatch)) {
                    validUsername = true;
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        if (validUsername) {
            // Successful login, close the login frame and open main app
            dispose(); // Close login frame
            try {
                new MainApp().setVisible(true); // Open main app
            } catch (Exception ex) {
                ex.printStackTrace(); // Handle exception
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Name", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    

    public static void main(String[] args) {
        // Run login frame directly for testing
        java.awt.EventQueue.invokeLater(LoginFrame::new);
    }
}
