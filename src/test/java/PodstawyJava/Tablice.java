package PodstawyJava;

public class Tablice {

    int liczby[] = new int[5];

    public void ustawWartosci(){

        liczby[0] = 1;
        liczby[1] = 10;
        liczby[2] = 25;
        liczby[3] = 100;
        liczby[4] = 150;


    }


    public void wypiszElementyTavlicy(){

        for (int i=0; i<liczby.length;i++){

            System.out.println(liczby[i]);
        }

    }

    Student studenci[] = new Student[2];
    public void dodajStudenta(){
        Student pierwszy = new Student("Tomasz", "Kot", "Z");
        Student drugi = new Student("Jan", "Kowalski", "X");
        studenci[0]=pierwszy;
        studenci[1]=drugi;

    }

    public void przedstawStudentow(){

        try{
            studenci[0].przedstawsie();
            studenci[1].przedstawsie();
            //studenci[2].przedstawsie();
            System.out.println("Tutaj robie cos innego");

        } catch (ArrayIndexOutOfBoundsException ex) {

            System.out.println( "Wsytapil wyjatek, idowlujesz sie do relemntu tablicy ktorgo niema");

        } finally {
            System.out.println("Tuta robie cos jescz einnego z bloku finally");
        }





    }


}
