package PodstawyJava;

import org.testng.annotations.Test;

public class Switch {

    @Test
    public void testSwitch(){

        wypiszDzienTygodnia(0);


    }



    public void wypiszDzienTygodnia(int dzienTygodnia){

        switch (dzienTygodnia){

            case 1:
                System.out.println("Jest Pn");
                break;
            case 2:
                System.out.println("Jest Wt");
                break;
            case 3:
                System.out.println("Jest Sr");
                break;
            case 4:
                System.out.println("Jest Czw");
                break;
            case 5:
                System.out.println("Jest Pt");
                break;
            case 6:
                System.out.println("Jest Sb");
                break;
            case 7:
                System.out.println("Jest Nd");
                break;
            default:
                System.out.println("Bledna wartosc");




        }


    }


}
