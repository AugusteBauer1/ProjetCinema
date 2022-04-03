/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appCinema.controller;

/**
 *
 * @author augus
 */
public class ResaController extends MotherController{
    
    public void writeNewresa(float _Montant, int IdSeance, int IdClient, int NbPlace) {
        InitController();
        dao.WriteResa(_Montant, IdSeance, IdClient, NbPlace);
    }
}
