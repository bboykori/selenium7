package kolekcje;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Mapy {


    Map<Integer,String> dziennik = new HashMap<Integer,String>();

    public void dodajUczniow(){

        dziennik.put(1, "Kowalska");
        dziennik.put(2, "Nowak");
        dziennik.put(3, "Kruczek");
        dziennik.put(4,"Jastrzab");


    }
    @Test
    public void testMapy(){
dodajUczniow();
        System.out.println(dziennik.size());
        dziennik.remove(1);
        System.out.println(dziennik.size());
        System.out.println(dziennik.get(2));
        System.out.println(dziennik.containsKey(3));
        iterateUsingEntrySet(dziennik);

            
        }


    public void iterateUsingEntrySet(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }





        
    }


