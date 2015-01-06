package view.manager;

import ExterneLibraries.PDFGenerator;
import QueryManager.DatabaseManager;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import main.FYSApp;
import main.Frame;
import view.LoginScreen;
import view.employee.EmployeeFront;

/**
 *
 * @author Team 1 IS106 ZoekJeKoffer
 */
public class ManagerLuggageAuctioned extends JPanel {

    // Always declare first..!
    DatabaseManager dbmanager;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public String input;
    ResultSetMetaData rsmetadata = null;
    public int columns = 0;

    public ManagerLuggageAuctioned() throws ClassNotFoundException, SQLException {
        initComponents();
        getAuctionedLuggage();
    }

    /**
     * Creates new form AdminAuctionedLuggage
     */
    private void getAuctionedLuggage() throws ClassNotFoundException, SQLException {
        rs = Frame.getQueryManager().getManagerAuctionedOverview();
        try {
            updateTable(rs);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ManagerLuggageLost.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateTable(ResultSet rs) throws ClassNotFoundException, SQLException {

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

        auctionedJTable.setModel(dtm);
        auctionedJTable.repaint();
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
        statisticsJButton = new javax.swing.JButton();
        auctionedJButton = new javax.swing.JButton();
        foundJButton = new javax.swing.JButton();
        lostJButton = new javax.swing.JButton();
        searchJTextField = new javax.swing.JTextField();
        JButtonPrint = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        auctionedJTable = new javax.swing.JTable();
        searchJButton1 = new javax.swing.JButton();
        jLWarning = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 153, 0));
        setToolTipText("");
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back-2-2-icon.png"))); // NOI18N
        backJButton.setText("BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, 100, 40));

        logoutJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout-icon.png"))); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 100, 30));

        statisticsJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        statisticsJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SEO-icon.png"))); // NOI18N
        statisticsJButton.setText("STATISTICS");
        statisticsJButton.setEnabled(false);
        statisticsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statisticsJButtonActionPerformed(evt);
            }
        });
        add(statisticsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 140, 40));

        auctionedJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        auctionedJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/auctioned-icon.png"))); // NOI18N
        auctionedJButton.setText("Auctioned Luggage");
        auctionedJButton.setBorder(null);
        auctionedJButton.setEnabled(false);
        auctionedJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auctionedJButtonActionPerformed(evt);
            }
        });
        add(auctionedJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 40));

        foundJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        foundJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login-icon.png"))); // NOI18N
        foundJButton.setText("Found Luggage");
        foundJButton.setBorder(null);
        foundJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foundJButtonActionPerformed(evt);
            }
        });
        add(foundJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, 40));

        lostJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lostJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login-icon.png"))); // NOI18N
        lostJButton.setText("Lost Luggage");
        lostJButton.setBorder(null);
        lostJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lostJButtonActionPerformed(evt);
            }
        });
        add(lostJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 140, 40));

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchJTextFieldKeyTyped(evt);
            }
        });
        add(searchJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 150, 20));

        JButtonPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/printer-icon.png"))); // NOI18N
        JButtonPrint.setText("PRINT");
        JButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonPrintActionPerformed(evt);
            }
        });
        add(JButtonPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 130, 40));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Currently logged in as: [username]");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Auctioned Luggage Overview");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 300, 33));

        auctionedJTable.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        auctionedJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(auctionedJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 590, 340));

        searchJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search-icon.png"))); // NOI18N
        searchJButton1.setText("SEARCH");
        searchJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJButton1ActionPerformed(evt);
            }
        });
        add(searchJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 120, 40));

        jLWarning.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLWarning.setForeground(new java.awt.Color(255, 255, 255));
        add(jLWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 410, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Corendon-background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(1024, 650));
        jLabel3.setMinimumSize(new java.awt.Dimension(1024, 650));
        jLabel3.setPreferredSize(new java.awt.Dimension(1024, 650));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1030, 620));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

       Frame.getInstance().showPanel(new ManagerFront());
    }//GEN-LAST:event_backJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        Frame.shutdown();
        FYSApp.logout();
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void statisticsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statisticsJButtonActionPerformed
        Frame.getInstance().showPanel(new EmployeeFront());
    }//GEN-LAST:event_statisticsJButtonActionPerformed

    private void auctionedJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auctionedJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_auctionedJButtonActionPerformed

    private void foundJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foundJButtonActionPerformed
        Frame.getInstance().showPanel(new ManagerLuggageFound());
    }//GEN-LAST:event_foundJButtonActionPerformed

    private void lostJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lostJButtonActionPerformed
        try {
            // TODO add your handling code here:
            Frame.getInstance().showPanel(new ManagerLuggageLost());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManagerLuggageAuctioned.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lostJButtonActionPerformed

    private void searchJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchJTextFieldActionPerformed

    private void JButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonPrintActionPerformed
        // create object for pdf generator
        PDFGenerator pdf = new PDFGenerator();
        // create own content through arrays using querymanager
        pdf.generate();
        // current date using timestamp
        String currentDate = FYSApp.getDateTime();
        //name of pdf file
        pdf.save(currentDate + " Auctioned.pdf");
        
    }//GEN-LAST:event_JButtonPrintActionPerformed

    private void searchJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButton1ActionPerformed
        try {
                input = searchJTextField.getText();
                rs = Frame.getQueryManager().searchTableAuctioned(input);

                if (input == null) {
                    auctionedJTable.repaint();
                }
                if (!rs.next()) {
                    jLWarning.setText("No matches found!");
                    getAuctionedLuggage();
                    updateTable(rs);
                } else {
                    jLWarning.setText("");
                    rs.beforeFirst();
                    updateTable(rs);
                }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(ManagerLuggageAuctioned.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_searchJButton1ActionPerformed

    private void searchJTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchJTextFieldMouseClicked
        searchJTextField.setText("");
    }//GEN-LAST:event_searchJTextFieldMouseClicked

    private void searchJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchJTextFieldKeyTyped
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                input = searchJTextField.getText();
                rs = Frame.getQueryManager().searchTableAuctioned(input);

                if (input == null) {
                    auctionedJTable.repaint();
                }
                if (!rs.next()) {
                    jLWarning.setText("No matches found!");
                    getAuctionedLuggage();
                    updateTable(rs);
                } else {
                    jLWarning.setText("");
                    rs.beforeFirst();
                    updateTable(rs);
                }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(ManagerLuggageAuctioned.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_searchJTextFieldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonPrint;
    private javax.swing.JButton auctionedJButton;
    private javax.swing.JTable auctionedJTable;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton foundJButton;
    private javax.swing.JLabel jLWarning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JButton lostJButton;
    private javax.swing.JButton searchJButton1;
    private javax.swing.JTextField searchJTextField;
    private javax.swing.JButton statisticsJButton;
    // End of variables declaration//GEN-END:variables
}
