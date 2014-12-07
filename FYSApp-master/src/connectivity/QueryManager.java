package connectivity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Client;
import model.Luggage;
import model.User;

/**
 * @author Team 1 IS106 ZoekJeKoffer
 *
 */

public class QueryManager {

    private DatabaseManager dbManager;
    private PreparedStatement pst;

    public QueryManager(DatabaseManager dbmanager) {
        this.dbManager = dbmanager;
    }

    // Method die Luggage aan de database toevoegd. 
    public void addLuggage(Luggage luggage) {

        String date = main.FYSApp.getDate();

//        String airportName = getAirportById(id);
        try {
            // Query aanmaken, daarna connection maken. 
            // Daarna bereid ie de query voor, plaatst hij de strings in de "?"'s
            // en voert hij de query uit met de benodigde variabelen.
            // Hij zet deze op de juiste plaats in de database.
            //Aan t einde moet de connection altijd weer gesloten worden.

            String sql = "INSERT INTO luggage (status, created, "
                    + "brand, weight, description, ownerid,"
                    + "airportname) VALUES (?,?,?,?,?,?,?)";

            dbManager.openConnection();
            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, luggage.getStatus());
            pst.setString(2, date);
            pst.setString(3, luggage.getBrand());
            pst.setString(4, luggage.getWeight());
            pst.setString(5, luggage.getDescription());
//            pst.setInt(6, id);
//            pst.setString(7, airportName);
            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();

        }

        dbManager.closeConnection();

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
            dbManager.openConnection();

            // Gebruik de getters en setters van de user object
            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, client.getFirstName());
            pst.setString(2, client.getMiddleName());
            pst.setString(3, client.getLastName());
            pst.setString(4, client.getCountry());
            pst.setString(5, client.getPhone());
            pst.setString(6, client.getEmail());
            pst.setString(7, client.getAdress());
            pst.setString(8, client.getCity());
            pst.setString(9, client.getState());
            pst.setString(10, client.getZipCode());

            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();

        }

        dbManager.closeConnection();

    }

    //Deze werkt nog niet, snelle copy paste van andere class waar hij nie hoort.
    public static int getOwnerid() {
        int ownerid = 0;
        // Method die zorgt dat de hoogste ownerID wordt gegenereerd.
//
//        int ownerid = 0;
//        try {
//
//            // Query aanmaken, daarna connection maken.
//            // Daarna bereid ie de query voor, haalt hij de laatste ownerid 
//            // uit de database en returnt het.
//            String sql = "SELECT ownerid FROM owner ORDER BY ownerid DESC LIMIT 0 , 1";
//            dbManager.openConnection();
//            PreparedStatement pst = connection.prepareStatement(sql);
//            ResultSet rs = pst.executeQuery();
//
//            // While loop die zorgt dat de hoogste ownerid wordt gepakt.
//            while (rs.next()) {
//
//                ownerid = rs.getInt(1);
//            }
//            connection.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
        return ownerid;
    }

    
    //Deze werkt nog niet, snelle copy paste van andere class waar hij nie hoort.
    public static void addOwner() {
//        // Method om een luggage owner toe te voegen aan de database.
//
//        try {
//
//        // Query aanmaken, daarna connection maken.
//            // Daarna bereid ie de query voor, plaatst hij de strings in de "?"'s
//            // en voert hij de query uit met de benodigde variabelen.
//            // Hij zet deze op de juiste plaats in de database.
//            String sql = "INSERT INTO owner (ownerid,firstname,middlename,lastname,country,phonenumber,email,address,city,state,zipcode) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
//            dbManager.openConnection();
//            PreparedStatement preparedStatement = d.prepareStatement(sql);
//            preparedStatement.setString(1, ownerId); // Userid
//            preparedStatement.setString(2, firstName); // First name
//            preparedStatement.setString(3, middleName); // Middle name
//            preparedStatement.setString(4, lastName); // Last name
//            preparedStatement.setString(5, country); // Country
//            preparedStatement.setString(6, phone); // Phone Number
//            preparedStatement.setString(7, email); // Email
//            preparedStatement.setString(8, address); // Adress
//            preparedStatement.setString(9, city); // City
//            preparedStatement.setString(10, state); // State
//            preparedStatement.setString(11, zipCode); // Zip code
//            preparedStatement.executeUpdate();
//
//            // Zorgt dat de connectie wordt geclosed.
//            connection.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
//    }
//
//    public String getAirportById(int id) {
//        String sql = "SELECT airportname WHERE userid = ?";
//
//        dbManager.openConnection();
//
//        String airportName = "";
//
//        try {
//            pst = dbManager.getConnection().prepareStatement(sql);
//
//            pst.setInt(1, id);
//
//            ResultSet rs = pst.executeQuery();
//
//            airportName = rs.getString("airportname");
//
//        } catch (SQLException ex) {
//            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        dbManager.closeConnection();
//
//        return airportName;
    }

    public int getLastClientId() {
        String sql = "SELECT ownerid FROM zoekjekoffer.client ORDER BY ownerid DESC LIMIT 1";

        dbManager.openConnection();

        int clientID = 0;

        try {
            pst = dbManager.getConnection().prepareStatement(sql);

            ResultSet rs = pst.executeQuery();
            clientID = rs.getInt("ownerid");

        } catch (SQLException ex) {
            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        dbManager.closeConnection();

        return clientID;
    }

    public ArrayList<String> getAirports() {
        // Method die zorgt dat er een arraylist komt met alle airports erin.

        List<String> airports = new ArrayList<>();

        try {
            // Query aanmaken, daarna connection maken.
            // Daarna bereid ie de query voor, haalt de airports
            // uit de database en returnt het.
            String sql = "SELECT airportname FROM airport";
//            Connection connection = DatabaseManager.openConnection();
            pst = dbManager.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            // While loop die zorgt dat alle airports uit de database 
            // worden gehaald.
            while (rs.next()) {
                airports.add(rs.getString("airportname"));
            }

        } catch (Exception e) {
            e.printStackTrace();

        }

        dbManager.closeConnection();
        return (ArrayList<String>) airports;

    }

    public void addUser(User user) {

        // Hij get de date en userid hier.
        String date = main.FYSApp.getDate();

        try {

            // Query aanmaken, daarna connection maken.
            // Daarna bereid ie de query voor, plaatst hij de strings in de "?"'s
            // en voert hij de query uit met de benodigde variabelen.
            // Hij zet deze op de juiste plaats in de database.
            //Aan t einde moet de connection altijd weer gesloten worden.
            // Pas de query aan. Maak indien nodig een nieuwe tabel genaamd client of owner.
            dbManager.openConnection();

            String sql = "INSERT INTO user (username,password,role,firstname"
                    + ",middlename,lastname,email,airportname) VALUES (?,?,?,?,?,?,?,?)";

            // Gebruik de getters en setters van de user object
            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, user.getUserName());
            pst.setString(2, user.getPass());
            pst.setString(3, user.getRole());
            pst.setString(4, user.getFirstName());
            pst.setString(5, user.getMiddleName());
            pst.setString(6, user.getLastName());
            pst.setString(7, user.getEmail());
            pst.setString(8, user.getAirport());

            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();

        }

        dbManager.closeConnection();

    }

    public ResultSet getEmployeeFoundLuggage() {

        ResultSet rs = null;
        try {

            dbManager.openConnection();

            String sql = "SELECT * FROM zoekjekoffer.luggage WHERE status = 'found';";

            pst = dbManager.getConnection().prepareStatement(sql);
            rs = pst.executeQuery(sql);
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        dbManager.closeConnection();
        return rs;
    }

    public ResultSet getEmployeeLostLuggage() {

        ResultSet rs = null;
        try {

            dbManager.openConnection();

            String sql = "SELECT * FROM zoekjekoffer.luggage WHERE status = 'lost';";
            pst = dbManager.getConnection().prepareStatement(sql);
            rs = pst.executeQuery(sql);

            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        dbManager.closeConnection();
        return rs;
    }

    public ResultSet getAdminUsersOverview() {
        ResultSet rs = null;

        try {
            dbManager.openConnection();

            String sql = "SELECT * FROM zoekjekoffer.user;";
            pst = dbManager.getConnection().prepareStatement(sql);
            rs = pst.executeQuery(sql);
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        dbManager.closeConnection();
        return rs;
    }

    public ResultSet getManagerOverview() {
        ResultSet rs = null;

        //EMPTY METHOD; komt nog
        return rs;

    }
}
