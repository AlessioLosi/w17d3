package com.w17d3.ChainOfResponsability;

public class Capitano extends Ufficiale {
    public Capitano(Ufficiale nextUfficiale) {
        super(nextUfficiale);
    }

    @Override
    protected boolean stipendio(int stipendio1) {
        return stipendio1 == 2000;
    }

    @Override
    protected void risposta(String risp) {
        System.out.println(risp);
    }
}
