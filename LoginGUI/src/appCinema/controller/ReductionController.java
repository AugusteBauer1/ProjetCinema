/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appCinema.controller;

import appCinema.model.Reduction;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author augus
 */
public class ReductionController extends MotherController {
    
    public void doWriteReduc(Reduction _Reduc) {
        InitController();
        dao.WriteReduc(_Reduc.getAgeMax(), _Reduc.getAgeMin(), _Reduc.getNbPlace(),_Reduc.getTaux() , _Reduc.getTitreReduc(), _Reduc.getDateSup(), _Reduc.getDateInf());
    }
    
    public ArrayList<Reduction> getReduc() throws SQLException {
        InitController();
        return dao.getReductions();
    }
    
    public void destroyReduc(String _ReducTitle) {
        InitController();
        dao.DeleteReduc(_ReducTitle);
    }
}
