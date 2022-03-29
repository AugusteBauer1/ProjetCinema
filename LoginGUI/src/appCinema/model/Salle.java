/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appCinema.model;

/**
 *
 * @author augus
 */
public class Salle {
    int m_IdSalle, m_NbPlaceSalle;
    String m_SpecificationSalle;

    public void setIdSalle(int _IdSalle) {
        this.m_IdSalle = _IdSalle;
    }

    public int getIdSalle() {
        return m_IdSalle;
    }

    public void setNbPlaceSalle(int _NbPlaceSalle) {
        this.m_NbPlaceSalle = _NbPlaceSalle;
    }

    public int getNbPlaceSalle() {
        return m_NbPlaceSalle;
    }

    public void setSpecificationSalle(String _SpecificationSalle) {
        this.m_SpecificationSalle = _SpecificationSalle;
    }

    public String getSpecificationSalle() {
        return m_SpecificationSalle;
    }
    
    
}
