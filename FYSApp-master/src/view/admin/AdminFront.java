package view.admin;

import javax.swing.JPanel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.FYSApp;
import view.LoginScreen;

/**
 *
 * @author Daniel Stern IS 106
 */
public class AdminFront extends JPanel {

    /**
     * Creates new form AdminFront
     */
    public AdminFront() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        overviewJButton = new javax.swing.JButton();
        lostJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        foundJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 255));
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setPreferredSize(new java.awt.Dimension(1024, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 90, 30));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Luggage");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 110, 30));

        overviewJButton.setText("OVERVIEW");
        overviewJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        overviewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overviewJButtonActionPerformed(evt);
            }
        });
        add(overviewJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 230, 50));

        lostJButton.setText("LOST");
        lostJButton.setActionCommand("Found");
        lostJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lostJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lostJButtonActionPerformed(evt);
            }
        });
        add(lostJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 230, 50));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 50, 30));

        foundJButton.setText("FOUND");
        foundJButton.setActionCommand("Found");
        foundJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        foundJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foundJButtonActionPerformed(evt);
            }
        });
        add(foundJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Corendon-background.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1024, 600));
        jLabel1.setMinimumSize(new java.awt.Dimension(1024, 600));
        jLabel1.setPreferredSize(new java.awt.Dimension(1024, 600));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1020, 620));
    }// </editor-fold>//GEN-END:initComponents

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        FYSApp.getInstance().showPanel(new LoginScreen());
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void overviewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overviewJButtonActionPerformed
        try {
            FYSApp.getInstance().showPanel(new AdminUsers());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminFront.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminFront.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_overviewJButtonActionPerformed

    private void lostJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lostJButtonActionPerformed
        FYSApp.getInstance().showPanel(new AdminLuggageLost());
    }//GEN-LAST:event_lostJButtonActionPerformed

    private void foundJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foundJButtonActionPerformed
        FYSApp.getInstance().showPanel(new AdminLuggageFound());
    }//GEN-LAST:event_foundJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton foundJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JButton lostJButton;
    private javax.swing.JButton overviewJButton;
    // End of variables declaration//GEN-END:variables
}
