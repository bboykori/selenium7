package PodstawyJava;

import com.google.common.io.Files;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class CzytaniePliku {

    List<String> tekst = new ArrayList<String>();


    @Test
    public List<String> czytaniePliku(String filePath){
        tekst.clear();
        File plik = new File(filePath);
        try {
            BufferedReader reader = Files.newReader(plik, Charset.defaultCharset());

            String line = null;
            while ((line = reader.readLine())!=null){
                //System.out.println(line);
                tekst.add(line);





            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(tekst.size());
//        tekst.forEach((String name) ->
//        {
//            System.out.println(name);
//        });

        return tekst;


    }
}
