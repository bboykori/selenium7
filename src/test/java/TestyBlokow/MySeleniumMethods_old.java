package TestyBlokow;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class MySeleniumMethods_old {

    // CheckIfElementExist - bylo na kursie, ale chyba bez sensu, bo sa przeciez asercje
    public boolean checkIfElementExist(By locator, WebDriver driver) {
        if (driver.findElements(locator).size() > 0) {
            System.out.println("Eleemtn istnieje na stronie");
            return true;
        } else {
            System.out.println("Eleemtnu niema na stronie");
            return false;
        }
    }

    //Switch to new window
    public void switchToNewWindow(WebDriver driver) {
        String currentHandle = driver.getWindowHandle();
        // System.out.println("Current handle ze srodka metody switchToNewWindow to "+currentHandle);
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles
        ) {
            //System.out.println("To jest iteracja for each handle dla "+handle);
            if (!currentHandle.equals(handle)) {
                //System.out.println("currentHandle to "+currentHandle);
                // System.out.println("Przelaczam okno na "+handle);
                driver.switchTo().window(handle);
            }

        }

    }


    //Explicit wait for visibilityOfElementLocatedBy
    public void waitForWebElementBy(By locator, int timeout, WebDriver driver) {

        Wait<WebDriver> wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    //Explicit wait for visibilityOfElementLocated
    public void waitForWebElement(WebElement webElement, int timeout, WebDriver driver) {

        Wait<WebDriver> wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOf(webElement));

    }


    //Take screenshot
    public void takeScreenShot(WebDriver driver){

        try {
            TakesScreenshot screenshoter = (TakesScreenshot) driver;
            File screenshot = screenshoter.getScreenshotAs(OutputType.FILE);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss.SSS");
            LocalDateTime now = LocalDateTime.now();
            Files.copy(screenshot.toPath(), Paths.get("src/test/resources/"+dtf.format(now)+".png"));
        } catch (IOException e) {
            System.out.println("Nie znaleziono pliku");
        }
    }

}
