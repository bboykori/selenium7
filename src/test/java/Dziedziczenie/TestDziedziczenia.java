package Dziedziczenie;

import org.testng.annotations.Test;

public class TestDziedziczenia {

    @Test
    public void testDziedziczenia(){
        Dziecko kid = new Dziecko();
        kid.wypiszMojKolorOczu();
        kid.wypiszKolorWlosow();
        kid.wypiszTypCeryiSklonnosciDoTycia();

        if (kid.sklonnoscDoTycia == true)
        {
            System.out.println("Mam sklonnosci do tycia");
        }

        kid.probujePlywac();


    }


}
