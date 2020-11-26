package com.phptravels.tests;
import com.phptravels.helpers.MyExcelReader;
import com.phptravels.helpers.TestListener;
import com.phptravels.pages.HomePage;
import com.phptravels.pages.ResultPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;

@Listeners(TestListener.class)
public class SearchHotelTest extends BaseSeleniumTest {


    @Test(dataProvider="getData")
    public void searchHotelTest(String city, String checkIn, String checkOut, String hotelName1,
     String price1, String hotelName2, String price2, String hotelName3, String price3) throws InterruptedException, IOException {

        testReporter.set(reports.createTest("Search Hotel Test"+checkIn)) ;
        driver.get("http://www.kurs-selenium.pl/demo/");
        HomePage homePage = new HomePage(driver);
        testReporter.get().info("On PHP Travels Home Page", getScreenShot());
        ResultPage resultPage = new ResultPage(driver);
        homePage.setCityHotel(city);
        homePage.setSetDateRange(checkIn, checkOut);
        homePage.addAdult(4);
       // System.out.println(TestyBlokow.MySeleniumMethods_old.takeScreenShotForReport(driver));
        homePage.addChild(6);
        testReporter.get().info("Before performing search for " + city + " for date range from " + checkIn + " to " +checkOut,getScreenShot());
        homePage.performSearch();
        testReporter.get().info("After performing search",getScreenShot());
//        List<String> hotelNamesResult = resultPage.getHotelNames();
//        CzytaniePliku czytaniePliku = new CzytaniePliku();
//        List<String> daneZpliku_hotelNames = czytaniePliku.czytaniePliku("C:\\pliki_z_kursu\\Nazwy_hoteli.txt");
//        for (int i=0; i<daneZpliku_hotelNames.size();i++){
//            System.out.println("Sparwadzam: "+daneZpliku_hotelNames.get(i));
//            Assert.assertEquals(hotelNamesResult.get(i),daneZpliku_hotelNames.get(i));
//        }
//
//        List<String> hotelPricesResult = resultPage.getHotelPrices();
//        List<String> daneZpliku_ceny = czytaniePliku.czytaniePliku("C:\\pliki_z_kursu\\ceny_hoteli.txt");
//        for (int i=0;i<daneZpliku_ceny.size();i++){
//            System.out.println("Sprawdzam: "+daneZpliku_ceny.get(i));
//            Assert.assertEquals(hotelPricesResult.get(i),daneZpliku_ceny.get(i));
//        }
        testReporter.get().info("Cheching hotel names and prices",getScreenShot());



        List<String> hotelNamesResult = resultPage.getHotelNames();
        Assert.assertEquals(hotelNamesResult.get(0),hotelName1);
        Assert.assertEquals(hotelNamesResult.get(1),hotelName2);
        Assert.assertEquals(hotelNamesResult.get(2),hotelName3);

        List<String> hotelPricesResult = resultPage.getHotelPrices();
        Assert.assertEquals(hotelPricesResult.get(0),price1);
        Assert.assertEquals(hotelPricesResult.get(1),price2);
        Assert.assertEquals(hotelPricesResult.get(2),price3);
//        System.out.println("dane z Excela:");
//        System.out.println(daneZExcela.length);
//        for (int y=1;y<daneZExcela[0].length;y++){
//            System.out.println("");
//            for(int x=1;x<daneZExcela.length;x++){
//                System.out.print(daneZExcela[x][y]+"\t\t\t");
//            }
//        }
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
