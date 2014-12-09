package view.employee;


import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import main.FYSApp;
import view.LoginScreen;

/**
 *
 * @author Team 1 IS106 ZoekJeKoffer
 */
public class FoundLuggageOverview extends JPanel {

  
    
    /**
     * Creates new form FoundLuggageOverview
     */
    public FoundLuggageOverview() throws ClassNotFoundException, SQLException {
        
        initComponents();
        
        ResultSet rs = FYSApp.getQueryManager().getEmployeeFoundLuggage();
        ResultSetMetaData rsmetadata = rs.getMetaData();

        int columns = rsmetadata.getColumnCount();

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

        foundLuggageTable.setModel(dtm);
        foundLuggageTable.repaint();
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
        lostJButton = new javax.swing.JButton();
        logoutJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        searchJButton = new javax.swing.JButton();
        searchJTextField = new javax.swing.JTextField();
        registerJButton = new javax.swing.JButton();
        editJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        foundLuggageTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 102, 102));
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setPreferredSize(new java.awt.Dimension(1024, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setText("BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, 100, 50));

        lostJButton.setText("LOST");
        lostJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lostJButtonActionPerformed(evt);
            }
        });
        add(lostJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 140, 100, 50));

        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 90, 30));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Found Luggage Overview - Employee");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 410, 33));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Currently logged in as: [username]");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        searchJButton.setText("SEARCH");
        searchJButton.setEnabled(false);
        searchJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJButtonActionPerformed(evt);
            }
        });
        add(searchJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 100, 40));

        searchJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        searchJTextField.setText("Enter keywords");
        searchJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJTextFieldActionPerformed(evt);
            }
        });
        add(searchJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 150, -1));

        registerJButton.setText("REGISTER FOUND LUGGAGE");
        registerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerJButtonActionPerformed(evt);
            }
        });
        add(registerJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 210, 40));

        editJButton.setText("EDIT");
        editJButton.setEnabled(false);
        editJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJButtonActionPerformed(evt);
            }
        });
        add(editJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 80, 40));

        foundLuggageTable.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        foundLuggageTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(foundLuggageTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 590, 340));

        jLabel4.setForeground(new java.awt.Color(51, 255, 255));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 300, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Corendon-background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(1024, 600));
        jLabel3.setMinimumSize(new java.awt.Dimension(1024, 600));
        jLabel3.setPreferredSize(new java.awt.Dimension(1024, 600));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        FYSApp.getInstance().showPanel(new EmployeeFront());
    }//GEN-LAST:event_backJButtonActionPerformed

    private void lostJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lostJButtonActionPerformed
        try {
            FYSApp.getInstance().showPanel(new LostLuggageOverview());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FoundLuggageOverview.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FoundLuggageOverview.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lostJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        FYSApp.getInstance().showPanel(new LoginScreen());
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void searchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchJButtonActionPerformed

    private void searchJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchJTextFieldActionPerformed

    private void registerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerJButtonActionPerformed
        FYSApp.getInstance().showPanel(new RegisterFoundLuggage());
    }//GEN-LAST:event_registerJButtonActionPerformed

    private void editJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton editJButton;
    private javax.swing.JTable foundLuggageTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JButton lostJButton;
    private javax.swing.JButton registerJButton;
    private javax.swing.JButton searchJButton;
    private javax.swing.JTextField searchJTextField;
    // End of variables declaration//GEN-END:variables
}
