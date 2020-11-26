package PodstawyJava;

import org.testng.annotations.Test;

public class StudentTest {


    @Test
    public void testStudent(){

        Student naszPierwszyStudent = new Student();
        naszPierwszyStudent.imie = "Adam";
        naszPierwszyStudent.nazwisko = "Adamowicz";
        naszPierwszyStudent.grupa = "A";

        naszPierwszyStudent.przedstawsie();

        Student drugiStudent = new Student("A","B","C");

        drugiStudent.przedstawsie();

        System.out.println("Tu bedzie foreach: \n");


//        List<PodstawyJava.Student> ss = new ArrayList<PodstawyJava.Student>();
//                ss.add(naszPierwszyStudent);
//        ss.add(drugiStudent);
//
//
//
//        for (PodstawyJava.Student s:ss)
//        {
//        s.przedstawsie();
//        }


        for (Student s: Student.listaStudentow)
        {
         s.przedstawsie();
        }





        //PodstawyJava.Student.class.getClass();





    }


}
