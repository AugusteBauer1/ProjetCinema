/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appCinema.controller;

import appCinema.model.DaoInterface;
import appCinema.model.DatabaseClient;

/**
 *
 * @author augus
 */
public class MotherController {
    
    protected DaoInterface dao;
    
     protected void InitController() {
        DatabaseClient daoInit = DatabaseClient.getDatabaseClient();
        daoInit.setConnection();
        this.dao = daoInit.getDaoInterface();
    }
}
