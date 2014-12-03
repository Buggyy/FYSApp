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

/**
 *
 * @author Gebruiker
 */
public class Owner {
    
    public static int getOwnerid() {
        // Method die zorgt dat de hoogste ownerID wordt gegenereerd.

        int ownerid = 0;
        try {
            
            // Query aanmaken, daarna connection maken.
            // Daarna bereid ie de query voor, haalt hij de laatste ownerid 
            // uit de database en returnt het.
            
            String sql = "SELECT ownerid FROM owner ORDER BY ownerid DESC LIMIT 0 , 1";
            Connection connection = DatabaseManager.openConnection();
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            // While loop die zorgt dat de hoogste ownerid wordt gepakt.
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
        // Method om een luggage owner toe te voegen aan de database.

    try {
        
        // Query aanmaken, daarna connection maken.
        // Daarna bereid ie de query voor, plaatst hij de strings in de "?"'s
        // en voert hij de query uit met de benodigde variabelen.
        // Hij zet deze op de juiste plaats in de database.
        
        String sql="INSERT INTO owner (ownerid,firstname,middlename,lastname,country,phonenumber,email,address,city,state,zipcode) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        Connection connection = DatabaseManager.openConnection();
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
        
        // Zorgt dat de connectie wordt geclosed.
        connection.close();
      

    }
    catch (Exception e)
    {
        e.printStackTrace();
        
    }
    

    }
}
