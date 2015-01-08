/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueryManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Client;

/**
 *
 * @author Rafael
 */
public class ClientManager {
     private DatabaseManager dbManager = new DatabaseManager();
    private PreparedStatement pst;
    
       // Method om een user toe te voegen aan de database.
    /**
     *
     * @param client
     */
    public void addClient(Client client) {

        String date = main.FYSApp.getDate();

        try {
            String sql = "INSERT INTO client (firstname,middlename,lastname, "
                    + "country, phonenumber, email ,address, city, state,"
                    + "zipcode) VALUES (?,?,?,?,?,?,?,?,?,?)";
            dbManager.openConnection();

            // Gebruik de getters en setters van de user object
            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, client.getFirstName());
            pst.setString(2, client.getMiddleName());
            pst.setString(3, client.getLastName());
            pst.setString(4, client.getCountry());
            pst.setString(5, client.getPhone());
            pst.setString(6, client.getEmail());
            pst.setString(7, client.getAddress());
            pst.setString(8, client.getCity());
            pst.setString(9, client.getState());
            pst.setString(10, client.getZipCode());

            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        dbManager.closeConnection();
    }
    
    
    
    public int getClientid() {

        int ownerid = 0;

        try {
            String sql = "SELECT ownerid FROM client ORDER BY ownerid DESC LIMIT 0 , 1";
            dbManager.openConnection();
            pst = dbManager.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                ownerid = rs.getInt(1);
            }

        } catch (Exception e) {
            //  ERROR-MESSAGE
        }
        dbManager.closeConnection();
        return ownerid;
    }
    
    
      public void updateClient(Client client, int id) {
        try {
            String sql = "UPDATE luggage SET brand=?, weight=?, description=? WHERE luggageid=?";
            dbManager.openConnection();
            pst = dbManager.getConnection().prepareStatement(sql);
            pst.setString(1, client.getFirstName());
            pst.setString(2, client.getMiddleName());
            pst.setString(3, client.getLastName());
            pst.setString(4, client.getCountry());
            pst.setString(5, client.getPhone());
            pst.setString(6, client.getEmail());
            pst.setString(7, client.getAddress());
            pst.setString(8, client.getCity());
            pst.setString(9, client.getState());
            //pst.setString(10, client.getZipCode());
            pst.setInt(4, id);
            pst.executeUpdate();
        } catch (SQLException e) {
        }
        dbManager.closeConnection();
    }
}
