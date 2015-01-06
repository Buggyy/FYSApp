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
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import main.FYSApp;
import main.Frame;
import model.User;

/**
 *
 * @author Team 1 IS106 ZoekJeKoffer
 */
public class AdminUsers extends JPanel {

    // Always declare first..!
    DatabaseManager dbmanager;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public String input;
    ResultSetMetaData rsmetadata = null;
    public int columns = 0;

    public AdminUsers() throws ClassNotFoundException, SQLException {
        initComponents();
        getUsers();
    }

    private void getUsers() throws ClassNotFoundException, SQLException {
        rs = Frame.getQueryManager().getAdminUsersOverview();
        try {
            updateTable(rs);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AdminUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Creates new form AdminUsers
     *
     * @param rs
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
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

        userTable.setModel(dtm);
        userTable.repaint();
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
        searchJTextField = new javax.swing.JTextField();
        searchJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        editJButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        registerJButton = new javax.swing.JButton();
        jLWarning = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 255));
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setPreferredSize(new java.awt.Dimension(1024, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back-2-2-icon.png"))); // NOI18N
        backJButton.setText("BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 70, 100, 40));

        logoutJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout-icon.png"))); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 110, 30));

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
        add(searchJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 150, -1));

        searchJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search-icon.png"))); // NOI18N
        searchJButton.setText("SEARCH");
        searchJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJButtonActionPerformed(evt);
            }
        });
        add(searchJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 110, 40));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Currently logged in as: [username]");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        userTable.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Username", "Password", "Role", "Airport", "Date DD/MM/YY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(userTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 590, 340));

        editJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit-icon.png"))); // NOI18N
        editJButton.setText("EDIT");
        editJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJButtonActionPerformed(evt);
            }
        });
        add(editJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 90, 40));

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
        jLabel2.setText("Users Overview - Admin");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 270, 33));

        registerJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add-icon.png"))); // NOI18N
        registerJButton.setText("REGISTER NEW USER");
        registerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerJButtonActionPerformed(evt);
            }
        });
        add(registerJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 210, 40));

        jLWarning.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLWarning.setForeground(new java.awt.Color(255, 255, 255));
        add(jLWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 410, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Corendon-background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(1024, 600));
        jLabel3.setMinimumSize(new java.awt.Dimension(1024, 600));
        jLabel3.setPreferredSize(new java.awt.Dimension(1024, 600));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1030, 610));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        Frame.getInstance().showPanel(new AdminFront());
    }//GEN-LAST:event_backJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        Frame.shutdown();
        FYSApp.logout();
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void searchJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJTextFieldActionPerformed

    }//GEN-LAST:event_searchJTextFieldActionPerformed

    private void searchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButtonActionPerformed
        try {
            input = searchJTextField.getText();
            rs = Frame.getQueryManager().searchTableUser(input);

            if (input == null) {
                userTable.repaint();
            }
            if (!rs.next()) {
                jLWarning.setText("No matches found!");
                getUsers();
                updateTable(rs);
            } else {
                jLWarning.setText("");
                rs.beforeFirst();
                updateTable(rs);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchJButtonActionPerformed

    private void editJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJButtonActionPerformed
        try {
            // TODO add your handling code here:
            int row = userTable.getSelectedRow();
            int userNameCol = 1;
            int userIdCol = 0;

            String uName = (String) userTable.getModel().getValueAt(row, userNameCol);
            int userId = Integer.parseInt((String) userTable.getModel().getValueAt(row, userIdCol));

            
            User user = Frame.getQueryManager().getSelectedUser(uName);
            
            Frame.getInstance().showPanel(new AdminRegisterUser());
            AdminRegisterUser.setUpdate(10,userId);

            Frame.getInstance().showPanel(new AdminRegisterUser());
            AdminRegisterUser.setUpdate(10, userId);

            AdminRegisterUser.setText(user);
        } catch (SQLException ex) {
            Logger.getLogger(AdminUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editJButtonActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        // TODO add your handling code here:
        int row = userTable.getSelectedRow();
        int col = 0;
        String uName = (String) userTable.getModel().getValueAt(row, col);

        Frame.getQueryManager().deleteUser(uName);

        try {
            Frame.getInstance().showPanel(new AdminUsers());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminUsers.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_deleteJButtonActionPerformed

    private void registerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerJButtonActionPerformed

        Frame.getInstance().showPanel(new AdminRegisterUser());
        AdminRegisterUser.setUpdate(0,0);
    }//GEN-LAST:event_registerJButtonActionPerformed

    private void searchJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchJTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                input = searchJTextField.getText();
                rs = Frame.getQueryManager().searchTableUser(input);

                if (input == null) {
                    userTable.repaint();
                }
                if (!rs.next()) {
                    jLWarning.setText("No matches found!");
                    getUsers();
                    updateTable(rs);
                } else {
                    jLWarning.setText("");
                    rs.beforeFirst();
                    updateTable(rs);
                }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(AdminUsers.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_searchJTextFieldKeyPressed

    private void searchJTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchJTextFieldMouseClicked
        searchJTextField.setText("");
    }//GEN-LAST:event_searchJTextFieldMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JButton editJButton;
    private javax.swing.JLabel jLWarning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JButton registerJButton;
    private javax.swing.JButton searchJButton;
    private javax.swing.JTextField searchJTextField;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
