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
import main.Frame;
import model.Luggage;

/**
 * 
 * @author Team 1 IS106 ZoekJeKoffer
 */
public class AdminLuggageFound extends JPanel {

    // Variables declared first here, before using them further in this file.
    DatabaseManager dbmanager;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public String input;
    ResultSetMetaData rsmetadata = null;
    public int columns = 0;

    /**
     * Basic Constructor
     */
    public AdminLuggageFound() {
        initComponents();
        getFoundLuggage();
        setLoggedInAs();
    }

    /**
     * Method that gets the found luggage, then updates the table by calling
     * the updateTable() method.
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
     * @param rs resultset for filling the foundLuggageJTable with its data.
     * @throws ClassNotFoundException
     * @throws SQLException
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

        jScrollPane2 = new javax.swing.JScrollPane();
        foundLuggageJTable = new javax.swing.JTable();
        searchJTextField = new javax.swing.JTextField();
        searchJButton = new javax.swing.JButton();
        logoutJButton = new javax.swing.JButton();
        lostJButton = new javax.swing.JButton();
        editJButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLWarning = new javax.swing.JLabel();
        overviewJButton = new javax.swing.JButton();
        foundJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        loggedInAs = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setPreferredSize(new java.awt.Dimension(1024, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        logoutJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout-icon.png"))); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 20, -1, 30));

        lostJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lost-luggage-icon.png"))); // NOI18N
        lostJButton.setText("Lost Luggage");
        lostJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lostJButtonActionPerformed(evt);
            }
        });
        add(lostJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 140, 40));

        editJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit-icon.png"))); // NOI18N
        editJButton.setText("EDIT");
        editJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJButtonActionPerformed(evt);
            }
        });
        add(editJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 90, 40));

        deleteJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete-icon.png"))); // NOI18N
        deleteJButton.setText("DELETE");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });
        add(deleteJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, -1, 40));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/found-luggage-icon.png"))); // NOI18N
        jLabel2.setText("   Found Luggage Overview - Admin");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 380, 33));

        jLWarning.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLWarning.setForeground(new java.awt.Color(255, 255, 255));
        add(jLWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 410, 30));

        overviewJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/users-icon.png"))); // NOI18N
        overviewJButton.setText("User Overview");
        overviewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overviewJButtonActionPerformed(evt);
            }
        });
        add(overviewJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 140, 40));

        foundJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/found-luggage-icon.png"))); // NOI18N
        foundJButton.setText("Found Luggage");
        foundJButton.setEnabled(false);
        foundJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foundJButtonActionPerformed(evt);
            }
        });
        add(foundJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 140, 40));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Currently logged in as: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        loggedInAs.setForeground(new java.awt.Color(255, 255, 255));
        loggedInAs.setText("jLabel2");
        add(loggedInAs, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Corendon-background.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1024, 600));
        jLabel1.setMinimumSize(new java.awt.Dimension(1024, 600));
        jLabel1.setPreferredSize(new java.awt.Dimension(1024, 600));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void searchJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJTextFieldActionPerformed

    }//GEN-LAST:event_searchJTextFieldActionPerformed
    /**
     *
     * @param evt actionlistener for searching specific data
     * in the foundLuggageJTable
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
            Logger.getLogger(AdminLuggageFound.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_searchJButtonActionPerformed

    /**
     * 
     * @param evt actionlistener that shuts down the Frame and calls the 
     * FYSApp frame.
     */
    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        Frame.shutdown();
        FYSApp.logout();
    }//GEN-LAST:event_logoutJButtonActionPerformed
    /**
     *
     * @param evt actionlistener that shows the AdminLuggageLost panel.
     */
    private void lostJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lostJButtonActionPerformed
        try {
            Frame.getInstance().showPanel(new AdminLuggageLost());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminLuggageFound.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lostJButtonActionPerformed

    /**
     * 
     * @param evt actionlistener that gets the row thats selected, then 
     * shows the EditLostLuggage panel and fills it with the selected content.
     */
    private void editJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJButtonActionPerformed
        //  If there is no row selected to edit
        if (foundLuggageJTable.getSelectedRow() >= 0) {
            int row = foundLuggageJTable.getSelectedRow();
            int col = 0;
            int id = Integer.parseInt((String) foundLuggageJTable.getModel().getValueAt(row, col));

            Luggage luggage = FYSApp.getLuggageManager().getSelectedLuggage(id);
            Frame.getInstance().showPanel(new EditLostLuggage());

            EditLostLuggage.setLuggageId(id);
            EditLostLuggage.setStatus("Found");
            EditLostLuggage.setText(luggage);
            
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row before editing!");
        }
    }//GEN-LAST:event_editJButtonActionPerformed

    /**
     * 
     * @param evt actionlistener that selects a row from the jTable, 
     * then deletes the content from the database.
     */
    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed

        if (foundLuggageJTable.getSelectedRow() >= 0) {
            int row = foundLuggageJTable.getSelectedRow();
            int col = 0;
            int id = Integer.parseInt((String) foundLuggageJTable.getValueAt(row, col));

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
                FYSApp.getQueryManager().delete(id);
                Frame.getInstance().showPanel(new AdminLuggageFound());
            } else {
                Frame.getInstance().showPanel(new AdminLuggageFound());
            }
            
        } else {
            //custom title, warning icon
            JOptionPane.showMessageDialog(null,
                    "Please select a row before editing!",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_deleteJButtonActionPerformed
    /**
     *
     * @param evt
     */
    private void searchJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchJTextFieldKeyTyped

    }//GEN-LAST:event_searchJTextFieldKeyTyped
    /**
     *
     * @param evt
     */
    private void searchJTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchJTextFieldMouseClicked
        searchJTextField.setText("");
    }//GEN-LAST:event_searchJTextFieldMouseClicked

    /**
     * 
     * @param evt actionlistener that shows the AdminUsers panel.
     */
    private void overviewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overviewJButtonActionPerformed
        try {
            Frame.getInstance().showPanel(new AdminUsers());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminLuggageFound.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_overviewJButtonActionPerformed

    /**
     * 
     * @param evt actionlistener that shows the AdminLuggageFound panel.
     */
    private void foundJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foundJButtonActionPerformed
        Frame.getInstance().showPanel(new AdminLuggageFound());
    }//GEN-LAST:event_foundJButtonActionPerformed

    /**
     * 
     * @param evt actionlistener that gets the content typed in by the user
     * from the searchJTextField, then searches the content in the database
     * and updates the table with its content.
     */
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
                Logger.getLogger(AdminLuggageFound.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_searchJTextFieldKeyPressed

    private void setLoggedInAs() {
        String userName = FYSApp.getUserManager().getUserName();
        loggedInAs.setText(userName);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteJButton;
    private javax.swing.JButton editJButton;
    private javax.swing.JButton foundJButton;
    public javax.swing.JTable foundLuggageJTable;
    private javax.swing.JLabel jLWarning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel loggedInAs;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JButton lostJButton;
    private javax.swing.JButton overviewJButton;
    private javax.swing.JButton searchJButton;
    public javax.swing.JTextField searchJTextField;
    // End of variables declaration//GEN-END:variables

}
