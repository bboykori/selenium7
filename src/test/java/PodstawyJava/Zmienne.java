package PodstawyJava;

import org.testng.annotations.Test;

public class Zmienne {

    //deklaracja zmiennych
    int pierwszaLiczba;
    int drugaLiczba;
    int suma;

    //dekl i inic

    String imie = "Damian";

    @Test
    public void suma() {
        //inicjalizacja zmiennej
        pierwszaLiczba = 7;
        drugaLiczba = 13;
        suma = pierwszaLiczba + drugaLiczba;
        System.out.println(suma);

    }
}
