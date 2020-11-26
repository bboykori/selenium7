package PodstawyJava;

import org.testng.annotations.Test;

public class Konstruktor {

    @Test
    public void testKonstruktor(){

        Student piatyStudent = new Student();

        Student szostyStudent = new Student("Bartosz","Trosisnki","D");

        String wynikPrzedstawsie = szostyStudent.przedstawsie_return();

                szostyStudent.przedstawsie();
        System.out.println(wynikPrzedstawsie);







    }




}
