package view.manager;

import ExterneLibraries.PDFGenerator;
import QueryManager.DatabaseManager;
import externelibraries.Graph;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import main.FYSApp;
import main.Frame;
import model.Luggage;
import view.admin.AdminLuggageFound;

/**
 * @version 1
 * @author Team 1 IS106;
 * @description class for handeling everything related to the found luggage in
 * the manager section of the app
 */
public class ManagerLuggageFound extends JPanel {

    // Always declare first..!
    DatabaseManager dbmanager;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public String input;
    ResultSetMetaData rsmetadata = null;
    public int columns = 0;

    /**
     * @default constructor
     */
    public ManagerLuggageFound() {
        initComponents();
        getFoundLuggage();
    }

    /**
     * @description gets data from database and fills the table on screen
     */
    private void getFoundLuggage() {
        rs = FYSApp.getTableManager().getEmployeeFoundLuggage();
        try {
            updateTable(rs);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AdminLuggageFound.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param rs Resultset with the data from the database
     * @throws ClassNotFoundException
     * @throws SQLException
     * @description get data from database and update the table
     */
    private void updateTable(ResultSet rs) throws ClassNotFoundException, SQLException {

        rsmetadata = rs.getMetaData();

        columns = rsmetadata.getColumnCount();

        DefaultTableModel dtm = new DefaultTableModel();

        Vector columns_name = new Vector();
        Vector data_rows = new Vector();

        for (int i = 1; i < columns; i++) {
            columns_name.addElement(rsmetadata.getColumnName(i));
        }
        dtm.setColumnIdentifiers(columns_name);

        while (rs.next()) {

            data_rows = new Vector();

            for (int j = 1; j < columns; j++) {
                data_rows.addElement(rs.getString(j));
            }
            dtm.addRow(data_rows);
        }

        foundLuggageJTable.setModel(dtm);
        foundLuggageJTable.repaint();
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
        auctionedJButton = new javax.swing.JButton();
        foundJButton = new javax.swing.JButton();
        lostJButton = new javax.swing.JButton();
        searchJTextField = new javax.swing.JTextField();
        searchJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        foundLuggageJTable = new javax.swing.JTable();
        statisticsJButton = new javax.swing.JButton();
        jLWarning = new javax.swing.JLabel();
        btn_print = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(156, 10, 13));
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setPreferredSize(new java.awt.Dimension(1024, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout-icon.png"))); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 20, -1, 30));

        auctionedJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        auctionedJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/auctioned-icon.png"))); // NOI18N
        auctionedJButton.setText("Auctioned Luggage");
        auctionedJButton.setBorder(null);
        auctionedJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auctionedJButtonActionPerformed(evt);
            }
        });
        add(auctionedJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, 40));

        foundJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        foundJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/found-luggage-icon.png"))); // NOI18N
        foundJButton.setText("Found Luggage");
        foundJButton.setBorder(null);
        foundJButton.setEnabled(false);
        foundJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foundJButtonActionPerformed(evt);
            }
        });
        add(foundJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, 40));

        lostJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lostJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lost-luggage-icon.png"))); // NOI18N
        lostJButton.setText("Lost Luggage");
        lostJButton.setBorder(null);
        lostJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lostJButtonActionPerformed(evt);
            }
        });
        add(lostJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, 40));

        searchJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        searchJTextField.setText("Enter keywords");
        searchJTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchJTextFieldMouseClicked(evt);
            }
        });
        searchJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJTextFieldActionPerformed(evt);
            }
        });
        searchJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchJTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchJTextFieldKeyTyped(evt);
            }
        });
        add(searchJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 150, -1));

        searchJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search-icon.png"))); // NOI18N
        searchJButton.setText("SEARCH");
        searchJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJButtonActionPerformed(evt);
            }
        });
        add(searchJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 110, 40));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Currently logged in as: [username]");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/found-luggage-icon.png"))); // NOI18N
        jLabel2.setText("   Found Luggage Overview");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 300, 33));

        foundLuggageJTable.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        foundLuggageJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "LuggageID", "Status", "Created", "Last Updated", "Brand", "Weight", "Description", "Picture", "Owner ID", "Airport"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(foundLuggageJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 590, 340));

        statisticsJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        statisticsJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SEO-icon.png"))); // NOI18N
        statisticsJButton.setText("Statistics");
        statisticsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statisticsJButtonActionPerformed(evt);
            }
        });
        add(statisticsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 150, 40));

        jLWarning.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLWarning.setForeground(new java.awt.Color(255, 255, 255));
        add(jLWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 410, 30));

        btn_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/printer-icon.png"))); // NOI18N
        btn_print.setText("PRINT");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 90, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/match-icon.png"))); // NOI18N
        jButton1.setText("Solved Luggage");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 150, 40));

        jLabel3.setBackground(new java.awt.Color(156, 10, 13));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Corendon-background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1030, 620));
    }// </editor-fold>//GEN-END:initComponents

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        Frame.shutdown();
        FYSApp.logout();
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void auctionedJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auctionedJButtonActionPerformed
        try {
            Frame.getInstance().showPanel(new ManagerLuggageAuctioned());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManagerLuggageFound.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_auctionedJButtonActionPerformed

    private void foundJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foundJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foundJButtonActionPerformed

    /**
     *
     * @param evt
     * @description switch to the lost frame
     */
    private void lostJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lostJButtonActionPerformed
        try {
            // TODO add your handling code here:
            Frame.getInstance().showPanel(new ManagerLuggageLost());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManagerLuggageFound.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lostJButtonActionPerformed

    private void searchJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchJTextFieldActionPerformed

    /**
     *
     * @param evt
     * @description Update table based on search query
     */
    private void searchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButtonActionPerformed
        try {
            input = searchJTextField.getText();
            rs = FYSApp.getSearchManager().searchTableLuggageFound(input);

            if (input == null) {
                foundLuggageJTable.repaint();
            }
            if (!rs.next()) {
                jLWarning.setText("No matches found!");
                getFoundLuggage();
                updateTable(rs);
            } else {
                jLWarning.setText("");
                rs.beforeFirst();
                updateTable(rs);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManagerLuggageFound.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_searchJButtonActionPerformed

    private void statisticsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statisticsJButtonActionPerformed
        Frame.getInstance().showPanel(new GraphOverview());
    }//GEN-LAST:event_statisticsJButtonActionPerformed

    private void searchJTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchJTextFieldMouseClicked
        searchJTextField.setText("");
    }//GEN-LAST:event_searchJTextFieldMouseClicked

    private void searchJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchJTextFieldKeyTyped

    }//GEN-LAST:event_searchJTextFieldKeyTyped

    private void JButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {
//        rs = FYSApp.getTableManager().getEmployeeFoundLuggage();
//
//     
//        try {
//            FYSApp.getInstance().getPDFGenerator().generateOverviewPDF(rs);
//        } catch (SQLException ex) {
//            Logger.getLogger(ManagerLuggageLost.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(ManagerLuggageLost.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    private void searchJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchJTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                input = searchJTextField.getText();
                rs = FYSApp.getSearchManager().searchTableLuggageFound(input);

                if (input == null) {
                    foundLuggageJTable.repaint();
                }
                if (!rs.next()) {
                    jLWarning.setText("No matches found!");
                    getFoundLuggage();
                    updateTable(rs);
                } else {
                    jLWarning.setText("");
                    rs.beforeFirst();
                    updateTable(rs);
                }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(ManagerLuggageFound.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_searchJTextFieldKeyPressed

    }

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed

//        rs = FYSApp.getTableManager().getEmployeeFoundLuggage();
//
//        try {
//            FYSApp.getInstance().getPDFGenerator().generateOverviewPDF(rs);
//        } catch (SQLException ex) {
//            Logger.getLogger(ManagerLuggageFound.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(ManagerLuggageFound.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }//GEN-LAST:event_btn_printActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Frame.getInstance().showPanel(new ManagerLuggageSolved());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManagerLuggageLost.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManagerLuggageLost.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton auctionedJButton;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton foundJButton;
    private javax.swing.JTable foundLuggageJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLWarning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JButton lostJButton;
    private javax.swing.JButton searchJButton;
    private javax.swing.JTextField searchJTextField;
    private javax.swing.JButton statisticsJButton;
    // End of variables declaration//GEN-END:variables
}
