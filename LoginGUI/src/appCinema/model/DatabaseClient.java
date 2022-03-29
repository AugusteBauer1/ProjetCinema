/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appCinema.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bourd
 */
public class DatabaseClient {

    private String m_Adress, m_Name, m_Pw;
    private Connection m_Connection;

    public DatabaseClient(String m_Adress, String m_Name, String m_Pw) {
        this.m_Adress = m_Adress;
        this.m_Name = m_Name;
        this.m_Pw = m_Pw;
    }

    public static DatabaseClient getDatabaseClient() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            /*this.m_Connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cinema", "root", "");*/
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);

        }
        DatabaseClient instance;
        instance = new DatabaseClient("jdbc:mysql://localhost:3306/cinema", "root", "");
        return instance;
    }

    public void setConnection() {
        try {
            this.m_Connection = DriverManager.getConnection(m_Adress,m_Name,m_Pw);
        }
        catch(SQLException e) {}
    }

    public Connection getConnection() {
        return m_Connection;
    }

    public DaoInterface getDaoInterface() {
        return new DaoImpl(this);
    }

    /*public Boolean exists(String name, String hash) {
        try {
            Statement stmt = m_Connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM client WHERE MailClient = \"" + name + "\" AND "
                    + "mdpClient = \"" + hash + "\";");
            if(rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseClient.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }*/
 /*public ArrayList<String> getFilmsName() throws SQLException {
        Statement stmt = m_Connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT TitreFilm FROM film;");
        ArrayList<String> films = new ArrayList<>();
        while(rs.next()){
            films.add(rs.getString("TitreFilm"));
        }
        return films;
    }*/
}
