/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueryManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
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
     */
    public void addFoundLuggage(Luggage luggage) {
        String sql = "INSERT INTO luggage (brand,lablecode,color,material"
                + ",otherdetails, weightclass, status, created, departurefrom,"
                + " whenfound,foundat) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            dbManager.openConnection();
            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, luggage.getBrand());
            pst.setString(2, luggage.getLableCode());
            pst.setString(3, luggage.getColor());
            pst.setString(4, luggage.getMaterial());
            pst.setString(5, luggage.getOtherDetails());
            pst.setString(6, luggage.getWeightClass());
            pst.setString(7, "Found");
            pst.setString(8, FYSApp.getDate());
            pst.setString(9, luggage.getDepartureFrom());
            pst.setString(10, luggage.getWhenFound());
            pst.setString(11, FYSApp.getUserManager().getAirPort());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Could not complete task, please contact your Administrator!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        dbManager.closeConnection();
    }

//    /**
//     * @description fasfsa
//     * @param luggage
//     * @param id
//     */
//    public void updateFoundLuggage(Luggage luggage, int id) {
//        String updateLuggage = "UPDATE luggage SET brand=?, lableCode=?,"
//                + " color=?, material=?, otherDetails=?, weightClass=?,"
//                + "status=?, created=?, departureFrom=?, lastupdated=? WHERE luggageid=?";
//        try {
//            dbManager.openConnection();
//            pst = dbManager.getConnection().prepareStatement(updateLuggage);
//            pst.setString(1, luggage.getBrand());
//            pst.setString(2, luggage.getLableCode());
//            pst.setString(3, luggage.getColor());
//            pst.setString(4, luggage.getMaterial());
//            pst.setString(5, luggage.getOtherDetails());
//            pst.setString(6, luggage.getWeightClass());
//            pst.setString(7, "Found");
//            pst.setString(8, FYSApp.getDate());
//            pst.setString(9, luggage.getDepartureFrom());
//            // + Airport where user is working at
//            pst.setString(10, FYSApp.getDateTime());
//            pst.setInt(11, id);
//            Calendar cal = Calendar.getInstance();
//            
//            
//
//            pst.executeUpdate();
//
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null,
//                    "Could not complete task, please contact your Administrator!",
//                    "Error",
//                    JOptionPane.ERROR_MESSAGE);
//        }
//        dbManager.closeConnection();
//    }
    /**
     * @description Add a LOST luggage item
     * @param luggage
     * @param id
     */
    public void addLostLuggage(Luggage luggage, int id) {
        String sql = "INSERT INTO luggage (brand, lablecode,"
                + " material, otherdetails, status, color, weightclass, created,"
                + " departurefrom, ownerid) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            dbManager.openConnection();
            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, luggage.getBrand());
            pst.setString(2, luggage.getLableCode());
            pst.setString(3, luggage.getMaterial());
            pst.setString(4, luggage.getOtherDetails());
            pst.setString(5, "Lost");
            pst.setString(6, luggage.getColor());
            pst.setString(7, luggage.getWeightClass());
            pst.setString(8, FYSApp.getDate());
            pst.setString(9, luggage.getDepartureFrom());
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
     * @description Update existing luggage item
     * @param luggage item
     * @param id of the luggage
     *
     */
    public void updateLuggage(Luggage luggage, int id) {
//        String updateLuggage = "UPDATE luggage SET brand=?, lableCode=?,"
//                + " color=?, material=?, otherDetails=?, weightClass=?,"
//                + "status=?, lastupdated=?, departureFrom=? WHERE luggageid=?";
//        
                String updateLuggage = "UPDATE luggage SET brand=?, lableCode=?,"
                + " color=?, material=?, otherDetails=?, weightClass=?,"
                + "status=?, departureFrom=? WHERE luggageid=?";
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
            pst.setString(7, luggage.getStatus());              //  Status
 //           pst.setString(8, FYSApp.getDate());                 //  Date of creation
            pst.setString(8, luggage.getDepartureFrom());       //  Client Departure
            //  pst.setString(9, user.getAirport());            //  Airport from user
            //pst.setString(10, FYSApp.getDateTime());            // timestramp for lastupdated
            pst.setInt(9, id);                                 //  id from luggage
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
     * @description @param luggage
     * @param id
     */
    public void updateSolvedLuggage(Luggage luggage, int id) {
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
            pst.setString(7, "Solved");
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

    /**
     *
     * @param status the status of a luggage item (lost, found, auctioned or
     * solved)
     * @return ResultSet
     */
    public Luggage getStatus(String status) {
        Luggage luggage = new Luggage();
        ResultSet rs = null;
        String getStatus = "SELECT status FROM luggage WHERE status=?";
        try {
            dbManager.openConnection();
            pst = dbManager.getConnection()
                    .prepareStatement(getStatus);

            pst.setString(1, status);

            rs = pst.executeQuery();

            if (rs.next()) {
                luggage.setStatus(rs.getString("status"));
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
     * alle luggages in arraylist stoppen en returnen
     *
     * @return
     */
    public ArrayList<Luggage> getLuggage() {

        ResultSet rs = null;
        ArrayList<Luggage> luggageList = new ArrayList<>();
        Luggage luggage = new Luggage();

        try {

            dbManager.openConnection();

            String sql = "SELECT * FROM zoekjekoffer.luggage";

            pst = dbManager.getConnection().prepareStatement(sql);
            rs = pst.executeQuery(sql);

            while (rs.next()) {
                luggage.setStatus(rs.getString("status"));
                luggageList.add(luggage);
            }

            return luggageList;

        } catch (SQLException ex) {
            Logger.getLogger(TableManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        dbManager.closeConnection();

        return luggageList;
    }

    public ArrayList<Luggage> getLostLuggage() {

        String sql = "SELECT * FROM zoekjekoffer.luggage WHERE status='Lost'";
        return ExecuteQueryAndPutResultsInArrayList(sql);

    }

    /**
     *
     * @param month the month you want the data of
     * @param status the status you want to count
     * @return amount of defined status by month
     */
    public int FindNumberOfStatusByMonth(int month, String status) {

        String getSelectedLuggage = "SELECT * from zoekjekoffer.luggage where luggage.status='" + status + "' AND month(luggage.lastupdated)=" + month + " ;";

        return ExecuteQueryAndReturnNumberOfElements(getSelectedLuggage);
    }

    private ArrayList<Luggage> ExecuteQueryAndPutResultsInArrayList(String query) {
        ArrayList<Luggage> luggages = new ArrayList<>();
        ResultSet rs = null;
        try {
            dbManager.openConnection();
            pst = dbManager.getConnection()
                    .prepareStatement(query);

            rs = pst.executeQuery();
            rs.next();
            do {
                Luggage luggage = new Luggage();
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
                luggage.setLastUpdated(rs.getString("lastupdated"));

                luggages.add(luggage);
            } while (rs.next());

        } catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        dbManager.closeConnection();
        return luggages;
    }

    private int ExecuteQueryAndReturnNumberOfElements(String query) {
        ArrayList<Luggage> luggages = new ArrayList<>();
        ResultSet rs = null;
        int ammount = 0;

        try {
            dbManager.openConnection();
            pst = dbManager.getConnection()
                    .prepareStatement(query);

            rs = pst.executeQuery();
            do {
                ammount++;
            } while (rs.next());

        } catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        dbManager.closeConnection();
        return ammount;
    }

    /**
     *
     * @return Vector of Luggage objects
     */
    public Vector getAllLuggage() {
        Vector luggageVector = new Vector();

        ResultSet rs = null;
        String getSelectedLuggage = "SELECT * FROM luggage";
        try {
            dbManager.openConnection();
            pst = dbManager.getConnection()
                    .prepareStatement(getSelectedLuggage);

            rs = pst.executeQuery();

            do {
                Luggage luggage = new Luggage();
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
                luggage.setLastUpdated(rs.getString("lastupdated"));

                luggageVector.add(luggage);
            } while (rs.next());

        } catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        dbManager.closeConnection();
        return luggageVector;
    }
}
