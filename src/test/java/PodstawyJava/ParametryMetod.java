package PodstawyJava;

import org.testng.annotations.Test;

public class ParametryMetod {

    public int suma(int pierwsza, int druga){


        return pierwsza + druga;
    }


    @Test
    public void testParametrow(){


        System.out.println(suma(100,55));



    }
}
