/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appCinema.model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bourd
 */
public class DatabaseClient {
    
    private Connection connection;

    public DatabaseClient() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test_pl", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex);
        }
    }
    
    public Boolean exists(String name, String hash) {
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE name = \"" + name + "\" AND "
                    + "pw = \"" + hash + "\";");
            if(rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseClient.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
