package PodstawyJava;

import org.testng.annotations.Test;

public class OperatoryLogicznePorownawcze {

    @Test
    public void testOperatorow(){

        int liczbaA = 2;
        int liczbaB = 5;
        System.out.println(liczbaA>liczbaB);
        System.out.println(liczbaA==liczbaB);
        System.out.println("\n");
        System.out.println(1>0 || 2>3);


    }
}
