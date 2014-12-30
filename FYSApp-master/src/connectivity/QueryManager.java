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
import view.LoginScreen;
import javax.swing.*;

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
    public void addFoundLuggage(Luggage luggage) {

//        String date = main.FYSApp.getDate();
//        String airportName = getAirportById(id);
        try {

            dbManager.openConnection();

            String sql = "INSERT INTO luggage (status,brand,weight,description) VALUES (?,?,?,?)";

            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, luggage.getStatus());
//            pst.setString(2, date);
            pst.setString(2, luggage.getBrand());
            pst.setString(3, luggage.getWeight());
            pst.setString(4, luggage.getDescription());
//            pst.setInt(6, id);
//            pst.setString(7, airportName);

            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();

        }

        dbManager.closeConnection();

    }

    public void addLostLuggage(Luggage luggage, int id) {

        try {
            dbManager.openConnection();

            String sql = "INSERT INTO luggage (status,brand,weight,description,"
                    + "ownerid) VALUES (?,?,?,?,?)";

            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, luggage.getStatus());
            pst.setString(2, luggage.getBrand());
            pst.setString(3, luggage.getWeight());
            pst.setString(4, luggage.getDescription());
            pst.setInt(5, id);

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

    public int getClientd() {

        int ownerid = 0;
//         Method die zorgt dat de hoogste ownerID wordt gegenereerd.

        try {

            String sql = "SELECT ownerid FROM client ORDER BY ownerid DESC LIMIT 0 , 1";
            dbManager.openConnection();
            pst = dbManager.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                ownerid = rs.getInt(1);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        dbManager.closeConnection();
        return ownerid;
    }

//    public int getLastClientId() {
//        
//        int clientID = 0;
//
//        dbManager.openConnection();
//
//        String sql = "SELECT ownerid FROM owner ORDER BY ownerid DESC LIMIT 1";
//        
//
//        try {
//            pst = dbManager.getConnection().prepareStatement(sql);
//
//            ResultSet rs = pst.executeQuery();
//            clientID = rs.getInt("ownerid");
//
//        } catch (SQLException ex) {
//            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        dbManager.closeConnection();
//
//        return clientID;
//    }
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
                    + ",middlename,lastname,email,created,airportname) VALUES (?,?,?,?,?,?,?,?,?)";

            // Gebruik de getters en setters van de user object
            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, user.getUserName());
            pst.setString(2, user.getPass());
            pst.setString(3, user.getRole());
            pst.setString(4, user.getFirstName());
            pst.setString(5, user.getMiddleName());
            pst.setString(6, user.getLastName());
            pst.setString(7, user.getEmail());
            pst.setString(8, date);
            pst.setString(9, user.getAirport());

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

    public ResultSet getManagerAuctionedOverview() {
        ResultSet rs = null;
        try {

            dbManager.openConnection();

            String sql = "SELECT * FROM zoekjekoffer.luggage WHERE status = 'auctioned';";

            pst = dbManager.getConnection().prepareStatement(sql);
            rs = pst.executeQuery(sql);
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        dbManager.closeConnection();
        return rs;

    }

//     dbManager.openConnection();
//
//            String sql = "INSERT INTO user (username,password,role,firstname"
//                    + ",middlename,lastname,email,airportname) VALUES (?,?,?,?,?,?,?,?)";
//
//            // Gebruik de getters en setters van de user object
//            pst = dbManager.getConnection().prepareStatement(sql);
//
//            pst.setString(1, user.getUserName());
//            pst.setString(2, user.getPass());
//            pst.setString(3, user.getRole());
//            pst.setString(4, user.getFirstName());
//            pst.setString(5, user.getMiddleName());
//            pst.setString(6, user.getLastName());
//            pst.setString(7, user.getEmail());
//            pst.setString(8, user.getAirport());
    public ResultSet getUserLoginfo(String username) {
        String sql = "SELECT password,role FROM user WHERE username=?";
        ResultSet rs = null;

        try {
            dbManager.openConnection();

            pst = dbManager.getConnection().prepareStatement(sql);
            pst.setString(1, username);
            rs = pst.executeQuery();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        dbManager.closeConnection();
        return rs;
    }

    public ResultSet searchTableLuggageFound(String input) throws ClassNotFoundException {

        ResultSet rs = null;

        try {
            dbManager.openConnection();

            String sql
                    = "SELECT * FROM luggage WHERE ("
                    + "status = 'found' AND (luggageid LIKE ? OR created LIKE ? OR brand LIKE ? OR weight LIKE ? "
                    + "OR description LIKE ? OR ownerid LIKE ? OR airportname LIKE ?))";

            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, "%" + input + "%");
            pst.setString(2, "%" + input + "%");
            pst.setString(3, "%" + input + "%");
            pst.setString(4, "%" + input + "%");
            pst.setString(5, "%" + input + "%");
            pst.setString(6, "%" + input + "%");
            pst.setString(7, "%" + input + "%");

            rs = pst.executeQuery();
            return rs;

        } catch (SQLException e) {
        }
        dbManager.closeConnection();
        return rs;
    }

    public ResultSet searchTableLuggageLost(String input) throws ClassNotFoundException {

        ResultSet rs = null;

        try {
            dbManager.openConnection();

            String sql
                    = "SELECT * FROM luggage WHERE ("
                    + "status = 'lost' AND (luggageid LIKE ? OR created LIKE ? OR brand LIKE ? OR weight LIKE ? "
                    + "OR description LIKE ? OR ownerid LIKE ? OR airportname LIKE ?))";

            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, "%" + input + "%");
            pst.setString(2, "%" + input + "%");
            pst.setString(3, "%" + input + "%");
            pst.setString(4, "%" + input + "%");
            pst.setString(5, "%" + input + "%");
            pst.setString(6, "%" + input + "%");
            pst.setString(7, "%" + input + "%");

            rs = pst.executeQuery();
            return rs;

        } catch (SQLException e) {
        }
        dbManager.closeConnection();
        return rs;
    }
    
    public ResultSet searchTableAuctioned(String input) throws ClassNotFoundException {

        ResultSet rs = null;

        try {
            dbManager.openConnection();

            String sql
                    = "SELECT * FROM luggage WHERE ("
                    + "status = 'auctioned' AND (luggageid LIKE ? OR created LIKE ? OR brand LIKE ? OR weight LIKE ? "
                    + "OR description LIKE ? OR ownerid LIKE ? OR airportname LIKE ?))";

            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, "%" + input + "%");
            pst.setString(2, "%" + input + "%");
            pst.setString(3, "%" + input + "%");
            pst.setString(4, "%" + input + "%");
            pst.setString(5, "%" + input + "%");
            pst.setString(6, "%" + input + "%");
            pst.setString(7, "%" + input + "%");

            rs = pst.executeQuery();
            return rs;

        } catch (SQLException e) {
        }
        dbManager.closeConnection();
        return rs;
    }

    public ResultSet searchTableUser(String input) throws ClassNotFoundException {

        ResultSet rs = null;

        try {
            dbManager.openConnection();

            String sql
                    = "SELECT * FROM zoekjekoffer.user WHERE "
                    + "userid LIKE ? OR username LIKE ? OR password LIKE ? OR role LIKE ? "
                    + "OR firstname LIKE ? OR middlename LIKE ? OR lastname LIKE ? "
                    + "OR email LIKE ? OR created LIKE ? OR updated LIKE ?";

            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, "%" + input + "%");
            pst.setString(2, "%" + input + "%");
            pst.setString(3, "%" + input + "%");
            pst.setString(4, "%" + input + "%");
            pst.setString(5, "%" + input + "%");
            pst.setString(6, "%" + input + "%");
            pst.setString(7, "%" + input + "%");
            pst.setString(8, "%" + input + "%");
            pst.setString(9, "%" + input + "%");
            pst.setString(10, "%" + input + "%");

            rs = pst.executeQuery();
            return rs;

        } catch (SQLException e) {
        }
        dbManager.closeConnection();
        return rs;
    }

    public Luggage getSelectedLuggage(int i) {
        Luggage luggage = new Luggage();
        ResultSet rs = null;
        String sql = "SELECT * FROM luggage WHERE luggageid=?";
        try {
            dbManager.openConnection();
            pst = dbManager.getConnection().prepareStatement(sql);
            pst.setInt(1, i);

            rs = pst.executeQuery();

            if (rs.next()) {
                luggage.setStatus(rs.getString("status"));
                luggage.setBrand(rs.getString("brand"));
                luggage.setDescription(rs.getString("description"));
                luggage.setWeight(rs.getString("weight"));
            }
            return luggage;
        } catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        dbManager.closeConnection();
        return luggage;

    }

    public void deleteLuggage(int i) {
        String sql = "DELETE from luggage WHERE luggageid=?";
        try {
            dbManager.openConnection();
            pst = dbManager.getConnection().prepareStatement(sql);
            pst.setInt(1, i);
            pst.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();

        }
        dbManager.closeConnection();
    }

    public void delete(int id) {
        try {
            String sql = "DELETE from luggage WHERE luggageid=?";
            dbManager.openConnection();
            pst = dbManager.getConnection().prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException e) {
        }
        dbManager.closeConnection();
    }

    public void updateLuggage(Luggage luggage, int id) {
        try {
            String sql = "UPDATE luggage SET brand=?, weight=?, description=? WHERE luggageid=?";
            dbManager.openConnection();
            pst = dbManager.getConnection().prepareStatement(sql);
            pst.setString(1, luggage.getBrand());
            pst.setString(2, luggage.getWeight());
            pst.setString(3, luggage.getDescription());
            pst.setInt(4, id);
            pst.executeUpdate();
        } catch (SQLException e) {
        }
        dbManager.closeConnection();
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
