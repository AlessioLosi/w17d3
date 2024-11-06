package com.w17d3.Composite;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titolo;
    private double prezzo;
    private List<Sezioni> sezioni;
    private List<Autori> autori;

    public Libro(String titolo, double prezzo) {
        this.titolo = titolo;
        this.prezzo = prezzo;
        this.sezioni = new ArrayList<Sezioni>();
        this.autori = new ArrayList<Autori>();
    }

    public String titolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public double prezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void add(Sezioni sezioni) {
        sezioni.add(sezioni);
    }

    public void remove(Sezioni sezione) {
        sezioni.remove(sezione);
    }

    public void add(Autori autore) {
        autori.add(autore);
    }

    public void remove(Autori autore) {
        autori.remove(autore);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", prezzo=" + prezzo +
                ", sezioni=" + sezioni +
                ", autori=" + autori +
                '}';
    }
}
