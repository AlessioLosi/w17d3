package com.w17d3.Composite;

import java.util.ArrayList;
import java.util.List;

public class Sezioni {
    private List<Sezioni> sottosezioni;
    private List<Pagine> pagineSezione;

    public Sezioni() {
        this.sottosezioni = new ArrayList<Sezioni>();
        this.pagineSezione = new ArrayList<Pagine>();
    }

    public void add(Sezioni element) {
        sottosezioni.add(element);
    }

    public void remove(Sezioni sezione) {
        sottosezioni.remove(sezione);
    }

    public void add(Pagine pagine) {
        pagineSezione.add(pagine);
    }

    public void remove(Pagine pagine) {
        pagineSezione.remove(pagine);
    }


    public List<Sezioni> getsottosezioni() {
        return sottosezioni;
    }

    public List<Pagine> getpagineSezione() {
        return pagineSezione;
    }

    @Override
    public String toString() {
        return "Sezioni{" +
                "sottosezioni=" + sottosezioni +
                ", pagineSezione=" + pagineSezione +
                '}';
    }
}
