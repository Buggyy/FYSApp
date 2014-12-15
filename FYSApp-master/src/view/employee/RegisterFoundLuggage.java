package view.employee;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import main.FYSApp;
import model.Luggage;
import view.LoginScreen;

/**
 *
 * @author Team 1 IS106
 */
public class RegisterFoundLuggage extends JPanel {

    private static int updateMode = 0;
    private static int luggageid;
    /**
     * Creates new form AddUser
     */
    public RegisterFoundLuggage() {
        initComponents();
    }
    
    public static void setUpdate(int id){
        updateMode =  id;
        luggageid = id;
        // object aanmaken voor de edit
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        brandJTextField = new javax.swing.JTextField();
        weightJTextField = new javax.swing.JTextField();
        descriptionJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        clearJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        logoutJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setPreferredSize(new java.awt.Dimension(1024, 600));

        panel1.setBackground(new java.awt.Color(255, 102, 102));
        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel1.setName("Register Found Luggage"); // NOI18N
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Register Found Luggage - Employee");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 380, 40));

        brandJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        brandJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandJTextFieldActionPerformed(evt);
            }
        });
        panel1.add(brandJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 190, -1));

        weightJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        weightJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightJTextFieldActionPerformed(evt);
            }
        });
        panel1.add(weightJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 50, -1));

        descriptionJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        descriptionJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionJTextFieldActionPerformed(evt);
            }
        });
        panel1.add(descriptionJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 340, 170));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Description");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        clearJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        clearJButton.setText("CLEAR");
        clearJButton.setEnabled(false);
        clearJButton.setMinimumSize(new java.awt.Dimension(70, 25));
        clearJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJButtonActionPerformed(evt);
            }
        });
        panel1.add(clearJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 130, 60));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Brand");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("KG");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        submitJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        submitJButton.setText("SUBMIT");
        submitJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitJButtonMouseClicked(evt);
            }
        });
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        panel1.add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 130, 60));

        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        panel1.add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 90, 30));

        backJButton.setText("BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        panel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, 100, 50));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Weight");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Currently logged in as: [username]");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Corendon-background.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void brandJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandJTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_brandJTextFieldActionPerformed

    private void clearJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearJButtonActionPerformed

    private void weightJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightJTextFieldActionPerformed

    private void descriptionJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionJTextFieldActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
 
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        FYSApp.getInstance().showPanel(new LoginScreen());
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        try {
            try {
                FYSApp.getInstance().showPanel(new FoundLuggageOverview());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RegisterFoundLuggage.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterFoundLuggage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitJButtonMouseClicked
        // Get de input van de user in de textfields en stopt dit
        // in variabelen, vervolgens geeft ie deze mee aan de addLuggage
        // methode zodat de koffer geregistreerd wordt. :D
        
        String weight = weightJTextField.getText(); 
        String brand = brandJTextField.getText(); 
        String description = descriptionJTextField.getText(); 
        String status = "found";
        
        Luggage luggage = new Luggage(weight,brand,description,status);
        

        if (updateMode > 1){
            FYSApp.getQueryManager().updateLuggage(luggage,luggageid);
        } else {
            FYSApp.getQueryManager().addFoundLuggage(luggage);
        }
        
        try {
            FYSApp.getInstance().showPanel(new FoundLuggageOverview());
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RegisterFoundLuggage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitJButtonMouseClicked

    public static void setText(Luggage luggage){
        brandJTextField.setText(luggage.getBrand());
        weightJTextField.setText(luggage.getWeight());
        descriptionJTextField.setText(luggage.getDescription());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private static javax.swing.JTextField brandJTextField;
    private javax.swing.JButton clearJButton;
    private static javax.swing.JTextField descriptionJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton logoutJButton;
    private java.awt.Panel panel1;
    private javax.swing.JButton submitJButton;
    private static javax.swing.JTextField weightJTextField;
    // End of variables declaration//GEN-END:variables
}
