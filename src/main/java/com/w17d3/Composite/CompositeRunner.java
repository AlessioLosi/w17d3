package com.w17d3.Composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Pagine pagina1 = new Pagine(1);
        Pagine pagina2 = new Pagine(2);
        Pagine pagina3 = new Pagine(3);
        Pagine pagina4 = new Pagine(4);
        Pagine pagina5 = new Pagine(5);
        Pagine pagina6 = new Pagine(6);

        Sezioni sezione1 = new Sezioni();
        Sezioni sezione2 = new Sezioni();
        Sezioni sezione3 = new Sezioni();
        Sezioni sezione4 = new Sezioni();
        Sezioni sezione5 = new Sezioni();
        Sezioni sezione6 = new Sezioni();
        Sezioni sezione7 = new Sezioni();

        Autori autore1 = new Autori("Autore", "1");
        Autori autore2 = new Autori("Autore", "2");
        Autori autore3 = new Autori("Autore", "3");
        Autori autore4 = new Autori("Autore", "4");
        Autori autore5 = new Autori("Autore", "5");

        Libro libro1 = new Libro("libro1", 10.5);
        Libro libro2 = new Libro("libro2", 12.5);
        Libro libro3 = new Libro("libro3", 15.5);
        sezione1.add(pagina1);
        sezione1.add(pagina2);
        sezione1.add(pagina3);
        sezione1.add(pagina4);
        sezione2.add(sezione1);
        libro1.add(autore1);
        libro1.add(autore2);
        libro1.add(sezione3);
        System.out.println(libro1);
        System.out.println(sezione2);


    }
}
