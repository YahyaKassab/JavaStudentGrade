package finalyearproject;

import javax.swing.JOptionPane;
import java.io.*;
import java.util.logging.*;

public class MainApp extends javax.swing.JFrame {
     private int shomeworks;
     private int stestmarks;
     File file = new File("./DB.txt");
     /**
     * Creates new form MainApp
     */
    public MainApp() throws IOException {

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        stud_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        stud_hwScore = new javax.swing.JTextField();
        stud_tScore = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT GRADING SYSTEM");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Student Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Home work Score not exceeding 30%");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Test score not exceeding 70%");

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 153, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("ADD STUDENT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(255, 153, 0));
        button3.setText("Show Grades");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(204, 204, 204)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(stud_hwScore, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stud_tScore, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stud_name, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(stud_tScore, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stud_name, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stud_hwScore, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(132, 132, 132))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        //Add Student Button
        //Validation rules not null
        if(stud_name.getText().equals("")) {
           JOptionPane.showMessageDialog(null, "Please fill the student Name");
        }else if(stud_hwScore.getText().equals("")){
           
            JOptionPane.showMessageDialog(null, "Homework score must not be empty");
        }else if(stud_tScore.getText().equals("")){
            //check if  marks is an integer
                JOptionPane.showMessageDialog(null, "Test marks must not be empty");
              
        }else{
            int final_ = Integer.parseInt(stud_hwScore.getText()) + Integer.parseInt(stud_tScore.getText());
            String grade;
            if (final_>=90)  grade = "A";
            else if (final_>=75&&final_<90) grade = "B";
            else if (final_>=60&&final_<75) grade = "C";
            else if (final_>=50&&final_<60) grade = "D";
            else grade = "F";

            try {

                //Write Data To The File
                FileWriter fwt = new FileWriter(file, true);
                BufferedWriter bwt = new BufferedWriter(fwt);
                PrintWriter coutr = new PrintWriter(bwt);
                coutr.append(stud_name.getText());
                coutr.append(" "+final_);
                coutr.append(" "+grade+"\n");
                coutr.close();
                System.out.println(stud_name.getText());
            } catch (IOException ex) {
                Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
            }

            //more Validation rules
//            check if value entered is an integer
            String homework = stud_hwScore.getText();

           // ResultSet result;
            
             //validate homework to be only number
            try {
                    shomeworks = Integer.parseInt(homework);
               }
               catch (NumberFormatException e) {
                    //if Not an integer  output this error
                    JOptionPane.showMessageDialog(null, "Homework mark must be an integer value");
 
               }
            //validate test score to be only number
            String test = stud_tScore.getText();
            try {
                    stestmarks = Integer.parseInt(test);
                    
               }
               catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Test marks must be an integer value");
               }
                    if (shomeworks > 30){
                        //JOptionPane.showMessageDialog(null, "Home work should not exceed score of 30%!");
                       JOptionPane.showMessageDialog(null , "Homework score must not exceed 30%" , "Homework" , JOptionPane.INFORMATION_MESSAGE);
                    }else if(stestmarks > 70){
                        JOptionPane.showMessageDialog(null, "Test score must not exceed 70%","testmarks", JOptionPane.INFORMATION_MESSAGE);
                        
                    }else{
                        //clear all fields after insertion
                        stud_name.setText("");
                        stud_hwScore.setText("");
                        stud_tScore.setText("");
                        
                    }
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        //Delete button
         try {
             String studentName = stud_name.getText();
             boolean success = removeLine(studentName);
             if(success) System.out.println("Line Removed Successfully.");
             else System.out.println("Error Removing the line");
         } catch (IOException ex) {
             Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("Error Removing the line");
         }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        try {
            String grades = readFile(); // Read grades from the file or database
            new GradeDisplayFrame(grades).setVisible(true); // Open grade display frame
        } catch (IOException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error reading grades", "Error", JOptionPane.ERROR_MESSAGE);
        }    }//GEN-LAST:event_button3ActionPerformed

    //function to read from the text file
    public String readFile() throws IOException {
        File file = new File("./DB.txt");
        StringBuilder data = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;

        while ((st = br.readLine()) != null){
            data.append(st);
            data.append('\n');
        }
        return data.toString();

    }

    //function to remove the line from the file
        public boolean removeLine(String nameToRemove) throws IOException{

            System.out.println("name to remove: " + nameToRemove);
            String newString = writeToText(nameToRemove);
            boolean success = overwriteFile(newString);
            return success;
         
        }

        //function to overwrite the text file with the new data after line removed
    public boolean overwriteFile(String text){
        try {
            FileWriter fw = new FileWriter("./DB.txt", false);
            fw.write(text);
            fw.close();
            return true;
        }
        catch (Exception e){
            System.out.println("Error Overwriting");
            return false;
        }

    }

    //function that returns a string of the data after removed line
    public String writeToText(String stringToRemove) throws IOException {
        if(stringToRemove.equals("")) {
            System.out.println("String = null\nRead File :\n" + readFile());
            return readFile();
        }else System.out.println("not null");
        File file = new File("./DB.txt");
        StringBuilder dataAfterRemoved = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;

        while ((st = br.readLine()) != null){

            if(st.trim() == null) continue;
            if(st.toLowerCase().contains(stringToRemove.toLowerCase())){
                System.out.println("Line To Remove : " + st);
                continue;
            }
            dataAfterRemoved.append(st);
            dataAfterRemoved.append('\n');


        }
        //String dataAfterRemovedString = dataAfterRemoved.toString().trim();
        System.out.println("data After Line Removed : \n" + dataAfterRemoved.toString());
        br.close();
        return dataAfterRemoved.toString();
    }
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainApp().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button3;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JTextField stud_hwScore;
    public javax.swing.JTextField stud_name;
    public javax.swing.JTextField stud_tScore;
    // End of variables declaration//GEN-END:variables
}
