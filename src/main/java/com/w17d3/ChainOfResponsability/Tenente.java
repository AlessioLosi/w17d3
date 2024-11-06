package com.w17d3.ChainOfResponsability;

public class Tenente extends Ufficiale {
    public Tenente(Ufficiale nextUfficiale) {
        super(nextUfficiale);
    }

    @Override
    protected boolean stipendio(int stipendio1) {
        return stipendio1 == 1000;
    }

    @Override
    protected void risposta(String risp) {
        System.out.println("percepisco 1000 euro al mese");
    }
}
