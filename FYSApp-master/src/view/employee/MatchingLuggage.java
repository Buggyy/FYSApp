/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.employee;

import QueryManager.DatabaseManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import main.FYSApp;
import main.Frame;
import model.Client;
import model.Luggage;

/**
 *
 * @author Lars
 */
public class MatchingLuggage extends JPanel {

    // Always declare first..!
    DatabaseManager dbmanager = new DatabaseManager();
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public String input;
    ResultSetMetaData rsmetadata;
    public int columns = 0;
    private static final int UPDATE_MODE_FALSE = 0;
    public int WHICH_STATUS = 0;
    public boolean lost;

     /**
     * Creates new form Match
     */
    public MatchingLuggage() {
        initComponents();
        getMatchingLuggage();
    }
    
    /**
     * Matched luggage
     */
    private void getMatchingLuggage() {
        rs = FYSApp.getTableManager().getEmployeeLostLuggage();
        try {
            updateTable(rs);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MatchingLuggage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Creates new form ML
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

        matchingLuggageTable.setModel(dtm);

        matchingLuggageTable.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        matchingLuggageTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        registerJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        matchJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        matchingLuggageTable.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        matchingLuggageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "LuggageID", "Status", "ownerID", "Airport", "Brand", "LableCode", "Material", "other details", "weightclass", "Color", "Whenfound", "Found at", "Departurefrom", "Created", "Lastupdated"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(matchingLuggageTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 790, 380));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/match-icon.png"))); // NOI18N
        jLabel5.setText("  Matching Luggage");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 410, 33));

        registerJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add-icon.png"))); // NOI18N
        registerJButton.setText(" REGISTER LUGGAGE");
        registerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerJButtonActionPerformed(evt);
            }
        });
        add(registerJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 210, 40));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Luggage found?");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 130, 33));

        logoutJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout-icon.png"))); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 110, 40));

        matchJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/match-icon.png"))); // NOI18N
        matchJButton.setText(" MATCH");
        matchJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchJButtonActionPerformed(evt);
            }
        });
        add(matchJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 110, 40));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Luggage not found?");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 170, 33));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Currently logged in as: [username]");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Corendon-background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void registerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerJButtonActionPerformed
        Frame.getInstance().showPanel(new RegisterFoundLuggage());
        RegisterFoundLuggage.setUpdate(UPDATE_MODE_FALSE);
    }//GEN-LAST:event_registerJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        Frame.shutdown();
        FYSApp.logout();
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void matchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchJButtonActionPerformed

        if (matchingLuggageTable.getSelectedRow() >= 0) {
            int row = matchingLuggageTable.getSelectedRow();
            int col = 0;
            int id = Integer.parseInt((String) matchingLuggageTable.getModel().getValueAt(row, col));
            Luggage luggage = FYSApp.getLuggageManager().getSelectedLuggage(id);
            Client client = FYSApp.getClientManager().getSelectedClient(id);
            Frame.getInstance().showPanel(new RegisterSolvesLuggage());
            RegisterSolvesLuggage.setUpdate(id);
            RegisterSolvesLuggage.setTextLuggage(luggage);
            RegisterSolvesLuggage.setTextClient(client);
        } else {
            JOptionPane.showMessageDialog(null,
                "Please select a row!",
                "Error",
                JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_matchJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JButton matchJButton;
    private javax.swing.JTable matchingLuggageTable;
    private javax.swing.JButton registerJButton;
    // End of variables declaration//GEN-END:variables

    
}
