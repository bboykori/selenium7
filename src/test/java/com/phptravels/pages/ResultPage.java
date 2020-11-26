package com.phptravels.pages;

import com.phptravels.helpers.MySeleniumMethods;
import com.phptravels.tests.BaseSeleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
//import java.util.logging.Logger;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

public class ResultPage extends BaseSeleniumTest {

    @FindBy(xpath = "//table[@class='bgwhite table table-striped']")
    private WebElement resultTable;

    private Logger log = Logger.getLogger(ResultPage.class);

    private WebDriver driver;


    public ResultPage (WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;

    }

    public List<String> getHotelNames (){
        log.info("Checking hotel names");
        MySeleniumMethods.waitForWebElementBy(By.xpath("//h4//b"),10,driver);
        List<WebElement> hotelNames = resultTable.findElements(By.xpath("//h4//b"));
        List<String> hotelNamesString = new ArrayList<String>();
        for (WebElement hotelName:hotelNames
        ) {
            hotelNamesString.add(hotelName.getText());
            log.info(hotelName.getText());
        }
        return hotelNamesString;

    }

    public List<String> getHotelPrices (){
        List<WebElement> hotelPrices = resultTable.findElements(By.xpath("//div[contains(@class,'price_tab')]//b"));
        List<String> hotelPricesString = hotelPrices.stream().map(hotelPrice -> hotelPrice.getText()).collect(Collectors.toList());
        return hotelPricesString;
    }







}
