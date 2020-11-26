package Interfejs;

public class AutoPremium implements Auto{


    @Override
    public void jedz() {
        System.out.println("Jedziesz autem premium");
    }

    @Override
    public void zatrzymaj() {

        System.out.println("zatrzymujesz premium");

    }

    @Override
    public void otworzSzybe() {

        System.out.println("Szyba elektrycznie");

    }

    @Override
    public void zmienBieg() {

        System.out.println("Zmieniamy bieg autoimatycznie");

    }

    public void specyficznaMeotdaDlaPremium(){

        System.out.println("Masz premium jestes gosc!");



    }





}
