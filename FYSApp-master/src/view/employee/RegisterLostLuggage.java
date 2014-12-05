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
 * @author Gebruiker
 */
public class RegisterLostLuggage extends JPanel {

    /**
     * Creates new form RegisterLostLuggage
     */
    public RegisterLostLuggage() {
        initComponents();
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
        jLabel4 = new javax.swing.JLabel();
        brandJTextField = new javax.swing.JTextField();
        weightJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        descriptionJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
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
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        countryJTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 102, 102));
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contact details");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 230, 30));

        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 90, 30));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Register Lost Luggage - Employee");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 360, 30));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Brand");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        brandJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        brandJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandJTextFieldActionPerformed(evt);
            }
        });
        add(brandJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 190, -1));

        weightJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        weightJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightJTextFieldActionPerformed(evt);
            }
        });
        add(weightJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 60, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("KG");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        descriptionJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionJTextFieldActionPerformed(evt);
            }
        });
        add(descriptionJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 340, 190));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Description");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        submitJButton.setText("SUBMIT");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 130, 60));

        clearJButton.setText("CLEAR");
        clearJButton.setEnabled(false);
        clearJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJButtonActionPerformed(evt);
            }
        });
        add(clearJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 130, 60));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Firstname");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        firstNameJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        firstNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameJTextFieldActionPerformed(evt);
            }
        });
        add(firstNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 190, -1));

        middleNameJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        middleNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleNameJTextFieldActionPerformed(evt);
            }
        });
        add(middleNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 190, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Middlename");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));

        lastNameJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lastNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameJTextFieldActionPerformed(evt);
            }
        });
        add(lastNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 190, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Lastname");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        phoneNrJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        phoneNrJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNrJTextFieldActionPerformed(evt);
            }
        });
        add(phoneNrJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 190, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Phonenumber");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, -1, -1));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, -1, -1));

        emailJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        emailJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailJTextFieldActionPerformed(evt);
            }
        });
        add(emailJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 190, -1));

        cityJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cityJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityJTextFieldActionPerformed(evt);
            }
        });
        add(cityJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 190, 20));

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Address");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, 20));

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("City");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, 20));

        addressJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        addressJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressJTextFieldActionPerformed(evt);
            }
        });
        add(addressJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 190, 20));

        zipcodeJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        zipcodeJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipcodeJTextFieldActionPerformed(evt);
            }
        });
        add(zipcodeJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, 130, 20));

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("State");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, -1, 20));

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Zipcode");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, -1, 20));

        stateJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        stateJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateJTextFieldActionPerformed(evt);
            }
        });
        add(stateJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 190, 20));

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Weight");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Currently logged in as: [username]");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        backJButton.setText("BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, 100, 50));

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Country ");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, 20));

        countryJTextField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        countryJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryJTextFieldActionPerformed(evt);
            }
        });
        add(countryJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 190, 20));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Corendon-background.jpg"))); // NOI18N
        jLabel17.setText("jLabel17");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        FYSApp.getInstance().showPanel(new LoginScreen());
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void brandJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandJTextFieldActionPerformed

    private void weightJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightJTextFieldActionPerformed

    private void descriptionJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionJTextFieldActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        // Get de input van de user in de textfields en stopt dit
        // in variabelen, vervolgens geeft ie deze mee aan de addLuggage
        // methode zodat de koffer geregistreerd wordt. :D
        Client client = new Client();
        Luggage luggage = new Luggage();
        
        // Set alle gegevens in deze luggage object.
//        luggage.setBlbalba(fabf);

        client.setFirstName(firstNameJTextField.getText());
        client.setMiddleName(middleNameJTextField.getText());
        client.setLastName(lastNameJTextField.getText());
        client.setPhone(phoneNrJTextField.getText());
        client.setEmail(emailJTextField.getText());
        client.setCountry(countryJTextField.getText());
        client.setAdress(addressJTextField.getText());
        client.setCity(cityJTextField.getText());
        client.setState(stateJTextField.getText());
        client.setZipCode(zipcodeJTextField.getText()); 
        
        //Query voor het ophalen van het ID van de laatste entry
        //Querymanager.getid
        /*
        1. Voeg client toe in de database.
        2. Haal de id op van laatst toegevoegde client.
        3. Zet deze id in de luggage object.
        4. Voeg daarna de luggage object toe.
        */
        FYSApp.getInstance().getQueryManager().addClient(client);
        //int id = FYSApp.getInstance().getQueryManager().getLastId();
        // Pak de id van deze client
        // luggage.setId(de id van je query die je ophaalt.)
        //FYSApp.getInstance().getQueryManager().addLuggage(luggage, id);
        try {
            FYSApp.getInstance().showPanel(new LostLuggageOverview());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterLostLuggage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegisterLostLuggage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void clearJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJButtonActionPerformed
        // TODO add your handling code here:
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

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        try {
            FYSApp.getInstance().showPanel(new LostLuggageOverview());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterLostLuggage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegisterLostLuggage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backJButtonActionPerformed

    private void countryJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryJTextFieldActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField brandJTextField;
    private java.awt.Canvas canvas1;
    private javax.swing.JTextField cityJTextField;
    private javax.swing.JButton clearJButton;
    private javax.swing.JTextField countryJTextField;
    private javax.swing.JTextField descriptionJTextField;
    private javax.swing.JTextField emailJTextField;
    private javax.swing.JTextField firstNameJTextField;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameJTextField;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JTextField middleNameJTextField;
    private javax.swing.JTextField phoneNrJTextField;
    private javax.swing.JTextField stateJTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField weightJTextField;
    private javax.swing.JTextField zipcodeJTextField;
    // End of variables declaration//GEN-END:variables
}
