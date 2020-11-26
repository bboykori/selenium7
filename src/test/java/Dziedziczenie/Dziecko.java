package Dziedziczenie;

public class Dziecko extends Rodzic{

    protected String kolorOczu = "zielone";

    @Override
    public void probujePlywac(){
        System.out.println("Byc moze odzieidzyclem talen, ale jestem jesvze za mlody");

    }


    public void wypiszMojKolorOczu(){
        System.out.println("Moj kolor oczu to" + kolorOczu);

    }

    public  void  wypiszKolorWlosow(){
        System.out.println("Moj kolor wlosow to" + kolorWlosow);

    }

    public void wypiszTypCeryiSklonnosciDoTycia(){
        System.out.println("Moja cera jest"+ typCery+ " oraz moje sklonnosci do tycia to" + sklonnoscDoTycia);
    }

}
