package com.w17d3.ChainOfResponsability;

public class Colonnello extends Ufficiale {
    public Colonnello(Ufficiale nextUfficiale) {
        super(nextUfficiale);
    }

    public Colonnello() {
    }

    @Override
    protected boolean stipendio(int stipendio1) {
        return stipendio1 == 4000;
    }

    @Override
    protected void risposta(String risp) {
        System.out.println(risp);

    }
}
