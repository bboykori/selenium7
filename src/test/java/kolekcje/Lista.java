package kolekcje;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    List<String> imiona = new ArrayList<String>();

    List<Integer> numery = new ArrayList<Integer>();


    public void dodajImiona(){
        imiona.add("Adam");
        imiona.add("Maciej");
        imiona.add("Szymon");
    }

    public void ustawNumeryLotto(){
        numery.add(3);
        numery.add(Integer.valueOf(7));
        numery.add(Integer.valueOf(54));
        numery.add(Integer.valueOf(23));
        numery.add(Integer.valueOf(88));
        numery.add(Integer.valueOf(11));
    }


    @Test
    public void testListy(){
        dodajImiona();
        System.out.println(imiona.get(0));
        System.out.println(imiona.size());
       // imiona.remove("Adam");
        System.out.println(imiona.size());
        System.out.println(imiona.indexOf("Maciej"));
        imiona.forEach((String name) ->
        {
            System.out.println(name);
        });

        //String x = "Adam";
        //System.out.println(x.contains("dam"));
        System.out.println("\n");

        imiona.stream().filter(item -> (item.contains("a"))).forEach(System.out::println);
        System.out.println("\n");








    }



    @Test
    public void testLinkedListy(){
        ustawNumeryLotto();
        System.out.println(numery.get(0));
        System.out.println(numery.contains(2));
        System.out.println(numery.size());
        System.out.println(numery.remove(2));
        System.out.println(numery.size());
    }





}
