package PodstawyJava;

import org.testng.annotations.Test;

public class KonwersjaRzutowanie {

    @Test
    public void testKonwersja(){

        int a = 1;
        double b = 2.22;

        double c = a + b;

        int d = a + (int)b;

        System.out.println(c);
        System.out.println(d);

        String imie = "Damian ";
        String nazwisko = "Korecki";

        System.out.println(imie+nazwisko);

        String nazwisko2 = nazwisko.replace("Ko","Ty");
        System.out.println(imie+nazwisko2);




    }
}
