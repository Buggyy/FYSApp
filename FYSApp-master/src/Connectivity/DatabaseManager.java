package Connectivity;

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
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/zoekjekoffer", "root", "");

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

    /**
     * Executes a query with result.
     *
     * @param query, the SQL query
     * @return
     */
//    public ResultSet doQuery(String query) {
//        ResultSet result = null;
//        try {
//            Statement statement = conn.createStatement();
//            result = statement.executeQuery(query);
//        } catch (java.sql.SQLException e) {
//            System.err.println(SQL_EXCEPTION + e);
//        }
//        return result;
//    }
    /**
     * Executes a query with result.
     *
     * @param query, the SQL query
     * @return
     */
//    public ResultSet insertQuery(String query) {
//        ResultSet result = null;
//        try {
//            Statement statement = conn.createStatement();
//            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
//            result = statement.getGeneratedKeys();
//        } catch (java.sql.SQLException e) {
//            System.err.println(SQL_EXCEPTION + e);
//        }
//        return result;
//    }
}
