package PodstawyJava;

import org.testng.annotations.Test;

public class PetlaDoWhile {



    @Test
     public void testDoWhile() {

         int zmienna = 3;
         do {
             System.out.println(zmienna);
             zmienna++;


         } while (zmienna<10);


     }
}
