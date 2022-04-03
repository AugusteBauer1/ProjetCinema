/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appCinema.model;

/**
 *
 * @author augus
 */
public class Film {
    int m_Idfilm, m_Dureefilm, m_AnneeSortieFilm;
    float m_NoteFilm;
    String m_TitreFilm, m_CategorieFilm;
    
    public Film(int _Idfilm,int _Dureefilm,int _AnneeSortieFilm,float _NoteFilm,String _Titrefilm,String _CategorieFilm) {
        m_Idfilm = _Idfilm;
        m_Dureefilm = _Dureefilm;
        m_AnneeSortieFilm = _AnneeSortieFilm;
        m_NoteFilm = _NoteFilm;
        m_TitreFilm = _Titrefilm;
        m_CategorieFilm = _CategorieFilm;
    }
    
    public void DisplayConsoleFilm() {
        System.out.println(m_Idfilm);
        System.out.println(m_Dureefilm);
        System.out.println(m_AnneeSortieFilm);
        System.out.println(m_NoteFilm);
        System.out.println(m_TitreFilm);
        System.out.println(m_CategorieFilm);
    }

    public int getAnneeSortieFilm() {
        return m_AnneeSortieFilm;
    }

    public void setAnneeSortieFilm(int _AnneeSortieFilm) {
        this.m_AnneeSortieFilm = _AnneeSortieFilm;
    }

    public String getCategorieFilm() {
        return m_CategorieFilm;
    }

    public void setCategorieFilm(String _CategorieFilm) {
        this.m_CategorieFilm = _CategorieFilm;
    }

    public int getDureefilm() {
        return m_Dureefilm;
    }

    public void setDureefilm(int _Dureefilm) {
        this.m_Dureefilm = _Dureefilm;
    }

    public int getIdfilm() {
        return m_Idfilm;
    }

    public void setIdfilm(int _Idfilm) {
        this.m_Idfilm = _Idfilm;
    }

    public float getNoteFilm() {
        return m_NoteFilm;
    }

    public void setNoteFilm(float _NoteFilm) {
        this.m_NoteFilm = _NoteFilm;
    }

    public String getTitreFilm() {
        return m_TitreFilm;
    }

    public void setTitreFilm(String _TitreFilm) {
        this.m_TitreFilm = _TitreFilm;
    }
    
    
}
