package com.phptravels.pages;

import com.phptravels.helpers.TestListener;
import com.phptravels.tests.BaseSeleniumTest;
import com.phptravels.helpers.MySeleniumMethods;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseSeleniumTest {

    @FindBy (xpath = "//span[text()='Search by Hotel or City Name']")
    private WebElement searchSpan;

    @FindBy (xpath = "//div[@id='select2-drop']/div/input")
    private WebElement searchCityInput;

    @FindBy (name = "checkin")
    private WebElement checkInInput;

    @FindBy (name = "checkout")
    private WebElement checkOutInput;

    @FindBy (id = "travellersInput")
    private WebElement travelersInput;

    @FindBy (id = "adultPlusBtn")
    private WebElement addAdultButton;

    @FindBy (id = "childPlusBtn")
    private WebElement addChildButton;

    @FindBy (xpath = "//button[text()=' Search']")
    private WebElement searchButton;



    @FindBy (xpath = "//span[@class='select2-match']")
    private WebElement selectResult;

    private WebDriver driver;

    private Logger log = Logger.getLogger(HomePage.class);


    public HomePage (WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;

    }

    public void setCityHotel(String cityName)  {
        log.info("Setting City name");
        searchSpan.click();
        searchCityInput.sendKeys(cityName);
        MySeleniumMethods.waitForWebElement(selectResult,10, driver);
        selectResult.click();
        log.info("City names has been set");
    }

    public void setSetDateRange (String checkInDate,String checkOutDate){
        log.info("setting date range");
        checkInInput.sendKeys(checkInDate);
        checkInInput.click();
        checkOutInput.sendKeys(checkOutDate);
        checkOutInput.click();
        log.info("date range has been set");
    }

    public void addAdult (int quantity)  {
        log.info("Adding adults");
        travelersInput.click();
        MySeleniumMethods.waitForWebElement(addAdultButton,10,driver);
        for (int i=0; i<quantity;i++){
            addAdultButton.click();
        }
        travelersInput.click();
        MySeleniumMethods.waitForWebElementInvisibility(addAdultButton,10,driver);
        log.info("Adults added");
    }

    public void addChild (int quantity)  {
        log.info("Adding child");
        travelersInput.click();
        MySeleniumMethods.waitForWebElement(addChildButton,10,driver);
        for (int i=0; i<quantity;i++){
            addChildButton.click();
        }
        travelersInput.click();
        MySeleniumMethods.waitForWebElementInvisibility(addChildButton,10,driver);
        log.info("Children added");
    }

    public void performSearch (){
        searchButton.click();
        log.info("search button pressed");

    }



}


