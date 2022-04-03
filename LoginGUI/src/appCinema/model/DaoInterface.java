/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package appCinema.model;

import java.util.ArrayList;
import java.sql.*;
import java.time.LocalTime;

/**
 *
 * @author augus
 */
public interface DaoInterface {
    //void ajouter(Client _NewClient );
    //Client getClient();
    public int AdminMemberExists(String name, String hash);
    public ArrayList<Film> getFilms() throws SQLException;
    public void DeleteClient(String _Title);
    public void DeleteReduc(String _Title);
    public Client getCurrentClient();
    public void deleteSession(int id);
    public void WriteSeance(int IdFilm, int idSalle, java.util.Date debut, LocalTime tempsDeb);
    public ArrayList<Seance> GetSeances();
    public void WriteResa(float _Montant, int IdSeance, int IdClient, int NbPlace);
    public void updateCurrentClient(String _Mail, int _Connect);
    public ArrayList<Reduction> getReductions() throws SQLException; 
    public void WriteReduc(int _AgeMax, int _AgeMin, int _NbPlace,float _Taux , String _TitreReduc, java.util.Date _DateSup,java.util.Date _DateInf);
    public void WriteFilm(String _Title,String _Category, int _Duration, int _ReleaseYear,float _Score);
    public void WriteClient(String _name, String _Surname, java.util.Date _BirthDate, String _PhoneNb, String _Email, String _Pw) throws SQLException ;
}
