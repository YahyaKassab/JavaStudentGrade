package finalyearproject;import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
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
        String[] columnNames = {"Name", "Score", "Grade", "Status"}; // Add "Status" column

        // Create a two-dimensional array to hold the data
        String[][] data = new String[rows.length][4];

        // Populate the data array
        for (int i = 0; i < rows.length; i++) {
            String[] parts = rows[i].split("\\s+");
            data[i][0] = parts[0]; // Name
            data[i][1] = parts[1] + "%"; // Score
            data[i][2] = parts[2]; // Grade
            String status = null;
            if(Integer.parseInt(parts[1]) >= 50){
                status = "Congrats";
            }else{
                status = "Try Again";

            }
            data[i][3] = status; //a button oppe; // Status based on score
        }
        
        // Create a table model with the data and column names
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Create a table with the model
        gradesTable = new JTable(model);

        // Set cell renderer to customize appearance
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer(){
            Font font = new Font("Arial", Font.BOLD, 30); // Define the font
    
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            c.setFont(font); // Set the font for the component
            return c;
        }};
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Apply renderer to each column
        for (int i = 0; i < gradesTable.getColumnCount(); i++) {
            gradesTable.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }

        // Set row height
        gradesTable.setRowHeight(40); // Increase row height

        // Set column width
        for (int i = 0; i < gradesTable.getColumnCount(); i++) {
            gradesTable.getColumnModel().getColumn(i).setPreferredWidth(200); // Increase column width
        }

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(gradesTable);

        // Set layout
        setLayout(new BorderLayout());

        // Add components
        add(scrollPane, BorderLayout.CENTER);

        // Set frame properties
        setTitle("Grades Display");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(900, 500);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }
}
