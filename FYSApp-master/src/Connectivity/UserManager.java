/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connectivity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.FYSApp;
import model.User;
import view.LoginScreen;

/**
 *
 * @author Rafael
 */
public class UserManager {

    private DatabaseManager dbManager = new DatabaseManager();
    private PreparedStatement pst;
    private String userName;
    private String airPort;

    public void addUser(User user) {
        String sql = "INSERT INTO user (username,password,role,firstname"
                + ",middlename,lastname,email,created,airportname,updated) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            dbManager.openConnection();

            pst = dbManager.getConnection().prepareStatement(sql);

            pst.setString(1, user.getUserName());
            pst.setString(2, user.getPass());
            pst.setString(3, user.getRole());
            pst.setString(4, user.getFirstName());
            pst.setString(5, user.getMiddleName());
            pst.setString(6, user.getLastName());
            pst.setString(7, user.getEmail());
            pst.setString(8, FYSApp.getDate());
            pst.setString(9, user.getAirport());
            pst.setString(10, FYSApp.getDate());

            pst.executeUpdate();

            dbManager.closeConnection();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Could not complete task, please contact your Administrator!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    public void deleteUser(String userName) {
        try {
            String sql = "DELETE from user WHERE userid=?";
            dbManager.openConnection();
            pst = dbManager.getConnection().prepareStatement(sql);
            pst.setString(1, userName);

            pst.executeUpdate();
            dbManager.closeConnection();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Could not complete task, please contact your Administrator!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public User getSelectedUser(String userName) throws SQLException {
        User user = new User();
        ResultSet rs = null;
        String sql = "SELECT * FROM user WHERE username=?";
        try {
            dbManager.openConnection();
            pst = dbManager.getConnection().prepareStatement(sql);
            pst.setString(1, userName);

            rs = pst.executeQuery();

            if (rs.next()) {
                user.setUserName(rs.getString("username"));
                user.setRole(rs.getString("role"));
                user.setPass(rs.getString("password"));
                user.setFirstName(rs.getString("firstname"));
                user.setMiddleName(rs.getString("middlename"));
                user.setLastName(rs.getString("lastname"));
                user.setEmail(rs.getString("email"));
                user.setAirport(rs.getString("airportname"));

            }
            return user;

        } catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        dbManager.closeConnection();
        return user;

    }

    public void updateUser(User user, int id) {
        try {
            String sql = "UPDATE user SET username=?, password=?, role=?, "
                    + "firstName=?, middlename=?, lastname=?, email=?, "
                    + "airportname=?, updated=?  WHERE userid=?";

            dbManager.openConnection();
            pst = dbManager.getConnection().prepareStatement(sql);
            pst.setString(1, user.getUserName());
            pst.setString(2, user.getPass());
            pst.setString(3, user.getRole());
            pst.setString(4, user.getFirstName());
            pst.setString(5, user.getMiddleName());
            pst.setString(6, user.getLastName());
            pst.setString(7, user.getEmail());
            pst.setString(8, user.getAirport());
            pst.setString(9, FYSApp.getDate());
            pst.setInt(10, id);
            pst.executeUpdate();
        } catch (SQLException e) {
        }
        dbManager.closeConnection();
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public boolean userExists(String userName) {
        ResultSet rs = null;
        boolean userExists = false;
        try {
            String sql = "SELECT EXISTS(SELECT * FROM user WHERE username=?)";
            dbManager.openConnection();
            pst = dbManager.getConnection().prepareStatement(sql);
            pst.setString(1, userName);
            rs = pst.executeQuery();
            if (rs.next()) {
                int exists = rs.getInt(1);
                if (exists == 1) {
                    userExists = true;
                    return userExists;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        dbManager.closeConnection();
        return userExists;
    }

    public void setAirPort() {
        ResultSet rs = null;
        try {
            String sql = "SELECT airportname FROM user WHERE username=?";
            dbManager.openConnection();
            pst = dbManager.getConnection().prepareStatement(sql);
            pst.setString(1, userName);
            rs = pst.executeQuery();

            if (rs.next()) {
                airPort = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        dbManager.closeConnection();
    }

    public String getAirPort() {
        return airPort;
    }
}
