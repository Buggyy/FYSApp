package view.employee;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import main.FYSApp;
import static main.FYSApp.*;
import model.*;
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
        
        for (int i = 0; i < airportsList.size(); i++) {
            cmb_departureFrom.addItem(airportsList);
        }

        //  These items should be stored in an array
        cmb_color.addItem("red");
        cmb_color.addItem("blue");
        cmb_color.addItem("yellow");
        cmb_color.addItem("pink");
        cmb_color.addItem("purple");
        cmb_color.addItem("green");
        cmb_color.addItem("black");
        cmb_color.addItem("white");
        cmb_color.addItem("orange");
        cmb_color.addItem("grey");
        cmb_color.addItem("brown");
        cmb_color.addItem("other..");

        cmb_weightClass.addItem("0kg - 5kg");
        cmb_weightClass.addItem("5kg - 10kg");
        cmb_weightClass.addItem("10kg - 15kg");
        cmb_weightClass.addItem("15kg - 20kg");
        cmb_weightClass.addItem("20kg+");

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
        lbl_rightTitle = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        lbl_leftTitle = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        clearJButton = new javax.swing.JButton();
        lbl_firstname = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        txt_middlename = new javax.swing.JTextField();
        lbl_middlename = new javax.swing.JLabel();
        txt_lastName = new javax.swing.JTextField();
        lbl_lastname = new javax.swing.JLabel();
        txt_phoneNumber = new javax.swing.JTextField();
        lbl_phoneNumber = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        txt_city = new javax.swing.JTextField();
        lbl_address = new javax.swing.JLabel();
        lbl_city = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        txt_zipcode = new javax.swing.JTextField();
        lbl_state = new javax.swing.JLabel();
        lbl_zipCode = new javax.swing.JLabel();
        txt_state = new javax.swing.JTextField();
        lbl_country = new javax.swing.JLabel();
        txt_country = new javax.swing.JTextField();
        lbl_weightClass = new javax.swing.JLabel();
        cmb_weightClass = new javax.swing.JComboBox();
        cmb_color = new javax.swing.JComboBox();
        lbl_color = new javax.swing.JLabel();
        lbl_brand = new javax.swing.JLabel();
        txt_brand = new javax.swing.JTextField();
        lbl_loadingMessage = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_otherDetails = new javax.swing.JTextArea();
        lbl_otherDetails = new javax.swing.JLabel();
        cmb_departureFrom = new javax.swing.JComboBox();
        lbl_departureFrom = new javax.swing.JLabel();
        lbl_material = new javax.swing.JLabel();
        txt_material = new javax.swing.JTextField();
        lbl_lableCode = new javax.swing.JLabel();
        txt_lableCode = new javax.swing.JTextField();

        setBackground(new java.awt.Color(156, 10, 13));
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_rightTitle.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbl_rightTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbl_rightTitle.setText("Contact details");
        add(lbl_rightTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 230, 30));

        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 90, 30));

        lbl_leftTitle.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbl_leftTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbl_leftTitle.setText("Register Lost Luggage");
        add(lbl_leftTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 360, 30));

        submitJButton.setText("SUBMIT");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 130, 30));

        clearJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel-icon.png"))); // NOI18N
        clearJButton.setText("CANCEL");
        clearJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJButtonActionPerformed(evt);
            }
        });
        add(clearJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 130, 30));

        lbl_firstname.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbl_firstname.setForeground(new java.awt.Color(255, 255, 255));
        lbl_firstname.setText("Firstname");
        add(lbl_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, -1));

        txt_firstname.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstnameActionPerformed(evt);
            }
        });
        add(txt_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 190, -1));

        txt_middlename.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_middlename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_middlenameActionPerformed(evt);
            }
        });
        add(txt_middlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 190, -1));

        lbl_middlename.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbl_middlename.setForeground(new java.awt.Color(255, 255, 255));
        lbl_middlename.setText("Middlename");
        add(lbl_middlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, -1, -1));

        txt_lastName.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lastNameActionPerformed(evt);
            }
        });
        add(txt_lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 190, -1));

        lbl_lastname.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbl_lastname.setForeground(new java.awt.Color(255, 255, 255));
        lbl_lastname.setText("Lastname");
        add(lbl_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, -1, -1));

        txt_phoneNumber.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_phoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneNumberActionPerformed(evt);
            }
        });
        add(txt_phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 190, -1));

        lbl_phoneNumber.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbl_phoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        lbl_phoneNumber.setText("Phonenumber");
        add(lbl_phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, -1, -1));

        lbl_email.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(255, 255, 255));
        lbl_email.setText("Email");
        add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, -1));

        txt_email.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 190, -1));

        txt_city.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cityActionPerformed(evt);
            }
        });
        add(txt_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 190, 20));

        lbl_address.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbl_address.setForeground(new java.awt.Color(255, 255, 255));
        lbl_address.setText("Address");
        add(lbl_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, -1, 20));

        lbl_city.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbl_city.setForeground(new java.awt.Color(255, 255, 255));
        lbl_city.setText("City");
        add(lbl_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, -1, 20));

        txt_address.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressActionPerformed(evt);
            }
        });
        add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 190, 20));

        txt_zipcode.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_zipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_zipcodeActionPerformed(evt);
            }
        });
        add(txt_zipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, 110, 20));

        lbl_state.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbl_state.setForeground(new java.awt.Color(255, 255, 255));
        lbl_state.setText("State");
        add(lbl_state, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, -1, 20));

        lbl_zipCode.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbl_zipCode.setForeground(new java.awt.Color(255, 255, 255));
        lbl_zipCode.setText("Zipcode");
        add(lbl_zipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, -1, 20));

        txt_state.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stateActionPerformed(evt);
            }
        });
        add(txt_state, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 190, 20));

        lbl_country.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbl_country.setForeground(new java.awt.Color(255, 255, 255));
        lbl_country.setText("Country ");
        add(lbl_country, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, -1, 20));

        txt_country.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_countryActionPerformed(evt);
            }
        });
        add(txt_country, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 190, 20));

        lbl_weightClass.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbl_weightClass.setForeground(new java.awt.Color(255, 255, 255));
        lbl_weightClass.setText("Weight class:");
        add(lbl_weightClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        cmb_weightClass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_weightClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_weightClassActionPerformed(evt);
            }
        });
        add(cmb_weightClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 160, -1));

        cmb_color.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_colorActionPerformed(evt);
            }
        });
        add(cmb_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 160, -1));

        lbl_color.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbl_color.setForeground(new java.awt.Color(255, 255, 255));
        lbl_color.setText("Color:");
        add(lbl_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        lbl_brand.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbl_brand.setForeground(new java.awt.Color(255, 255, 255));
        lbl_brand.setText("Brand:");
        add(lbl_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        txt_brand.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_brandActionPerformed(evt);
            }
        });
        add(txt_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 160, -1));

        lbl_loadingMessage.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lbl_loadingMessage.setForeground(new java.awt.Color(255, 255, 255));
        lbl_loadingMessage.setText("Loading message..");
        add(lbl_loadingMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, -1, 10));
        add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 340, 20));

        txt_otherDetails.setColumns(20);
        txt_otherDetails.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_otherDetails.setRows(5);
        jScrollPane4.setViewportView(txt_otherDetails);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 340, 60));

        lbl_otherDetails.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbl_otherDetails.setForeground(new java.awt.Color(255, 255, 255));
        lbl_otherDetails.setText("Other details:");
        add(lbl_otherDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        cmb_departureFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_departureFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_departureFromActionPerformed(evt);
            }
        });
        add(cmb_departureFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 160, -1));

        lbl_departureFrom.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbl_departureFrom.setForeground(new java.awt.Color(255, 255, 255));
        lbl_departureFrom.setText("Departure from:");
        add(lbl_departureFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        lbl_material.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbl_material.setForeground(new java.awt.Color(255, 255, 255));
        lbl_material.setText("Material:");
        add(lbl_material, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        txt_material.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_materialActionPerformed(evt);
            }
        });
        add(txt_material, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 160, -1));

        lbl_lableCode.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbl_lableCode.setForeground(new java.awt.Color(255, 255, 255));
        lbl_lableCode.setText("lable code");
        add(lbl_lableCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        txt_lableCode.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_lableCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lableCodeActionPerformed(evt);
            }
        });
        add(txt_lableCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        FYSApp.getInstance().showPanel(new LoginScreen());
    }//GEN-LAST:event_logoutJButtonActionPerformed


    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        //  Create client
        String firstName = txt_firstname.getText();
        String middleName = txt_middlename.getText();
        String lastName = txt_lastName.getText();

        String phone = txt_phoneNumber.getText();
        String email = txt_email.getText();

        String country = txt_country.getText();
        String address = txt_address.getText();
        String city = txt_city.getText();
        String state = txt_state.getText();
        String zipCode = txt_zipcode.getText();

        //  Calling client constructor from the client class
        Client newClient = new Client(firstName, middleName, lastName, phone,
                email, country, address, city, state, zipCode);

        //  store user input in variables
        String brand = txt_brand.getText();
        String color
                = String.valueOf(cmb_color.getSelectedItem());
        String weightClass
                = String.valueOf(cmb_weightClass.getSelectedItem());
        String departureFrom
                = String.valueOf(cmb_departureFrom.getSelectedItem());
        String material = txt_material.getText();
        String lableCode = txt_lableCode.getText();
        String otherDetails = txt_otherDetails.getText();
        String status = "Lost";
        String whenFound = "";
        String foundAt = "";

        //  Create lost luggage item with user input
        Luggage luggage = new Luggage(brand, lableCode, material,
                otherDetails, status, color, weightClass, whenFound, foundAt,
                departureFrom);
        
        //  COMMENT
        if (updateMode > 1) {
            FYSApp.getLuggageManager().updateLostLuggage(luggage, luggageid);
        } else {
            //  If this is not the case, then we call the addLuggage Query +
            //  the add client luggage
            FYSApp.getClientManager().addClient(newClient);
            int id = FYSApp.getClientManager().getClientid();
            FYSApp.getLuggageManager().addLostLuggage(luggage, id);
        }

        //  COMMENT
        try {
            FYSApp.getInstance().showPanel(new LostLuggageOverview());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger
        (RegisterLostLuggage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void clearJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJButtonActionPerformed
        try {
            FYSApp.getInstance().showPanel(new LostLuggageOverview());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RegisterLostLuggage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_clearJButtonActionPerformed

    private void txt_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstnameActionPerformed

    private void txt_middlenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_middlenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_middlenameActionPerformed

    private void txt_lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lastNameActionPerformed

    private void txt_phoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneNumberActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cityActionPerformed

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressActionPerformed

    private void txt_zipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_zipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_zipcodeActionPerformed

    private void txt_stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_stateActionPerformed

    private void txt_countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_countryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_countryActionPerformed

    private void cmb_weightClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_weightClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_weightClassActionPerformed

    private void cmb_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_colorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_colorActionPerformed

    private void txt_brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_brandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_brandActionPerformed

    private void cmb_departureFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_departureFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_departureFromActionPerformed

    private void txt_materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_materialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_materialActionPerformed

    private void txt_lableCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lableCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lableCodeActionPerformed

    public static void setText(Luggage luggage) {
        txt_brand.setText(luggage.getBrand());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton clearJButton;
    private static javax.swing.JComboBox cmb_color;
    private static javax.swing.JComboBox cmb_departureFrom;
    private static javax.swing.JComboBox cmb_weightClass;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_brand;
    private javax.swing.JLabel lbl_city;
    private javax.swing.JLabel lbl_color;
    private javax.swing.JLabel lbl_country;
    private javax.swing.JLabel lbl_departureFrom;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_firstname;
    private javax.swing.JLabel lbl_lableCode;
    private javax.swing.JLabel lbl_lastname;
    private javax.swing.JLabel lbl_leftTitle;
    private javax.swing.JLabel lbl_loadingMessage;
    private javax.swing.JLabel lbl_material;
    private javax.swing.JLabel lbl_middlename;
    private javax.swing.JLabel lbl_otherDetails;
    private javax.swing.JLabel lbl_phoneNumber;
    private javax.swing.JLabel lbl_rightTitle;
    private javax.swing.JLabel lbl_state;
    private javax.swing.JLabel lbl_weightClass;
    private javax.swing.JLabel lbl_zipCode;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField txt_address;
    private static javax.swing.JTextField txt_brand;
    private javax.swing.JTextField txt_city;
    private javax.swing.JTextField txt_country;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_firstname;
    private static javax.swing.JTextField txt_lableCode;
    private javax.swing.JTextField txt_lastName;
    private static javax.swing.JTextField txt_material;
    private javax.swing.JTextField txt_middlename;
    private static javax.swing.JTextArea txt_otherDetails;
    private javax.swing.JTextField txt_phoneNumber;
    private javax.swing.JTextField txt_state;
    private javax.swing.JTextField txt_zipcode;
    // End of variables declaration//GEN-END:variables
}
