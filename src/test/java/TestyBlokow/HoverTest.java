package TestyBlokow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTest extends BaseSeleniumTest {

        @Test
        public void googleSearchTest() throws InterruptedException {
        driver.get("https://www.w3schools.com/");
        Thread.sleep(3000);
        WebElement acceptCookieButton = driver.findElement(By.id("accept-choices"));
        acceptCookieButton.click();

        Actions action =  new Actions(driver);
        WebElement navbtn_tutorials = driver.findElement(By.id("navbtn_tutorials"));
        action.moveToElement(navbtn_tutorials).build().perform();

        //Thread.sleep(3000);


            Assert.assertEquals((navbtn_tutorials.getCssValue("background-color")),"rgba(255, 255, 255, 1)");




            //driver.switchTo().frame(0);
//        WebElement googleButtonAgree = driver.findElement(By.xpath("//span[text()='Zgadzam się']"));
//        googleButtonAgree.click();
//        WebElement searchInput = driver.findElement(By.name("q"));
//        searchInput.sendKeys("Selenium");
//        searchInput.sendKeys(Keys.ENTER);
//        WebElement firstResult = driver.findElement(By.xpath("//div[@class='g']//a"));
//        firstResult.click();
//        String expectedTitle = "SeleniumHQ Browser Automation";
//        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }

}
