package model;

import connectivity.DatabaseManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Team 1 IS106 ZoekJeKoffer
 *
 */
public class Luggage {

    // Implementeer eigenschappen (Brand, weight etc)
    private String weight; 
    private String brand;
    private String description; 
    private String status;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
//    public static int getLuggageid(){
//        // Method die zorgt dat de hoogste luggageID wordt gegenereerd.
//        int luggageid = 0;
//    try {
//        
//        // Query aanmaken, daarna connection maken.
//        // Daarna bereid ie de query voor, haalt hij de laatste luggageid 
//        // uit de database en returnt het.
//        
//        String sql = "SELECT luggageid FROM luggage ORDER BY luggageid DESC LIMIT 0 , 1";
//        Connection connection = DatabaseManager.openConnection();
//        PreparedStatement pst = connection.prepareStatement(sql);
//        ResultSet rs = pst.executeQuery();
//        
//        // while loop die loopt tot dat ie bij het hoogste nummer zit.
//        while (rs.next()) {
//
//                luggageid = rs.getInt(1);
//        }    
//        connection.close();
//    }
//    catch (Exception e)
//    {
//        e.printStackTrace();
//        
//    }
//    return luggageid;
//    }
//    
//
//}
