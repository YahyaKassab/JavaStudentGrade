package finalyearproject;

import javax.swing.*;

public class FinalYearProject {

    public static void main(String[] args) {

        try {
            // Splash for the first screen
            // good-looking visual loading screen
            Splash spl = new Splash();
            spl.setVisible(true);
            for (int i = 0; i <= 100; i++) {
                // set the sleep time of the loader
                Thread.sleep(45);
                spl.loadingNum.setText("Loading..." + Integer.toString(i) + " %");
                spl.jProgressBarload.setValue(i);
                // open grading panel if loading in the progress bar is over
                if (i == 100) {
                    JOptionPane.showMessageDialog(null, "Completed. Click OK to continue.");
                    
                    // Our main app is showed here when the loading is done
                    LoginPage app = new LoginPage();
                    spl.setVisible(false);
                    Thread.sleep(45);
                    app.setVisible(true);
                    break; // Exit the loop once the login frame is shown
                } else if (i == 45) {
                    spl.guides_add.setText("Please wait while setting things in order");
                    try {

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (i == 90) {
                    try {
                        // JOptionPane.showMessageDialog(null, " Table has been created successfully");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    spl.guides_add.setText("All data created.");
                } else if (i == 99) {
                    spl.guides_add.setText("Enjoy our service! Thanks!!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
