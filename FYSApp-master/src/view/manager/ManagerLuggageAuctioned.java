package view.manager;

import Connectivity.DatabaseManager;
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

/**
 *
 * @author Team 1 IS106 ZoekJeKoffer
 */
public class ManagerLuggageAuctioned extends JPanel {

    // Always declare first..!
    private DatabaseManager dbmanager;
    private Connection conn = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    private String input;
    private ResultSetMetaData rsmetadata = null;
    private int columns = 0;

    /**
     *
     * @throws ClassNotFoundException
     * @throws SQLException
     * @description constructor
     */
    public ManagerLuggageAuctioned() throws ClassNotFoundException,
            SQLException {

        initComponents();
        getAuctionedLuggage();
        setLoggedInAs();
    }

    /**
     *
     * @throws ClassNotFoundException
     * @throws SQLException
     * @description Creates new form AdminAuctionedLuggage
     */
    private void getAuctionedLuggage() throws ClassNotFoundException,
            SQLException {

        rs = FYSApp.getTableManager().getManagerAuctionedOverview();

        try {
            updateTable(rs);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ManagerLuggageLost.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
    }

    /**
     * @param rs Resultset with the data from the database
     * @throws ClassNotFoundException
     * @throws SQLException
     * @description get data from database and update the table
     */
    public void updateTable(ResultSet rs) throws ClassNotFoundException,
            SQLException {

        rsmetadata = rs.getMetaData();

        columns = rsmetadata.getColumnCount();

        DefaultTableModel dtm = new DefaultTableModel();

        Vector columnsName = new Vector();
        Vector dataRows = new Vector();

        for (int i = 1; i < columns; i++) {
            columnsName.addElement(rsmetadata.getColumnName(i));
        }

        dtm.setColumnIdentifiers(columnsName);

        while (rs.next()) {

            dataRows = new Vector();

            for (int j = 1; j < columns; j++) {
                dataRows.addElement(rs.getString(j));
            }

            dtm.addRow(dataRows);
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

        logoutJButton = new javax.swing.JButton();
        statisticsJButton = new javax.swing.JButton();
        auctionedJButton = new javax.swing.JButton();
        foundJButton = new javax.swing.JButton();
        lostJButton = new javax.swing.JButton();
        searchJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        auctionedJTable = new javax.swing.JTable();
        jLWarning = new javax.swing.JLabel();
        searchJButton1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        loggedInAs = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 153, 0));
        setToolTipText("");
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout-icon.png"))); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 20, -1, 30));

        statisticsJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        statisticsJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SEO-icon.png"))); // NOI18N
        statisticsJButton.setText("Statistics");
        statisticsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statisticsJButtonActionPerformed(evt);
            }
        });
        add(statisticsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 150, 40));

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
        add(auctionedJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 150, 40));

        foundJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        foundJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/found-luggage-icon.png"))); // NOI18N
        foundJButton.setText("Found Luggage");
        foundJButton.setBorder(null);
        foundJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foundJButtonActionPerformed(evt);
            }
        });
        add(foundJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, 40));

        lostJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lostJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lost-luggage-icon.png"))); // NOI18N
        lostJButton.setText("Lost Luggage");
        lostJButton.setBorder(null);
        lostJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lostJButtonActionPerformed(evt);
            }
        });
        add(lostJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, 40));

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
        add(searchJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 150, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/auctioned-icon.png"))); // NOI18N
        jLabel2.setText("   Auctioned Luggage Overview");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 340, 33));

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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 700, 340));

        jLWarning.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLWarning.setForeground(new java.awt.Color(255, 255, 255));
        add(jLWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 410, 30));

        searchJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search-icon.png"))); // NOI18N
        searchJButton1.setText("SEARCH");
        searchJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJButton1ActionPerformed(evt);
            }
        });
        add(searchJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, 110, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/match-icon.png"))); // NOI18N
        jButton1.setText("Solved Luggage");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, 40));

        loggedInAs.setForeground(new java.awt.Color(255, 255, 255));
        loggedInAs.setText("jLabel2");
        add(loggedInAs, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Currently logged in as: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Corendon-background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(1024, 650));
        jLabel3.setMinimumSize(new java.awt.Dimension(1024, 650));
        jLabel3.setPreferredSize(new java.awt.Dimension(1024, 650));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1030, 620));
    }// </editor-fold>//GEN-END:initComponents
    /**
     *
     * @param evt
     * @description exit app
     */
    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed

        Frame.shutdown();
        FYSApp.logout();
    }//GEN-LAST:event_logoutJButtonActionPerformed
    /**
     *
     * @param evt
     * @description switch to graph overview screen
     */
    private void statisticsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statisticsJButtonActionPerformed
        Frame.getInstance().showPanel(new GraphOverview());
    }//GEN-LAST:event_statisticsJButtonActionPerformed

    private void auctionedJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auctionedJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_auctionedJButtonActionPerformed
    /**
     *
     * @param evt
     * @description switch to found screen
     */
    private void foundJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foundJButtonActionPerformed
        Frame.getInstance().showPanel(new ManagerLuggageFound());
    }//GEN-LAST:event_foundJButtonActionPerformed

    /**
     *
     * @param evt
     * @description switch to lost screen
     */
    private void lostJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lostJButtonActionPerformed

        try {
            Frame.getInstance().showPanel(new ManagerLuggageLost());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManagerLuggageAuctioned.class.getName()).log(
                    Level.SEVERE, null, ex);
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
    private void searchJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButton1ActionPerformed

        try {

            input = searchJTextField.getText();
            rs = FYSApp.getSearchManager().searchTableAuctioned(input);

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
            Logger.getLogger(ManagerLuggageAuctioned.class.getName()).log(
                    Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_searchJButton1ActionPerformed
    /**
     *
     * @param evt
     * @description reset searchfield
     */
    private void searchJTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchJTextFieldMouseClicked
        searchJTextField.setText("");
    }//GEN-LAST:event_searchJTextFieldMouseClicked

    private void searchJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchJTextFieldKeyTyped

    }//GEN-LAST:event_searchJTextFieldKeyTyped

    /**
     *
     * @param evt
     * @description search when key is pressed
     */
    private void searchJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchJTextFieldKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            try {

                input = searchJTextField.getText();
                rs = FYSApp.getSearchManager().searchTableAuctioned(input);

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
                Logger.getLogger(ManagerLuggageAuctioned.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_searchJTextFieldKeyPressed
    /**
     *
     * @param evt
     * @description switch to solved screen
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            Frame.getInstance().showPanel(new ManagerLuggageSolved());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManagerLuggageAuctioned.class.getName()).log(
                    Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManagerLuggageAuctioned.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * @descriptoin show currently logged in user
     */
    private void setLoggedInAs() {

        String userName = FYSApp.getUserManager().getUserName();
        loggedInAs.setText(userName);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton auctionedJButton;
    private javax.swing.JTable auctionedJTable;
    private javax.swing.JButton foundJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLWarning;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel loggedInAs;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JButton lostJButton;
    private javax.swing.JButton searchJButton1;
    private javax.swing.JTextField searchJTextField;
    private javax.swing.JButton statisticsJButton;
    // End of variables declaration//GEN-END:variables
}
