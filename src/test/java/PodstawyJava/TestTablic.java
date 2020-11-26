package PodstawyJava;

import org.testng.annotations.Test;

public class TestTablic {

    @Test
    public void testTablic(){

        Tablice tab = new Tablice();

        tab.ustawWartosci();
        tab.wypiszElementyTavlicy();

        tab.dodajStudenta();
        tab.przedstawStudentow();

    }
}
