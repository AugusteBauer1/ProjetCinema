/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appCinema.controller;

import appCinema.model.Film;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author augus
 */
public class FilmController extends MotherController {

    public ArrayList<String> getFilmsTitle() throws SQLException {
        InitController();
        ArrayList<Film> films = dao.getFilms();
        ArrayList<String> titreFilms = new ArrayList<>();
        films.forEach(film -> titreFilms.add(film.getTitreFilm()));
        return titreFilms;
    }

    public ArrayList<Film> getFilms() throws SQLException {
        InitController();
        return dao.getFilms();
    }

    public Film getFilmFromId(int id) throws SQLException {
        InitController();
        ArrayList<Film> films = dao.getFilms();
        Film thisOne = null;
        for (int i = 0; i < films.size(); i++) {
            if (films.get(i).getIdfilm() == id) {
                thisOne = films.get(i);
            }
        }
        return thisOne;
    }
    
    public Film getFilmFromTitle(String _Titre) throws SQLException {
        InitController();
        ArrayList<Film> films = dao.getFilms();
        Film thisOne = null;
        for (int i = 0; i < films.size(); i++) {
            if (films.get(i).getTitreFilm().equals(_Titre)) {
                thisOne = films.get(i);
            }
        }
        return thisOne;
    }

    public void setNewFilm(Film film) {
        InitController();
        dao.WriteFilm(film.getTitreFilm(), film.getCategorieFilm(), film.getDureefilm(), film.getAnneeSortieFilm(), film.getNoteFilm());
    }

    public void destroyFilm(String filmTitle) {
        InitController();
        dao.DeleteClient(filmTitle);
    }
}
