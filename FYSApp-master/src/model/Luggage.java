
package model;

import connectivity.DatabaseManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *@author Team 1 IS106 ZoekJeKoffer
 * 
 */
public class Luggage {
    public static int getLuggageid(){
        // Method die zorgt dat de luggageID wordt gegenereerd.

        int luggageid = 0;
    try {
        String sql = "SELECT luggageid FROM luggage ORDER BY luggageid DESC LIMIT 0 , 1";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DatabaseManager.openConnection();
        Statement statement = connection.createStatement();
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        
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
        // Timestamp moet nog mee worden gegeven, iemand kan dit fixen.
        
        //Date date = new Date();
        //String dateString = date.toLocaleString();
        //java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
        String luggageid = (getLuggageid() + 1) + "";
        String date = main.FYSApp.getDate();

    try {
        String sql="INSERT INTO luggage (luggageid,status,created,weight,brand,description,ownerid) VALUES (?,?,?,?,?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DatabaseManager.openConnection();
        Statement statement = connection.createStatement();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, luggageid);
        preparedStatement.setString(2, status);
        preparedStatement.setString(3, date);
        preparedStatement.setString(4, weight);
        preparedStatement.setString(5, brand);
        preparedStatement.setString(6, description);
        preparedStatement.setString(7, ownerid);
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