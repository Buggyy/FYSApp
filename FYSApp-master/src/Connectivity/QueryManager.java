package Connectivity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Luggage;
import main.FYSApp;

/**
 * @author Team 1 IS106 ZoekJeKoffer
 *
 */
public class QueryManager {

    private DatabaseManager dbManager = new DatabaseManager();
    private PreparedStatement pst;

    public QueryManager(DatabaseManager dbmanager) {
        this.dbManager = dbmanager;
    }

    public ArrayList<String> getAirports() {
        // Method die zorgt dat er een arraylist komt met alle airports erin.

        List<String> airports = new ArrayList<>();

        try {
            // Query aanmaken, daarna connection maken.
            // Daarna bereid ie de query voor, haalt de airports
            // uit de database en returnt het.
            dbManager.openConnection();
            String sql = "SELECT airportname FROM airport";
            pst = dbManager.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            // While loop die zorgt dat alle airports uit de database 
            // worden gehaald.
            while (rs.next()) {
                airports.add(rs.getString("airportname"));
            }

            dbManager.closeConnection();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Could not complete task, please contact your Administrator!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        return (ArrayList<String>) airports;

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
}
