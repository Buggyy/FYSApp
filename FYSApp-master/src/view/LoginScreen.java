package view;

import connectivity.DatabaseManager;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.AWTEvent;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.imageio.ImageIO;

import main.FYSApp;
import view.admin.AdminFront;
import view.employee.EmployeeFront;
import view.manager.ManagerFront;

/**
 *
 * @author Daniel Stern IS 106
 */
public class LoginScreen extends javax.swing.JPanel {

    // Always declare first. (nullpointerexception H8 guys)
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
        conn = DatabaseManager.openConnection();
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
        txt_username = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        txt_password = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnl_login1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_username1 = new javax.swing.JTextField();
        btn_login1 = new javax.swing.JButton();
        txt_password1 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_login.setBackground(new java.awt.Color(255, 255, 255));
        pnl_login.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ZoekJeKoffer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 24))); // NOI18N
        pnl_login.setMaximumSize(new java.awt.Dimension(1024, 600));

        txt_username.setToolTipText("Fill in your Username");
        txt_username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_username.setMaximumSize(new java.awt.Dimension(1024, 600));
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });

        btn_login.setBackground(new java.awt.Color(255, 255, 255));
        btn_login.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        txt_password.setToolTipText("Fill in your password");
        txt_password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_password.setMaximumSize(new java.awt.Dimension(1024, 600));
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        jButton2.setText("I can't login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                    .addComponent(txt_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btn_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_loginLayout = new javax.swing.GroupLayout(pnl_login);
        pnl_login.setLayout(pnl_loginLayout);
        pnl_loginLayout.setHorizontalGroup(
            pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_loginLayout.setVerticalGroup(
            pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_loginLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(pnl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Corendon-background.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setAlignmentY(0.0F);
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setMaximumSize(new java.awt.Dimension(1024, 600));
        jLabel2.setMinimumSize(new java.awt.Dimension(1024, 600));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(1024, 600));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -100, 1030, 800));

        pnl_login1.setBackground(new java.awt.Color(255, 255, 255));
        pnl_login1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ZoekJeKoffer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 24))); // NOI18N
        pnl_login1.setMaximumSize(new java.awt.Dimension(1024, 600));

        txt_username1.setToolTipText("Fill in your Username");
        txt_username1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_username1.setMaximumSize(new java.awt.Dimension(1024, 600));
        txt_username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_username1ActionPerformed(evt);
            }
        });

        btn_login1.setBackground(new java.awt.Color(255, 255, 255));
        btn_login1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btn_login1.setText("Login");
        btn_login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_login1ActionPerformed(evt);
            }
        });

        txt_password1.setToolTipText("Fill in your password");
        txt_password1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_password1.setMaximumSize(new java.awt.Dimension(1024, 600));
        txt_password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_password1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        jButton3.setText("I can't login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_username1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_password1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(btn_login1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_username1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btn_login1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_login1Layout = new javax.swing.GroupLayout(pnl_login1);
        pnl_login1.setLayout(pnl_login1Layout);
        pnl_login1Layout.setHorizontalGroup(
            pnl_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_login1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_login1Layout.setVerticalGroup(
            pnl_login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_login1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(pnl_login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        String sql = "SELECT * FROM user WHERE username=? and password=?";
        String sql_role = "SELECT role FROM user WHERE username=?";

        try {
            //  Select the user
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_username.getText());
            pst.setString(2, txt_password.getText());
            rs = pst.executeQuery();

            // Select the role
            pst = conn.prepareStatement(sql_role);
            pst.setString(1, txt_username.getText());
            ResultSet rs = pst.executeQuery();

            //  Down here we need to check the user on its role..
            if (rs.next()) {

                String role = rs.getString("role");

                if (role == null || role.isEmpty()) {
                    // process no role case first - it deals with the null role problem
                }
                if (role.equals("manager")) {
                    main.FYSApp.getInstance().showPanel(new ManagerFront());
                    
                } else if (role.equals("medewerker")) {
                    main.FYSApp.getInstance().showPanel(new EmployeeFront());
                    
                } else if (role.equals("admin")) {
                    main.FYSApp.getInstance().showPanel(new AdminFront());
                    
                }
            } else {
                jLabel1.setText("Please try again");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        // First testing with 1 user
        //        String viewUser = determineUser();
        //
        //        switch(viewUser){
            //            case "Employee":
            //                FYSApp.getInstance().showPanel(new EmployeeFront());
            //                break;
            //            case "Admin":
            //                FYSApp.getInstance().showPanel(new AdminFront());
            //                break;
            //            case "Manager":
            //                FYSApp.getInstance().showPanel(new ManagerFront());
            //                break;
            //        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FYSApp.getInstance().showPanel(new CantLogin());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_username1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_username1ActionPerformed

    private void btn_login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_login1ActionPerformed
        String sql = "SELECT * FROM user WHERE username=? and password=?";
        String sql_role = "SELECT role FROM user WHERE username=?";

        try {
            //  Select the user
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_username.getText());
            pst.setString(2, txt_password.getText());
            rs = pst.executeQuery();

            // Select the role
            pst = conn.prepareStatement(sql_role);
            pst.setString(1, txt_username.getText());
            ResultSet rs = pst.executeQuery();

            //  Down here we need to check the user on its role..
            if (rs.next()) {

                String role = rs.getString("role");

                if (role == null || role.isEmpty()) {
                    // process no role case first - it deals with the null role problem
                }
                if (role.equals("manager")) {
                    main.FYSApp.getInstance().showPanel(new ManagerFront());
                    
                } else if (role.equals("medewerker")) {
                    main.FYSApp.getInstance().showPanel(new EmployeeFront());
                    
                } else if (role.equals("admin")) {
                    main.FYSApp.getInstance().showPanel(new AdminFront());
                    
                }
            } else {
                jLabel1.setText("Please try again");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        // First testing with 1 user
        //        String viewUser = determineUser();
        //
        //        switch(viewUser){
            //            case "Employee":
            //                FYSApp.getInstance().showPanel(new EmployeeFront());
            //                break;
            //            case "Admin":
            //                FYSApp.getInstance().showPanel(new AdminFront());
            //                break;
            //            case "Manager":
            //                FYSApp.getInstance().showPanel(new ManagerFront());
            //                break;
            //        }
    }//GEN-LAST:event_btn_login1ActionPerformed

    private void txt_password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_password1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_password1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FYSApp.getInstance().showPanel(new CantLogin());
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_login1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnl_login;
    private javax.swing.JPanel pnl_login1;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JPasswordField txt_password1;
    private javax.swing.JTextField txt_username;
    private javax.swing.JTextField txt_username1;
    // End of variables declaration//GEN-END:variables
}
