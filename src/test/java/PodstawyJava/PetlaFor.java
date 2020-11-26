package PodstawyJava;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PetlaFor {
    @Test
    public void testFor(){

        for (int i=0; i < 5; i++)
        {
            System.out.println(i);
        }



        List<String> studenci = Arrays.asList("Tomek","Maciej","Asia","Basia");
/*
        for (String student:studenci)
        {
            System.out.println(student);
        }
*/

        System.out.println(studenci.get(2));

        for (int i=0;i< studenci.size();i++)
        {
            System.out.println(studenci.get(i));
        }






    }
}
