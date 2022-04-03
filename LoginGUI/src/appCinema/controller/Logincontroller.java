/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appCinema.controller;

import appCinema.model.Client;
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
public class Logincontroller extends MotherController{

    
    public int exist(String email, String pw) throws SQLException {
        InitController();
        return dao.AdminMemberExists(email, pw);  
    }
    
    public void setConnection(String _email, int _Connect) {
        InitController();
        dao.updateCurrentClient(_email, _Connect);
    }
    
    public Client getClient() {
        InitController();
        return dao.getCurrentClient();
    }
    
}
