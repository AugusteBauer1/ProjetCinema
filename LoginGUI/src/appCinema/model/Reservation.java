/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appCinema.model;

/**
 *
 * @author augus
 */
public class Reservation {
    int m_IdResa, m_IdResaSeance, m_IdResaClients, m_ResaNbPlace;
    float m_MontantResa;

    public void setIdResa(int _IdResa) {
        this.m_IdResa = _IdResa;
    }

    public int getIdResa() {
        return m_IdResa;
    }

    public void setIdResaClients(int _IdResaClients) {
        this.m_IdResaClients = _IdResaClients;
    }

    public int getIdResaClients() {
        return m_IdResaClients;
    }

    public void setIdResaSeance(int _IdResaSeance) {
        this.m_IdResaSeance = _IdResaSeance;
    }

    public int getIdResaSeance() {
        return m_IdResaSeance;
    }

    public void setMontantResa(float _MontantResa) {
        this.m_MontantResa = _MontantResa;
    }

    public float getMontantResa() {
        return m_MontantResa;
    }

    public void setResaNbPlace(int _ResaNbPlace) {
        this.m_ResaNbPlace = _ResaNbPlace;
    }

    public int getResaNbPlace() {
        return m_ResaNbPlace;
    }
    
    
}
