/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appCinema.controller;

import appCinema.model.DaoInterface;
import appCinema.model.DatabaseClient;
import appCinema.model.Film;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author bourd
 */
public class Logincontroller {

    private DaoInterface dao;
    
    

    public void InitLogincontroller() {
        DatabaseClient daoInit = DatabaseClient.getDatabaseClient();
        daoInit.setConnection();
        this.dao = daoInit.getDaoInterface();
    }

    public int exist(String email, String pw) throws SQLException {
        InitLogincontroller();
        return dao.AdminMemberExists(email, pw);  
    }
    
    public void doWriteClient(String _name, String _Surname, Date _BirthDate, String _PhoneNb, String _Email, String _Pw) throws SQLException {
        InitLogincontroller();
        dao.WriteClient(_name, _Surname, _BirthDate, _PhoneNb, _Email, _Pw);
    }
    
    
    public  ArrayList<String> getFilmsTitle() throws SQLException {
        InitLogincontroller();
        ArrayList<Film> films = dao.getFilms();
        ArrayList<String> titreFilms = new ArrayList<>();
        films.forEach(film -> titreFilms.add(film.getTitreFilm()));
        return titreFilms;
    }
    
    public  ArrayList<Film> getFilms() throws SQLException {
        InitLogincontroller();
        return dao.getFilms();
    }
}
