package com.w17d3.ChainOfResponsability;

public class Maggiore extends Ufficiale {
    public Maggiore(Ufficiale nextUfficiale) {
        super(nextUfficiale);
    }

    @Override
    protected boolean stipendio(int stipendio1) {
        return stipendio1 == 3000;
    }

    @Override
    protected void risposta(String risp) {
        System.out.println(risp);
    }
}
