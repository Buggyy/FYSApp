package view.admin;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import main.FYSApp;
import static main.FYSApp.ZERO;
import main.Frame;
import model.Luggage;

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
        setLoggedInAs();
    }

    private void getLostLuggage() throws ClassNotFoundException, SQLException {
        rs = FYSApp.getTableManager().getEmployeeLostLuggage();
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

        tbl_lostLuggage.setModel(dtm);
        tbl_lostLuggage.repaint();
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
        btn_search = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        btn_deleteRow = new javax.swing.JButton();
        btn_foundLuggage = new javax.swing.JButton();
        btn_editRow = new javax.swing.JButton();
        searchJTextField = new javax.swing.JTextField();
        lbl_lostLuggageOverviewTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_lostLuggage = new javax.swing.JTable();
        lbl_warning = new javax.swing.JLabel();
        btn_lostLuggage = new javax.swing.JButton();
        btn_userOverview = new javax.swing.JButton();
        lbl_loggedInAs2 = new javax.swing.JLabel();
        lbl_loggedInAs1 = new javax.swing.JLabel();
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

        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search-icon.png"))); // NOI18N
        btn_search.setText("SEARCH");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 110, 40));

        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout-icon.png"))); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel1.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 20, -1, 30));

        btn_deleteRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete-icon.png"))); // NOI18N
        btn_deleteRow.setText("DELETE");
        btn_deleteRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteRowActionPerformed(evt);
            }
        });
        jPanel1.add(btn_deleteRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, -1, 40));

        btn_foundLuggage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/found-luggage-icon.png"))); // NOI18N
        btn_foundLuggage.setText("Found Luggage");
        btn_foundLuggage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_foundLuggageActionPerformed(evt);
            }
        });
        jPanel1.add(btn_foundLuggage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 140, 40));

        btn_editRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit-icon.png"))); // NOI18N
        btn_editRow.setText("EDIT");
        btn_editRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editRowActionPerformed(evt);
            }
        });
        jPanel1.add(btn_editRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, 90, 40));

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
        jPanel1.add(searchJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 150, -1));

        lbl_lostLuggageOverviewTitle.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbl_lostLuggageOverviewTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbl_lostLuggageOverviewTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lost-luggage-icon.png"))); // NOI18N
        lbl_lostLuggageOverviewTitle.setText("   Lost Luggage Overview");
        jPanel1.add(lbl_lostLuggageOverviewTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 290, 33));

        tbl_lostLuggage.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_lostLuggage.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        tbl_lostLuggage.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_lostLuggage);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 710, 340));

        lbl_warning.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_warning.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 410, 30));

        btn_lostLuggage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lost-luggage-icon.png"))); // NOI18N
        btn_lostLuggage.setText("Lost Luggage");
        btn_lostLuggage.setEnabled(false);
        btn_lostLuggage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lostLuggageActionPerformed(evt);
            }
        });
        jPanel1.add(btn_lostLuggage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 140, 40));

        btn_userOverview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/users-icon.png"))); // NOI18N
        btn_userOverview.setText("User Overview");
        btn_userOverview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_userOverviewActionPerformed(evt);
            }
        });
        jPanel1.add(btn_userOverview, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 140, 40));

        lbl_loggedInAs2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_loggedInAs2.setText("[username]");
        jPanel1.add(lbl_loggedInAs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        lbl_loggedInAs1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_loggedInAs1.setText("Currently logged in as: ");
        jPanel1.add(lbl_loggedInAs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Corendon-background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(1024, 600));
        jLabel3.setMinimumSize(new java.awt.Dimension(1024, 600));
        jLabel3.setPreferredSize(new java.awt.Dimension(1024, 600));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        try {
            input = searchJTextField.getText();
            rs = FYSApp.getSearchManager().searchTableLuggageLost(input);
            if (rs != null) {
                rs = FYSApp.getSearchManager().searchTableLuggageLost(input);

                if (input == null) {
                    tbl_lostLuggage.repaint();
                }
                if (!rs.next()) {
                    lbl_warning.setText("No matches found!");
                    getLostLuggage();
                    updateTable(rs);
                } else {
                    lbl_warning.setText("");
                    rs.beforeFirst();
                    updateTable(rs);
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminLuggageLost.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
          //  Logout and stop the application
        FYSApp.logout();
        Frame.shutdown();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_deleteRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteRowActionPerformed
        //  if there is an actual row selected
        if (tbl_lostLuggage.getSelectedRow() >= 0) {

            int row = tbl_lostLuggage.getSelectedRow();
            int col = (int) ZERO;
            int id = Integer.parseInt((String) tbl_lostLuggage.getValueAt(row, col));

            // Give user second opinion with OptionPane
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
                //  if user clicked yes, row will be deleted
                FYSApp.getQueryManager().delete(id);
                try {
                    //  Go back to previous screen
                    Frame.getInstance().showPanel(new AdminLuggageLost());
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(AdminLuggageLost.class.getName())
                            .log(Level.SEVERE, null, ex);
                }
            } else {
                //  if user clicked no, no actions will be performed
                try {
                    //  stay on current screen
                    Frame.getInstance().showPanel(new AdminLuggageLost());
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(AdminLuggageLost.class.getName())
                            .log(Level.SEVERE, null, ex);
                }
            }

        } else {
            // If user didn't select a row before clicking edit button
            JOptionPane.showMessageDialog(null,
                    "Please select a row before editing!",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_btn_deleteRowActionPerformed

    private void btn_foundLuggageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_foundLuggageActionPerformed
        Frame.getInstance().showPanel(new AdminLuggageFound());
    }//GEN-LAST:event_btn_foundLuggageActionPerformed

    private void btn_editRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editRowActionPerformed

        //  
        if (tbl_lostLuggage.getSelectedRow() >= 0) {
            int row = tbl_lostLuggage.getSelectedRow();
            int col = 0;
            int id = Integer.parseInt((String) tbl_lostLuggage.getModel().getValueAt(row, col));

            Luggage luggage = FYSApp.getLuggageManager().getSelectedLuggage(id);
            Frame.getInstance().showPanel(new EditLuggage());

            EditLuggage.setLuggageId(id);
            EditLuggage.setStatus("Lost");
            EditLuggage.setText(luggage);

        } else { //  If there is no row selected to edit
            JOptionPane.showMessageDialog(null, "Please select a row before editing!");
        }


    }//GEN-LAST:event_btn_editRowActionPerformed

    private void searchJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJTextFieldActionPerformed

    }//GEN-LAST:event_searchJTextFieldActionPerformed

    private void searchJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchJTextFieldKeyPressed

        //  Check if the user pressed the enter button
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                input = searchJTextField.getText();
                rs = FYSApp.getSearchManager().searchTableLuggageLost(input);
                if (rs != null) {
                    rs = FYSApp.getSearchManager().searchTableLuggageLost(input);

                    if (input == null) {
                        tbl_lostLuggage.repaint();
                    }
                    if (!rs.next()) {
                        // if column values from this record do not match
                        lbl_warning.setText("No matches found!");
                        getLostLuggage();
                        updateTable(rs);
                    } else {
                        lbl_warning.setText("");
                        rs.beforeFirst();
                        updateTable(rs);
                    }
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(AdminLuggageLost.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_searchJTextFieldKeyPressed

    private void searchJTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchJTextFieldMouseClicked
        searchJTextField.setText("");
    }//GEN-LAST:event_searchJTextFieldMouseClicked

    private void btn_lostLuggageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lostLuggageActionPerformed
        try {
            Frame.getInstance().showPanel(new AdminLuggageLost());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminLuggageFound.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_lostLuggageActionPerformed

    private void btn_userOverviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userOverviewActionPerformed
        try {
            Frame.getInstance().showPanel(new AdminUsers());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_userOverviewActionPerformed

    private void setLoggedInAs() {
        //  Store return value from method in a variable
        String userName = FYSApp.getUserManager().getUserName();
        lbl_loggedInAs2.setText(userName);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_deleteRow;
    private javax.swing.JButton btn_editRow;
    private javax.swing.JButton btn_foundLuggage;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_lostLuggage;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_userOverview;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_loggedInAs1;
    private javax.swing.JLabel lbl_loggedInAs2;
    private javax.swing.JLabel lbl_lostLuggageOverviewTitle;
    private javax.swing.JLabel lbl_warning;
    private javax.swing.JTextField searchJTextField;
    private javax.swing.JTable tbl_lostLuggage;
    // End of variables declaration//GEN-END:variables
}
