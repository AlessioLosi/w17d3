package com.w17d3.ChainOfResponsability;

public class Generale extends Ufficiale {
    public Generale(Ufficiale nextUfficiale) {
        super(nextUfficiale);
    }

    @Override
    protected boolean stipendio(int stipendio1) {
        return stipendio1 == 5000;
    }

    @Override
    protected void risposta(String risp) {
        System.out.println(risp);
    }
}
