
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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael
 */
public class User {
    
        //System.out.println(date);
    public static void addUser(String userName,String password,String role,String firstName,String middleName,String lastName,String email,String airport){
        // Method om een user toe te voegen aan de database.
        String date = main.FYSApp.getDate();
        int userid = getUserid() + 1;

    try {
        String sql="INSERT INTO user (userid,username,password,role,firstname,middlename,lastname,email,created,airportname) VALUES ("+userid+",?,?,?,?,?,?,?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DatabaseManager.openConnection();
        Statement statement = connection.createStatement();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, userName); // Username
        preparedStatement.setString(2, password); // Password
        preparedStatement.setString(3, role); // Role
        preparedStatement.setString(4, firstName); // First name
        preparedStatement.setString(5, middleName); // Middle name
        preparedStatement.setString(6, lastName); // Last name
        preparedStatement.setString(7, email); // Email
        preparedStatement.setString(8, date); // Created at
        preparedStatement.setString(9, airport); // Airport
        preparedStatement.executeUpdate();
        
        //Statement statement = connection.createStatement();

        //statement.executeUpdate(sql);

        //ResultSet resultSet = statement.executeQuery("SELECT Name FROM ComputerStatus");
        
        connection.close();
      

    }
    catch (Exception e)
    {
        e.printStackTrace();
        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
    
}