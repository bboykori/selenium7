package PodstawyJava;

import org.testng.annotations.Test;

public class InstrukcjaIfElse {
    @Test
    public void testInstrukcji(){

sprawdzWiek(18);

    }


    public void sprawdzWiek(int wiek){

        if (wiek < 18)
        {
            System.out.println("Jestes za mlody, nie kupisz alko");
        }
        else
        {
            System.out.println("Oki kupis alko");
        }



    }

}
