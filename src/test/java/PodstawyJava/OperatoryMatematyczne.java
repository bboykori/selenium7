package PodstawyJava;

import org.testng.annotations.Test;

public class OperatoryMatematyczne {

    @Test
    public void testOperatory() {

        int pierwsza = 5;
        int druga = 2;

        int sumaa = pierwsza + druga;

        int roznica = pierwsza - druga;

        int iloczyn = pierwsza * druga;

        int iloraz = pierwsza / druga;

        int modulo = pierwsza % druga;

        System.out.println(sumaa);
        System.out.println(roznica);
        System.out.println(iloczyn);
        System.out.println(iloraz);
        System.out.println(modulo);



    }

}
