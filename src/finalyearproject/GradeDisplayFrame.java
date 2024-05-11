package finalyearproject;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class GradeDisplayFrame extends JFrame {
    private JTable gradesTable;

    public GradeDisplayFrame(String grades) {
        initComponents(grades);
    }

    private void initComponents(String grades) {
        // Split the grades data into rows
        String[] rows = grades.split("\\n");

        // Define column names
        String[] columnNames = {"Name", "Score", "Grade"};

        // Create a two-dimensional array to hold the data
        String[][] data = new String[rows.length][3];

        // Populate the data array
        for (int i = 0; i < rows.length; i++) {
            String[] parts = rows[i].split("\\s+");
            data[i][0] = parts[0]; // Name
            data[i][1] = parts[1]; // Score
            data[i][2] = parts[2]; // Grade
        }

        // Create a table model with the data and column names
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Create a table with the model
        gradesTable = new JTable(model);

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(gradesTable);

        // Set layout
        setLayout(new BorderLayout());

        // Add components
        add(scrollPane, BorderLayout.CENTER);

        // Set frame properties
        setTitle("Grades Display");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 300);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }
}
