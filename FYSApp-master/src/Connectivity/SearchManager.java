/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connectivity;

import java.sql.*;
import model.Luggage;

/**
 *
 * @author Team 1
 */
public class SearchManager {

    private DatabaseManager dbManager = new DatabaseManager();
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
                    = "SELECT * FROM luggage WHERE "
                    + "status = 'found' AND (luggageid LIKE ? OR ownerid LIKE ?"
                    + " OR brand LIKE ? "
                    + "OR lablecode LIKE ? OR material LIKE ? OR otherdetails "
                    + "LIKE ? OR weightclass LIKE ? OR color LIKE ? OR whenfound"
                    + " LIKE ? OR foundat LIKE ? OR departurefrom LIKE ? OR "
                    + "created LIKE ? OR lastupdated LIKE ?)";

            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, "%" + input + "%");
            pst.setString(2, "%" + input + "%");
            pst.setString(3, "%" + input + "%");
            pst.setString(4, "%" + input + "%");
            pst.setString(5, "%" + input + "%");
            pst.setString(6, "%" + input + "%");
            pst.setString(7, "%" + input + "%");
            pst.setString(8, "%" + input + "%");
            pst.setString(9, "%" + input + "%");
            pst.setString(10, "%" + input + "%");
            pst.setString(11, "%" + input + "%");
            pst.setString(12, "%" + input + "%");
            pst.setString(13, "%" + input + "%");

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
                    = "SELECT * FROM luggage WHERE "
                    + "status = 'lost' AND (luggageid LIKE ? OR ownerid LIKE ?"
                    + " OR brand LIKE ? "
                    + "OR lablecode LIKE ? OR material LIKE ? OR otherdetails "
                    + "LIKE ? OR weightclass LIKE ? OR color LIKE ? OR whenfound"
                    + " LIKE ? OR foundat LIKE ? OR departurefrom LIKE ? OR "
                    + "created LIKE ? OR lastupdated LIKE ?)";

            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, "%" + input + "%");
            pst.setString(2, "%" + input + "%");
            pst.setString(3, "%" + input + "%");
            pst.setString(4, "%" + input + "%");
            pst.setString(5, "%" + input + "%");
            pst.setString(6, "%" + input + "%");
            pst.setString(7, "%" + input + "%");
            pst.setString(8, "%" + input + "%");
            pst.setString(9, "%" + input + "%");
            pst.setString(10, "%" + input + "%");
            pst.setString(11, "%" + input + "%");
            pst.setString(12, "%" + input + "%");
            pst.setString(13, "%" + input + "%");

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
    public ResultSet searchTableAuctioned(String input) throws ClassNotFoundException {

        ResultSet rs = null;

        try {
            dbManager.openConnection();

            String sql
                    = "SELECT * FROM luggage WHERE "
                    + "status = 'auctioned' AND (luggageid LIKE ? OR ownerid LIKE ?"
                    + " OR brand LIKE ? "
                    + "OR lablecode LIKE ? OR material LIKE ? OR otherdetails "
                    + "LIKE ? OR weightclass LIKE ? OR color LIKE ? OR whenfound"
                    + " LIKE ? OR foundat LIKE ? OR departurefrom LIKE ? OR "
                    + "created LIKE ? OR lastupdated LIKE ?)";

            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, "%" + input + "%");
            pst.setString(2, "%" + input + "%");
            pst.setString(3, "%" + input + "%");
            pst.setString(4, "%" + input + "%");
            pst.setString(5, "%" + input + "%");
            pst.setString(6, "%" + input + "%");
            pst.setString(7, "%" + input + "%");
            pst.setString(8, "%" + input + "%");
            pst.setString(9, "%" + input + "%");
            pst.setString(10, "%" + input + "%");
            pst.setString(11, "%" + input + "%");
            pst.setString(12, "%" + input + "%");
            pst.setString(13, "%" + input + "%");
  

            rs = pst.executeQuery();
            return rs;

        } catch (SQLException e) {
        }
        dbManager.closeConnection();
        return rs;
    }

    public ResultSet searchTableSolved(String input) throws ClassNotFoundException {

        ResultSet rs = null;

        try {
            dbManager.openConnection();

            String sql
                    = "SELECT * FROM luggage WHERE "
                    + "status = 'solved' AND (luggageid LIKE ? OR ownerid LIKE ?"
                    + " OR brand LIKE ? "
                    + "OR lablecode LIKE ? OR material LIKE ? OR otherdetails "
                    + "LIKE ? OR weightclass LIKE ? OR color LIKE ? OR whenfound"
                    + " LIKE ? OR foundat LIKE ? OR departurefrom LIKE ? OR "
                    + "created LIKE ? OR lastupdated LIKE ?)";

            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, "%" + input + "%");
            pst.setString(2, "%" + input + "%");
            pst.setString(3, "%" + input + "%");
            pst.setString(4, "%" + input + "%");
            pst.setString(5, "%" + input + "%");
            pst.setString(6, "%" + input + "%");
            pst.setString(7, "%" + input + "%");
            pst.setString(8, "%" + input + "%");
            pst.setString(9, "%" + input + "%");
            pst.setString(10, "%" + input + "%");
            pst.setString(11, "%" + input + "%");
            pst.setString(12, "%" + input + "%");
            pst.setString(13, "%" + input + "%");
       

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
    public ResultSet searchTableUser(String input) throws ClassNotFoundException {

        ResultSet rs = null;

        try {
            dbManager.openConnection();

            String sql
                    = "SELECT * FROM zoekjekoffer.user WHERE "
                    + "userid LIKE ? OR username LIKE ? OR password LIKE ? OR role LIKE ? "
                    + "OR firstname LIKE ? OR middlename LIKE ? OR lastname LIKE ? "
                    + "OR email LIKE ? OR created LIKE ? OR updated LIKE ?";

            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, "%" + input + "%");
            pst.setString(2, "%" + input + "%");
            pst.setString(3, "%" + input + "%");
            pst.setString(4, "%" + input + "%");
            pst.setString(5, "%" + input + "%");
            pst.setString(6, "%" + input + "%");
            pst.setString(7, "%" + input + "%");
            pst.setString(8, "%" + input + "%");
            pst.setString(9, "%" + input + "%");
            pst.setString(10, "%" + input + "%");

            rs = pst.executeQuery();
            return rs;

        } catch (SQLException e) {
        }
        dbManager.closeConnection();
        return rs;
    }

    /**
     *
     * @param luggage
     * @param lostOrFound
     * @return rs
     * @throws ClassNotFoundException
     */
    public ResultSet searchSimilarities(Luggage luggage, boolean lostOrFound) throws ClassNotFoundException {

        ResultSet rs = null;
        boolean lost = lostOrFound;

        try {
            dbManager.openConnection();
            String sql;
            if (lost = true) {
                sql
                        = "SELECT * FROM luggage WHERE ("
                        + "status = 'Lost' AND ("
                        + "brand LIKE ? OR lablecode LIKE ? OR material LIKE ? "
                        + "OR color LIKE ?))";
            } else {
                sql
                        = "SELECT * FROM luggage WHERE ("
                        + "status = 'Found' AND ("
                        + "brand LIKE ? OR lablecode LIKE ? OR material LIKE ? "
                        + "OR color LIKE ?))";
            }
            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, luggage.getBrand());
            pst.setString(2, luggage.getLableCode());
            pst.setString(3, luggage.getMaterial());
            pst.setString(4, luggage.getColor());

            rs = pst.executeQuery();
            return rs;

        } catch (SQLException e) {
        }
        dbManager.closeConnection();
        return rs;
    }
}
