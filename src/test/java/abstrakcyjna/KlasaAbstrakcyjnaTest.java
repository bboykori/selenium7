package abstrakcyjna;

import org.testng.annotations.Test;

public class KlasaAbstrakcyjnaTest {


    @Test
    public void testKlasyAbstrakcyjnej(){
        Pies reksio = new Pies();

        reksio.poruszajSie();
        reksio.napijSieWody();
        reksio.wypiszPrzysmak();

        Ptak tweety = new Ptak();
        tweety.poruszajSie();
        tweety.napijSieWody();
        tweety.wypiszPrzysmak();




    }
}
