package view.employee;

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

    // this method does not belong here..
    public static void setUpdate(int id) {
        updateMode = id;
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
        clearJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtfld_description = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jCbox_Color = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jCbox_Color1 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jCbox_Color2 = new javax.swing.JComboBox();
        brandJTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        submitJButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        brandJTextField3 = new javax.swing.JTextField();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();

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
        panel1.add(brandJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 160, -1));

        clearJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        clearJButton.setText("CLEAR ALL");
        clearJButton.setMinimumSize(new java.awt.Dimension(70, 25));
        clearJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJButtonActionPerformed(evt);
            }
        });
        panel1.add(clearJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 130, 30));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Color:");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

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
        panel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 100, 30));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Currently logged in as: [username]");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        txtfld_description.setColumns(20);
        txtfld_description.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtfld_description.setRows(5);
        jScrollPane2.setViewportView(txtfld_description);

        panel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 340, 90));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Brand:");
        panel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jCbox_Color.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCbox_Color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbox_ColorActionPerformed(evt);
            }
        });
        panel1.add(jCbox_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 160, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Weight class:");
        panel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jCbox_Color1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCbox_Color1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbox_Color1ActionPerformed(evt);
            }
        });
        panel1.add(jCbox_Color1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 160, -1));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Found at");
        panel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        jCbox_Color2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCbox_Color2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbox_Color2ActionPerformed(evt);
            }
        });
        panel1.add(jCbox_Color2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 160, -1));

        brandJTextField1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        brandJTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandJTextField1ActionPerformed(evt);
            }
        });
        panel1.add(brandJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 160, -1));

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Material:");
        panel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Other details:");
        panel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        submitJButton1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        submitJButton1.setText("SUBMIT");
        submitJButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitJButton1MouseClicked(evt);
            }
        });
        submitJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButton1ActionPerformed(evt);
            }
        });
        panel1.add(submitJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 130, 30));

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("When found:");
        panel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("lable code");
        panel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jDateChooser1.setToolTipText("Pick a date");
        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        panel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 160, -1));

        brandJTextField3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        brandJTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandJTextField3ActionPerformed(evt);
            }
        });
        panel1.add(brandJTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 160, -1));
        panel1.add(jMonthChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private void brandJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandJTextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_brandJTextFieldActionPerformed

    private void clearJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJButtonActionPerformed
        //clear all the fields
        brandJTextField.setText("");
        jCbox_Color.setSelectedIndex(0);
        jCbox_Color1.setSelectedIndex(0);
        brandJTextField2.setText("");
        jCbox_Color2.setSelectedIndex(0);
        brandJTextField1.setText("");
        brandJTextField2.setText("");
        lbl_picname.setText("");
        txtfld_description1.setText("");  
    }//GEN-LAST:event_clearJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        FYSApp.getInstance().showPanel(new LoginScreen());
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        FYSApp.getInstance().showPanel(new FoundLuggageOverview());
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jCbox_ColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbox_ColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbox_ColorActionPerformed

    private void jCbox_Color1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbox_Color1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbox_Color1ActionPerformed

    private void jCbox_Color2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbox_Color2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbox_Color2ActionPerformed

    private void brandJTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandJTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandJTextField1ActionPerformed

    private void submitJButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitJButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_submitJButton1MouseClicked

    private void submitJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButton1ActionPerformed
        try {
            // Code for submission
        } catch (Exception e) {
            // Set warning on label
        }
            
    }//GEN-LAST:event_submitJButton1ActionPerformed

    private void brandJTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandJTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandJTextField3ActionPerformed

    public static void setText(Luggage luggage) {
        brandJTextField.setText(luggage.getBrand());
        txtfld_description.setText(luggage.getDescription());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private static javax.swing.JTextField brandJTextField;
    private static javax.swing.JTextField brandJTextField1;
    private static javax.swing.JTextField brandJTextField3;
    private javax.swing.JButton clearJButton;
    private static javax.swing.JComboBox jCbox_Color;
    private static javax.swing.JComboBox jCbox_Color1;
    private static javax.swing.JComboBox jCbox_Color2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JScrollPane jScrollPane2;
<<<<<<< HEAD
=======
    private javax.swing.JScrollPane jScrollPane3;
    private static javax.swing.JLabel lbl_picname;
    private static javax.swing.JLabel lbl_picname1;
>>>>>>> origin/master
    private javax.swing.JButton logoutJButton;
    private java.awt.Panel panel1;
    private javax.swing.JButton submitJButton1;
    private static javax.swing.JTextArea txtfld_description;
    // End of variables declaration//GEN-END:variables

}
