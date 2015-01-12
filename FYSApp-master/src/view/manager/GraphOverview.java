package view.manager;

import externelibraries.Graph;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.FYSApp;
import main.Frame;

/**
 *
 * @author Daniel Stern IS 106
 */
public class GraphOverview extends javax.swing.JPanel {

    /**
     * Creates new form GraphOverview
     */
    public GraphOverview() {
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

        logoutJButton = new javax.swing.JButton();
        auctionedJButton = new javax.swing.JButton();
        foundJButton = new javax.swing.JButton();
        lostJButton = new javax.swing.JButton();
        statisticsJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        graphJPanel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout-icon.png"))); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 20, -1, 30));

        auctionedJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        auctionedJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/auctioned-icon.png"))); // NOI18N
        auctionedJButton.setText("Auctioned Luggage");
        auctionedJButton.setBorder(null);
        auctionedJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auctionedJButtonActionPerformed(evt);
            }
        });
        add(auctionedJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 150, 40));

        foundJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        foundJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/found-luggage-icon.png"))); // NOI18N
        foundJButton.setText("Found Luggage");
        foundJButton.setBorder(null);
        foundJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foundJButtonActionPerformed(evt);
            }
        });
        add(foundJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, 40));

        lostJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lostJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lost-luggage-icon.png"))); // NOI18N
        lostJButton.setText("Lost Luggage");
        lostJButton.setBorder(null);
        lostJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lostJButtonActionPerformed(evt);
            }
        });
        add(lostJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, 40));

        statisticsJButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        statisticsJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SEO-icon.png"))); // NOI18N
        statisticsJButton.setText("Statistics");
        statisticsJButton.setEnabled(false);
        statisticsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statisticsJButtonActionPerformed(evt);
            }
        });
        add(statisticsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 150, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/match-icon.png"))); // NOI18N
        jButton1.setText("Solved Luggage");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, 40));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SEO-icon.png"))); // NOI18N
        jLabel2.setText("   Graph Luggage Overview");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 310, 33));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Currently logged in as: [username]");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jMonthChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jMonthChooser1PropertyChange(evt);
            }
        });
        add(jMonthChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, 100, 40));

        graphJPanel.setMaximumSize(new java.awt.Dimension(590, 340));
        graphJPanel.setMinimumSize(new java.awt.Dimension(590, 340));
        graphJPanel.setPreferredSize(new java.awt.Dimension(590, 340));
        add(graphJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        jButton2.setText("Year Overview");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Corendon-background.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        Frame.shutdown();
        FYSApp.logout();
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void auctionedJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auctionedJButtonActionPerformed

        try {
            Frame.getInstance().showPanel(new ManagerLuggageAuctioned());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GraphOverview.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GraphOverview.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_auctionedJButtonActionPerformed

    private void foundJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foundJButtonActionPerformed
        Frame.getInstance().showPanel(new ManagerLuggageFound());
    }//GEN-LAST:event_foundJButtonActionPerformed

    private void lostJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lostJButtonActionPerformed
        try {
            // TODO add your handling code here:
            Frame.getInstance().showPanel(new ManagerLuggageLost());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManagerLuggageSolved.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lostJButtonActionPerformed

    private void statisticsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statisticsJButtonActionPerformed

    }//GEN-LAST:event_statisticsJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Frame.getInstance().showPanel(new ManagerLuggageSolved());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManagerLuggageLost.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManagerLuggageLost.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMonthChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jMonthChooser1PropertyChange

        //HIER KOMT GRAPH WEER
        Graph examGraph = new Graph("Monthly overview of Luggage status");

        String[] days = new String[30];

        for (int i = 0; i < days.length; i++) {
            days[i] += i;
        }
        ArrayList<Integer> nbrOfFoundByMonth = new ArrayList<>();
        ArrayList<Integer> nbrOfLostByMonth = new ArrayList<>();
        ArrayList<Integer> nbrOfSolvedByMonth = new ArrayList<>();
        ArrayList<Integer> nbrOfAuctionedByMonth = new ArrayList<>();
        String listName1 = "Found";
        String listName2 = "Lost";
        String listName3 = "Solved";
        String listName4 = "Auctioned";
        int beginMonth = jMonthChooser1.getMonth();
        
        String dateType = "day";

        examGraph.addSeriesDays(dateType, beginMonth, days, nbrOfFoundByMonth, nbrOfLostByMonth, nbrOfSolvedByMonth, nbrOfAuctionedByMonth, listName1, listName2, listName3, listName4);

        graphJPanel.removeAll();

        graphJPanel.add(examGraph.createChart("Luggage overview", "Days", "Amount", 590, 340, Color.WHITE));

        graphJPanel.revalidate();

        examGraph.setSeriesThickness(0, 2);
        examGraph.setSeriesThickness(1, 2);
        examGraph.setSeriesThickness(2, 2);
        examGraph.setSeriesThickness(3, 2);

        examGraph.setSeriesColor(0, Color.GREEN);
        examGraph.setSeriesColor(1, Color.RED);
        examGraph.setSeriesColor(2, Color.BLACK);
        examGraph.setSeriesColor(3, Color.YELLOW);

        examGraph.setGraphBackgroundColors(Color.WHITE, Color.WHITE);


    }//GEN-LAST:event_jMonthChooser1PropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Graph examGraph = new Graph("Monthly overview of Luggage status");

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        ArrayList<Integer> nbrOfFoundByMonth = new ArrayList<>();
        ArrayList<Integer> nbrOfLostByMonth = new ArrayList<>();
        ArrayList<Integer> nbrOfSolvedByMonth = new ArrayList<>();
        ArrayList<Integer> nbrOfAuctionedByMonth = new ArrayList<>();
        String listName1 = "Found";
        String listName2 = "Lost";
        String listName3 = "Solved";
        String listName4 = "Auctioned";
        int beginMonth = 0;
        String dateType = "month";

        examGraph.addSeriesMonths(dateType, beginMonth, months, nbrOfFoundByMonth, nbrOfLostByMonth, nbrOfSolvedByMonth, nbrOfAuctionedByMonth, listName1, listName2, listName3, listName4);

        graphJPanel.removeAll();

        graphJPanel.add(examGraph.createChart("Luggage overview", "Month", "Amount", 590, 340, Color.WHITE));

        graphJPanel.revalidate();

        examGraph.setSeriesThickness(0, 2);
        examGraph.setSeriesThickness(1, 2);
        examGraph.setSeriesThickness(2, 2);
        examGraph.setSeriesThickness(3, 2);

        examGraph.setSeriesColor(0, Color.GREEN);
        examGraph.setSeriesColor(1, Color.RED);
        examGraph.setSeriesColor(2, Color.BLACK);
        examGraph.setSeriesColor(3, Color.YELLOW);

        examGraph.setGraphBackgroundColors(Color.WHITE, Color.WHITE);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton auctionedJButton;
    private javax.swing.JButton foundJButton;
    private javax.swing.JPanel graphJPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JButton lostJButton;
    private javax.swing.JButton statisticsJButton;
    // End of variables declaration//GEN-END:variables
}
