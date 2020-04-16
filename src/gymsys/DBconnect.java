/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymsys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jomar
 */
public class DBconnect {

    public static Connection connect() throws ClassNotFoundException {

        Connection con = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=GYMSYSTEM;user=admin;password=123456";

        try {
            con = DriverManager.getConnection(connectionURL);
            System.out.println("Connection Successful!");
        } catch (SQLException e) {
            System.out.println(e);
        }

        return con;
    }

}
