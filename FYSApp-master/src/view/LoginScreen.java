package view;

import QueryManager.DatabaseManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.nio.channels.SelectionKey;
import java.sql.*;
import main.FYSApp;
import static main.FYSApp.shutdown;
import view.admin.AdminLuggageFound;
import view.employee.FoundLuggageOverview;
import view.manager.ManagerLuggageFound;

/**
 *
 * @author Team 1 IS106 ZoekJeKoffer
 */

public class LoginScreen extends javax.swing.JPanel {

    // Always declare first. (nullpointerexception H8 guys)
    DatabaseManager dbmanager;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    /**
     * Creates new form LoginScreen
     */
   public LoginScreen() {
        initComponents();
        //  Open the connection by calling the openConnection method from
        // DatabaseManager.java
//        conn = DatabaseManager.openConnection();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2,
                size.height / 2 - getHeight() / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        passJTextField = new javax.swing.JPasswordField();
        userNameJTextField = new javax.swing.JTextField();
        loginJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lbl_defaultvalueusername1 = new javax.swing.JLabel();
        lbl_defaultvaluepassword = new javax.swing.JLabel();
        jWarning = new javax.swing.JLabel();
        btn_cantlogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setPreferredSize(new java.awt.Dimension(1024, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Gabriola", 0, 36)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/zjk logo.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 100, 110));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setName("Login"); // NOI18N

        passJTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        passJTextField.setToolTipText("Fill in your password");
        passJTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        passJTextField.setMaximumSize(new java.awt.Dimension(1024, 600));
        passJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passJTextFieldActionPerformed(evt);
            }
        });

        userNameJTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        userNameJTextField.setToolTipText("Fill in your username");
        userNameJTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userNameJTextField.setMaximumSize(new java.awt.Dimension(1024, 600));
        userNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTextFieldActionPerformed(evt);
            }
        });
        userNameJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userNameJTextFieldKeyPressed(evt);
            }
        });

        loginJButton.setBackground(new java.awt.Color(255, 255, 255));
        loginJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        loginJButton.setText("LOGIN");
        loginJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbl_defaultvalueusername1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_defaultvalueusername1.setText("Username");

        lbl_defaultvaluepassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_defaultvaluepassword.setText("Password");

        jWarning.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_defaultvaluepassword)
                        .addComponent(lbl_defaultvalueusername1)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(passJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbl_defaultvalueusername1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbl_defaultvaluepassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 300, 220));

        btn_cantlogin.setBackground(new java.awt.Color(255, 255, 255));
        btn_cantlogin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_cantlogin.setText("I can't login");
        btn_cantlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cantloginActionPerformed(evt);
            }
        });
        add(btn_cantlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 110, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Corendon_icon.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Corendon-background.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void userNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextFieldActionPerformed

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed

        try {
            
            String userName = userNameJTextField.getText();
            String passWord = passJTextField.getText();
            
            rs = FYSApp.getTableManager().getUserLoginfo(userName);
            boolean exists = FYSApp.getUserManager().userExists(userName);

            //  Down here we need to check the user on its role..
            if (exists = true){
            
            if (rs.next()) {
                String pass = rs.getString("password");
                String role = rs.getString("role");
                if (pass.equals(passWord)){ 
                if (role == null || role.isEmpty()) {
                    // process no role case first - it deals with the null role problem
                }
                    switch (role) {
                        case "manager":
                            FYSApp.getUserManager().setUserName(userName);
                            FYSApp.getUserManager().setAirPort();
                            main.FYSApp.getInstance().showPanel(new ManagerLuggageFound());
                            FYSApp.shutdown();
                            main.Frame.ManagerFrame();
                            break;
                        case "employee":
                            FYSApp.getUserManager().setUserName(userName);
                            FYSApp.getUserManager().setAirPort();
                            main.FYSApp.getInstance().showPanel(new FoundLuggageOverview());
                            
                            FYSApp.shutdown();
                            main.Frame.EmployeeFrame();
                            break;
                        case "admin":
                            FYSApp.getUserManager().setUserName(userName);
                            FYSApp.getUserManager().setAirPort();
                            main.FYSApp.getInstance().showPanel(new AdminLuggageFound());

                            FYSApp.shutdown();
                            main.Frame.AdminFrame();
                            break;
                    }
                }
            } else {
                jWarning.setText("Wrong Username/Password - Please try again");
            }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void passJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passJTextFieldActionPerformed
        // Does the same as the login button, only this will perform when
        // 'enter' has been hitten.    
        loginJButtonActionPerformed(evt);
    }//GEN-LAST:event_passJTextFieldActionPerformed

    private void btn_cantloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cantloginActionPerformed
        FYSApp.getInstance().showPanel(new CantLogin());
    }//GEN-LAST:event_btn_cantloginActionPerformed

    private void userNameJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameJTextFieldKeyPressed
       
        if(evt.getKeyCode() == KeyEvent.VK_TAB){
            passJTextField.setFocusTraversalKeysEnabled(true);
        }
    }//GEN-LAST:event_userNameJTextFieldKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        shutdown();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cantlogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jWarning;
    private javax.swing.JLabel lbl_defaultvaluepassword;
    private javax.swing.JLabel lbl_defaultvalueusername1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JPasswordField passJTextField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
