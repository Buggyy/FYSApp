package QueryManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Client;
import view.LoginScreen;

/**
 *
 * @author Rafael
 */
public class ClientManager {

    private DatabaseManager dbManager = new DatabaseManager();
    private PreparedStatement pst;

    /**
     * Method om een user toe te voegen aan de database.
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

    /**
     *
     * @return
     */
    public int getClientid() {

        int ownerid = 0;

        try {

            String sql = "SELECT ownerid FROM client ORDER BY ownerid DESC "
                    + "LIMIT 0 , 1";

            dbManager.openConnection();
            pst = dbManager.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                ownerid = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        dbManager.closeConnection();
        return ownerid;
    }

    /**
     *
     * @param i
     * @return
     */
    public Client getSelectedClient(int i) {

        Client client = new Client();
        ResultSet rs = null;
        String getSelectedClient = "SELECT * FROM client WHERE ownerid=?";

        try {

            dbManager.openConnection();
            pst = dbManager.getConnection()
                    .prepareStatement(getSelectedClient);

            pst.setInt(1, i);

            rs = pst.executeQuery();

            if (rs.next()) {

                client.setFirstName(rs.getString("firstname"));
                client.setMiddleName(rs.getString("middlename"));
                client.setLastName(rs.getString("lastname"));
                client.setPhone(rs.getString("phonenumber"));
                client.setEmail(rs.getString("email"));
                client.setCountry(rs.getString("country"));
                client.setAddress(rs.getString("address"));
                client.setCity(rs.getString("city"));
                client.setState(rs.getString("state"));
                client.setZipCode(rs.getString("zipcode"));
            }

            return client;

        } catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        dbManager.closeConnection();
        return client;
    }

    /**
     *
     * @param client
     * @param id
     */
    public void updateClient(Client client, int id) {

        String updateClient = "UPDATE client SET firstname=?, middlename=?, "
                + "lastname=?, country=?, phonenumber=?, email=?, "
                + "address=?, city=?, state=?, zipcode=? WHERE ownerid=?";
        try {

            dbManager.openConnection();
            pst = dbManager.getConnection().prepareStatement(updateClient);

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
            pst.setInt(11, id);

            pst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Could not complete task, please contact your "
                    + "Administrator!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        dbManager.closeConnection();
    }
}
