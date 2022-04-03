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
public class Reduction {
    private int m_IdReduc, m_AgeMax, m_AgeMin, m_NbPlace;
    private float m_Taux;
    private String m_TitreReduc;
    private Date m_DateSup, m_DateInf;
    
    public Reduction(int _IdReduc,int _AgeMax,int _AgeMin, int _NbPlace, float _Taux, String _TitreReduc, Date _DateSup,Date _DateInf) {
        m_IdReduc = _IdReduc;
        m_NbPlace = _NbPlace;
        m_AgeMax = _AgeMax;
        m_AgeMin = _AgeMin;
        m_Taux = _Taux;
        m_DateInf = _DateInf;
        m_DateSup = _DateSup;
        m_TitreReduc = _TitreReduc;
    }

    public int getAgeMax() {
        return m_AgeMax;
    }

    public void setAgeMax(int m_AgeMax) {
        this.m_AgeMax = m_AgeMax;
    }

    public int getAgeMin() {
        return m_AgeMin;
    }

    public void setAgeMin(int m_AgeMin) {
        this.m_AgeMin = m_AgeMin;
    }

    public Date getDateInf() {
        return m_DateInf;
    }

    public void setDateInf(Date m_DateInf) {
        this.m_DateInf = m_DateInf;
    }

    public Date getDateSup() {
        return m_DateSup;
    }

    public void setDateSup(Date m_DateSup) {
        this.m_DateSup = m_DateSup;
    }

    public int getIdReduc() {
        return m_IdReduc;
    }

    public int getNbPlace() {
        return m_NbPlace;
    }

    public void setNbPlace(int m_NbPlace) {
        this.m_NbPlace = m_NbPlace;
    }

    public String getTitreReduc() {
        return m_TitreReduc;
    }

    public void setTitreReduc(String m_TitreReduc) {
        this.m_TitreReduc = m_TitreReduc;
    }

    public void setTaux(float m_Taux) {
        this.m_Taux = m_Taux;
    }

    public float getTaux() {
        return m_Taux;
    }
    
}
