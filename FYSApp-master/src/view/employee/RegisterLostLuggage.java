package view.employee;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import main.FYSApp;
import model.Client;
import model.Luggage;
import view.LoginScreen;

/**
 *
 * @author Team 1 IS106 ZoekJeKoffer
 */
public class RegisterLostLuggage extends JPanel {

    private static int updateMode = 0;
    private static int luggageid;

    //private Client client;

    /**
     * Creates new form RegisterLostLuggage
     */
    public RegisterLostLuggage() {
        
        initComponents();
    }

    public static void setUpdate(int id) {
        RegisterLostLuggage.updateMode = id;
        RegisterLostLuggage.luggageid = id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        jLabel2 = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        clearJButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        firstNameJTextField = new javax.swing.JTextField();
        middleNameJTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lastNameJTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        phoneNrJTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        emailJTextField = new javax.swing.JTextField();
        cityJTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        addressJTextField = new javax.swing.JTextField();
        zipcodeJTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        stateJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        countryJTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jCbox_Color1 = new javax.swing.JComboBox();
        jCbox_Color = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        brandJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtfld_description = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtfld_description2 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(156, 10, 13));
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contact details");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 230, 30));

        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 90, 30));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Register Lost Luggage");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 360, 30));

        submitJButton.setText("SUBMIT");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 130, 30));

        clearJButton.setText("CANCEL");
        clearJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJButtonActionPerformed(evt);
            }
        });
        add(clearJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 130, 30));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Firstname");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, -1));

        firstNameJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        firstNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameJTextFieldActionPerformed(evt);
            }
        });
        add(firstNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 190, -1));

        middleNameJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        middleNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleNameJTextFieldActionPerformed(evt);
            }
        });
        add(middleNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 190, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Middlename");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, -1, -1));

        lastNameJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lastNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameJTextFieldActionPerformed(evt);
            }
        });
        add(lastNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 190, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Lastname");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, -1, -1));

        phoneNrJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        phoneNrJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNrJTextFieldActionPerformed(evt);
            }
        });
        add(phoneNrJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 190, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Phonenumber");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, -1, -1));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, -1));

        emailJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        emailJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailJTextFieldActionPerformed(evt);
            }
        });
        add(emailJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 190, -1));

        cityJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cityJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityJTextFieldActionPerformed(evt);
            }
        });
        add(cityJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 190, 20));

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Address");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, -1, 20));

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("City");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, -1, 20));

        addressJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        addressJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressJTextFieldActionPerformed(evt);
            }
        });
        add(addressJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 190, 20));

        zipcodeJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        zipcodeJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipcodeJTextFieldActionPerformed(evt);
            }
        });
        add(zipcodeJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, 130, 20));

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("State");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, -1, 20));

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Zipcode");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, -1, 20));

        stateJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        stateJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateJTextFieldActionPerformed(evt);
            }
        });
        add(stateJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 190, 20));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Currently logged in as: [username]");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Country ");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, -1, 20));

        countryJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        countryJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryJTextFieldActionPerformed(evt);
            }
        });
        add(countryJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 190, 20));

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Last place seen");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Weight class:");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jCbox_Color1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCbox_Color1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbox_Color1ActionPerformed(evt);
            }
        });
        add(jCbox_Color1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 160, -1));

        jCbox_Color.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCbox_Color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbox_ColorActionPerformed(evt);
            }
        });
        add(jCbox_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 160, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Color:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Brand:");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        brandJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        brandJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandJTextFieldActionPerformed(evt);
            }
        });
        add(brandJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 160, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Loading message..");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, -1, 10));
        add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 340, 20));

        txtfld_description.setColumns(20);
        txtfld_description.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtfld_description.setRows(5);
        jScrollPane2.setViewportView(txtfld_description);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 340, 60));

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText(">>>> Error message <<<<");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 210, 20));

        txtfld_description2.setColumns(20);
        txtfld_description2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtfld_description2.setRows(5);
        jScrollPane4.setViewportView(txtfld_description2);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 340, 60));

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Other details:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Corendon-background.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 1090, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        FYSApp.getInstance().showPanel(new LoginScreen());
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
/*
        // Get de input van de user in de textfields en stopt dit
        // in variabelen, vervolgens geeft ie deze mee aan de addLuggage
        // methode zodat de koffer geregistreerd wordt. :D
//        Luggage luggage = new Luggage((weight,brand,description,status);
        // Set alle gegevens in deze luggage object.
//        luggage.setBlbalba(fabf);
        String firstName = firstNameJTextField.getText();
        String middleName = middleNameJTextField.getText();
        String lastName = lastNameJTextField.getText();
        String phone = phoneNrJTextField.getText();
        String email = emailJTextField.getText();
        String country = countryJTextField.getText();
        String address = addressJTextField.getText();
        String city = cityJTextField.getText();
        String state = stateJTextField.getText();
        String zipCode = zipcodeJTextField.getText();

        Client client = new Client(firstName, middleName, lastName, phone, email, country,
                address, city, state, zipCode);

        String weight = weightJTextField.getText();
        String brand = brandJTextField.getText();
        String description = descriptionJTextField.getText();
        String status = "lost";

        Luggage luggage = new Luggage(weight, brand, description, status);

        if (updateMode > 1) {
            FYSApp.getQueryManager().updateLuggage(luggage, luggageid);
        } else {
            FYSApp.getQueryManager().addClient(client);
            int id = FYSApp.getQueryManager().getClientd();
            FYSApp.getQueryManager().addLostLuggage(luggage, id);
        }

        // Pak de id van deze client
        // luggage.setId(de id van je query die je ophaalt.)
//        FYSApp.getInstance().getQueryManager().addLuggage(luggage);
        try {
            FYSApp.getInstance().showPanel(new LostLuggageOverview());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RegisterLostLuggage.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void clearJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJButtonActionPerformed
        try {
            FYSApp.getInstance().showPanel(new LostLuggageOverview());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RegisterLostLuggage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_clearJButtonActionPerformed

    private void firstNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameJTextFieldActionPerformed

    private void middleNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middleNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middleNameJTextFieldActionPerformed

    private void lastNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameJTextFieldActionPerformed

    private void phoneNrJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNrJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNrJTextFieldActionPerformed

    private void emailJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailJTextFieldActionPerformed

    private void cityJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityJTextFieldActionPerformed

    private void addressJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressJTextFieldActionPerformed

    private void zipcodeJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipcodeJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipcodeJTextFieldActionPerformed

    private void stateJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateJTextFieldActionPerformed

    private void countryJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryJTextFieldActionPerformed

    private void jCbox_Color1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbox_Color1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbox_Color1ActionPerformed

    private void jCbox_ColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbox_ColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbox_ColorActionPerformed

    private void brandJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandJTextFieldActionPerformed

    public static void setText(Luggage luggage) {
        brandJTextField.setText(luggage.getBrand());
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressJTextField;
    private static javax.swing.JTextField brandJTextField;
    private java.awt.Canvas canvas1;
    private javax.swing.JTextField cityJTextField;
    private javax.swing.JButton clearJButton;
    private javax.swing.JTextField countryJTextField;
    private javax.swing.JTextField emailJTextField;
    private javax.swing.JTextField firstNameJTextField;
    private static javax.swing.JComboBox jCbox_Color;
    private static javax.swing.JComboBox jCbox_Color1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField lastNameJTextField;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JTextField middleNameJTextField;
    private javax.swing.JTextField phoneNrJTextField;
    private javax.swing.JTextField stateJTextField;
    private javax.swing.JButton submitJButton;
    private static javax.swing.JTextArea txtfld_description;
    private static javax.swing.JTextArea txtfld_description2;
    private javax.swing.JTextField zipcodeJTextField;
    // End of variables declaration//GEN-END:variables
}
