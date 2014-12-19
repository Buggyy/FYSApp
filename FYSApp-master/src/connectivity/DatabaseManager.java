package connectivity;

import java.sql.*;
import javax.swing.*;

/*
 *   @author Team 1 IS106 ZoekJeKoffer
 *   Goal: In this file we will store all the Database Methods and functions
 */
public class DatabaseManager {

    public static final String JDBC_EXCEPTION = "JDBC Exception: ";
    public static final String SQL_EXCEPTION = "SQL Exception: ";

    private Connection conn = null;

    /**
     * Open database connection
     */
    public void openConnection() {
            // <editor-fold defaultstate="collapsed" desc="Connect to online database"> 
//        try {
//            //  Database information
//            String url = "jdbc:mysql://iavconcepts.com:3306/"; 
//            String dbName = "zoekjekoffer";
//
//            //  jdbc driver
//            String driver = "com.mysql.jdbc.Driver";
//            
//            //  username of database user
//            String userName = "hvateammember";
//            
//            //  Password of database user
//            String password = "Q3c&QKCsUI";
//
//            // The newInstance() call is a work around for some
//            // broken Java implementations
//            Class.forName(driver).newInstance();
//            conn = DriverManager.getConnection(url + dbName, userName, password);

            //  Adding multiple exception catches
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
//
//        }
        
        // </editor-fold>
        
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
        } catch (Exception e) {
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
    // Maak hier preparedstatement van.
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
    // Maak hier preparedstatement van.
    public ResultSet doQuery(String query) {
        ResultSet result = null;
        try {
            Statement statement = conn.createStatement();
            result = statement.executeQuery(query);
        } catch (java.sql.SQLException e) {
            System.err.println(SQL_EXCEPTION + e);
        }
        return result;
    }

    /**
     * Executes a query with result.
     *
     * @param query, the SQL query
     */
    public ResultSet insertQuery(String query) {
        ResultSet result = null;
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            result = statement.getGeneratedKeys();
        } catch (java.sql.SQLException e) {
            System.err.println(SQL_EXCEPTION + e);
        }
        return result;
    }

}
