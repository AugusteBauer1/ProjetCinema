/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appCinema.model;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author augus
 */
public class Seance {
    
    int m_IdSeance, m_IdFilmSeance, m_IdSalleSeance;
    Date DaySeance;
    LocalTime m_debutSeance;

    public Seance(int m_IdSeance, int m_IdFilmSeance, int m_IdSalleSeance, Date DaySeance, LocalTime m_debutSeance) {
        this.m_IdSeance = m_IdSeance;
        this.m_IdFilmSeance = m_IdFilmSeance;
        this.m_IdSalleSeance = m_IdSalleSeance;
        this.DaySeance = DaySeance;
        this.m_debutSeance = m_debutSeance;
    }


    public void setDaySeance(Date _DaySeance) {
        this.DaySeance = _DaySeance;
    }

    public Date getDaySeance() {
        return DaySeance;
    }

    public void setDebutSeance(LocalTime _DebutSeance) {
        this.m_debutSeance = _DebutSeance;
    }

    public LocalTime getDebutSeance() {
        return m_debutSeance;
    }

    public void setIdFilmSeance(int _IdFilmSeance) {
        this.m_IdFilmSeance = _IdFilmSeance;
    }

    public int getIdFilmSeance() {
        return m_IdFilmSeance;
    }

    public void setIdSalleSeance(int _IdSalleSeance) {
        this.m_IdSalleSeance = _IdSalleSeance;
    }

    public int getIdSalleSeance() {
        return m_IdSalleSeance;
    }

    public void setIdSeance(int _IdSeance) {
        this.m_IdSeance = _IdSeance;
    }

    public int getIdSeance() {
        return m_IdSeance;
    }
    
    
    
}
