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
public class Client {
    int m_IdClient, m_Admin;
    String m_NomClient, m_PrenomClient, m_MailClient, m_MdpClient, m_NumTelClient;
    Date m_DateNaissanceClient;

    public int getAdmin() {
        return m_Admin;
    }

    public void setAdmin(int Admin) {
        this.m_Admin = Admin;
    }

    public int getIdClient() {
        return m_IdClient;
    }

    public void setIdClient(int _IdClient) {
        this.m_IdClient = _IdClient;
    }

    public void setDateNaissanceClient(Date _DateNaissanceClient) {
        this.m_DateNaissanceClient = _DateNaissanceClient;
    }

    public Date getDateNaissanceClient() {
        return m_DateNaissanceClient;
    }

    public void setMailClient(String _MailClient) {
        this.m_MailClient = _MailClient;
    }

    public String getMailClient() {
        return m_MailClient;
    }

    public void setMdpClient(String _MdpClient) {
        this.m_MdpClient = _MdpClient;
    }

    public String getMdpClient() {
        return m_MdpClient;
    }

    public void setNomClient(String _NomClient) {
        this.m_NomClient = _NomClient;
    }

    public String getNomClient() {
        return m_NomClient;
    }

    public void setPrenomClient(String _PrenomClient) {
        this.m_PrenomClient = _PrenomClient;
    }

    public String getPrenomClient() {
        return m_PrenomClient;
    }

    public void setNumTelClient(String _NumTelClient) {
        this.m_NumTelClient = _NumTelClient;
    }

    public String getNumTelClient() {
        return m_NumTelClient;
    }
    
    
}
