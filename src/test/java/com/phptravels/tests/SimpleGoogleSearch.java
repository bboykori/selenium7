package com.phptravels.tests;

import com.phptravels.helpers.TestListener;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(TestListener.class)
public class SimpleGoogleSearch extends BaseSeleniumTest{

    private Logger log = Logger.getLogger(SimpleGoogleSearch.class);

    @Test
    public void simpleGoogleSearch() throws IOException {

        testReporter.set(reports.createTest("Simple Google Search Test"));
        testReporter.get().info("Simple Google Search Test");
        System.out.println("Simple Google Search Test");
        log.info("Simple Google Search Test");
        driver.get("https://google.com");
        log.info("Google page opened");
        testReporter.get().info("Google page opened",getScreenShot());
        System.out.println("Google page opened");
        driver.switchTo().frame(0);
        WebElement googleButtonAgree = driver.findElement(By.xpath("//span[text()='Zgadzam się']"));
        googleButtonAgree.click();
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium");
        searchInput.sendKeys(Keys.ENTER);
        WebElement firstResult = driver.findElement(By.xpath("//div[@class='g']//a"));
        testReporter.get().info("Showing results of searching Selenium phrase",getScreenShot());
        log.info("Showing results of searching Selenium phrase");
        System.out.println("Showing results of searching Selenium phrase");
        firstResult.click();
        String expectedTitle = "SeleniumHQ Browser Automation";
        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }



}
