/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package appCinema.model;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author augus
 */
public interface DaoInterface {
    //void ajouter(Client _NewClient );
    //Client getClient();
    public int AdminMemberExists(String name, String hash);
    public ArrayList<Film> getFilms() throws SQLException;
    public void WriteClient(String _name, String _Surname, java.util.Date _BirthDate, String _PhoneNb, String _Email, String _Pw) throws SQLException ;
}
