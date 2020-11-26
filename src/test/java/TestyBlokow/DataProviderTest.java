package TestyBlokow;

import com.phptravels.helpers.MyExcelReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class DataProviderTest {

    @Test(dataProvider = "getData")
    public void dataProviderTest(String city, String checkIn, String checkOut, String hotelName1, String price1, String hotelName2, String price2,
                                 String hotelName3,   String price3){
        System.out.println(checkIn);
//        System.out.println(b);
//        System.out.println(c);

    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = null;
        try {
            data = MyExcelReader.myExcelReaderForDataProvider("Z:\\Dane.xlsx",true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
