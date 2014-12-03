/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connectivity.DatabaseManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael
 */
public class User {

    public static int getUserid() {
        // Method die zorgt dat de luggageID wordt gegenereerd.

        int userid = 0;
        try {
            String sql = "SELECT userid FROM user ORDER BY userid DESC LIMIT 0 , 1";
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DatabaseManager.openConnection();
            Statement statement = connection.createStatement();
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                userid = rs.getInt(1);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return userid;
    }
    ///////////////////////////////////////////////////////////////////////////

    public static ArrayList<String> getAirports() {
        // Method die zorgt dat de luggageID wordt gegenereerd.

        List<String> airports = new ArrayList<>();

        try {
            String sql = "SELECT airportname FROM zoekjekoffer.airport";
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DatabaseManager.openConnection();
            Statement statement = connection.createStatement();
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                airports.add(rs.getString("airportname"));
            }

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        
        return (ArrayList<String>) airports;

    }

    ///////////////////////////////////////////////////////////////////////////
    public static void addUser(String getInput1, String getInput2,
            String getInput3, String getInput4, String getInput5, String getInput6,
            String getInput7) {
        // Timestamp moet nog mee worden gegeven, iemand kan dit fixen.

        //Date date = new Date();
        //String dateString = date.toLocaleString();
        //java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
        int userid = getUserid() + 1;

        try {
            String sql = "INSERT INTO user (userid,username,password,role,firstname,middlename,lastname,email,airportname) VALUES (" + userid + ",?,?,?,?,?,?,?,?)";
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DatabaseManager.openConnection();
            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, getInput1); // Username
            preparedStatement.setString(2, getInput2); // Password
            preparedStatement.setString(3, getInput3); // Role
            preparedStatement.setString(4, getInput4); // First name
            preparedStatement.setString(5, getInput5); // Middle name
            preparedStatement.setString(6, getInput6); // Last name
            preparedStatement.setString(7, getInput7); // Email
            //preparedStatement.setString(8, getInput8); // Airport
            preparedStatement.executeUpdate();

            //Statement statement = connection.createStatement();
            //statement.executeUpdate(sql);
            //ResultSet resultSet = statement.executeQuery("SELECT Name FROM ComputerStatus");
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
