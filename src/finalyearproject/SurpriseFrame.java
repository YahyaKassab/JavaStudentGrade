package finalyearproject;

import javax.swing.*;

public class SurpriseFrame extends JFrame {
    public SurpriseFrame(String status) {
        initComponents(status);
    }
    
    private void initComponents(String status) {
        JLabel statusLabel = new JLabel(status);
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        statusLabel.setVerticalAlignment(SwingConstants.CENTER);
        statusLabel.setFont(statusLabel.getFont().deriveFont(30.0f)); // Increase font size
        
        // Add the status label to the frame's content pane
        getContentPane().add(statusLabel);
        
        // Set frame properties
        setTitle("Surprise");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }
    
    public static void main(String[] args) {
        // Example usage:
        SwingUtilities.invokeLater(() -> {
            new SurpriseFrame("Congrats! You did it!");
        });
    }
}
