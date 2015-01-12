package view.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import main.FYSApp;
import static main.FYSApp.airportsList;
import main.Frame;
import model.Luggage;
import view.employee.FoundLuggageOverview;

/**
 *
 * @author Team 1 IS106
 */
public class RegisterFoundLuggage extends JPanel {

    private static int updateMode = 0;
    private static int luggageid;
    private static boolean lost = false;

    /**
     * Creates new form AddUser
     */
    public RegisterFoundLuggage() {
        initComponents();
        lbl_foundAt.setVisible(false);
        cmb_foundAt.setVisible(false);

//  These items should be stored in an array
        cmb_color.addItem("other..");
        cmb_color.addItem("red");
        cmb_color.addItem("blue");
        cmb_color.addItem("cyan");
        cmb_color.addItem("yellow");
        cmb_color.addItem("pink");
        cmb_color.addItem("magenta");
        cmb_color.addItem("green");
        cmb_color.addItem("black");
        cmb_color.addItem("white");
        cmb_color.addItem("orange");
        cmb_color.addItem("grey");
        cmb_color.addItem("brown");

        cmb_weightClass.addItem("other..");
        cmb_weightClass.addItem("0kg - 5kg");
        cmb_weightClass.addItem("5kg - 10kg");
        cmb_weightClass.addItem("10kg - 15kg");
        cmb_weightClass.addItem("15kg - 20kg");
        cmb_weightClass.addItem("20kg+");

    }

    // this method does not belong here..
    public static void setUpdate(int id) {
        updateMode = id;
        luggageid = id;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_material = new javax.swing.JTextField();
        txt_brand = new javax.swing.JTextField();
        lbl_color = new javax.swing.JLabel();
        cmb_color = new javax.swing.JComboBox();
        lbl_brand = new javax.swing.JLabel();
        lbl_weightClass = new javax.swing.JLabel();
        cmb_weightClass = new javax.swing.JComboBox();
        lbl_foundAt = new javax.swing.JLabel();
        cmb_foundAt = new javax.swing.JComboBox();
        lbl_material = new javax.swing.JLabel();
        lbl_code = new javax.swing.JLabel();
        txt_lableCode = new javax.swing.JTextField();
        btn_submit = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_otherDetails = new javax.swing.JTextArea();
        lbldefaultvaluecode = new javax.swing.JLabel();
        lbl_otherDetails = new javax.swing.JLabel();
        lbl_whenFound = new javax.swing.JLabel();
        dc_whenFound = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        backJButton = new javax.swing.JButton();
        logoutJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setPreferredSize(new java.awt.Dimension(1024, 600));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 23)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTER FOUND LUGGAGE");

        jPanel2.setBackground(new java.awt.Color(255, 241, 234));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_material.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_material.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_materialActionPerformed(evt);
            }
        });

        txt_brand.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_brandActionPerformed(evt);
            }
        });

        lbl_color.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_color.setText("Color:");

        cmb_color.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmb_color.setMaximumRowCount(15);
        cmb_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_colorActionPerformed(evt);
            }
        });

        lbl_brand.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_brand.setText("Brand:");

        lbl_weightClass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_weightClass.setText("Weight class:");

        cmb_weightClass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmb_weightClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_weightClassActionPerformed(evt);
            }
        });

        lbl_foundAt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_foundAt.setText("Found at:");

        cmb_foundAt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmb_foundAt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_foundAtActionPerformed(evt);
            }
        });

        lbl_material.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_material.setText("Material:");

        lbl_code.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_code.setText("Lable code:");

        txt_lableCode.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_lableCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_lableCodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_lableCodeFocusLost(evt);
            }
        });
        txt_lableCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lableCodeActionPerformed(evt);
            }
        });
        txt_lableCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_lableCodeKeyPressed(evt);
            }
        });

        btn_submit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/check-icon.png"))); // NOI18N
        btn_submit.setText("SUBMIT");
        btn_submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_submitMouseClicked(evt);
            }
        });
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        btn_clear.setText("CLEAR ALL");
        btn_clear.setMinimumSize(new java.awt.Dimension(70, 25));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        txt_otherDetails.setColumns(20);
        txt_otherDetails.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_otherDetails.setRows(5);
        jScrollPane2.setViewportView(txt_otherDetails);

        lbldefaultvaluecode.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbldefaultvaluecode.setForeground(new java.awt.Color(204, 204, 204));
        lbldefaultvaluecode.setText("123A-456B-789C");

        lbl_otherDetails.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_otherDetails.setText("Other details:");

        lbl_whenFound.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_whenFound.setText("When found:");

        dc_whenFound.setDateFormatString("dd-MM-yyyy");
        dc_whenFound.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_whenFound)
                    .addComponent(lbldefaultvaluecode)
                    .addComponent(lbl_otherDetails)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(btn_submit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl_brand)
                                .addComponent(lbl_color)
                                .addComponent(lbl_code)
                                .addComponent(lbl_material)
                                .addComponent(lbl_foundAt)
                                .addComponent(lbl_weightClass))
                            .addGap(63, 63, 63)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_lableCode)
                                .addComponent(cmb_foundAt, 0, 125, Short.MAX_VALUE)
                                .addComponent(cmb_weightClass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmb_color, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_material)
                                .addComponent(txt_brand)
                                .addComponent(dc_whenFound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_brand)
                    .addComponent(txt_brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_color)
                    .addComponent(cmb_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_weightClass)
                    .addComponent(cmb_weightClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_code)
                    .addComponent(txt_lableCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_material)
                    .addComponent(txt_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_whenFound)
                    .addComponent(dc_whenFound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_foundAt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_foundAt))
                .addGap(19, 19, 19)
                .addComponent(lbl_otherDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldefaultvaluecode)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 241, 234));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back-2-2-icon.png"))); // NOI18N
        backJButton.setText(" ");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        logoutJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout-icon.png"))); // NOI18N
        logoutJButton.setText(" ");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoutJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backJButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(339, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(242, 242, 242)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void submitJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitJButtonMouseClicked

    }//GEN-LAST:event_submitJButtonMouseClicked

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        Frame.getInstance().showPanel(new FoundLuggageOverview());
    }//GEN-LAST:event_backJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        Frame.shutdown();
        FYSApp.logout();
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        //clear all the fields
        txt_brand.setText("");
        cmb_color.setSelectedIndex(0);
        cmb_weightClass.setSelectedIndex(0);
        txt_material.setText("");
        cmb_foundAt.setSelectedIndex(0);
        dc_whenFound.setDateFormatString("00-january-0000");
        //clear all the fields
        txt_brand.setText("");
        cmb_color.setSelectedIndex(0);
        cmb_weightClass.setSelectedIndex(0);
        txt_material.setText("");
        txt_otherDetails.setText("");

    }//GEN-LAST:event_btn_clearActionPerformed

    private boolean checkIfExists(Luggage lug) {
        ArrayList<Luggage> list = FYSApp.getLuggageManager().getLostLuggage();
        return list.contains(lug);
    }

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed

        //  store user input in variables
        String brand = txt_brand.getText();

        String color
                = String.valueOf(cmb_color.getSelectedItem());
        String weightClass
                = String.valueOf(cmb_weightClass.getSelectedItem());
        String foundAt
                = String.valueOf(cmb_foundAt.getSelectedItem());

        String lableCode = txt_lableCode.getText();
        String material = txt_material.getText();
        String whenFound = ((JTextField) dc_whenFound.getDateEditor().getUiComponent()).getText();
        String otherDetails = txt_otherDetails.getText();
        String status = "Found";
        String departureFrom = "";
        //  store airport where employee is working at
        // String airport

        //  Create lost luggage item with user input
        Luggage luggage = new Luggage(brand, lableCode, color,
                otherDetails, status, material, weightClass, whenFound, foundAt,
                departureFrom);

        if (updateMode > 1) {
            FYSApp.getLuggageManager().updateLuggage(luggage, luggageid);
            Frame.getInstance().showPanel(new FoundLuggageOverview());
        } else {
            try {
                if (checkIfExists(luggage)) {

                    FYSApp.getSearchManager().searchSimilarities(luggage, lost);
                    JOptionPane.showMessageDialog(null, "Possible match found!");
                    JOptionPane.showMessageDialog(null, "You will now be redirected to the overview of the matched luggage");
                    Frame.getInstance().showPanel(new MatchingLuggage());
                } else {
                    JOptionPane.showMessageDialog(null, "Information is saved");
                    FYSApp.getLuggageManager().addFoundLuggage(luggage);
                    Frame.getInstance().showPanel(new FoundLuggageOverview());
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RegisterFoundLuggage.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_btn_submitActionPerformed

    private void btn_submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_submitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_submitMouseClicked

    private void txt_lableCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lableCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lableCodeActionPerformed

    private void cmb_foundAtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_foundAtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_foundAtActionPerformed

    private void cmb_weightClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_weightClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_weightClassActionPerformed

    private void cmb_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_colorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_colorActionPerformed

    private void txt_brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_brandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_brandActionPerformed

    private void txt_materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_materialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_materialActionPerformed

    private void txt_lableCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_lableCodeFocusGained
        lbldefaultvaluecode.setText("");
    }//GEN-LAST:event_txt_lableCodeFocusGained

    private void txt_lableCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_lableCodeFocusLost
        lbldefaultvaluecode.setText("123A-456B-789C");
    }//GEN-LAST:event_txt_lableCodeFocusLost

    private void txt_lableCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lableCodeKeyPressed
        lbldefaultvaluecode.setText("");
    }//GEN-LAST:event_txt_lableCodeKeyPressed

    public static void setText(Luggage luggage) {
        lbl_foundAt.setVisible(true);
        cmb_foundAt.setVisible(true);
        setAirports();
        txt_brand.setText(luggage.getBrand());
        cmb_color.setSelectedItem(luggage.getColor());
        cmb_weightClass.setSelectedItem(luggage.getWeightClass());
        cmb_foundAt.setSelectedItem(luggage.getFoundAt());
        txt_material.setText(luggage.getMaterial());
        txt_lableCode.setText(luggage.getLableCode());
        txt_otherDetails.setText(luggage.getOtherDetails());

    }

    public static void setAirports() {
        ArrayList<String> fgt = FYSApp.getQueryManager().getAirports();
        for (String fgt1 : fgt) {
            cmb_foundAt.addItem(fgt1);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_submit;
    private static javax.swing.JComboBox cmb_color;
    private static javax.swing.JComboBox cmb_foundAt;
    private static javax.swing.JComboBox cmb_weightClass;
    private com.toedter.calendar.JDateChooser dc_whenFound;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_brand;
    private javax.swing.JLabel lbl_code;
    private javax.swing.JLabel lbl_color;
    private static javax.swing.JLabel lbl_foundAt;
    private javax.swing.JLabel lbl_material;
    private javax.swing.JLabel lbl_otherDetails;
    private javax.swing.JLabel lbl_weightClass;
    private javax.swing.JLabel lbl_whenFound;
    private javax.swing.JLabel lbldefaultvaluecode;
    private javax.swing.JButton logoutJButton;
    private static javax.swing.JTextField txt_brand;
    private static javax.swing.JTextField txt_lableCode;
    private static javax.swing.JTextField txt_material;
    private static javax.swing.JTextArea txt_otherDetails;
    // End of variables declaration//GEN-END:variables

}
