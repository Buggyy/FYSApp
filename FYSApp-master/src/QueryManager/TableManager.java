/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueryManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Luggage;
import view.LoginScreen;

/**
 *
 * @author Rafael
 */
public class TableManager {

    private DatabaseManager dbManager = new DatabaseManager();
    private PreparedStatement pst;
    private ResultSet rs = null;

    /**
     * @description HERE
     * @param username
     * @return
     */
    public ResultSet getUserLoginfo(String username) {

        String sql = "SELECT password,role FROM user WHERE username=?";

        try {
            dbManager.openConnection();

            pst = dbManager.getConnection().prepareStatement(sql);
            pst.setString(1, username);
            rs = pst.executeQuery();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        dbManager.closeConnection();
        return rs;
    }

    /**
     *
     * @return
     */
    public ResultSet getManagerAuctionedOverview() {

        try {

            dbManager.openConnection();

            String sql = "SELECT * FROM zoekjekoffer.luggage WHERE status = 'auctioned';";

            pst = dbManager.getConnection().prepareStatement(sql);
            rs = pst.executeQuery(sql);
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        dbManager.closeConnection();
        return rs;
    }

    /**
     *
     * @return Resultset all solved luggage for overview
     */
    public ResultSet getManagerSolvedOverview() {

        try {

            dbManager.openConnection();

            String sql = "SELECT * FROM zoekjekoffer.luggage WHERE status = 'solved';";

            pst = dbManager.getConnection().prepareStatement(sql);
            rs = pst.executeQuery(sql);
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        dbManager.closeConnection();
        return rs;
    }

    /**
     *
     * @return
     */
    public ResultSet getAdminUsersOverview() {

        try {
            dbManager.openConnection();

            String sql = "SELECT * FROM zoekjekoffer.user;";
            pst = dbManager.getConnection().prepareStatement(sql);
            rs = pst.executeQuery(sql);
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        dbManager.closeConnection();
        return rs;
    }

    /**
     *
     * @return found luggage data
     */
    public ResultSet getEmployeeFoundLuggage() {

        try {

            dbManager.openConnection();

            String sql = "SELECT * FROM zoekjekoffer.luggage WHERE status = 'found';";

            pst = dbManager.getConnection().prepareStatement(sql);
            rs = pst.executeQuery(sql);

            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(TableManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        dbManager.closeConnection();

        return rs;
    }

    /**
     *
     * @return lost luggage data
     */
    public ResultSet getEmployeeLostLuggage() {

        try {

            dbManager.openConnection();

            String sql = "SELECT * FROM luggage WHERE status = 'lost';";
            pst = dbManager.getConnection().prepareStatement(sql);
            rs = pst.executeQuery(sql);

            dbManager.closeConnection();
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(TableManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        dbManager.closeConnection();
        return rs;
    }

    /**
     * 
     * @return 
     */
    public ArrayList<Luggage> getLuggage() {

        ArrayList<Luggage> luggageList = new ArrayList<>();
        Luggage luggage = new Luggage();

        try {

            dbManager.openConnection();

            String sql = "SELECT * FROM zoekjekoffer.luggage";

            pst = dbManager.getConnection().prepareStatement(sql);
            rs = pst.executeQuery(sql);

            while (rs.next()) {
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
                luggageList.add(luggage);
            }

            dbManager.closeConnection();
            return luggageList;

        } catch (SQLException ex) {
            Logger.getLogger(TableManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        dbManager.closeConnection();

        return luggageList;
    }
}
