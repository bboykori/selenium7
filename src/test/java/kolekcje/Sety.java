package kolekcje;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class Sety {

    Set<String> nicks = new HashSet<String>();

    public void dodajuzytkownikow(){
        nicks.add("Ponury zniwiarz");
        nicks.add("Wesoly chlopak");
        nicks.add("Czarna Owca");
        nicks.add("swinka pepa");


    }
    @Test
    public void testSetow(){
        dodajuzytkownikow();
        nicks.add("kolejny user");
        System.out.println(nicks.size());
        System.out.println(nicks.contains("Ponury zniwiarz"));
        nicks.remove("Ponury zniwiarz");
        System.out.println(nicks.size());
        nicks.forEach((e) -> { System.out.println(e); });

    }

}
