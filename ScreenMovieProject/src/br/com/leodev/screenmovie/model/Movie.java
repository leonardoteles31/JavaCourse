package br.com.leodev.screenmovie.model;

import br.com.leodev.screenmovie.calculations.Classifiable;

public class Movie extends Title implements Classifiable {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return 0;
    }
}
