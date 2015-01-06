/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueryManager;

import java.sql.*;

/**
 *
 * @author Rafael
 */
public class SearchManager {
        private DatabaseManager dbManager;
    private PreparedStatement pst;

    /**
     * @description HERE
     * @param input
     * @return
     * @throws ClassNotFoundException
     */
    public ResultSet searchTableLuggageFound(String input) throws ClassNotFoundException {

        ResultSet rs = null;

        try {
            dbManager.openConnection();

            String sql
                    = "SELECT * FROM luggage WHERE ("
                    + "status = 'found' AND (luggageid LIKE ? OR created LIKE ? OR brand LIKE ? OR weight LIKE ? "
                    + "OR description LIKE ? OR ownerid LIKE ? OR airportname LIKE ?))";

            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, "%" + input + "%");
            pst.setString(2, "%" + input + "%");
            pst.setString(3, "%" + input + "%");
            pst.setString(4, "%" + input + "%");
            pst.setString(5, "%" + input + "%");
            pst.setString(6, "%" + input + "%");
            pst.setString(7, "%" + input + "%");

            rs = pst.executeQuery();

            return rs;
        } catch (SQLException e) {
        }
        dbManager.closeConnection();
        return rs;
    }
    
    
    /**
     * @description HERE
     * @param input
     * @return
     * @throws ClassNotFoundException
     */
    public ResultSet searchTableLuggageLost(String input) throws ClassNotFoundException {

        ResultSet rs = null;

        try {
            dbManager.openConnection();

            String sql
                    = "SELECT * FROM luggage WHERE ("
                    + "status = 'lost' AND (luggageid LIKE ? OR created LIKE ? OR brand LIKE ? OR weight LIKE ? "
                    + "OR description LIKE ? OR ownerid LIKE ? OR airportname LIKE ?))";

            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, "%" + input + "%");
            pst.setString(2, "%" + input + "%");
            pst.setString(3, "%" + input + "%");
            pst.setString(4, "%" + input + "%");
            pst.setString(5, "%" + input + "%");
            pst.setString(6, "%" + input + "%");
            pst.setString(7, "%" + input + "%");

            rs = pst.executeQuery();
            return rs;

        } catch (SQLException e) {
        }
        dbManager.closeConnection();
        return rs;
    }
    
    
    /**
     *
     * @param input
     * @return
     * @throws ClassNotFoundException
     */
//    public ResultSet searchTableAuctioned(String input) throws ClassNotFoundException {
//
//        ResultSet rs = null;
//
//        try {
//            dbManager.openConnection();
//
//            String sql
//                    = "SELECT * FROM luggage WHERE ("
//                    + "status = 'auctioned' AND (luggageid LIKE ? OR created LIKE ? OR brand LIKE ? OR weight LIKE ? "
//                    + "OR description LIKE ? OR ownerid LIKE ? OR airportname LIKE ?))";
//
//            pst = dbManager.getConnection().prepareStatement(sql);
//
//            pst.setString(1, "%" + input + "%");
//            pst.setString(2, "%" + input + "%");
//            pst.setString(3, "%" + input + "%");
//            pst.setString(4, "%" + input + "%");
//            pst.setString(5, "%" + input + "%");
//            pst.setString(6, "%" + input + "%");
//            pst.setString(7, "%" + input + "%");
//
//            rs = pst.executeQuery();
//            return rs;
//
//        } catch (SQLException e) {
//        }
//        dbManager.closeConnection();
//        return rs;
//    }
    /**
     *
     * @param input
     * @return
     * @throws ClassNotFoundException
     */
//    public ResultSet searchTableUser(String input) throws ClassNotFoundException {
//
//        ResultSet rs = null;
//
//        try {
//            dbManager.openConnection();
//
//            String sql
//                    = "SELECT * FROM zoekjekoffer.user WHERE "
//                    + "userid LIKE ? OR username LIKE ? OR password LIKE ? OR role LIKE ? "
//                    + "OR firstname LIKE ? OR middlename LIKE ? OR lastname LIKE ? "
//                    + "OR email LIKE ? OR created LIKE ? OR updated LIKE ?";
//
//            pst = dbManager.getConnection().prepareStatement(sql);
//
//            pst.setString(1, "%" + input + "%");
//            pst.setString(2, "%" + input + "%");
//            pst.setString(3, "%" + input + "%");
//            pst.setString(4, "%" + input + "%");
//            pst.setString(5, "%" + input + "%");
//            pst.setString(6, "%" + input + "%");
//            pst.setString(7, "%" + input + "%");
//            pst.setString(8, "%" + input + "%");
//            pst.setString(9, "%" + input + "%");
//            pst.setString(10, "%" + input + "%");
//
//            rs = pst.executeQuery();
//            return rs;
//
//        } catch (SQLException e) {
//        }
//        dbManager.closeConnection();
//        return rs;
//    }
    
//    }

}
