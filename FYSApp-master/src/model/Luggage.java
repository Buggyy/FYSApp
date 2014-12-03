
package model;

import connectivity.DatabaseManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *@author Team 1 IS106 ZoekJeKoffer
 * 
 */
public class Luggage {
    
    public static int getLuggageid(){
        // Method die zorgt dat de hoogste luggageID wordt gegenereerd.
        int luggageid = 0;
    try {
        
        // Query aanmaken, daarna connection maken.
        // Daarna bereid ie de query voor, haalt hij de laatste luggageid 
        // uit de database en returnt het.
        
        String sql = "SELECT luggageid FROM luggage ORDER BY luggageid DESC LIMIT 0 , 1";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DatabaseManager.openConnection();
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        
        // while loop die loopt tot dat ie bij het hoogste nummer zit.
        while (rs.next()) {

                luggageid = rs.getInt(1);
        }    
        connection.close();
    }
    catch (Exception e)
    {
        e.printStackTrace();
        
    }
    return luggageid;
    }
    
    public static void addLuggage(String weight,String brand,String description,String status,String ownerid){
        // Method die Luggage aan de database toevoegd. 
        // Alle variabelen spreken voor zich.
        
        String luggageid = (getLuggageid() + 1) + "";
        String date = main.FYSApp.getDate();

    try {
        // Query aanmaken, daarna connection maken.
        // Daarna bereid ie de query voor, plaatst hij de strings in de "?"'s
        // en voert hij de query uit met de benodigde variabelen.
        // Hij zet deze op de juiste plaats in de database.
        
        String sql="INSERT INTO luggage (luggageid,status,created,weight,brand,description,ownerid) VALUES (?,?,?,?,?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DatabaseManager.openConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, luggageid);
        preparedStatement.setString(2, status);
        preparedStatement.setString(3, date);
        preparedStatement.setString(4, weight);
        preparedStatement.setString(5, brand);
        preparedStatement.setString(6, description);
        preparedStatement.setString(7, ownerid);
        preparedStatement.executeUpdate();
        
        
        connection.close();
      

    }
    catch (Exception e)
    {
        e.printStackTrace();
        
    }

}
}