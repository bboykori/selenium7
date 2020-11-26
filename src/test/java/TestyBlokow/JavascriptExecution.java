package TestyBlokow;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavascriptExecution extends BaseSeleniumTest{

        @Test
        public void googleSearchTest() throws InterruptedException {

        //JS Executor - inicjalizacja
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        driver.get("https://google.com");
        driver.switchTo().frame(0);
        WebElement googleButtonAgree = driver.findElement(By.xpath("//span[text()='Zgadzam się']"));

        //JS Executor - click
        executor.executeScript("arguments[0].click();",googleButtonAgree) ;
        WebElement searchInput = driver.findElement(By.name("q"));

        //JS Executor - sendKeys
        executor.executeScript("arguments[0].setAttribute('value','Selenium')",searchInput);
        searchInput.sendKeys(Keys.ENTER);
        WebElement firstResult = driver.findElement(By.xpath("//div[@class='g']//a"));

        //JS Executor - click
        executor.executeScript("arguments[0].click();",firstResult) ;

        //Right click implementation
        Actions action =  new Actions(driver);

        //Right click on site
        //action.contextClick().build().perform();
        //Thread.sleep(2000);

        //Right click on element "Donwload" link
        WebElement donwloadLink = driver.findElement(By.linkText("Downloads"));
        action.contextClick(donwloadLink).build().perform();
        Thread.sleep(2000);

        String expectedTitle = "SeleniumHQ Browser Automation";
        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }

}
