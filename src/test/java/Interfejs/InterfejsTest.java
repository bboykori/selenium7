package Interfejs;

import org.testng.annotations.Test;

public class InterfejsTest {


    @Test
    public void interfejsTestujemy(){

        PodstawoweAuto autoBasic = new PodstawoweAuto();

        autoBasic.jedz();
        autoBasic.otworzSzybe();
        autoBasic.metodaSpecyficzna();

        AutoPremium lepszeAuto = new AutoPremium();
        lepszeAuto.jedz();
        lepszeAuto.zmienBieg();
        lepszeAuto.specyficznaMeotdaDlaPremium();

        System.out.println("\n");


        AutoPremium autoPremium = new AutoPremium();
        zaprezentujAuto(autoPremium);

        PodstawoweAuto podstawoweAuto = new PodstawoweAuto();
        zaprezentujAuto(podstawoweAuto);




    }

    public void zaprezentujAuto (AutoPremium autoPremium){
        System.out.println("Prezentuje auto premium");
        autoPremium.jedz();
        autoPremium.zatrzymaj();


    }

    public void zaprezentujAuto (PodstawoweAuto podstawoweAuto){
        System.out.println("Prezentuje auto basic");
        podstawoweAuto.jedz();
        podstawoweAuto.zatrzymaj();

    }






}
