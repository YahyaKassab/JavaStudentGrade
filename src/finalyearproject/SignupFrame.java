package finalyearproject;
import javax.swing.*;
import java.awt.*;
public class SignupFrame extends JFrame {
    private JTextField usernameField;

    public SignupFrame() {
        initComponents();
    }

    private void initComponents() {
        // Initialize components
        usernameField = new JTextField(20);
        JButton signupButton = new JButton("Signup");

        // Set layout
        setLayout(new FlowLayout());

        // Add components
        add(new JLabel("Name:"));
        add(usernameField);
        add(signupButton);

        // Set frame properties
        setTitle("Signup");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);

        // Ensure frame is opaque
        getContentPane().setBackground(Color.WHITE); // Set background color

        // Add action listener for signup button
        signupButton.addActionListener(e -> signup());
    }

    private void signup() {
        String username = usernameField.getText().trim(); // Get username and trim any leading/trailing spaces

        // Check if username is empty
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name shouldn't be empty", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Username is not empty, proceed with your logic (reading from file, opening main app)
            // ... (replace with your existing code for reading username from the file etc.)

            dispose(); // Close signup frame
            try {
                new MainApp().setVisible(true); // Open main app
            } catch (Exception ex) {
                ex.printStackTrace(); // Handle exception
            }
        }
    }

    public static void main(String[] args) {
        // Run signup frame directly for testing
        java.awt.EventQueue.invokeLater(SignupFrame::new);
    }
}
