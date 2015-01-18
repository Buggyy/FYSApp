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
    private static ResultSet rs = null;
    PreparedStatement pst = null;
    private String input;
    private static ResultSetMetaData rsmetadata;
    private static int columns = 0;
    private static final int UPDATE_MODE_FALSE = 0;
    private int WHICH_STATUS = 0;
    private boolean lost;
    private static String brand;
    private static String lableCode;
    private static String material;
    private static String otherDetails;
    private static String color;
    private static String departureFrom;
    private static String weightClass;
    private static String firstName;
    private static String middleName;
    private static String lastName;
    private static String phoneNumber;
    private static String email;
    private static String country;
    private static String address;
    private static String city;
    private static String state;
    private static String zipCode;
    private static String whenFound;
    private static String foundAt;
    private static int updateMode = 0;
    private static int luggageid;
    private static int clientid;
    private static String lostOrFound = "";

    /**
     * Creates new form Match
     *
     * @description Constructor
     */
    public MatchingLuggage() {
        initComponents();
        setLoggedInAs();
    }

    /**
     *
     * @param lostOrFound String containing lost or found status
     * @descriptoin set status to lost or found
     */
    public static void setLostOrFound(String lostOrFound) {
        MatchingLuggage.lostOrFound = lostOrFound;
    }

    /**
     *
     * @param luggage set of luggage info
     * @description set all the luggage fields
     */
    public static void setTextLuggage(Luggage luggage) {
        brand = luggage.getBrand();
        lableCode = luggage.getLableCode();
        material = luggage.getMaterial();
        otherDetails = luggage.getOtherDetails();
        color = luggage.getColor();
        departureFrom = luggage.getDepartureFrom();
        weightClass = luggage.getWeightClass();
        whenFound = luggage.getWhenFound();
        foundAt = luggage.getFoundAt();

    }

    /**
     *
     * @param client set of client info
     * @description set all the client fields of the lost luggage fields
     */
    public static void setTextClient(Client client) {
        firstName = client.getFirstName();
        middleName = client.getMiddleName();
        lastName = client.getLastName();
        phoneNumber = client.getPhone();
        email = client.getEmail();
        country = client.getCountry();
        address = client.getAddress();
        city = client.getCity();
        state = client.getState();
        zipCode = client.getZipCode();
    }

    /**
     * Creates new form MatchingLuggage
     *
     * @param id an id is needed
     * @descripton updates the selected id
     */
    public static void setUpdate(int id) {
        updateMode = id;
        luggageid = id;
        clientid = id;
    }

    /**
     * Matched luggage
     *
     * @param resultSet result set of data needed
     * @description get possible matches
     */
    public static void getMatchingLuggage(ResultSet resultSet) {
        MatchingLuggage.rs = resultSet;
        try {
            updateTable(rs);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MatchingLuggage.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param rs resultset with info to show
     * @throws ClassNotFoundException
     * @throws SQLException * Creates new form ML
     * @description updates matchingLuggageTable
     */
    private static void updateTable(ResultSet rs)
            throws ClassNotFoundException, SQLException {

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
     * @description shows currently logged in user
     */
    private void setLoggedInAs() {
        String userName = FYSApp.getUserManager().getUserName();
        loggedInAs.setText(userName);
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
        backJButton2 = new javax.swing.JButton();
        loggedInAs = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        matchingLuggageTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 790, 380));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/match-icon.png"))); // NOI18N
        jLabel5.setText("  Matching Luggage");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 410, 33));

        registerJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add-icon.png"))); // NOI18N
        registerJButton.setText(" REGISTER LUGGAGE");
        registerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerJButtonActionPerformed(evt);
            }
        });
        add(registerJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 210, 40));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Luggage found?");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 130, 33));

        logoutJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout-icon.png"))); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 20, -1, 30));

        matchJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/match-icon.png"))); // NOI18N
        matchJButton.setText(" MATCH");
        matchJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchJButtonActionPerformed(evt);
            }
        });
        add(matchJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 110, 40));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Luggage not found?");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 170, 33));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Currently logged in as:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        backJButton2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        backJButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel-icon.png"))); // NOI18N
        backJButton2.setText("CANCEL");
        backJButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });
        add(backJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, 100, 30));

        loggedInAs.setForeground(new java.awt.Color(255, 255, 255));
        loggedInAs.setText("jLabel2");
        add(loggedInAs, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Corendon-background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setAutoscrolls(true);
        jLabel3.setMaximumSize(new java.awt.Dimension(1024, 600));
        jLabel3.setMinimumSize(new java.awt.Dimension(1024, 600));
        jLabel3.setPreferredSize(new java.awt.Dimension(1024, 600));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    /**
     *
     * @param evt
     * @description register the luggage set
     */
    private void registerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerJButtonActionPerformed
        //  Create solved luggage item with user input
        Luggage luggage = new Luggage(brand, lableCode, color,
                otherDetails, lostOrFound, material, weightClass, whenFound,
                foundAt, departureFrom);

        // Create solved client item with user input
        Client client = new Client(firstName, middleName, lastName, phoneNumber,
                email, country, address, city, state, zipCode);

        FYSApp.getClientManager().addClient(client);
        int id = FYSApp.getClientManager().getClientid();
        FYSApp.getLuggageManager().addLostLuggage(luggage, id);
        if (lostOrFound.equalsIgnoreCase("found")) {
            Frame.getInstance().showPanel(new FoundLuggageOverview());
        } else {
            try {
                Frame.getInstance().showPanel(new LostLuggageOverview());
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(MatchingLuggage.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
        }
        JOptionPane.showMessageDialog(null, "Information is saved");
    }//GEN-LAST:event_registerJButtonActionPerformed
    /**
     *
     * @param evt
     * @description logs the user out of the system
     */
    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        Frame.shutdown();
        FYSApp.logout();
    }//GEN-LAST:event_logoutJButtonActionPerformed
    /**
     *
     * @param evt
     * @description the data of the selected row will be send to the
     * RegisterSolvesLuggage, you can't select more than 1 line
     */
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
    /**
     *
     * @param evt
     * @description back to previous screen dependent on which screen you came
     *              from
     */
    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed
        if (lostOrFound.equalsIgnoreCase("found")) {
            Frame.getInstance().showPanel(new FoundLuggageOverview());
        } else {
            try {
                Frame.getInstance().showPanel(new LostLuggageOverview());
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(MatchingLuggage.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_backJButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel loggedInAs;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JButton matchJButton;
    private static javax.swing.JTable matchingLuggageTable;
    private javax.swing.JButton registerJButton;
    // End of variables declaration//GEN-END:variables

}
