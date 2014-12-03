
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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marijn
 */
public class User {
    
    public static void addUser(String userName,String password,String role,String firstName,String middleName,String lastName,String email,String airport){
        // Method om een user toe te voegen aan de database.
        // Hij get de date en userid hier.
        String date = main.FYSApp.getDate();
        int userid = getUserid() + 1;

    try {
        
        // Query aanmaken, daarna connection maken.
        // Daarna bereid ie de query voor, plaatst hij de strings in de "?"'s
        // en voert hij de query uit met de benodigde variabelen.
        // Hij zet deze op de juiste plaats in de database.
        
        String sql="INSERT INTO user (userid,username,password,role,firstname,middlename,lastname,email,created,airportname) VALUES ("+userid+",?,?,?,?,?,?,?,?,?)";
        Connection connection = DatabaseManager.openConnection();
        
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
        
        // De connectie closen lol.
        connection.close();
      

    }
    catch (Exception e)
    {
        e.printStackTrace();
        
    }

}
    public static int getUserid() {
        // Method die zorgt dat de userID wordt gegenereerd.

        int userid = 0;
        try {
            
            // Query aanmaken, daarna connection maken.
            // Daarna bereid ie de query voor, haalt hij de laatste userid 
            // uit de database en returnt het.
            
            String sql = "SELECT userid FROM user ORDER BY userid DESC LIMIT 0 , 1";
            Connection connection = DatabaseManager.openConnection();
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            // While loop die zorgt dat de hoogste userid word gepakt.
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
        // Method die zorgt dat er een arraylist komt met alle airports erin.

        List<String> airports = new ArrayList<>();

        try {
            // Query aanmaken, daarna connection maken.
            // Daarna bereid ie de query voor, haalt de airports
            // uit de database en returnt het.
            String sql = "SELECT airportname FROM zoekjekoffer.airport";
            Connection connection = DatabaseManager.openConnection();
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            // While loop die zorgt dat alle airports uit de database 
            // worden gehaald.
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