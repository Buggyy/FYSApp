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
import java.sql.Statement;

/**
 *
 * @author Gebruiker
 */
public class Owner {
    
    public static int getOwnerid() {
        // Method die zorgt dat de luggageID wordt gegenereerd.

        int ownerid = 0;
        try {
            String sql = "SELECT ownerid FROM owner ORDER BY ownerid DESC LIMIT 0 , 1";
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DatabaseManager.openConnection();
            Statement statement = connection.createStatement();
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                ownerid = rs.getInt(1);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return ownerid;
    }
    
    public static void addOwner(String ownerId,String firstName,String middleName,String lastName,String country, String phone, String email, String address, String city,
            String state, String zipCode){
        // Method om een user toe te voegen aan de database.
        //String date = main.FYSApp.getDate();
        // int userid = getUserid() + 1;

    try {
        String sql="INSERT INTO owner (ownerid,firstname,middlename,lastname,country,phonenumber,email,address,city,state,zipcode) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DatabaseManager.openConnection();
        Statement statement = connection.createStatement();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, ownerId); // Userid
        preparedStatement.setString(2, firstName); // First name
        preparedStatement.setString(3, middleName); // Middle name
        preparedStatement.setString(4, lastName); // Last name
        preparedStatement.setString(5, country); // Country
        preparedStatement.setString(6, phone); // Phone Number
        preparedStatement.setString(7, email); // Email
        preparedStatement.setString(8, address); // Adress
        preparedStatement.setString(9, city); // City
        preparedStatement.setString(10, state); // State
        preparedStatement.setString(11, zipCode); // Zip code
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
}
