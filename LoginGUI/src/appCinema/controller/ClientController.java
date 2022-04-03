/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appCinema.controller;

import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author augus
 */
public class ClientController extends MotherController{
    
    
    public void doWriteClient(String _name, String _Surname, Date _BirthDate, String _PhoneNb, String _Email, String _Pw) throws SQLException {
        InitController();
        dao.WriteClient(_name, _Surname, _BirthDate, _PhoneNb, _Email, _Pw);
    }
}
