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

    @Override
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

    @Override
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

    @Override
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

    @Override
    public void WriteFilm(String _Title, String _Category, int _Duration, int _ReleaseYear, float _Score) {
        java.sql.Connection connection = m_DatabaseClient.getConnection();
        Statement stmt;
        try {
            stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO `film` (TitreFilm,CategorieFilm,DureeFilm,"
                    + "AnneeSortieFilm,NoteFilm) VALUES(\"" + _Title + "\", \"" + _Category + "\","
                    + "\"" + _Duration + "\",\"" + _ReleaseYear + "\",\"" + _Score + "\");");
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void DeleteClient(String _Title) {
        java.sql.Connection connection = m_DatabaseClient.getConnection();
        Statement stmt;
        try {
            stmt = connection.createStatement();
            stmt.executeUpdate("DELETE FROM `film` WHERE \"" + _Title + "\"=TitreFilm;");
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void DeleteReduc(String _Title) {
        java.sql.Connection connection = m_DatabaseClient.getConnection();
        Statement stmt;
        try {
            stmt = connection.createStatement();
            stmt.executeUpdate("DELETE FROM `reduction` WHERE \"" + _Title + "\"=TitreReduc;");
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void WriteReduc(int _AgeMax, int _AgeMin, int _NbPlace, float _Taux, String _TitreReduc, java.util.Date _DateSup, java.util.Date _DateInf) {
        java.sql.Connection connection = m_DatabaseClient.getConnection();
        Statement stmt;
        SimpleDateFormat dateInf = new SimpleDateFormat("yyyy-MM--dd");
        String sqlInfDate = dateInf.format(_DateInf);
        SimpleDateFormat dateSup = new SimpleDateFormat("yyyy-MM--dd");
        String sqlSupDate = dateSup.format(_DateSup);
        try {
            stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO `reduction` (TauxReduc, TitreReduc,NombrePlace,AgeMin,"
                    + "AgeMax,DateInf,DateSup) VALUES(\"" + _Taux + "\",\"" + _TitreReduc + "\", \"" + _NbPlace + "\","
                    + "\"" + _AgeMin + "\",\"" + _AgeMax + "\",\"" + sqlInfDate + "\",\"" + sqlSupDate + "\");");
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Reduction> getReductions() throws SQLException {
        ArrayList<Reduction> reducs = new ArrayList<>();
        java.sql.Connection connection = m_DatabaseClient.getConnection();
        Statement stmt;
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Reduction;");
            while (rs.next()) {
                Reduction temp = new Reduction(rs.getInt("IdReduc"), rs.getInt("AgeMax"), rs.getInt("AgeMin"),
                        rs.getInt("NombrePlace"), rs.getFloat("TauxReduc"), rs.getString("TitreReduc"),
                        rs.getDate("DateSup"), rs.getDate("DateInf"));
                reducs.add(temp);
                //temp.DisplayConsoleFilm();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reducs;
    }

    @Override
    public void updateCurrentClient(String _Mail, int _Connect) {
        java.sql.Connection connection = m_DatabaseClient.getConnection();
        Statement stmt;
        try {
            stmt = connection.createStatement();
            stmt.executeUpdate("UPDATE `client` set `connection`= " + _Connect + " WHERE MailClient = \"" + _Mail + "\"");
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Client getCurrentClient() {
        java.sql.Connection connection = m_DatabaseClient.getConnection();
        Statement stmt;
        Client client = null;
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `client` WHERE connection = 1;");
            while (rs.next()) {
                client = new Client(rs.getInt("IdClient"), rs.getInt("Admin"), rs.getInt("connection"),
                        rs.getString("NomClient"), rs.getString("PrenomClient"), rs.getString("MailClient"), "CRYPTE", rs.getString("NumTelClient"), rs.getDate("DateNaissanceClient"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return client;
    }

}
