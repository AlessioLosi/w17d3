package com.w17d3.Composite;

public class Autori {
    private String nome;
    private String cognome;

    public Autori(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String nome() {
        return nome;
    }

    public String cognome() {
        return cognome;
    }

    @Override
    public String toString() {
        return "Autori{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }
}
