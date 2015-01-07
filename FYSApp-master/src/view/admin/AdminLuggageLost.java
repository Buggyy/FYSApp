package view.admin;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import main.FYSApp;
import static main.FYSApp.WARNING_MUST_SELECT_SOMETHING;
import main.Frame;
import view.LoginScreen;

/**
 *
 * @author Team 1 IS106 ZoekJeKoffer
 */
public class AdminLuggageLost extends JPanel {

    // Always declare first..!
    DatabaseManager dbmanager;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public String input;
    ResultSetMetaData rsmetadata = null;
    public int columns = 0;

    public AdminLuggageLost() throws ClassNotFoundException, SQLException {
        initComponents();
        getLostLuggage();
    }

    private void getLostLuggage() throws ClassNotFoundException, SQLException {
        rs = Frame.getTableManager().getEmployeeLostLuggage();
        try {
            updateTable(rs);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AdminLuggageLost.class.getName()).log(Level.SEVERE, null, ex);
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

        lostLuggageTable.setModel(dtm);
        lostLuggageTable.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchJButton = new javax.swing.JButton();
        logoutJButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();
        foundJButton = new javax.swing.JButton();
        editJButton = new javax.swing.JButton();
        searchJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lostLuggageTable = new javax.swing.JTable();
        jLWarning = new javax.swing.JLabel();
        lostJButton = new javax.swing.JButton();
        overviewJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setPreferredSize(new java.awt.Dimension(1024, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 600));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search-icon.png"))); // NOI18N
        searchJButton.setText("SEARCH");
        searchJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 120, 40));

        logoutJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout-icon.png"))); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 100, 30));

        deleteJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete-icon.png"))); // NOI18N
        deleteJButton.setText("DELETE");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 110, 40));

        foundJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/found-luggage-icon.png"))); // NOI18N
        foundJButton.setText("Found Luggage");
        foundJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foundJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(foundJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 140, 40));

        editJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit-icon.png"))); // NOI18N
        editJButton.setText("EDIT");
        editJButton.setEnabled(false);
        editJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(editJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 100, 40));

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
        });
        jPanel1.add(searchJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 150, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lost-luggage-icon.png"))); // NOI18N
        jLabel2.setText("   Lost Luggage Overview - Admin");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 360, 33));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Currently logged in as: [username]");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        lostLuggageTable.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lostLuggageTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(lostLuggageTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 590, 340));

        jLWarning.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLWarning.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 410, 30));

        lostJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lost-luggage-icon.png"))); // NOI18N
        lostJButton.setText("Lost Luggage");
        lostJButton.setEnabled(false);
        lostJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lostJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(lostJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 140, 40));

        overviewJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/users-icon.png"))); // NOI18N
        overviewJButton.setText("User Overview");
        overviewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overviewJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(overviewJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 140, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Corendon-background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(1024, 600));
        jLabel3.setMinimumSize(new java.awt.Dimension(1024, 600));
        jLabel3.setPreferredSize(new java.awt.Dimension(1024, 600));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 600));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void searchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButtonActionPerformed
        try {
            input = searchJTextField.getText();
            rs = Frame.getSearchManager().searchTableLuggageLost(input);

            if (input == null) {
                lostLuggageTable.repaint();
            }
            if (!rs.next()) {
                jLWarning.setText("No matches found!");
                getLostLuggage();
                updateTable(rs);
            } else {
                jLWarning.setText("");
                rs.beforeFirst();
                updateTable(rs);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminLuggageLost.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        Frame.shutdown();
        FYSApp.logout();
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        if (lostLuggageTable.getSelectedRow() >= 0) {
            int row = lostLuggageTable.getSelectedRow();
            int col = 0;
            int id = Integer.parseInt((String) lostLuggageTable.getValueAt(row, col));

            //Custom button text
            Object[] options = {"Yes",
                "No"};
            int n = JOptionPane.showOptionDialog(null,
                    "Are you sure you want to delete this row?",
                    "Warning",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[1]);
            if (n == JOptionPane.YES_OPTION) {
                Frame.getQueryManager().delete(id);
                try {
                    Frame.getInstance().showPanel(new AdminLuggageLost());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AdminLuggageLost.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminLuggageLost.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    Frame.getInstance().showPanel(new AdminLuggageLost());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AdminLuggageLost.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminLuggageLost.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        } else {
            //custom title, warning icon
            JOptionPane.showMessageDialog(null,
                    "Please select a row before editing!",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);

        }

        //  Wat is dit? leg uit.
//        try {
//            Frame.getInstance().showPanel(new AdminLuggageLost());
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(AdminLuggageLost.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(AdminLuggageLost.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_deleteJButtonActionPerformed

    private void foundJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foundJButtonActionPerformed
        Frame.getInstance().showPanel(new AdminLuggageFound());
    }//GEN-LAST:event_foundJButtonActionPerformed

    private void editJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJButtonActionPerformed
        if (lostLuggageTable.getSelectedRow() >= 0) {
            // Code to edit lost luggage
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row before editing!");
        }

    }//GEN-LAST:event_editJButtonActionPerformed

    private void searchJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJTextFieldActionPerformed

    }//GEN-LAST:event_searchJTextFieldActionPerformed

    private void searchJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchJTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                input = searchJTextField.getText();
                rs = FYSApp.getSearchManager().searchTableLuggageLost(input);

                if (input == null) {
                    lostLuggageTable.repaint();
                }
                if (!rs.next()) {
                    jLWarning.setText("No matches found!");
                    getLostLuggage();
                    updateTable(rs);
                } else {
                    jLWarning.setText("");
                    rs.beforeFirst();
                    updateTable(rs);
                }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(AdminLuggageLost.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_searchJTextFieldKeyPressed

    private void searchJTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchJTextFieldMouseClicked
        searchJTextField.setText("");
    }//GEN-LAST:event_searchJTextFieldMouseClicked

    private void lostJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lostJButtonActionPerformed
        try {
            Frame.getInstance().showPanel(new AdminLuggageLost());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminLuggageFound.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lostJButtonActionPerformed

    private void overviewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overviewJButtonActionPerformed
        try {
            Frame.getInstance().showPanel(new AdminUsers());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_overviewJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteJButton;
    private javax.swing.JButton editJButton;
    private javax.swing.JButton foundJButton;
    private javax.swing.JLabel jLWarning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JButton lostJButton;
    private javax.swing.JTable lostLuggageTable;
    private javax.swing.JButton overviewJButton;
    private javax.swing.JButton searchJButton;
    private javax.swing.JTextField searchJTextField;
    // End of variables declaration//GEN-END:variables
}
