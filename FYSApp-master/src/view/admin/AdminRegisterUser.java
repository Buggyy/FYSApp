package view.admin;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import main.FYSApp;
import static main.FYSApp.ZERO;
import static main.FYSApp.*;
import main.Frame;
import model.User;

/**
 * @version 1
 * @author Team 1 IS106 ZoekJeKoffer: chrisverra, amrishheddes, stefanlobato,
 * jerryrump, larsvanalphen, marijnbakker, danielstern Doel: Het maken van een
 * kofferapplicatie.
 */
public class AdminRegisterUser extends JPanel {

    private static int updateMode = (int) ZERO;
    private static int userId = (int) ZERO;

    /**
     * Creates new form UserOverview
     */
    public AdminRegisterUser() {
        initComponents();

        // Add roles to the combobox.
        roleJComboBox.addItem("employee");
        roleJComboBox.addItem("manager");
        roleJComboBox.addItem("admin");

        //  method to fill airport combobox
        setAirports();
        setLoggedInAs();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        logoutJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        clearJButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        firstNameJTextField = new javax.swing.JTextField();
        middleNameJTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lastNameJTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        emailJTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        passJTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        airportJComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loggedInAs = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 255));
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setPreferredSize(new java.awt.Dimension(1024, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back-2-2-icon.png"))); // NOI18N
        backJButton.setText("BACK");
        backJButton.setBorder(null);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, 100, 30));

        logoutJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout-icon.png"))); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 20, -1, 30));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contact details");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 230, 30));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add-icon.png"))); // NOI18N
        jLabel3.setText("   Register new user");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 230, 30));

        submitJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/check-icon.png"))); // NOI18N
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
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 130, 40));

        clearJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete-icon.png"))); // NOI18N
        clearJButton.setText("CLEAR");
        clearJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJButtonActionPerformed(evt);
            }
        });
        add(clearJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 130, 40));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Firstname");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        firstNameJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        firstNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameJTextFieldActionPerformed(evt);
            }
        });
        add(firstNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 190, -1));

        middleNameJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        middleNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleNameJTextFieldActionPerformed(evt);
            }
        });
        add(middleNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 190, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Middlename");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        lastNameJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lastNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameJTextFieldActionPerformed(evt);
            }
        });
        add(lastNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 190, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Lastname");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        emailJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        emailJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailJTextFieldActionPerformed(evt);
            }
        });
        add(emailJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 190, -1));

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Username");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        userNameJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        userNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTextFieldActionPerformed(evt);
            }
        });
        add(userNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 190, -1));

        passJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        passJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passJTextFieldActionPerformed(evt);
            }
        });
        add(passJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 190, -1));

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Password");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Role");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        roleJComboBox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });
        add(roleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 190, -1));

        airportJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
        airportJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airportJComboBoxActionPerformed(evt);
            }
        });
        add(airportJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 190, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Airport");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 80, 20));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Currently logged in as: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        loggedInAs.setForeground(new java.awt.Color(255, 255, 255));
        loggedInAs.setText("jLabel2");
        add(loggedInAs, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Corendon-background.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1024, 600));
        jLabel1.setMinimumSize(new java.awt.Dimension(1024, 600));
        jLabel1.setPreferredSize(new java.awt.Dimension(1024, 600));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        //  Logout and stop the application
        FYSApp.logout();
        Frame.shutdown();
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        // Store user input in variables
        String userName = userNameJTextField.getText();
        String pass = passJTextField.getText();
        String role = String.valueOf(roleJComboBox.getSelectedItem());
        String firstName = firstNameJTextField.getText();
        String middleName = middleNameJTextField.getText();
        String lastName = lastNameJTextField.getText();
        String email = emailJTextField.getText();
        String airport = String.valueOf(airportJComboBox.getSelectedItem());

        //  Make sure some important fields are not empty
        if (userName.equalsIgnoreCase("") || pass.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null,
                    "Username and Password should be filled.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            Frame.getInstance().showPanel(new AdminRegisterUser());
        } else {
            // Create a new user object from the variables above
            User user = new User(userName, pass, role, firstName, middleName,
                    lastName, email, airport);

            //  If the row is selected and user clicked on edit
            if (updateMode > 1) {
                FYSApp.getUserManager().updateUser(user, userId);
            } else {
                FYSApp.getUserManager().addUser(user);
            }
            try {
                Frame.getInstance().showPanel(new AdminUsers());
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(AdminRegisterUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void clearJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJButtonActionPerformed
        // Clear all the fields
        userNameJTextField.setText("");
        passJTextField.setText("");
        roleJComboBox.setSelectedIndex(0);
        firstNameJTextField.setText("");
        middleNameJTextField.setText("");
        emailJTextField.setText("");
        airportJComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_clearJButtonActionPerformed

    private void firstNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameJTextFieldActionPerformed

    private void middleNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middleNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middleNameJTextFieldActionPerformed

    private void lastNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameJTextFieldActionPerformed

    private void emailJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailJTextFieldActionPerformed

    private void userNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextFieldActionPerformed

    private void passJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passJTextFieldActionPerformed

    private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBoxActionPerformed

    }//GEN-LAST:event_roleJComboBoxActionPerformed

    private void submitJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitJButtonMouseClicked

    }//GEN-LAST:event_submitJButtonMouseClicked

    private void airportJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airportJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airportJComboBoxActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        try {
            Frame.getInstance().showPanel(new AdminUsers());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminRegisterUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backJButtonActionPerformed

    public static void setText(User user) {
        //  Fill in the edit screen with current record variables
        userNameJTextField.setText(user.getUserName());
        passJTextField.setText(user.getPass());
        firstNameJTextField.setText(user.getFirstName());
        middleNameJTextField.setText(user.getMiddleName());
        lastNameJTextField.setText(user.getLastName());
        roleJComboBox.setSelectedItem(user.getRole());
        emailJTextField.setText(user.getEmail());
        airportJComboBox.setSelectedItem(user.getAirport());
    }

    public static void setUpdate(int update, int userId) {
        AdminRegisterUser.updateMode = update;
        AdminRegisterUser.userId = userId;
    }

    //  Populate combobox with airports
    public void setAirports() {
        ArrayList<String> airPorts = FYSApp.getQueryManager().getAirports();
        for (String airPortsBox : airPorts) {
            airportJComboBox.addItem(airPortsBox);
        }
    }

    private void setLoggedInAs() {
        String userName = FYSApp.getUserManager().getUserName();
        loggedInAs.setText(userName);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JComboBox airportJComboBox;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton clearJButton;
    private static javax.swing.JTextField emailJTextField;
    private static javax.swing.JTextField firstNameJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private static javax.swing.JTextField lastNameJTextField;
    private javax.swing.JLabel loggedInAs;
    private javax.swing.JButton logoutJButton;
    private static javax.swing.JTextField middleNameJTextField;
    private static javax.swing.JTextField passJTextField;
    private static javax.swing.JComboBox roleJComboBox;
    private javax.swing.JButton submitJButton;
    private static javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
