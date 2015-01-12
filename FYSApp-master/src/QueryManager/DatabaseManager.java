package QueryManager;

import java.sql.*;
import javax.swing.*;

/*
 *   @author Team 1 IS106 ZoekJeKoffer
 *   Goal: In this file we will store all the Database Methods and functions
 */
public class DatabaseManager {

    public static final String JDBC_EXCEPTION = "JDBC Exception: ";
    public static final String SQL_EXCEPTION = "SQL Exception: ";

    private Connection conn;

    /**
     * Open database connection
     */
    public void openConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/zoekjekoffer", "root", "neee");

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * Close database connection
     */
    public void closeConnection() {

        try {
            conn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public Connection getConnection() {
        return conn;
    }

    /**
     * Executes a query without result.
     *
     * @param query, the SQl query
     */
    public void executeQuery(String query) {

        try {

            Statement statement = conn.createStatement();
            statement.executeQuery(query);

        } catch (java.sql.SQLException e) {
            System.err.println(SQL_EXCEPTION + e);
        }
    }
}
