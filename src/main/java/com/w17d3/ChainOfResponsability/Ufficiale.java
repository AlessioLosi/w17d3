package com.w17d3.ChainOfResponsability;


abstract public class Ufficiale {
    protected Ufficiale nextUfficiale;

    public Ufficiale(Ufficiale nextUfficiale) {
        this.nextUfficiale = nextUfficiale;
    }

    public Ufficiale() {
    }

    public void cercaStipendio(int importo) {
        if (stipendio(importo)) {
            risposta("percepisco" + importo + " euro al mese");
        } else if (nextUfficiale != null) {
            nextUfficiale.stipendio(importo);
            nextUfficiale.risposta("percepisco uno stipedio di " + importo + "euro al mese");

        } else {
            System.out.println("Nessuno percepisce uno stipendio di " + importo + " euro");
        }

    }

    protected abstract boolean stipendio(int stipendio1);

    protected abstract void risposta(String risp);
}
