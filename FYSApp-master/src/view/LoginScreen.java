package view;

import connectivity.DatabaseManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.nio.channels.SelectionKey;
import java.sql.*;
import main.FYSApp;
import view.admin.AdminFront;
import view.employee.EmployeeFront;
import view.manager.ManagerFront;

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

        pnl_login = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        userNameJTextField = new javax.swing.JTextField();
        loginJButton = new javax.swing.JButton();
        passJTextField = new javax.swing.JPasswordField();
        cantLoginJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setPreferredSize(new java.awt.Dimension(1024, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_login.setBackground(new java.awt.Color(255, 255, 255));
        pnl_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        pnl_login.setMaximumSize(new java.awt.Dimension(1024, 600));
        pnl_login.setMinimumSize(new java.awt.Dimension(1024, 600));

        userNameJTextField.setToolTipText("Fill in your Username");
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
        loginJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        loginJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login-icon.png"))); // NOI18N
        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        passJTextField.setToolTipText("Fill in your password");
        passJTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        passJTextField.setMaximumSize(new java.awt.Dimension(1024, 600));
        passJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passJTextFieldActionPerformed(evt);
            }
        });

        cantLoginJButton.setBackground(new java.awt.Color(255, 255, 255));
        cantLoginJButton.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        cantLoginJButton.setText("I can't login");
        cantLoginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantLoginJButtonActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(cantLoginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cantLoginJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(loginJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("ZoekJeKoffer");

        javax.swing.GroupLayout pnl_loginLayout = new javax.swing.GroupLayout(pnl_login);
        pnl_login.setLayout(pnl_loginLayout);
        pnl_loginLayout.setHorizontalGroup(
            pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnl_loginLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_loginLayout.setVerticalGroup(
            pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_loginLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(427, Short.MAX_VALUE))
        );

        add(pnl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 172, 370, 190));
    }// </editor-fold>//GEN-END:initComponents

    private void userNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextFieldActionPerformed

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // Getting inputs from user. Getting the role and password from the 
        // Querymanager. After that it will match the password, if it's
        // correct it will get the users role and let the user go to the
        // right screen. If the password is not correct it wil print out
        // an error message.
        
        try {
            
            String userName = userNameJTextField.getText();
            String passWord = passJTextField.getText();
            
            rs = FYSApp.getQueryManager().getUserLoginfo(userName);
           

            //  Down here we need to check the user on its role..
            if (rs.next()) {
                String pass = rs.getString("password");
                String role = rs.getString("role");
                if (pass.equals(passWord)){ 
                if (role == null || role.isEmpty()) {
                    // process no role case first - it deals with the null role problem
                }
                    switch (role) {
                        case "manager":
                            FYSApp.getQueryManager().setUserName(userName);
                            main.FYSApp.getInstance().showPanel(new ManagerFront());
                            break;
                        case "employee":
                            FYSApp.getQueryManager().setUserName(userName);
                            main.FYSApp.getInstance().showPanel(new EmployeeFront());
                            break;
                        case "admin":
                            FYSApp.getQueryManager().setUserName(userName);
                            main.FYSApp.getInstance().showPanel(new AdminFront());
                            break;
                    }
            } else {
                jLabel1.setText("Wrong Username/Password - Please try again");
            }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void passJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passJTextFieldActionPerformed
        // Does the same ass the login button, only this will perform when
        // 'enter' has been hitten.
        
        loginJButtonActionPerformed(evt);
    }//GEN-LAST:event_passJTextFieldActionPerformed

    private void cantLoginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantLoginJButtonActionPerformed
        FYSApp.getInstance().showPanel(new CantLogin());
    }//GEN-LAST:event_cantLoginJButtonActionPerformed

    private void userNameJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameJTextFieldKeyPressed
       
        if(evt.getKeyCode() == KeyEvent.VK_TAB){
            passJTextField.setFocusTraversalKeysEnabled(true);
        }
    }//GEN-LAST:event_userNameJTextFieldKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cantLoginJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JPasswordField passJTextField;
    private javax.swing.JPanel pnl_login;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
