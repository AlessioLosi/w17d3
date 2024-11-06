package com.w17d3.Composite;

public class Pagine extends Sezioni {
    private int numeroPagina;

    public Pagine(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    @Override
    public String toString() {
        return "{" +
                "numeroPagina=" + numeroPagina +
                '}';
    }
}
