package PodstawyJava;

import org.testng.annotations.Test;

public class Metody {

    public void Metoda1(){

        int a = 2;
        int b = 3;

        System.out.println(a+b);

    }

    public int suma(){

        int a = 2;
        int b = 3;
        return a+b;


    }

    int wynik = suma();

    public Student pobierzDaneStudenta(){

        Student trzeciSrtudent = new Student();
        trzeciSrtudent.imie = "Tomasz";
        trzeciSrtudent.nazwisko = "Kot";
        trzeciSrtudent.grupa = "B";
        return trzeciSrtudent;



    }




    @Test
    public void testMetod(){

        Metoda1();
        System.out.println(suma());
        System.out.println(wynik);


        Student czwartyStudent = pobierzDaneStudenta();
        System.out.println(czwartyStudent.imie + czwartyStudent.nazwisko + czwartyStudent.grupa);

    }


}
