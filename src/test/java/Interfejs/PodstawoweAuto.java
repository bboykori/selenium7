package Interfejs;

public class PodstawoweAuto implements Auto {

    private String model = "Tipo";
    private String marka = "Fiat";


    //Metoda specyficzna dla klasy (nie wymagan aprzez interfejs)

    public void metodaSpecyficzna(){

        System.out.println("Wykonujemy metode specyficzna w klasie Powdstawowowe auto"+marka+model);


    }





    @Override
    public void jedz() {
        System.out.println("Jedziesz podstawowym");

    }

    @Override
    public void zatrzymaj() {
        System.out.println("Zatrzymujesz podstwowe");

    }

    @Override
    public void otworzSzybe() {
        System.out.println("Kręcisz korba, aby otworzyc szybe");

    }

    @Override
    public void zmienBieg() {
        System.out.println("zmieniaz bieg manulanie");

    }
}
