/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appCinema.controller;

import appCinema.model.Seance;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author augus
 */
public class SessionController extends MotherController{
    
    public void writeSession(int IdFilm, int idSalle, Date debut, LocalTime tempsDeb) {
        InitController();
        dao.WriteSeance(IdFilm, idSalle, debut, tempsDeb);
    }
    
    public ArrayList<Seance> getAllSeances() {
        InitController();
        return dao.GetSeances();
    }
    
    public void destroySession(int id) {
        InitController();
        dao.deleteSession(id);
    }
    
    public ArrayList<Seance> getSeanceFromId(int id) {
        InitController();
        ArrayList<Seance> RealOne = dao.GetSeances();
        ArrayList<Seance> JustId = new ArrayList<>();
        for(int i = 0;i<RealOne.size();i++) {
            if(RealOne.get(i).getIdFilmSeance() == id) {
                JustId.add(RealOne.get(i));
            }
        }
        return JustId;
    }
}
