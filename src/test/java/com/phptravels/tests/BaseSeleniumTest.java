package com.phptravels.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.phptravels.drivers.DriverFactory;
import com.phptravels.drivers.DriverType;
import com.phptravels.helpers.MySeleniumMethods;
import com.phptravels.exceptions.NoSuchDriverException;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.IOException;

public abstract class BaseSeleniumTest {

    private Logger log = Logger.getLogger(BaseSeleniumTest.class);

    //public static WebDriver driverForListener;
    public static ThreadLocal<WebDriver> driverForListener = new ThreadLocal<>();


    protected WebDriver driver;
   // protected TestyBlokow.MySeleniumMethods_old mySeleniumMethods = new TestyBlokow.MySeleniumMethods_old();
    protected static ExtentHtmlReporter reporter;
    public static ExtentReports reports;
    //public static ExtentTest testReporter;
    public static ThreadLocal<ExtentTest> testReporter = new ThreadLocal<>();


    @BeforeSuite
    public void setUpReporter(){
        reporter = new ExtentHtmlReporter("src//test//resources//reports//index.html");
        reports = new ExtentReports();
        reports.attachReporter(reporter);
    }

    @BeforeMethod
    public void setUp() throws NoSuchDriverException {
        log.debug("Before Method");
       // System.out.println("Before Mrthod");
        driver = DriverFactory.getDriver(DriverType.CHROME); // OPTIONS: CHROME, FIREFOX, IE
        driverForListener.set(driver);

    }

    @AfterMethod
    public void tearDown()
    {
        log.debug("After Method");
       // System.out.println("After Method");
        driver.quit();
        DriverFactory.resetDriver();
    }

    @AfterSuite
    public void tearDownReporter(){
        reporter.flush();
        reports.flush();
    }

    public static MediaEntityModelProvider getScreenShot() throws IOException {
        return MediaEntityBuilder.createScreenCaptureFromPath(MySeleniumMethods.takeScreenShotForReport(driverForListener.get())).build();
    }
}
