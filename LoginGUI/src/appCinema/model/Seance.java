/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appCinema.model;

import java.util.Date;

/**
 *
 * @author augus
 */
public class Seance {
    
    int m_IdSeance, m_IdFilmSeance, m_IdSalleSeance;
    Date m_DebutSeance, m_FinSeance;

    public void setDebutSeance(Date _DebutSeance) {
        this.m_DebutSeance = _DebutSeance;
    }

    public Date getDebutSeance() {
        return m_DebutSeance;
    }

    public void setFinSeance(Date _FinSeance) {
        this.m_FinSeance = _FinSeance;
    }

    public Date getFinSeance() {
        return m_FinSeance;
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
