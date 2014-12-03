/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.employee;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.FYSApp;
import view.LoginScreen;

/**
 *
 * @author Team 1 IS106
 */
public class RegisterFoundLuggage extends javax.swing.JPanel {

    /**
     * Creates new form AddUser
     */
    public RegisterFoundLuggage() {
        initComponents();
        // Always declare first. (nullpointerexception H8 guys)
        Connection conn = null;
        
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_clear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_submit_found_luggage = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
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

        jTextField1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 190, -1));

        jTextField2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        panel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 50, -1));

        jTextField3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        panel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 340, 170));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Description");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        btn_clear.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_clear.setText("CLEAR");
        btn_clear.setEnabled(false);
        btn_clear.setMinimumSize(new java.awt.Dimension(70, 25));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        panel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 130, 60));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Brand");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("KG");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        btn_submit_found_luggage.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_submit_found_luggage.setText("SUBMIT");
        btn_submit_found_luggage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_submit_found_luggageMouseClicked(evt);
            }
        });
        btn_submit_found_luggage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submit_found_luggageActionPerformed(evt);
            }
        });
        panel1.add(btn_submit_found_luggage, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 130, 60));

        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        panel1.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 90, 30));

        btn_back.setText("BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        panel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, 100, 50));

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

    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_clearActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void btn_submit_found_luggageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submit_found_luggageActionPerformed
 
    }//GEN-LAST:event_btn_submit_found_luggageActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        FYSApp.getInstance().showPanel(new LoginScreen());
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        try {
            FYSApp.getInstance().showPanel(new FoundLuggageOverview());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterFoundLuggage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegisterFoundLuggage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_submit_found_luggageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_submit_found_luggageMouseClicked
        // Get de input van de user in de textfields en stopt dit
        // in variabelen, vervolgens geeft ie deze mee aan de addLuggage
        // methode zodat de koffer geregistreerd wordt. :D
        
        String weight = jTextField2.getText(); // weight
        String brand = jTextField1.getText(); // brand
        String description = jTextField3.getText(); // description
        String status = "found";
        
        model.Luggage.addLuggage(weight,brand,description,status,"");
        
        try {
            FYSApp.getInstance().showPanel(new FoundLuggageOverview());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterFoundLuggage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegisterFoundLuggage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_submit_found_luggageMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_submit_found_luggage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
