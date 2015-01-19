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
        List<String> airports = new ArrayList<>();

        try {
            dbManager.openConnection();
            
            String sql = "SELECT airportname FROM airport";
            //  Prepare the sql statement
            pst = dbManager.getConnection().prepareStatement(sql);
            //  execute and store resultset
            ResultSet rs = pst.executeQuery();

            //  Store all records in ArrayList
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
