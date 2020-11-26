package TestyBlokow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class HandlingFramesTest extends BaseSeleniumTest{



    @Test
    public void handlingGFramesTest()  {

        System.out.println("Start test");
        driver.get("file:///C:/pliki_z_kursu/iFrameTest.html");
        driver.switchTo().frame(0);
        WebElement cliclOnMeButton = driver.findElement(By.id("clickOnMe"));
        cliclOnMeButton.click();
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
        List<WebElement> headers = driver.findElements(By.tagName("h1"));
        System.out.println(headers.size());
        headers.forEach(webElement -> System.out.println(webElement.getText()));









    }




}
