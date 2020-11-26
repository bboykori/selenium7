package PodstawyJava;

import java.util.ArrayList;
import java.util.List;

public class Student {

    public String imie;
    public String nazwisko;
    public String grupa;

    public static List<Student> listaStudentow = new ArrayList<Student>();

    public void przedstawsie(){

        System.out.println("Część nazywam się " + imie + " " +nazwisko);


    }

    public String przedstawsie_return(){

        return "Część nazywam się " + imie + " " +nazwisko;


    }


    public Student(){
System.out.println("Tu działa konstruktor podstawowy w klasie PodstawyJava.Student");
listaStudentow.add(this);

    }


    public Student (String noweImie, String noweNazwisko, String nowaGrupa){
        System.out.println("Tu działa konstruktor z parametrami w klasie PodstawyJava.Student");
        listaStudentow.add(this);

        imie = noweImie;
        nazwisko = noweNazwisko;
        grupa = nowaGrupa;



    }


}
