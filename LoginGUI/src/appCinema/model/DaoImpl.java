/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appCinema.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author augus
 */
public class DaoImpl implements DaoInterface {

    private DatabaseClient m_DatabaseClient;

    DaoImpl(DatabaseClient _DatabaseClient) {
        this.m_DatabaseClient = _DatabaseClient;
    }

    public int AdminMemberExists(String name, String hash) {
//Return 0 if the account doesnt exist | 1 if the account is a "Member" | 2 if the account is an "Admin"
        try {
            java.sql.Connection connection = m_DatabaseClient.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM client WHERE MailClient = \"" + name + "\" AND "
                    + "mdpClient = \"" + hash + "\";");
            if (rs1.next()) {
                ResultSet rs2 = stmt.executeQuery("SELECT * FROM client WHERE MailClient = \"" + name + "\" AND "
                        + "mdpClient = \"" + hash + "\" AND Admin = 1;");
                if (rs2.next()) {
                    return 2;
                } else {
                    return 1;
                }

            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseClient.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public ArrayList<Film> getFilms() {
        java.sql.Connection connection = m_DatabaseClient.getConnection();
        Statement stmt;
        ArrayList<Film> films = new ArrayList<>();
        try {
            stmt = connection.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM film;");

            while (rs.next()) {
                Film temp = new Film(rs.getInt("IdFilm"), rs.getInt("DureeFilm"), rs.getInt("AnneeSortieFilm"),
                         rs.getFloat("NoteFilm"), rs.getString("TitreFilm"), rs.getString("CategorieFilm"));
                films.add(temp);
                //temp.DisplayConsoleFilm();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return films;
    }

    public void WriteClient(String _name, String _Surname, Date _BirthDate, String _PhoneNb, String _Email, String _Pw) throws SQLException {
        java.sql.Connection connection = m_DatabaseClient.getConnection();
        Statement stmt = connection.createStatement();
        SimpleDateFormat birthDate = new SimpleDateFormat("yyyy-MM--dd");
        String sqlBirthDate = birthDate.format(_BirthDate);
        stmt.executeUpdate("INSERT INTO `client`(Admin,NomClient,PrenomClient,"
                + "MailClient,MdpClient,DateNaissanceClient,NumTelClient) "
                + "VALUES(0,\"" + _name + "\",\"" + _Surname + "\",\"" + _Email + "\","
                + "\"" + _Pw + "\",\"" + sqlBirthDate + "\",\"" + _PhoneNb + "\");");

    }
}
                 
