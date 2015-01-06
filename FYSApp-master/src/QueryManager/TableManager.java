/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueryManager;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.LoginScreen;

/**
 *
 * @author Rafael
 */
public class TableManager {

    private DatabaseManager dbManager;
    private PreparedStatement pst;

    /**
     * @description HERE
     * @param username
     * @return
     */
    public ResultSet getUserLoginfo(String username) {
        String sql = "SELECT password,role FROM user WHERE username=?";
        ResultSet rs = null;

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
//    public ResultSet getManagerAuctionedOverview() {
//        ResultSet rs = null;
//        try {
//
//            dbManager.openConnection();
//
//            String sql = "SELECT * FROM zoekjekoffer.luggage WHERE status = 'auctioned';";
//
//            pst = dbManager.getConnection().prepareStatement(sql);
//            rs = pst.executeQuery(sql);
//            return rs;
//
//        } catch (SQLException ex) {
//            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        dbManager.closeConnection();
//        return rs;
//    }
    /**
     *
     * @return
     */
//    public ResultSet getAdminUsersOverview() {
//        ResultSet rs = null;
//
//        try {
//            dbManager.openConnection();
//
//            String sql = "SELECT * FROM zoekjekoffer.user;";
//            pst = dbManager.getConnection().prepareStatement(sql);
//            rs = pst.executeQuery(sql);
//            return rs;
//
//        } catch (SQLException ex) {
//            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        dbManager.closeConnection();
//        return rs;
//    }
    /**
     *
     * @return found luggage data
     */
//    public ResultSet getEmployeeFoundLuggage() {
//
//        ResultSet rs = null;
//        try {
//
//            dbManager.openConnection();
//
//            String sql = "SELECT * FROM zoekjekoffer.luggage WHERE status = 'found';";
//
//            pst = dbManager.getConnection().prepareStatement(sql);
//            rs = pst.executeQuery(sql);
//            return rs;
//
//        } catch (SQLException ex) {
//            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        dbManager.closeConnection();
//        return rs;
//    }
    /**
     *
     * @return lost luggage data
     */
//    public ResultSet getEmployeeLostLuggage() {
//
//        ResultSet rs = null;
//        try {
//
//            dbManager.openConnection();
//
//            String sql = "SELECT * FROM zoekjekoffer.luggage WHERE status = 'lost';";
//            pst = dbManager.getConnection().prepareStatement(sql);
//            rs = pst.executeQuery(sql);
//
//            return rs;
//
//        } catch (SQLException ex) {
//            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        dbManager.closeConnection();
//        return rs;
//    }
}
