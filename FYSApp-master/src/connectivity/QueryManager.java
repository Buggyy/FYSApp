package connectivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Client;
import model.Luggage;

public class QueryManager {

    private DatabaseManager dbmanager;
    private PreparedStatement preparedStatement;

    public QueryManager(DatabaseManager dbmanager) {
        this.dbmanager = dbmanager;
    }

    // Method die Luggage aan de database toevoegd. 
    public void addLuggage(Luggage luggage, int id) {

        String date = main.FYSApp.getDate();

        String airportName = getAirportById(id);

        try {
            // Query aanmaken, daarna connection maken. 
            // Daarna bereid ie de query voor, plaatst hij de strings in de "?"'s
            // en voert hij de query uit met de benodigde variabelen.
            // Hij zet deze op de juiste plaats in de database.
            //Aan t einde moet de connection altijd weer gesloten worden.

            String sql = "INSERT INTO luggage (status, created, "
                    + "brand, weight, description, ownerid,"
                    + "airportname) VALUES (?,?,?,?,?,?,?)";
            dbmanager.openConnection();
            preparedStatement = dbmanager.getConnection().prepareStatement(sql);
            
            preparedStatement.setString(1, luggage.getStatus());
            preparedStatement.setString(2, date);
            preparedStatement.setString(3, luggage.getBrand());
            preparedStatement.setString(4, luggage.getWeight());
            preparedStatement.setString(5, luggage.getDescription());
            preparedStatement.setInt(6, id);
            preparedStatement.setString(7, airportName);
            preparedStatement.executeUpdate();

            
        } catch (Exception e) {
            e.printStackTrace();

        }

        dbmanager.closeConnection();
        
    }

    // Method om een user toe te voegen aan de database.
    public void addClient(Client client) {

        // Hij get de date en userid hier.
        String date = main.FYSApp.getDate();

        try {

            // Query aanmaken, daarna connection maken.
            // Daarna bereid ie de query voor, plaatst hij de strings in de "?"'s
            // en voert hij de query uit met de benodigde variabelen.
            // Hij zet deze op de juiste plaats in de database.
            //Aan t einde moet de connection altijd weer gesloten worden.
            // Pas de query aan. Maak indien nodig een nieuwe tabel genaamd client of owner.
            String sql = "INSERT INTO client (firstname,middlename,lastname, "
                    + "country, phonenumber, email ,adress, city, state,"
                    + "zipcode) VALUES (?,?,?,?,?,?,?,?,?,?)";
            dbmanager.openConnection();

            // Gebruik de getters en setters van de user object
            preparedStatement = dbmanager.getConnection().prepareStatement(sql);

            preparedStatement.setString(1, client.getFirstName());
            preparedStatement.setString(2, client.getMiddleName());
            preparedStatement.setString(3, client.getLastName());
            preparedStatement.setString(4, client.getCountry());
            preparedStatement.setString(5, client.getPhone());
            preparedStatement.setString(6, client.getEmail());
            preparedStatement.setString(7, client.getAdress());
            preparedStatement.setString(8, client.getCity());
            preparedStatement.setString(9, client.getState());
            preparedStatement.setString(10, client.getZipCode());

            preparedStatement.executeUpdate();

            
        } catch (Exception e) {
            e.printStackTrace();

        }

        dbmanager.closeConnection();
        
    }

    public String getAirportById(int id) {
        String sql = "SELECT airportname WHERE userid = ?";

        dbmanager.openConnection();

        String airportName = "";

        try {
            preparedStatement = dbmanager.getConnection().prepareStatement(sql);

            preparedStatement.setInt(1, id);

            ResultSet rs = preparedStatement.executeQuery();

            airportName = rs.getString("airportname");
            
        } catch (SQLException ex) {
            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        dbmanager.closeConnection();
        
        return airportName;
    }

    public int getLastClientId() {
        String sql = "SELECT ownerid FROM zoekjekoffer.client ORDER BY ownerid DESC LIMIT 1";

        dbmanager.openConnection();

        PreparedStatement preparedStatement;

        int clientID = 0;

        try {
            preparedStatement = dbmanager.getConnection().prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();
            clientID = rs.getInt("ownerid");

        } catch (SQLException ex) {
            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        dbmanager.closeConnection();

        return clientID;
    }
}
