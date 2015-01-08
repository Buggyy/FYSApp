/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueryManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.FYSApp;
import model.Luggage;
import view.LoginScreen;

/**
 *
 * @author Rafael
 */
public class LuggageManager {

    private DatabaseManager dbManager = new DatabaseManager();
    private PreparedStatement pst;

    /**
     * @description HERE
     * @param luggage
     * @param id
     */
    public void addFoundLuggage(Luggage luggage, int id) {
        String sql = "INSERT INTO luggage (brand,lablecode,color,material"
                + "otherdetails, weightclass, status, created, departurefrom) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            dbManager.openConnection();
            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, luggage.getBrand());
            pst.setString(2, luggage.getLableCode());
            pst.setString(3, luggage.getColor());
            pst.setString(4, luggage.getMaterial());
            pst.setString(5, luggage.getOtherDetails());
            pst.setString(6, luggage.getWeightClass());
            pst.setString(7, "Lost");
            pst.setString(8, FYSApp.getDate());
            pst.setString(9, luggage.getDepartureFrom());
            // + Airport where user is working at
            pst.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Could not complete task, please contact your Administrator!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        dbManager.closeConnection();
    }

    /**
     * @description fasfsa
     * @param luggage
     * @param id
     */
    public void updateFoundLuggage(Luggage luggage, int id) {
        String updateLuggage = "UPDATE luggage SET brand=?, lableCode=?,"
                + " color=?, material=?, otherDetails=?, weightClass=?,"
                + "status=?, created=?, departureFrom=? WHERE luggageid=?";
        try {
            dbManager.openConnection();
            pst = dbManager.getConnection().prepareStatement(updateLuggage);
            pst.setString(1, luggage.getBrand());
            pst.setString(2, luggage.getLableCode());
            pst.setString(3, luggage.getColor());
            pst.setString(4, luggage.getMaterial());
            pst.setString(5, luggage.getOtherDetails());
            pst.setString(6, luggage.getWeightClass());
            pst.setString(7, "Lost");
            pst.setString(8, FYSApp.getDate());
            pst.setString(9, luggage.getDepartureFrom());
            // + Airport where user is working at
            pst.setInt(10, id);
            pst.executeUpdate();


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Could not complete task, please contact your Administrator!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        dbManager.closeConnection();
    }

    /**
     * @description Add a LOST luggage item
     * @param luggage
     * @param id
     */
    public void addLostLuggage(Luggage luggage, int id) {
        String sql = "INSERT INTO luggage (brand,weightclass,lablecode,"
                + "color, material, otherdetails, status, created,"
                + "departurefrom, ownerid) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            dbManager.openConnection();
            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, luggage.getBrand());
            pst.setString(2, luggage.getWeightClass());
            pst.setString(3, luggage.getLableCode());
            pst.setString(4, luggage.getColor());
            pst.setString(5, luggage.getMaterial());
            pst.setString(6, luggage.getOtherDetails());
            pst.setString(7, "Lost");
            pst.setString(8, FYSApp.getDate());
            pst.setString(9, luggage.getDepartureFrom());
            // + Airport where user is working at
            pst.setInt(10, id);
            pst.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Could not complete task, please contact your Administrator!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        dbManager.closeConnection();
    }

    /**
     * @description Update existing LOST luggage item
     * @param luggage item
     * @param id of the luggage
     *
     */
    public void updateLostLuggage(Luggage luggage, int id) {
        String updateLuggage = "UPDATE luggage SET brand=?, lableCode=?,"
                + " color=?, material=?, otherDetails=?, weightClass=?,"
                + "status=?, lastupdated=?, departureFrom=? WHERE luggageid=?";
        try {
            dbManager.openConnection();
            pst = dbManager.getConnection()
                    .prepareStatement(updateLuggage);

            pst.setString(1, luggage.getBrand());               //  Brand
            pst.setString(2, luggage.getLableCode());           //  Lable Code
            pst.setString(3, luggage.getColor());               //  Color
            pst.setString(4, luggage.getMaterial());            //  Material
            pst.setString(5, luggage.getOtherDetails());        //  Other Details
            pst.setString(6, luggage.getWeightClass());         //  Weightclass
            pst.setString(7, "Lost");                           //  Status
            pst.setString(8, FYSApp.getDate());                 //  Date of creation
            pst.setString(9, luggage.getDepartureFrom());       //  Client Departure
            //  pst.setString(9, user.getAirport());            //  Airport from user
            pst.setInt(10, id);                                 //  id from luggage
            pst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Could not complete task, please contact your Administrator!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        dbManager.closeConnection();
    }


    /**
     *
     * @param i
     * @return
     */
    public Luggage getSelectedLuggage(int i) {
        Luggage luggage = new Luggage();
        ResultSet rs = null;
        String getSelectedLuggage = "SELECT * FROM luggage WHERE luggageid=?";
        try {
            dbManager.openConnection();
            pst = dbManager.getConnection()
                    .prepareStatement(getSelectedLuggage);

            pst.setInt(1, i);

            rs = pst.executeQuery();

            if (rs.next()) {
                luggage.setBrand(rs.getString("brand"));
                luggage.setColor(rs.getString("color"));
                luggage.setWeightClass(rs.getString("weightclass"));
                luggage.setFoundAt(rs.getString("foundat"));
                luggage.setLableCode(rs.getString("LableCode"));
                luggage.setMaterial(rs.getString("material"));
                luggage.setWhenFound(rs.getString("whenfound"));
                luggage.setOtherDetails(rs.getString("otherDetails"));
                luggage.setStatus(rs.getString("status"));
                luggage.setDepartureFrom(rs.getString("departureFrom"));
            }
            return luggage;

        } catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        dbManager.closeConnection();
        return luggage;
    }

    /**
     *
     * @param i
     */
    public void deleteLuggage(int i) {
        String sql = "DELETE from luggage WHERE luggageid=?";
        try {
            dbManager.openConnection();
            pst = dbManager.getConnection().prepareStatement(sql);
            pst.setInt(1, i);
            pst.executeUpdate(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Could not complete task, please contact your Administrator!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        dbManager.closeConnection();
    }
}
