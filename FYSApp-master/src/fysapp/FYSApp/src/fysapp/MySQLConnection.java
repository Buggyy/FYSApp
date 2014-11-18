/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fysapp;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Rafael
 */
public class MySQLConnection {

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jbdc:mysql://localhost/test", "username", "password");
            Statement stmt = (Statement) con.createStatement();
        } catch (Exception e) {

        }
    }

}
