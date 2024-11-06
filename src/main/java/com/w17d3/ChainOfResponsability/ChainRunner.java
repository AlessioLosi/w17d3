package com.w17d3.ChainOfResponsability;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        Ufficiale colonnello = new Colonnello();
        Ufficiale generale = new Generale(colonnello);
        Ufficiale maggiore = new Maggiore(generale);
        Ufficiale capitano = new Capitano(maggiore);
        Ufficiale tentente = new Tenente(capitano);

        tentente.cercaStipendio(5000);
    }
}
